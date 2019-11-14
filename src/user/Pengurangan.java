/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

// Import
import java.util.Random;

/**
 *
 * @author Naubyra (Naufal Ammar K3518047)
 */
public class Pengurangan extends User{
    private Integer A, B;
    public int hasil;
    private String teksA, teksB;

    // Instansiasi Random
    Random rand = new Random();
    
    // Method Set
    public void setAngkaA() { // Set Integer A sesuai dengan Level
        switch (Level) {
            case 1: // Jika Level = 1
                A = rand.nextInt(11); // Set Integer dengan angka 0 - 10
                break;
            case 2: // Jika Level = 2
                A = -10 + rand.nextInt(10); // Set Integer dengan angka (-10) - (-1)
                break;
            case 3: // Jika Level = 3
                A = -10 + rand.nextInt(21); // Set Integer dengan angka (-10) - (10)
                break;
            default:
                break;
        }
    }
    
    public void setAngkaB() { // Set Integer B sesuai dengan Level
        switch (Level) {
            case 1: // Jika Level = 1
                B = rand.nextInt(11); // Set Integer dengan angka 0 - 10
                break;
            case 2: // Jika Level = 2
                B = -10 + rand.nextInt(10); // Set Integer dengan angka (-10) - (-1)
                break;
            case 3: // Jika Level = 3
                B = -10 + rand.nextInt(21); // Set Integer dengan angka (-10) - (10)
                break;
            default:
                break;
        }
    }
    
    // Method Get
    public String getTeksA() { // Mendapatkan Teks A
        if (A < 0) {
           teksA = "(" + A.toString() + ")"; // Jika A < 0 Maka Teks A = (A)
        }
        else {
           teksA = A.toString(); // Jika A !< 0 Maka Teks A = A
        }
        return teksA;
    }
    
    public String getTeksB() { // Mendapatkan Teks B
        if (B < 0) {
           teksB = "(" + B.toString() + ")"; // Jika B < 0 Maka Teks B = (B)
        }
        else {
           teksB = B.toString(); // Jika B !< 0 Maka Teks B = B
        }
        return teksB;
    }
    
    public void randomSoal() {
        // Merandom Angka A dan B
        this.setAngkaA();
        this.setAngkaB();

        if (Level == 1 && A < B) { // Jika Level 1 Mempunyai Angka B > A Maka B - A Agar Hasil tidak negatif
            System.out.println("Berapakah hasil dari " + this.getTeksB() + " - " + this.getTeksA() + " ?");
            hasil = B - A;
        }
        else {
            System.out.println("Berapakah hasil dari " + this.getTeksA() + " - " + this.getTeksB() + " ?");
            hasil = A - B;
        }
    }
}
