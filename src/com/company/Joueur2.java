package com.company;

import java.util.Scanner;

public class Joueur2 extends Personnage {
    public Joueur2() {
        System.out.println(" Création du personnage Joueur2...\n");

    }

    @Override
    void choisirClassePersonnage() {
        super.choisirClassePersonnage();
    }


    public void affiche() {
        System.out.println("Joueur 2, Niveau "+ this.niveau+ " je possède "+ this.vie+ " de vitalité "+ this.force+ " de force "+ this.agilité+" d'agilité "+this.Intelligence+" d'intelligence !");

    }
    public  void dommage(){
        System.out.println("Joueur 2 perd "+ this.vie+ " points de vie");
        if (this.vie==0){
            System.out.println("Joueur 2 est mort");
        }
}