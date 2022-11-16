package com.company;

public class Weapon {
    private String nomeArma;
    private float dannoArma;


    public Weapon(float dannoArma) {
        this.nomeArma = nomeArma;
        this.dannoArma = dannoArma;
    }


    public float getDannoArma() {
        return dannoArma;
    }
}
