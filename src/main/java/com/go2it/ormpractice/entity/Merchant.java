package com.go2it.ormpractice.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

@Entity
//(name = "merchant")
public class Merchant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String bankName;
    private String swift;
    private String account;
    private Double charge;
    private Short period1;
    private Double minSum;
    private Double needToSend;
    private Double sent;
    private java.sql.Date lastSent;

    @OneToMany(mappedBy = "merchant", fetch = FetchType.EAGER) // without ',fetch = FetchType.EAGER' - by default hibernate session make cache light, inner properties of object will not fetched
    private Collection<Payment> payments;

//    @ManyToMany(fetch = FetchType.EAGER)
//    @JoinTable(name="payment", joinColumns=@JoinColumn(name="merchantId"), inverseJoinColumns=@JoinColumn(name="customerId"))
//    private Collection<Customer> customers;//cascade=CascadeType.ALL


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getSwift() {
        return swift;
    }

    public void setSwift(String swift) {
        this.swift = swift;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Double getCharge() {
        return charge;
    }

    public void setCharge(Double charge) {
        this.charge = charge;
    }

    public Short getPeriod1() {
        return period1;
    }

    public void setPeriod1(Short period) {
        this.period1 = period;
    }

    public Double getMinSum() {
        return minSum;
    }

    public void setMinSum(Double minSum) {
        this.minSum = minSum;
    }

    public Double getNeedToSend() {
        return needToSend;
    }

    public void setNeedToSend(Double needToSend) {
        this.needToSend = needToSend;
    }

    public Double getSent() {
        return sent;
    }

    public void setSent(Double sent) {
        this.sent = sent;
    }

    public Date getLastSent() {
        return lastSent;
    }

//
//    public Collection<Payment> getPayments() {
//        return payments;
//    }
//
//    public void setPayments(Collection<Payment> payments) {
//        this.payments = payments;
//    }

    @Override
    public String toString() {
        return "Merchant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", bankName='" + bankName + '\'' +
                ", swift='" + swift + '\'' +
                ", account='" + account + '\'' +
                ", charge=" + charge +
                ", period=" + period1 +
                ", minSum=" + minSum +
                ", needToSend=" + needToSend +
                ", sent=" + sent +
                ", lastSent=" + lastSent +
                '}';
    }

    public void setLastSent(Date lastSent) {
        this.lastSent = lastSent;
    }
    //@Override
    //	public boolean equals(Object o) {
    //		if (this == o)
    //			return true;
    //		if (o == null || getClass() != o.getClass())
    //			return false;
    //		Merchant merchant = (Merchant) o;
    //		return id == merchant.id && Objects.equals(name, merchant.name) && Objects.equals(bankName,
    //				merchant.bankName) && Objects.equals(swift, merchant.swift) && Objects.equals(account,
    //				merchant.account) && Objects.equals(charge, merchant.charge) && Objects.equals(period,
    //				merchant.period) && Objects.equals(minSum, merchant.minSum) && Objects.equals(needToSend,
    //				merchant.needToSend) && Objects.equals(sent, merchant.sent) && Objects.equals(lastSent,
    //				merchant.lastSent);
    //	}

    //@Override
    //	public int hashCode() {
    //		return Objects.hash(id, name, bankName, swift, account, charge, period, minSum, needToSend, sent,
    //				lastSent);
    //	}


}
