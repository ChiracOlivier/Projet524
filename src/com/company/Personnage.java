package com.company;

import java.util.Scanner;

public class Personnage {















    private Scanner sc1 = new Scanner(System.in);
    public int niveau, force, agilité, Intelligence,vie, classePersonnage ;


     Personnage() {
        int entree2;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Veuillez choisir la classe de votre personnage (1: Guerrier,  2: Rodeur, 3: Mage) \n");
            entree2 = sc.nextInt();

            switch (entree2) {
                case 1:
                    Guerrier GuerrierUn = new Guerrier();
                    GuerrierUn.toString();
                    break;
                case 2:
                    Rodeur RodeurUn = new Rodeur();
                    RodeurUn.toString();
                    break;
                case 3:
                    Mage MageUn = new Mage();
                    MageUn.toString();
                    break;
                default:
                    System.out.println("Vous avez choisi un personnage Inconnu!!!\n");
                    break;

            }
        }
        while ((entree2 != 1) && (entree2 != 2) && (entree2 != 3));
    }

    public void Caracteristics() {

        System.out.println("Niveau du personnage ??");
        niveau= sc1.nextInt();
        vie= niveau*5;
        System.out.println("Force du personnage ??");
        force= sc1.nextInt();
        System.out.println("agilité du personnage ??");
        agilité= sc1.nextInt();
        System.out.println("Intelligence du personnage ??");
        Intelligence= sc1.nextInt();

    }


}
