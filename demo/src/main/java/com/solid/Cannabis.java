package com.solid;

public class Cannabis extends Drug {

    private String strain;
    
    public Cannabis(boolean legality, int dosage,int overdose, String strain) {
        super(legality, dosage, overdose);
        this.strain = strain;
    }

    public String getStrain() {
        return this.strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }
    
}
