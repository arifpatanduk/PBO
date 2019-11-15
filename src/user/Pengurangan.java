/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;
<<<<<<< HEAD
import java.util.*;
=======

// Import
import java.util.Random;

>>>>>>> 6e69c38924360838bc5d7e1c4aac2b06367b05ce
/**
 *
 * @author Erix Prasetyo Waluyo
 */
<<<<<<< HEAD
public class Pengurangan extends Penjumlahan {
    @Override
    public void randomSoal(){
        if (Level == 1){
            soalA = random.nextInt(11);
            soalB = random.nextInt(11);
            System.out.println("Berapakah hasil dari " + soalA + " - " + soalB + " ?");
            int hasil = soalA - soalB;
        }
        
        else if (Level == 2){
            soalA = -10 + (int) (Math.random()*10);
            soalB = -10 + (int) (Math.random()*10);
            System.out.println("Berapakah hasil dari " + "(" + soalA + ")"+ " - " + "(" + soalB + ")"+ " ?");
            int hasil = soalA - soalB;
        }
        
        else if (Level == 3){
            soalA = -10 + (int) (Math.random()*21);
            soalB = -10 + (int) (Math.random()*21);
            if (soalA < 0 && soalB < 0){
                System.out.println("Berapakah hasil dari " + "(" + soalA + ")"+ " - " + "(" + soalB + ")"+ " ?");
            }
            else if (soalA < 0 && soalB >= 0 ){
                System.out.println("Berapakah hasil dari " + "(" + soalA + ")"+ " - " + soalB + " ?");
            }
            else if (soalA >= 0 && soalB < 0){
                System.out.println("Berapakah hasil dari " + soalA + " - " + "(" + soalB + ")"+ " ?");
            }
            else if (soalA >= 0 && soalB >= 0){
                System.out.println("Berapakah hasil dari " + soalA + " - " + soalB + " ?");
            }
            int hasil = soalA - soalB;
=======
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
>>>>>>> 6e69c38924360838bc5d7e1c4aac2b06367b05ce
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
