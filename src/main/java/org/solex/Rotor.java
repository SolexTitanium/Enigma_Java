package org.solex;

import java.util.HashMap;

public class Rotor {

    //attributs
    private int pos;

    //constantes
    private final int id;
    private final HashMap<Character,Character> table;
    private final Character[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    private final Character[] r4 = {'E','S','O','V','P','Z','J','A','Y','Q','U','I','R','H','X','L','N','F','T','G','K','D','C','M','W','B'};
    private final Character[] r5 = {'V','Z','B','R','G','I','T','Y','U','P','S','D','N','H','L','X','A','W','M','J','Q','O','F','E','C','K'};
    private final Character[] r6 = {'J','P','G','V','O','U','M','F','Y','Q','B','E','N','H','Z','R','D','K','A','S','X','L','I','C','T','W'};
    private final Character[] r7 = {'N','Z','J','H','G','R','C','X','M','Y','S','W','B','O','U','F','A','I','V','L','P','E','K','Q','D','T'};
    private final Character[] r8 = {'F','K','Q','H','T','L','X','O','C','B','J','S','P','D','Z','R','A','M','E','W','N','I','U','Y','G','V'};


    public Rotor(){
        id = randInt(4,8);
        pos = 0 ;
        Character[] c;
        HashMap<Character,Character> tmp = new HashMap<Character,Character>();
        switch (id){
            case 4:
                c = r4;
                break;
            case 5:
                c = r5;
                break;
            case 6:
                c = r6;
                break;
            case 7:
                c = r7;
                break;
            default:
                c = r8;
                break;
        }
        for (int i = 0;i <c.length;i++){
            tmp.put(alphabet[i],c[i]);
        }
        table = tmp;
    }
    public Rotor(int id){
        this.id = id;
        pos = 0 ;
        Character[] c;
        HashMap<Character,Character> tmp = new HashMap<Character,Character>();
        switch (id){
            case 4:
                c = r4;
                break;
            case 5:
                c = r5;
                break;
            case 6:
                c = r6;
                break;
            case 7:
                c = r7;
                break;
            default:
                c = r8;
                break;
        }
        for (int i = 0;i <c.length;i++){
            tmp.put(alphabet[i],c[i]);
        }
        table = tmp;
    }

    //methodes
    public static int randInt(int min, int max) {
        return (int)(min+(max+1-min)*Math.random());
    }

    public int getId() {
        return id;
    }

    public int getPos() {
        return pos;
    }

    public HashMap<Character, Character> getTable() {
        return table;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }
    public void incPos() {
        this.pos ++;
    }
    public Character chiffre(Character c){
        return table.get(c);
    }
}
