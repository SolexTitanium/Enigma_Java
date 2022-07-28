package org.solex;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Rotor ro = new Rotor();
        Reflecteur re = new Reflecteur();
        Character[] chain= {'A','B','C','D','E','F','G','H','I','J'};
        Character[] chain2= {'K','L','M','N','O','P','Q','R','S','T'};
        Permutations p = new Permutations(chain,chain2);
        System.out.println(p.getPermutations());
        p.updatePermutations('A','Y');
        System.out.println(ro.getTABLE());
        System.out.println(ro.chiffre('V'));*/


        /*Character[] in = {'A','C','F','G','X'};
        Character[] out = {'D','Y','J','E','Z'};
        Enigma e = new Enigma(1,2,3,1,in,out);
        System.out.println(e.toString());
        System.out.println(e.chiffre('A'));
        System.out.println("..");
        System.out.println(e.chiffre('A'));
        e = new Enigma(1,2,3,1,in,out);
        System.out.println(e.chiffre('A'));
        System.out.println("..");
        System.out.println(e.chiffre('A'));*/

        Scanner input = new Scanner(System.in);
        System.out.println("Choisissez le 1er rotor (entier entre 1 et 5) : ");
        int r1 = input.nextInt();
        System.out.println("Choisissez le 2e rotor (entier entre 1 et 5) : ");
        int r2 = input.nextInt();
        System.out.println("Choisissez le 3e rotor (entier entre 1 et 5) : ");
        int r3 = input.nextInt();
        System.out.println("Choisissez le Reflecteur (entier entre 1 et 3) : ");
        int ref = input.nextInt();
        System.out.println("Choisissez les lettres a permuter (ABDE = A->B D->E) ");
        String lettres = input.nextLine();
        for (int i = 0; i < lettres.length(); i++) {
            if (i % 2 == 0) {

            }
            else {

            }
        }
    }

}