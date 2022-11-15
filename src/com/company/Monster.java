package com.company;

public class Monster {
    private String nome;
    private float puntiFerita;


    public Monster(String nome,float puntiFerita) {
        this.nome = nome;
        this.puntiFerita=puntiFerita;
    }

    public String attacco(float attacco){
        return "Il mostro "+nome+"ha effettuato "+attacco+"di danno";
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

    @Override
    public String toString() {
        return "Monster{" +
                "nome='" + nome + '\'' +
                ", puntiFerita=" + puntiFerita +
                '}';
    }
}
