package com.go2it.ormpractice;

import com.go2it.ormpractice.entity.Customer;
import com.go2it.ormpractice.entity.Merchant;
import com.go2it.ormpractice.entity.Payment;
import com.go2it.ormpractice.entity.dto.Result;
import com.go2it.ormpractice.service.ICustomerService;
import com.go2it.ormpractice.service.IMerchantService;
import com.go2it.ormpractice.service.IPaymentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Collection;
import java.util.List;


public class Application {
    private static final Logger LOGGER = LoggerFactory.getLogger (Application.class);

    public static void main(String[] args) {

//================= find merchant by id =================
//        ApplicationContext context = new ClassPathXmlApplicationContext ("beans.xml");
//        MerchantService merchantService = context.getBean (MerchantService.class); // can be changed to IMerchantService
//        Merchant m1 = merchantService.findById (2);
//        System.out.println ("name = " + m1.getName ( ));
//        LOGGER.info ("name = " + m1.getName ( ));

// ================= find customer by id ================
//        ApplicationContext context = new ClassPathXmlApplicationContext ("beans.xml");
//        ICustomerService customerService = context.getBean(ICustomerService.class); // can be changed to CustomerService

//        Customer customer = customerService.findById (1);
//        System.out.println (customer.toString () );

//===================add or save to DB new customer =========
//        ApplicationContext context = new ClassPathXmlApplicationContext ("beans.xml");
//        ICustomerService customerService = context.getBean(ICustomerService.class); // can be changed to CustomerService
//
//        Customer customer = new Customer ();
//        customer.setAddress ("DeOeuf st.26,DeBle France");
//        customer.setCcNo ("1110003340009");
//        customer.setCcType ("Master Card");
//        customer.setEmail ("ara@t.com");
//        customer.setName ("Dima Tut");
//        LocalDate dt1 = LocalDate.of(2012, Month.MAY,06);
//        customer.setMaturity (java.sql.Date.valueOf (dt1));
//        LocalDate dt2 = LocalDate.of(2029, Month.FEBRUARY,10);
//        customer.setExpDate (java.sql.Date.valueOf (dt2));
//
//        customerService.save (customer); // saving new customer
//        System.out.println ("id= "+customer.getId () ); // will show the auto-incremented ID of new customer in DB if created

//=====================add or save to DB new merchant =========
//        ApplicationContext context = new ClassPathXmlApplicationContext ("beans.xml");
//        IMerchantService merchantService = context.getBean(IMerchantService.class);
//
//        Merchant merchant = new Merchant ();
//        merchant.setName ("Walmart");
//        merchant.setCharge(10.00);
//        merchant.setBankName ("Visa");
//        merchant.setAccount ("55588888555");
//        merchant.setMinSum (2.00);
//        merchant.setSwift ("BZXC9234W");
//        merchant.setPeriod1((short) 4);
//        merchant.setMinSum (28.0);
//        merchant.setNeedToSend (22.0);
//        merchant.setSent (29.0);
//        Date dt = Date.valueOf (LocalDate.now ());
//        merchant.setLastSent (dt);
//
//        merchantService.save (merchant); // saving new merchant
//        System.out.println ("id= "+merchant.getId () ); // will show the auto-incremented ID of new customer in DB if created

//===todo================add or save to DB new payment =========


//========== remove customer by id ======================
//        ApplicationContext context = new ClassPathXmlApplicationContext ("beans.xml");
//        ICustomerService customerService = context.getBean(ICustomerService.class);
//        System.out.println ("The customer with id = 15 was removed successfully -"+customerService.remove (15) );

//////========== remove customer by customer object===========?????????????? how to do it????
//        ApplicationContext context = new ClassPathXmlApplicationContext ("beans.xml");
//        ICustomerService customerService = context.getBean(ICustomerService.class);
//        Customer customer =customerService.findById (14);
//        System.out.println ("The customer "+ customer.getName ()+", was removed successfully -"+customerService.remove (customer));

//========== Update of specific field in the object
//        ApplicationContext context = new ClassPathXmlApplicationContext ("beans.xml");
//        ICustomerService customerService = context.getBean(ICustomerService.class);
//        boolean result = customerService.updateCcNo (3,"55555555555");
//        System.out.println ("Update finished. Result is : "+result );
//
//        Customer foundById = customerService.findById (3);
//        System.out.println (foundById );

// =========== merge() - Update of most updated object with saving it at BD
//        ApplicationContext context = new ClassPathXmlApplicationContext ("beans.xml");
//        ICustomerService customerService = context.getBean(ICustomerService.class);
//        boolean result = customerService.updateCcNo (17,"777777777");
//        System.out.println ("Update finished. Result is : "+result );
//        Customer foundById = customerService.findById (17);
//        System.out.println (foundById );

//======================== Payment================
//        ApplicationContext context = new ClassPathXmlApplicationContext ("beans.xml");
//        IPaymentService paymentService = context.getBean (IPaymentService.class);
//
//        Payment p1 = paymentService.findById (2);
//        System.out.println (p1.toString () );


//================ HQL Hibernate Query language===============
//        ApplicationContext context = new ClassPathXmlApplicationContext ("beans.xml");
//        IMerchantService merchantService = context.getBean (IMerchantService.class); // can be changed to MerchantService
//        List<Result> list = merchantService.getTotalReport ();
//        for (Result result:list){
//            System.out.format ("%s, %8.2f\n",result.getName (),result.getSum () );
//        }
//=================  LazyInitializationException
//        ApplicationContext context = new ClassPathXmlApplicationContext ("beans.xml");
//        IMerchantService merchantService = context.getBean (IMerchantService.class);
//
//        List<Merchant> list = merchantService.getSortedByNeedToPay ( );
//        for (Merchant merchant : list) {
//            System.out.println ("++++++++++++++++++++++++++++++++");
//            System.out.println (merchant.getName ( ));
//            //===========  LazyInitializationException==================================
//            Collection<Payment>payments = merchant.getPayments ( );
//            for(Payment p:payments){
//                System.out.println (p.toString () );
//            }
//        }
//=============(ManyToMany) read data about merchants whose goods were bought by a given customer=============
//        ApplicationContext context = new ClassPathXmlApplicationContext ("beans.xml");
//        ICustomerService customerService = context.getBean(ICustomerService.class);
//
//        Customer customer = customerService.findById (1);
//        if (customer!= null){
//            System.out.println (customer.toString () );
//            Collection<Merchant> merchants = customer.getMerchants();
//            for(Merchant m:merchants){
//                System.out.println (m.getName () );
//            }
//        }
//=====todo================ save new payment =============
//        ApplicationContext context = new ClassPathXmlApplicationContext ("beans.xml");
//        ICustomerService customerService = context.getBean (ICustomerService.class);
//        Customer customer = customerService.findById (1);
//
//        Merchant newMerchant = new Merchant ( );
//        newMerchant.setAccount ("123123");
//        newMerchant.setBankName ("Me123");
//        newMerchant.setCharge (5.00);
//        IMerchantService merchantService = context.getBean (IMerchantService.class);
//        merchantService.save(newMerchant);
//
//        Payment p1 = new Payment ( );
//        p1.setDt (Date.valueOf (LocalDate.now ( )));
//        p1.setCustomer (customer);
//        p1.setMerchant (newMerchant);
//
//        IPaymentService paymentService = context.getBean (IPaymentService.class);
//        paymentService.save(p1);

//===================== using TypedQuery interface( HQL) =============
//        ApplicationContext context = new ClassPathXmlApplicationContext ("beans.xml");
//        IMerchantService merchantService = context.getBean (IMerchantService.class);
//        List<Merchant> list = merchantService.findAll ();
//        for ( Merchant m:list){
//            System.out.println (m );
//        }
//===================== get names of customer who payed more then 500.00 by time =============
//        ApplicationContext context = new ClassPathXmlApplicationContext ("beans.xml");
//        ICustomerService customerService = context.getBean (ICustomerService.class);
//        List<String>list=customerService.getNamesBySumPaid (1000.00);
//        for (String s:list){
//            System.out.println (s);
//        }
//=============== get sum of ol payments =============
//        ApplicationContext context = new ClassPathXmlApplicationContext ("beans.xml");
//        IPaymentService paymentService = context.getBean (IPaymentService.class);
//        double paymentsSum = paymentService.getPaymentsSum ( );
//        System.out.println (paymentsSum);

//=============== query with parameters  example (Prepared statement)=============
//        ApplicationContext context = new ClassPathXmlApplicationContext ("beans.xml");
//        IPaymentService paymentService = context.getBean (IPaymentService.class);
//        List<Payment>paymentList=paymentService.getLargePayments (300);
//        for (Payment p:paymentList){
//            System.out.println (p +" The sum paid is: "+ p.getSumPaid ());
//        }
    }
}
