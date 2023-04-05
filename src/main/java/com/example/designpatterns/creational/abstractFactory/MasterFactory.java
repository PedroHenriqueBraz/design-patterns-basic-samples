package com.example.designpatterns.creational.abstractFactory;

public class MasterFactory extends CreditCardFactory{

    public CreditCard getCreditCard(CardType type){
        switch (type){
            case GOLD:
                return new MasterGoldCreditCard();
            case BLACK:
                return new MasterBlackCreditCard();
        }
        return null;
    }
}
