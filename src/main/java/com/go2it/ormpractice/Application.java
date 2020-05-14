package com.go2it.ormpractice;

import com.go2it.ormpractice.entity.Customer;
import com.go2it.ormpractice.entity.Merchant;
import com.go2it.ormpractice.service.CustomerService;
import com.go2it.ormpractice.service.ICustomerService;
import com.go2it.ormpractice.service.MerchantService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDate;
import java.time.Month;

public class Application {
    private static final Logger LOGGER = LoggerFactory.getLogger (Application.class);

    public static void main(String[] args) {
//================= find merchant by id =================
//        ApplicationContext context = new ClassPathXmlApplicationContext ("beans.xml");
//        MerchantService merchantService = context.getBean (MerchantService.class);
//        Merchant m1 = merchantService.findById (2);
//        System.out.println ("name = " + m1.getName ( ));
//        LOGGER.info ("name = " + m1.getName ( ));

        ApplicationContext context = new ClassPathXmlApplicationContext ("beans.xml");
        ICustomerService customerService = context.getBean(ICustomerService.class); // change to CustomerService
// ================= find customer by id ================
//        Customer customer = customerService.findById (1);
//        System.out.println (customer.toString () );
//===================add or save to DB new customer =========
//        Customer customer = new Customer ();
//        customer.setAddress ("Independence st.26,Malaga Spain");
//        customer.setCcNo ("11122233344499");
//        customer.setCcType ("Master Card");
//        customer.setEmail ("dima@t.com");
//        customer.setName ("Dima Tut");
//        LocalDate dt1 = LocalDate.of(2002, Month.MAY,01);
//        customer.setMaturity (java.sql.Date.valueOf (dt1));
//        LocalDate dt2 = LocalDate.of(2019, Month.FEBRUARY,18);
//        customer.setExpDate (java.sql.Date.valueOf (dt2));
//
//        customerService.save (customer); // saving new customer
//        System.out.println ("id= "+customer.getId () ); // will show the auto-incremented ID of new customer in DB if created
//========== remove customer by id ======================
//        System.out.println ("The customer with id = 15 was removed successfully -"+customerService.remove (15) );
//////========== remove customer by customer object===========??????????????
//        Customer customer = new Customer ();
//        customer.setAddress ("Independence st.26,Malaga Spain");
//        customer.setCcNo ("11122233344499");
//        customer.setCcType ("Master Card");
//        customer.setEmail ("dima@t.com");
//        customer.setName ("Dima Tut");
//        LocalDate dt1 = LocalDate.of(2002, Month.MAY,01);
//        customer.setMaturity (java.sql.Date.valueOf (dt1));
//        LocalDate dt2 = LocalDate.of(2019, Month.FEBRUARY,18);
//        customer.setExpDate (java.sql.Date.valueOf (dt2));
//        System.out.println ("The customer "+ customer.getName ()+", was removed successfully -"+customerService.remove (customer));


    }
}
