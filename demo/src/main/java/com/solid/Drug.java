package com.solid;

public class Drug implements DrugsInterface {
    
    private boolean legality;
    private int dosage;
    private int overdose;

    public Drug(boolean legality, int dosage,int overdose){

        this.overdose = overdose;
        this.legality = legality;
        this.dosage = dosage;
    }

    public boolean isOverdose(){

        if (dosage > overdose){return true;}

        return false;
    }

    public boolean isLegal(){
        return legality;
    }

}
