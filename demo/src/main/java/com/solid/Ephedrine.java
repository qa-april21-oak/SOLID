package com.solid;

public class Ephedrine extends Drug{

    private int cost;

    public Ephedrine(boolean legality, int dosage,int overdose, int cost) {
        super(legality, dosage,overdose);
        this.cost = cost;
    }
    
    public int getCost() {
        return this.cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

}
