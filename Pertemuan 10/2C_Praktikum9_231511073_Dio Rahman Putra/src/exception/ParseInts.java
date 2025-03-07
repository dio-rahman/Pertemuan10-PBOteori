// ****************************************************************
// ParseInts.java
// Reads a line of text and prints the integers in the line.
//
// ****************************************************************

package exception;

import java.util.Scanner;

public class ParseInts {
    public static void main(String[] args) {
        int val;
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a line of text");
        Scanner scanLine = new Scanner(scan.nextLine());
        
        while (scanLine.hasNext()) {
            try {
                val = Integer.parseInt(scanLine.next());
                sum += val;
            }
            
            //-----------------------------------------------------------------
            // Tidak melakukan apa-apa jika bukan angka
            //-----------------------------------------------------------------
            catch (NumberFormatException e) {

                // Kosong

            }
        }

        System.out.println("The sum of the integers on this line is " + sum);
    }
}