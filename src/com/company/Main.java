package com.company;

import org.jetbrains.annotations.Contract;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int entree1 = 0,entree2= 0;
        System.out.println("Bienvenue dans ce jeu  épique!!!\n");
        System.out.println("Choississez votre mode :\n 1: 1 joueur\n 2: 2 joueurs\n");

        if (entree1==1){
            Joueur1 joueur1= new Joueur1();
        }else {
            Joueur1 joueur1= new Joueur1();
            Joueur2 joueur2 = new Joueur2();
        }


    }
}