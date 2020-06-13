package com.go2it.ormpractice.entity;
import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

@Entity
(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private java.sql.Date maturity;
    private java.sql.Date expDate;
    private String ccType;
    private String ccNo;
    private String email;
    private String address;
    private String name;

    @OneToMany(mappedBy = "customer", fetch = FetchType.EAGER)
    private Collection<Payment> paymentsCustomer;

    public Collection<Payment> getPaymentsCustomer() {
        return paymentsCustomer;
    }
    public void setPaymentsCustomer(Collection<Payment> payment) {
        this.paymentsCustomer = payment;
    }

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name="payment", joinColumns=@JoinColumn(name="customerId"), inverseJoinColumns=@JoinColumn(name="merchantId"))
    private Collection<Merchant> merchants;//cascade=CascadeType.ALL

    public Collection<Merchant> getMerchants() {
        return merchants;
    }
    public void setMerchants(Collection<Merchant> merchants) {
        this.merchants = merchants;
    }


    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public Date getMaturity() {
        return maturity;
    }
    public void setMaturity(Date maturity) {
        this.maturity = maturity;
    }
    public Date getExpDate() {
        return expDate;
    }
    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }
    public String getCcType() {
        return ccType;
    }
    public void setCcType(String ccType) {
        this.ccType = ccType;
    }
    public String getCcNo() {
        return ccNo;
    }
    public void setCcNo(String ccNo) {
        this.ccNo = ccNo;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", maturity=" + maturity +
                ", expDate=" + expDate +
                ", ccType='" + ccType + '\'' +
                ", ccNo='" + ccNo + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
