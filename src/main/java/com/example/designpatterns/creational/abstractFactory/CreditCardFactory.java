package com.example.designpatterns.creational.abstractFactory;

// abstract factory
public abstract class CreditCardFactory {
    public static CreditCardFactory getCreditCardFactory(int creditScore){
        if (creditScore > 600){
            return new MasterFactory();
        } else {
            return new VisaFactory();
        }
    }

    public abstract CreditCard getCreditCard(CardType typoe);
}
