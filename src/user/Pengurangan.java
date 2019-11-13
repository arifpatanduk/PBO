/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;
import java.util.Random;

/**
 *
 * @author Naubyra (Naufal Ammar K3518047)
 */
public class Pengurangan extends User{
    private Integer A, B;
    public int hasil;
    private String teksA, teksB;
    Random rand = new Random();
    
    public void randomSoal() {
        switch (level) {
            case 1: // Random number dari 0 - 10
                A = rand.nextInt(11);
                B = rand.nextInt(11);
                if (B > A) {
                    System.out.println("Berapakah hasil dari " + B + " - " + A + " ?");
                    hasil = B - A;
                }
                else {
                    System.out.println("Berapakah hasil dari " + A + " - " + B + " ?");
                    hasil = A - B;
                }
                break;
            case 2: // Random number dari -10 - (-1)
                A = -10 + rand.nextInt(10);
                B = -10 + rand.nextInt(10);
                if (A < 0) {
                    teksA = "(" + A.toString() + ")";
                }
                else {
                    teksA = A.toString();
                }
                if (B < 0) {
                    teksB = "(" + B.toString() + ")";
                }
                else {
                    teksB = B.toString();
                }
                System.out.println("Berapakah hasil dari " + teksA + " - " + teksB + " ?");
                hasil = A - B;
                break;
            case 3: // Random number dari -10 - 10
                A = -10 + rand.nextInt(21);
                B = -10 + rand.nextInt(21);
                if (A < 0) {
                    teksA = "(" + A.toString() + ")";
                }
                else {
                    teksA = A.toString();
                }
                if (B < 0) {
                    teksB = "(" + B.toString() + ")";
                }
                else {
                    teksB = B.toString();
                }
                System.out.println("Berapakah hasil dari " + teksA + " - " + teksB + " ?");
                hasil = A - B;
                break;
            default:
                break;
        }
    }
}
