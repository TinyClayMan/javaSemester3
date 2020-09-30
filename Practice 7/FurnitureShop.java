package com.company;
import java.util.ArrayList;

public class FurnitureShop {
    private ArrayList<Furniture> furnitureInventory = new ArrayList<Furniture>();

    public FurnitureShop(){
    }

    public void addToFurnitureInventory(Furniture ... args){
        for (int i = 0; i< args.length; i++) {
            furnitureInventory.add(args[i]);
        }
    }

    public Furniture getItem(int n){
        Furniture fetchedItem = furnitureInventory.get(n);
        furnitureInventory.remove(n);
        return fetchedItem;
    }

    public ArrayList<Furniture> getFurnitureInventory() {
        return furnitureInventory;
    }
}
