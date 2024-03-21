import javax.swing.JOptionPane;
public class nilai_angka_baru {
    public static void main(String[] args) {
        
        int data[][] = { {4, 6, 4, 2, 8, 4, 2, 10}, {4, 6, 4, 2, 8, 4, 2, 10}};
        
        int baris = Integer.parseInt(JOptionPane.showInputDialog("Masukkan baris: "));
        int kolom = Integer.parseInt(JOptionPane.showInputDialog("Masukkan kolom: "));
        
        int nilai_angka_baru = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai angka baru; "));
        data[baris][kolom] = nilai_angka_baru;
        
        for (int a = 0; a < data.length; a++) {
            for (int b = 0; b < data[a].length; b++) {
                System.out.print(data[a][b] + " ");
            }
            System.out.println();
        }
    }
    
}
