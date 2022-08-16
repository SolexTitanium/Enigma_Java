package org.solex;

import java.util.HashMap;

public class Rotor {

    //attributs
    private int pos;

    //constantes
    private final int ID;
    private final HashMap<Character,Character> TABLE;
    private final Character[] ALPHABET = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    private final Character[] R4 = {'E','S','O','V','P','Z','J','A','Y','Q','U','I','R','H','X','L','N','F','T','G','K','D','C','M','W','B'};
    private final Character[] R5 = {'V','Z','B','R','G','I','T','Y','U','P','S','D','N','H','L','X','A','W','M','J','Q','O','F','E','C','K'};
    private final Character[] R6 = {'J','P','G','V','O','U','M','F','Y','Q','B','E','N','H','Z','R','D','K','A','S','X','L','I','C','T','W'};
    private final Character[] R7 = {'N','Z','J','H','G','R','C','X','M','Y','S','W','B','O','U','F','A','I','V','L','P','E','K','Q','D','T'};
    private final Character[] R8 = {'F','K','Q','H','T','L','X','O','C','B','J','S','P','D','Z','R','A','M','E','W','N','I','U','Y','G','V'};


    public Rotor(){
        ID = randInt(4,8);
        pos = 0 ;
        Character[] c;
        HashMap<Character,Character> tmp = new HashMap<Character,Character>();
        switch (ID){
            case 4:
                c = R4;
                break;
            case 5:
                c = R5;
                break;
            case 6:
                c = R6;
                break;
            case 7:
                c = R7;
                break;
            default:
                c = R8;
                break;
        }
        for (int i = 0;i <c.length;i++){
            tmp.put(ALPHABET[i],c[i]);
        }
        TABLE = tmp;
    }
    public Rotor(int ID){
        this.ID = ID;
        pos = 0 ;
        Character[] c;
        HashMap<Character,Character> tmp = new HashMap<Character,Character>();
        switch (ID){
            case 1:
                c = R4;
                break;
            case 2:
                c = R5;
                break;
            case 3:
                c = R6;
                break;
            case 4:
                c = R7;
                break;
            default:
                c = R8;
                break;
        }
        for (int i = 0;i <c.length;i++){
            tmp.put(ALPHABET[i],c[i]);
        }
        TABLE = tmp;
    }

    @Override
    public String toString() {
        return "Rotor{" +
                "pos=" + pos +
                ", ID=" + ID +
                '}';
    }

    //methodes
    public static int randInt(int min, int max) {
        return (int)(min+(max+1-min)*Math.random());
    }

    public int getID() {
        return ID;
    }

    public int getPos() {
        return pos;
    }

    public HashMap<Character, Character> getTABLE() {
        return TABLE;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }
    public void incPos() {
        this.pos ++;
    }
    public Character chiffre(Character c){
        int value = c;
        value += pos/2;
        if(value > 90) {
            value -= 26;
        }
        Character r = TABLE.get((char) value);
        //System.out.println("rotor : "+ID+"  "+ r);
        pos++;
        return r;
    }
}
