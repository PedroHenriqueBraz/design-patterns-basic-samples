package com.example.designpatterns.creational.abstractFactory;

public class AbstractFactoryMain {
    public static void main(String args[]){
        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(700);

        CreditCard card = abstractFactory.getCreditCard(CardType.GOLD);

        System.out.println(card.getClass());

        abstractFactory = CreditCardFactory.getCreditCardFactory(500);
        CreditCard cred2 = abstractFactory.getCreditCard(CardType.GOLD);

        System.out.println(cred2.getClass());

    }
}
