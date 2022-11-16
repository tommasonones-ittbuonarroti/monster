package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float d1,d2;

        int scelta = -1,scelta1 = -1,scelta2=-1;
        float a1,a2;
        Monster m1 = new Monster("ciao",150);
        Monster m2 = new Monster("badu",65);




        while(scelta !=0){
            System.out.println("Chi vuoi fare lottare?");
            System.out.println("1)primo mostro");
            System.out.println("2)secondo mostro");
            System.out.println("0)uscire");
            System.out.println("Cosa desideri fare: ");
            scelta = input.nextInt();
            switch(scelta){
                case 1:
                    System.out.println("Punti Ferita: "+m1.getPuntiFerita());
                    System.out.println("1)Vedere il danno effetuato da un mostro");
                    System.out.println("2)Fare danno all'altro mostro");
                    System.out.println("0)uscire");
                    System.out.println("Cosa desideri fare: ");
                    scelta1 = input.nextInt();
                    switch(scelta1){
                        case 1:
                            System.out.println(m1.toString());
                        case 2:
                            System.out.println("Inserisci il danno da parte del primo mostro:");
                            d1=input.nextFloat();
                            try {
                                m2.subisci(d1);
                            } catch (Exception e) {
                                e.getMessage();
                            }
                    }
                    break;
                case 2:
                    System.out.println("Punti Ferita: "+m2.getPuntiFerita());
                    System.out.println("1)Vedere il danno effetuato da un mostro");
                    System.out.println("2)Fare danno all'altro mostro");
                    System.out.println("0)uscire");
                    System.out.println("Cosa desideri fare: ");
                    scelta2 = input.nextInt();
                    switch(scelta2){
                        case 1:
                            System.out.println(m2.toString());
                            break;
                        case 2:
                            System.out.println("Inserisci il danno da parte del secondo mostro:");
                            d2=input.nextFloat();
                            try {
                                m1.subisci(d2);
                            } catch (Exception e) {
                                e.getMessage();
                            }
                            break;
                    }
                    break;
            }
        }

    }
}
