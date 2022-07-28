package org.solex;

import java.util.HashMap;

public class Permutations {
    //attributs
    private HashMap<Character,Character> permutations;

    //Constructeur (Empecher les duplis)
    public Permutations(Character[] in,Character[] out){
        permutations = new HashMap<Character,Character>();
        if(in.length <= 10 && out.length == in.length){
            for(int i = 0;i<out.length;i++){
                permutations.put(in[i],out[i]);
            }
        }
        else {
            System.out.println("Nombres de caracteres incorrect");
        }
    }

    @Override
    public String toString() {
        return "Permutations{" +
                "permutations=" + permutations +
                '}';
    }

//methodes

    public HashMap<Character, Character> getPermutations() {
        return permutations;
    }
    public void updatePermutations(Character key, Character val){
        permutations.put(key, val);
    }

    public Character permute(Character c){
        if(permutations.containsKey(c)){
            //System.out.println("perm : " + permutations.get(c));
            return permutations.get(c);
        }
        else {
            return c;
        }

    }
}
