package com.go2it.ormpractice.entity;

import javax.persistence.*;
import java.sql.Date;
import java.text.SimpleDateFormat;

    @Entity
    (name = "payment") //  needed - because in DB not the same name of entity
    public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private java.sql.Date dt;
    private java.sql.Date paymentDate;
    private String goods;
    private Double sumPaid;
    private Double chargePaid;

    @ManyToOne @JoinColumn(name = "merchantId")             // Mapped entity 1
    private Merchant merchant;

    @ManyToOne @JoinColumn(name = "customerId")             // Mapped entity 2
    private Customer customer;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Date getDt() {
        return dt;
    }
    public void setDt(Date dt) {
        this.dt = dt;
    }
    public Date getPaymentDate() {
        return paymentDate;
    }
    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }
    public String getGoods() {
        return goods;
    }
    public void setGoods(String goods) {
        this.goods = goods;
    }
    public Double getSumPaid() {
        return sumPaid;
    }
    public void setSumPaid(Double sumPaid) {
        this.sumPaid = sumPaid;
    }
    public Double getChargePaid() {
        return chargePaid;
    }
    public void setChargePaid(Double chargePaid) {
        this.chargePaid = chargePaid;
    }
    public Merchant getMerchant() {
            return merchant;
        }
    public void setMerchant(Merchant merchantId) {
            this.merchant = merchantId;
        }
    public Customer getCustomer() {
            return customer;
        }
    public void setCustomer(Customer customerId) {
            this.customer = customerId;
        }

    @Override
    public String toString() {
        String txt = "id = " + id + "; date = ";
        SimpleDateFormat dtFrm = new SimpleDateFormat ("dd.MM.yyyy");
        txt += dtFrm.format(dt) + "; merchant = " + merchant.getName();
        //txt += "; total = " + total + "; charge = " + charge;
        return txt;
//        return "Payment{" +
//                "id=" + id +
//                ", dt=" + dt +
//                ", paymentDate=" + paymentDate +
//                ", goods='" + goods + '\'' +
//                ", sumPaid=" + sumPaid +
//                ", chargePaid=" + chargePaid +
//                ", merchant=" + merchant +
//                ", customer=" + customer +
//                '}';
    }

}
