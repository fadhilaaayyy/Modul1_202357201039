/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul1_202357201039;

/**
 *
 * @author hp
 */
public class nilai_ganjil {
    public static void main(String[] args) {
        int data [][] = {{4, 6, 4, 2, 8, 4, 2, 10}, {4, 6, 4, 2, 8, 4, 2, 10}};
        int total_kolom = 0;
        for (int a = 0; a < data.length; a++) {
            for (int b = 0; b < data[0].length; b++) {
                if (b % 2 != 0) {
                    total_kolom += data[a][b];
                }
            }
        }
        System.out.print("Total elemen dengan index kolom ganjil :" +total_kolom);
    }
    
}
