// Given a positive integer number N.
// The task is to generate all the binary strings of N bits.

import java.util.Scanner;

public class nBitCombinations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        generate(sc.nextInt(), "");

    }

    protected static void generate(int n, String bits){
        if(n == 0){
            System.out.println(bits);
            return;
        }

        generate(n-1, bits + "0");
        generate(n-1, bits + "1");
    }
}
