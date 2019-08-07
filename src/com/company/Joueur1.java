package com.company;

public class Joueur1 {
    public Joueur1() {
        System.out.println(" Création du personnage Joueur1...\n");

    }

    @Override
    public String toString() {
        return super.toString();
    }
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
