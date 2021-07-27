package com.thanhvan.apiresponse.app.welcome.app.home;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.terasoluna.gfw.web.token.transaction.TransactionTokenCheck;

@Slf4j
@Controller
@RequestMapping(value = "/")
@TransactionTokenCheck(value = "/")
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String init() {
        log.info("initial view");
        return "welcome/welcome";
    }



}
