package org.solex;

public class Main {
    public static void main(String[] args) {

        Enigma e = new Enigma();
        Rotor ro = new Rotor();
        Reflecteur re = new Reflecteur();
        Character[] chain= {'A','B','C','D','E','F','G','H','I','J'};
        Character[] chain2= {'K','L','M','N','O','P','Q','R','S','T'};
        Permutations p = new Permutations(chain,chain2);
        System.out.println(p.getPermutations());
        p.updatePermutations('A','Y');
        System.out.println(ro.getTable());
        System.out.println(ro.chiffre('V'));

    }

}