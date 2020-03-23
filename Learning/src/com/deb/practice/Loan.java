package com.deb.practice;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Loan {
    
    BigDecimal capital;
    BigDecimal totalValue;
    double interestRate;

    public Loan(BigDecimal capital, double interestRate) {
        this.capital = capital;
        this.interestRate = interestRate;
        calculateTotalValueToPayBack();
    }
    
    public String calculateTotalValueToPayBack() {
        interestRate = interestRate/100;
        String interest = Double.toString(interestRate);
        BigDecimal intRest = new BigDecimal(interest);
        BigDecimal intCalc = capital.multiply(intRest);
        totalValue = capital.add(intCalc);
        totalValue = totalValue.setScale(2,RoundingMode.CEILING);
        System.out.println("Inside Loan Class: "+totalValue);
        return "";
    }
    
     public BigDecimal getTotalValue() {
    
        return totalValue;
    
    }

}
