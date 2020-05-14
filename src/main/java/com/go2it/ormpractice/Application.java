package com.go2it.ormpractice;

import com.go2it.ormpractice.entity.Merchant;
import com.go2it.ormpractice.service.MerchantService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    private static final Logger LOGGER = LoggerFactory.getLogger (Application.class);

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext ("beans.xml");
        MerchantService merchantService = context.getBean (MerchantService.class);
        Merchant m1 = merchantService.findById (2);
        System.out.println ("name = " + m1.getName ( ));
        LOGGER.info ("name = " + m1.getName ( ));
    }
}
