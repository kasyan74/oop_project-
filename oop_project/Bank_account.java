/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_project;

/**
 *
 * @author Ari Tech
 */
public class Bank_account extends Customer {
    private int accountnumber;
    private String transactionid;
    private String transactionsate;
    private double amount;
    private double withdrawl ;
    private double deposit;
    private double transferamount;

 
    public int getAccountnumber() {
        return accountnumber;
    }

    
    public void setAccountnumber(int accountnumber) {
        this.accountnumber = accountnumber;
    }


    public String getTransactionid() {
        return transactionid;
    }

 
    public void setTransactionid(String transactionid) {
        this.transactionid = transactionid;
    }

   
    public String getTransactionsate() {
        return transactionsate;
    }

  
    public void setTransactionsate(String transactionsate) {
        this.transactionsate = transactionsate;
    }

   
    public double getAmount() {
        return amount;
    }

   
    public void setAmount(double amount) {
        this.amount = amount;
    }

    

    public double getWithdrawl() {
        return withdrawl;
    }

   
    public void setWithdrawl(double withdrawl) {
        this.withdrawl = withdrawl;
    }

  
    public double getDeposit() {
        return deposit;
    }

  
    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

   
    public double getTransferamount() {
        return transferamount;
    }

   
    public void setTransferamount(double transferamount) {
        this.transferamount = transferamount;
    }
    
}
