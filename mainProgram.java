package bab8;

import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        do {
             System.out.print("Masukkan angka : ");
            double n = scn.nextDouble();
            Nilai nil = new Nilai(n);
        } while (true);
    }
}
