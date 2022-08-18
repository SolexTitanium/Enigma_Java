package org.solex;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    throws Exception
    {

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
        try {
            int r1,r2,r3,ref = 0;
            int run = 1;
            String lettres;
            Scanner input = new Scanner(System.in);
            do {
                System.out.println("Choisissez le 1er rotor (entier entre 1 et 5) : ");
                r1 = input.nextInt();
            }while (r1 <= 0 || r1 > 5);
            System.out.println(r1);
            do {
                System.out.println("Choisissez le 2e rotor (entier entre 1 et 5) : ");
                r2 = input.nextInt();
            }while (r2 <=0 || r2>5);
            do {
                System.out.println("Choisissez le 3e rotor (entier entre 1 et 5) : ");
                r3 = input.nextInt();
            }while (r3 <= 0 || r3 > 5);
            do {
                System.out.println("Choisissez le Reflecteur (entier entre 1 et 3) : ");
                ref = input.nextInt();
            }while (ref<=0 || ref>3);
            do{
                System.out.println("Choisissez les lettres a permuter (ABDE = A->B B->A D->E E->D ) ");
                lettres = input.next();
            }while (lettres.length()%2 == 1 || lettres.length()>20);
            Character[] permIn = new Character[lettres.length()/2];
            Character[] permOut = new Character[lettres.length()/2];
            for (int i = 0; i < lettres.length(); i++) {
                if (i%2 == 0){
                    permIn[i/2] = lettres.charAt(i);
                }
                else {
                    permOut[i/2] = lettres.charAt(i);
                }
            }
            Enigma enigma = new Enigma(r1,r2,r3,ref,permIn,permOut);
            System.out.println("Enigma configurée pour quiter le programme entrez @Quit \n Entrez un message et il vous sera retourné chiffré");

            do{
                String message = "";
                String messageChiffree = "";
                System.out.println("Quel est le message a coder ?");
                message = input.nextLine().toUpperCase();
                if (message.equals("@QUIT")){
                    run = 0;
                }
                else {
                    for (int i=0;i<message.length();i++) {
                        messageChiffree += enigma.chiffre(message.charAt(i));
                        System.out.println(messageChiffree);
                    }
                }


            }while(run == 1);
            input.close();
        }
        catch (Exception e){
            System.out.println(e);
        }

    }

}