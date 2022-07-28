package org.solex;

import java.util.HashMap;

import static org.solex.Rotor.randInt;

public class Reflecteur {

    //Attributs
    private int id;


    //Const
    private final HashMap<Character,Character> TABLE;
    private final Character[] ALPHABET = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    private final Character[] REF1 = {'E','J','M','Z','A','L','Y','X','V','B','W','F','C','R','Q','U','O','N','T','S','P','I','K','H','G','D'};
    private final Character[] REF2 = {'Y','R','U','H','Q','S','L','D','P','X','N','G','O','K','M','I','E','B','F','Z','C','W','V','J','A','T'};
    private final Character[] REF3 = {'F','V','P','J','I','A','O','Y','E','D','R','Z','X','W','G','C','T','K','U','Q','S','B','N','M','H','L'};
    public Reflecteur(){
        Character[] c;
        HashMap<Character,Character> tmp =new HashMap<Character,Character>();
        id = randInt(1,3);
        c = switch (id) {
            case 1 -> REF1;
            case 2 -> REF2;
            default -> REF3;
        };
        for (int i = 0; i < c.length; i++) {
            tmp.put(ALPHABET[i],c[i]);
        }
        TABLE = tmp;
    }
    public Reflecteur(int id){
        Character[] c;
        HashMap<Character,Character> tmp =new HashMap<Character,Character>();
        this.id = id;
        c = switch (id) {
            case 1 -> REF1;
            case 2 -> REF2;
            default -> REF3;
        };
        for (int i = 0; i < c.length; i++) {
            tmp.put(ALPHABET[i],c[i]);
        }
        TABLE = tmp;
    }
    //getters
    public HashMap<Character, Character> getTABLE() {
        return TABLE;
    }

    @Override
    public String toString() {
        return "Reflecteur{" +
                "id=" + id +
                '}';
    }

    public int getId() {
        return id;
    }
    //setters
    //methodes
    public Character chiffre(Character a){
        //System.out.println("Ref : "+TABLE.get(a));
        return TABLE.get(a);
    }

}
