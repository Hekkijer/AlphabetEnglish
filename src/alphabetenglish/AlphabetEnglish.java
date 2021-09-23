/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphabetenglish;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class AlphabetEnglish {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] alphabet = {
            "a", "b", "c", "d", "e", "f", "g", "h",
            "i", "j", "k", "l", "m", "n", "o", "p",
            "q", "r", "s", "t", "u", "v", "w", "x",
            "y", "z"
        };

        int num = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input sentence: ");
        String userString = scanner.nextLine();

        char[] userArray = userString.toCharArray();

        for (int i = 0; i < alphabet.length; i++) {
            for (int in = 0; in < userArray.length; in++) {
                String charToString = Character.toString(userArray[in]);
                if (alphabet[i].equals(charToString)) {
                    num++;
                    break;
                }
            }
        }

        System.out.println("=========================================================");
        System.out.println("Your sentence contains " + num + " chars of english alphabet");
        if (num == 26) {
            System.out.println("Your sentence contains all english alphabets");
        } else {
            System.out.println("Your sentence does not contain all english alphabets");
        }
    }
    
}
