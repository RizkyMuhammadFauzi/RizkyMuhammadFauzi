/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project2;
import java.util.Scanner;

/**
 *
 * @author SMPI MU
 */
public class Project2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Nama Anda :");
        String nama = input.nextLine();
        
        System.out.print("Masukan Usia Anda :");
        int usia = input.nextInt();
        
        System.out.print("Masukan Tinggi Badan Anda (CM) :");
        double tinggiBadan = input.nextDouble();
        
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("Tinggi Badan: " + tinggiBadan + " CM");
        
        
        
        
    }
    
}
