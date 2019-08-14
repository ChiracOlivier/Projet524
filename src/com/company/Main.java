package com.company;

import org.jetbrains.annotations.Contract;

import java.util.Scanner;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int entree1;

        System.out.println("Bienvenue dans ce jeu  épique!!!\n");
        System.out.println("Choississez votre mode :\n 1: 1 joueur\n 2: 2 joueurs\n");
        entree1= sc.nextInt();

        if (entree1==1){
            Joueur1 joueur1= new Joueur1();
            joueur1.choisirClassePersonnage();


            joueur1.Caracteristics();
            joueur1.affiche();
            System.out.println("début du jeu!!!");

        }else {
            Joueur1 joueur1= new Joueur1();
            joueur1.choisirClassePersonnage();
            joueur1.Caracteristics();
            joueur1.affiche();
            Joueur2 joueur2 = new Joueur2();
            joueur2.choisirClassePersonnage();
            joueur2.Caracteristics();
            joueur2.affiche();
            System.out.println("début du jeu!!!");
            while ((joueur1.vie!=0)&&(joueur2.vie!=0)){
                joueur1.classePersonnage.attaque();
                joueur1.dommage();
                joueur2.dommage();
                joueur2.classePersonnage.attaque();
                joueur1.dommage();
                joueur2.dommage();
            }
            if (joueur1.vie==0){
                System.out.println("Joueur 1 a perdu!!");
            }else if (joueur2.vie==0){
                System.out.println("Joueur 2 a perdu !!");
            }



    }
}