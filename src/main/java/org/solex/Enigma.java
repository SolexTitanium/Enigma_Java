package org.solex;
import java.util.Arrays;

import static org.solex.Rotor.randInt;
public class Enigma {
    //attributs
    private Rotor[] rotors;
    private Permutations permutations;

    //constantes
    private Reflecteur REFLECTEUR = new Reflecteur();


    //Constructeur
    public Enigma(int r1,int r2, int r3,int ref,Character[] refIn,Character[] refOut){
        rotors = new Rotor[]{new Rotor(r1), new Rotor(r2), new Rotor(r3)};
        permutations = new Permutations(refIn,refOut);
        REFLECTEUR = new Reflecteur(ref);

    }

    //getter

    public Permutations getPermutations() {
        return permutations;
    }

    public Reflecteur getREFLECTEUR() {
        return REFLECTEUR;
    }

    public Rotor[] getRotors() {
        return rotors;
    }

    @Override
    public String toString() {
        return "Enigma{" +
                "rotors=" + Arrays.toString(rotors) +
                ", permutations=" + permutations.toString() +
                ", REFLECTEUR=" + REFLECTEUR.toString() +
                '}';
    }

    //methodes
    public Character chiffre(Character c){
        if (c == ' '){
            return c;
        }
        else {
            return permutations.permute(
                    rotors[2].chiffre(
                            rotors[1].chiffre(
                                    rotors[0].chiffre(
                                            REFLECTEUR.chiffre(
                                                    rotors[0].chiffre(
                                                            rotors[1].chiffre(
                                                                    rotors[0].chiffre(
                                                                            permutations.permute(c)
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            )
                    )
            );
        }

    }
}
