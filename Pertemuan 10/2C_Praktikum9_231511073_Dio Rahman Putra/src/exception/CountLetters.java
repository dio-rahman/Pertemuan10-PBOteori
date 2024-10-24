// ****************************************************************
// CountLetters.java
//
// Reads a words from the standard input and prints the number of
// occurrences of each letter in that word.
//
// ****************************************************************

package exception;

import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        int[] counts = new int[26];
        Scanner scan = new Scanner(System.in);

        //-----------------------------------------------------------------
        // User menginput disini
        //-----------------------------------------------------------------
        System.out.print("Enter a single word (letters only, please): ");
        String word = scan.nextLine();

        //-----------------------------------------------------------------
        // Mengubah menjadi huruf kapital
        //-----------------------------------------------------------------
        word = word.toUpperCase();

        //-----------------------------------------------------------------
        // Menghitung frekuensi huruf
        //-----------------------------------------------------------------
        for (int i = 0; i < word.length(); i++) {
            try {
                counts[word.charAt(i) - 'A']++;
            } 
            
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Bukan huruf: " + word.charAt(i));
            }
        }

        //-----------------------------------------------------------------
        // Menampilkan frekuensi
        //-----------------------------------------------------------------
        System.out.println();
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] != 0) {
                System.out.println((char) (i + 'A') + ": " + counts[i]);
            }
        }
    }
}