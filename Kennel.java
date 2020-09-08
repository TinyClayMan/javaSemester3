package com.company;

public class Kennel {
    private int dogsCount;
    Dog[] dogs;

    public Kennel(int amount){
        this.dogsCount = 0;
        dogs = new Dog[amount];
    }

    public void addDogs(Dog ... dogs){
        for (int i=0; i<dogs.length; i++){
            this.dogs[dogsCount] = dogs[i];
            dogsCount++;
        }
    }
    
    public Dog getDog(int i){
        return dogs[i];
    }
}
