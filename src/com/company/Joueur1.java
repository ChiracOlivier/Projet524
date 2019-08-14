package com.company;

import java.util.Scanner;

public class Joueur1 extends Personnage {
    public Joueur1() {
        System.out.println(" Création du personnage Joueur1...\n");
        super();
    }


    public void affiche() {
        System.out.println("Joueur 1, Niveau "+ this.niveau+ " je possède "+ this.vie+ " de vitalité "+ this.force+ " de force "+ this.agilité+"  d'agilité "+this.Intelligence+" d'intelligence !");
    }


    public  void dommage(int a){
        System.out.println("Joueur 1 perd "+ a + " points de vie");
        if (this.vie==0){
            System.out.println("Joueur 1 est mort");
        }
    }
}
