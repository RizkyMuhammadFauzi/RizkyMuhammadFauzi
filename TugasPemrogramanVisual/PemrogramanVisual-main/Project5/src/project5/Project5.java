/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project5;
import java.util.Scanner;

/**
 *
 * @author SMPI MU
 */
public class Project5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        boolean lanjut = true;

        while (lanjut) {
            int jumlah = 0;
            int jumlahAngka = 0;

            System.out.println("Masukkan serangkaian angka (0 untuk menghitung rata-rata):");

            while (true) {
                try {
                    int angka = Integer.parseInt(input.nextLine());

                    if (angka == 0) {
                        break;
                    }

                    jumlah += angka;
                    jumlahAngka++;
                } catch (NumberFormatException e) {
                    System.out.println("Input tidak sah. Masukkan angka.");
                }
            }

            if (jumlahAngka > 0) {
                double rataRata = (double) jumlah / jumlahAngka;
                System.out.println("Rata-rata angka adalah: " + rataRata);
            } else {
                System.out.println("Tidak ada nilai atau angka yang dimasukkan.");
            }

            System.out.print("Apakah Anda ingin menghitung rata-rata lagi? (ya/tidak): ");
            String jawaban = input.nextLine().toLowerCase();

            if (!jawaban.equals("ya")) {
                lanjut = false;
            }
        }

        System.out.println("Hatur Nuhun. Program berhenti.");
    }
    
}
