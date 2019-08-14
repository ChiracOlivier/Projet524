package com.company;

import org.jetbrains.annotations.Contract;

import java.util.Scanner;

public class Guerrier extends Joueur1 {
    public Guerrier(){
        System.out.println("Woarg je suis le Guerrier");
    }

    @Override
    public void Caracteristics() {
        super.Caracteristics();
    }

    public void attaque(){
        Scanner sc3= new Scanner(System.in);
        System.out.println(" Veuillez choisir votre action : ( 1: Basique, 2: Spéciale)");
        int attac = sc3.nextInt();
        if (attac==1){
            System.out.println("Joueur Utilise Coup d'Epée et inflige "+ this.force+" dommages");

        }else if (attac==2){
            System.out.println("Joueur  Utilise Coup de Rage et inflige  "+ (this.force)*2+ " dommages");
        }
}
}
