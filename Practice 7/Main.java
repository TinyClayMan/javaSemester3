package com.company;

public class Main {

    public static void main(String[] args) {
	    //furniture is delivered
        Cezve roundCezve = new Cezve(true, "bronze");
        Cezve highCezve = new Cezve(true, "copper");
        Bean greenBean = new Bean(true, "wool", 50);
        Carpet wideCarpet = new Carpet(true, "wool", "arabesque");

        //wares are carried into the shop
        FurnitureShop plsBuyFromUs = new FurnitureShop();
        plsBuyFromUs.addToFurnitureInventory(roundCezve, highCezve, greenBean, wideCarpet);

        System.out.println(plsBuyFromUs.getFurnitureInventory());

        //a person walks into a store
        Costumer guyWithWeirdGlasses = new Costumer();
        guyWithWeirdGlasses.addToShoppingCart(plsBuyFromUs.getItem(1));
        System.out.println(guyWithWeirdGlasses.lookAtShoppingCart());
    }
}
