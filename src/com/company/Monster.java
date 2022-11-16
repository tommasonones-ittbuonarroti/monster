package com.company;

public class Monster {
    private String nome;
    private float puntiFerita;
    private float attacco;


    public Monster(String nome,float puntiFerita) {
        this.nome = nome;
        this.puntiFerita=puntiFerita;
        this.attacco=attacco;
        Weapon arma = new Weapon(5);
    }

    public String attacco(float attacco1){
        attacco=attacco1;
        return "Il mostro "+nome+" ha effettuato "+attacco1+" di danno";
    }
    public void aggiungiArma(Weapon a){
        
    }
    public float subisci(float danno) throws Exception{
        try{
            if(puntiFerita > 0){
                puntiFerita -= danno;
            }
        }catch (Exception e){
            System.out.println("punti ferita esauriti");
        }
        return puntiFerita;
    }
    public float attaccoArma(){

    }

    public float getPuntiFerita() {
        return puntiFerita;
    }

    @Override
    public String toString() {
        return "Il mostro "+nome+" ha effettuato "+attacco+" di danno";
    }
}
