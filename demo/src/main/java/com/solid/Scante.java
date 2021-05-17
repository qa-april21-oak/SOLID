package com.solid;

public class Scante extends Drug {

    private int purity;

    public Scante(boolean legality, int dosage, int overdose, int purity) {
        super(legality, dosage, overdose);
        this.purity = purity;
    }

    public int getPurity() {
        return this.purity;
    }

    public void setPurity(int purity) {
        this.purity = purity;
    }
}