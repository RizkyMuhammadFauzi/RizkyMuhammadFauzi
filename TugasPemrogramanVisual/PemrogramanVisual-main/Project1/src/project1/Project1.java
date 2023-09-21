/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project1;
import java.util.Scanner;
/**
 *
 * @author SMPI MU
 */
public class Project1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        
        int a,t;
        double luas;
        
        System.out.println("Menghitung Luas Segitiga");
        System.out.println("========================");
        
        System.out.print("Masukan Alas :");
        a = input.nextInt();
        System.out.print("Masukan Tinggi :");
        t = input.nextInt();
        
        luas= 0.5*a*t;
        System.out.println("Luas Segitiga Adalah:"+ luas);
    }
    
}
