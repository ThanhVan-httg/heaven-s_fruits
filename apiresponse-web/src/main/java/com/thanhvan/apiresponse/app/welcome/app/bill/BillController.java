package com.thanhvan.apiresponse.app.welcome.app.bill;

import com.thanhvan.apiresponse.app.welcome.app.fruit.FruitForm;
import com.thanhvan.apiresponse.domain.model.Bill;
import com.thanhvan.apiresponse.domain.model.Fruit;
import com.thanhvan.apiresponse.domain.repository.bill.BillRepository;
import com.thanhvan.apiresponse.domain.repository.fruit.FruitRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.terasoluna.gfw.web.token.transaction.TransactionTokenCheck;
import org.terasoluna.gfw.web.token.transaction.TransactionTokenType;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Slf4j
@Controller
@RequestMapping(value = "/order")
/*@TransactionTokenCheck(value = "order")*/
public class BillController {
    String idFruit ;
    Long priceFruit ;
    Long countFruit ;
    String nameFruit;
    Long total;
    List<String> listName = new ArrayList<String>();
    List<String> listPrice = new ArrayList<String>();
    List<String> listCount = new ArrayList<String>();
    List<Long> listTotal = new ArrayList<Long>();
    long sum = 0;
    @Inject
    FruitRepository fruitRepository;

    @Inject
    BillRepository billRepository;


    @ModelAttribute
    public OrderForm setUpOrderForm() {
        return new OrderForm();
    }


    @Transactional
    @RequestMapping(method = { RequestMethod.GET, RequestMethod.POST })
    public String order(@Validated OrderForm orderForm, Model model, @RequestParam Map<List<String>, List<String>> requestParams) {
        Integer idpk = 0 ;
        if(orderForm.getId() !=  null){
            listName = new ArrayList<String>();
            listPrice = new ArrayList<String>();
            listCount = new ArrayList<String>();
            listTotal = new ArrayList<Long>();
            sum = 0;
            for (int i=0 ;i < orderForm.getId().size() ; i++){
                for (int j = 0; j < orderForm.getId().size();j ++ ) {
                    // have the same index then stop ,because of store array id , name,...
                    if(i == j){
                        idpk ++ ;
                        String id = orderForm.getId().get(i);
                        String idF= id.replaceAll("\\s", "");
                        Fruit fruit = fruitRepository.findOne(idF);
                        nameFruit = fruit.getName();
                        priceFruit = fruit.getPrice();
                        String count = orderForm.getCount().get(j);
                        countFruit = Long.parseLong(count);
                        Bill bill = new Bill();
                        bill.setFruitId(idF);
                        bill.setAmount(countFruit);
                        bill.setIdPK(idpk);
                        total = priceFruit * countFruit;
                        listName.add(nameFruit);
                        listPrice.add(priceFruit.toString());
                        listCount.add(count);
                        listTotal.add(total);
                        /*listName = Stream.of(nameFruit).collect(Collectors.toList());
                        listPrice = Stream.of(priceFruit.toString()).collect(Collectors.toList());
                        listCount = Stream.of(count).collect(Collectors.toList());*/
                       /* billRepository.save(bill);*/
                    }
                }
            }

            for(Long  tot: listTotal) {
                sum += tot;
            }
            model.addAttribute("orderForm",orderForm);
            model.addAttribute("listName",listName);
            model.addAttribute("listPrice",listPrice);
            model.addAttribute("listCount",listCount);
            model.addAttribute("total",sum);
        }else{
            listName = new ArrayList<String>();
            listPrice = new ArrayList<String>();
            listCount = new ArrayList<String>();
            listTotal = new ArrayList<Long>();
            sum = 0;
            model.addAttribute("listName",listName);
            model.addAttribute("listPrice",listPrice);
            model.addAttribute("listCount",listCount);
            model.addAttribute("total",sum);
        }


        return "fruit/bill";
    }
}
