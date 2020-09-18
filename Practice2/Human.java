package com.company;

public class Human {
    Head Head;
    Body Body;
    Hands Hands;
    Feet Feet;

    void setHead(Head head) {
        Head = head;
    }

    void setBody(Body body) {
        Body = body;
    }

    void setHands(Hands hands) {
        Hands = hands;
    }

    void setFeet(Feet feet) {
        Feet = feet;
    }


    public String getStatus() {
        return "Status \n" +
                "" + Head.getFeel() +
                "\n" + Body.getThirst() +
                "\n" + Body.getHunger() +
                "\n" + Body.getLungs() +
                "\nVision " + Head.getVision() +
                "\nAbility to stand " + Feet.getAbilityStand() +
                "\nAbility to grasp " + Hands.getAbilityGrasp();
    }
}

class Head {
    private String vision = "Clear";
    private String feel = "Alive";

    public void setVision(String status) {
        this.vision = status;
    }

    public void setFeel(String status) {
        this.feel = status;
    }


    public String getVision() {
        return vision;
    }

    public String getFeel() {
        return feel;
    }
}

class Body {
    private String hunger = "Growl";
    private String thirst = "Dry";
    private String breath = "Breathing";

    public void setHunger(String status) {
        this.hunger = status;
    }

    public void setThirst(String status) {
        this.thirst = status;
    }

    public void setLungs(String status) {
        this.breath = status;
    }

    public String getHunger() {
        return hunger;
    }

    public String getThirst() {
        return thirst;
    }

    public String getLungs() {
        return breath;
    }
}

class Hands {
    private String abilityGrasp = "remains";

    public void setAbilityGrasp(String status) {
        this.abilityGrasp = status;
    }

    public String getAbilityGrasp() {
        return abilityGrasp;
    }
}

class Feet {
    private String abilityStand = "remains";

    public void setAbilityStand(String status) {
        this.abilityStand = status;
    }

    public String getAbilityStand() {
        return abilityStand;
    }
}