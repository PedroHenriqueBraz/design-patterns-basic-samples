package com.example.designpatterns.creational.abstractFactory;

public class VisaFactory extends  CreditCardFactory{

    public CreditCard getCreditCard(CardType type){
        switch (type){
            case GOLD:
                return new VisaGoldCreditCard();
            case PLATINUM:
                return new VisaPlatinumCreditCard();
        }

        return null;
    }
}
