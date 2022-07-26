package org.solex;

import java.util.HashMap;

public class Permutations {
    //attributs
    private HashMap<Character,Character> permutations;

    //Constructeur (Empecher les duplis)
    public Permutations(Character[] in,Character[] out){
        permutations = new HashMap<Character,Character>();
        if(in.length <= 10 && out.length == in.length){
            for(int i = 0;i<10;i++){
                permutations.put(in[i],out[i]);
            }
        }
        else {
            System.out.println("Nombres de caracteres incorrect");
        }
    }
    //methodes

    public HashMap<Character, Character> getPermutations() {
        return permutations;
    }
    public void updatePermutations(Character key, Character val){
        permutations.put(key, val);
    }
}
