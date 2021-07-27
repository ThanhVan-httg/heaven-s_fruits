package com.thanhvan.apiresponse.app.welcome.app.fruit;

import com.thanhvan.apiresponse.domain.model.Fruit;
import com.thanhvan.apiresponse.domain.service.fruit.FruitService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.terasoluna.gfw.web.token.transaction.TransactionTokenCheck;

import javax.inject.Inject;
import java.util.List;


@Slf4j
@Controller
@RequestMapping(value = "/fruits")
/*@TransactionTokenCheck(value = "fruits")*/
public class FruitController {

    @Inject
    FruitService fruitService;

    @Inject
    FruitHelper fruitHelper;

    @ModelAttribute
    public FruitForm setUpFruitForm() {
        return new FruitForm();
    }

    /*@RequestMapping(value = "{catagoryId}",method = RequestMethod.GET)*/
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
    public String showListFruit(Model model) {
        String catagoryId = "C1";
        List<Fruit> fruits = fruitHelper.list(catagoryId);
        model.addAttribute("fruits", fruits);
        return "layout/home"; // defind right name and direct (file jsp we want to get list)
    }

   @RequestMapping(value = "/{id}" , method = { RequestMethod.GET, RequestMethod.POST })
    public String fruits(@Validated FruitForm fruitForm, @PathVariable("id")  String id , Model model) {
       Fruit fruit = fruitService.findOne(id);
       model.addAttribute("fruitAdd",fruit);
       return "layout/home";
    }

  /*  @RequestMapping(value = "/{id}", method = RequestMethod.GET, params = "complete")
    public String addComplete() {
        return "layout/home";
    }*/

}
