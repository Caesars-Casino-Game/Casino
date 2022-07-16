package com.github.zipcodewilmington.casino;

public class CasinoAccountPractice {
    private Integer balance;
    private String accountName;
    private String accountPassword;

    public CasinoAccountPractice () {
        this.accountName = "";
        this.accountPassword = "";
        this.balance = 0;
    }

    public CasinoAccountPractice(String accountName, String accountPassword, Integer balance) {

        this.accountName = accountName;
        this.accountPassword = accountPassword;
        this.balance = balance;

    }

    public String getAccountName () {
        return accountName;
    }

    public void setAccountName (String accountName){
        this.accountName = accountName;
    }

    public String getAccountPassword () {
        return accountPassword;
    }

    public void setAccountPassword (String accountPassword){
        this.accountPassword = accountPassword;
    }

    public int getBalance () {
        return balance;
    }

    public void setBalance ( int balance){
        this.balance = balance;
    }
}

