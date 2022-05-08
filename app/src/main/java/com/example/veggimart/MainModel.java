package com.example.veggimart;

public class MainModel {

    String name,number,cvv,expire,surl;

    MainModel(){


    }

    public MainModel(String name, String number, String cvv, String expire, String surl) {
        this.name = name;
        this.number = number;
        this.cvv = cvv;
        this.expire = expire;
        this.surl = surl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getExpire() {
        return expire;
    }

    public void setExpire(String expire) {
        this.expire = expire;
    }

    public String getSurl() {
        return surl;
    }

    public void setSurl(String surl) {
        this.surl = surl;
    }
}
