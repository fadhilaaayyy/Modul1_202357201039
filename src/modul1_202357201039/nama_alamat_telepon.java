/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul1_202357201039;

public class nama_alamat_telepon {
    public static void main(String[] args) {
        String[][] data = {{"ABDUL", "Kediri", "085646668991"}, {"KUSNO", "Trenggalek", "085646668992"},
            {"PONIRAN", "Bojonegoro", "085646668999"}
        };
        System.out.println("NAMA\t ALAMAT\t TELEPON\t");
        for (String[] i : data){
            System.out.print(i[0] + "\t");
            System.out.print(i[1] + "\t");
            System.out.print(i[2] + "\t");
            
    }
        System.out.println("NAMA\t ALAMAT\t TELEPON\t");
        for(int baris = 0; baris < data.length; baris++){
            System.out.print(data[baris][0] + "\t");
            System.out.print(data[baris][1] + "\t");
            System.out.print(data[baris][2] + "\t");
        }
    }
    
}

