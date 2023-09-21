/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project4;
import java.util.Scanner;
/**
 *
 * @author SMPI MU
 */
public class Project4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int angka;
        do{
            System.out.print("Masukan angka (0 untuk keluar):");
            angka = input.nextInt();
            
            if (angka == 0){
                System.out.print("HaturNuhun Program Atos Kaluar:");
            }else if (angka % 2 ==0){
            System.out.println("Angka genap");
        }else {
                System.out.println("Angka Ganjil");
                }
        }while (angka !=0);
    }
    
}
