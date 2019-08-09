package com.company;

import org.jetbrains.annotations.Contract;

import java.util.Scanner;

public class Guerrier extends Personnage {
    public Guerrier(){
        System.out.println("Woarg je suis le Guerrier");
    }

    @Override
    public void Caracteristics() {
        super.Caracteristics();
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        return "Guerrier{}";
    }
}
