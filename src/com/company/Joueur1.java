package com.company;

import java.util.Scanner;

public class Joueur1 extends Personnage {
    public Joueur1() {
        System.out.println(" Création du personnage Joueur1...\n");

    }


    @Override
    void choisirClassePersonnage() {
        super.choisirClassePersonnage();
    }


    public void affiche() {
        System.out.println("Joueur 1, Niveau"+ this.niveau+ "je possède"+ (this.niveau)*5+ "de vitalité"+ this.force+ "de force"+ this.agilité+" d'agilité"+this.Intelligence+"d'intelligence !");
    }
}
