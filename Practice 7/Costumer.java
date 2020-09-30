package com.company;

import java.util.ArrayList;

public class Costumer {
    private ArrayList<Furniture> shoppingCart;

    public Costumer(){
        shoppingCart = new ArrayList<Furniture>();
    }

    public void addToShoppingCart(Furniture ... args){
        for (int i = 0; i< args.length; i++) {
            shoppingCart.add(args[i]);
        }
    }

    public String lookAtShoppingCart() {
        return "Costumer{" +
                "shoppingCart=" + shoppingCart +
                '}';
    }
}
