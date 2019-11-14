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
    
    public void setAngkaA() {
        switch (Level) {
            case 1:
                A = rand.nextInt(11);
                break;
            case 2:
                A = -10 + rand.nextInt(10);
                break;
            case 3:
                A = -10 + rand.nextInt(21);
                break;
            default:
                break;
        }
    }
    
    public void setAngkaB() {
        switch (Level) {
            case 1:
                B = rand.nextInt(11);
                break;
            case 2:
                B = -10 + rand.nextInt(10);
                break;
            case 3:
                B = -10 + rand.nextInt(21);
                break;
            default:
                break;
        }
    }
    
    public int getAngkaA() {
        return A;
    }
    
    public int getAngkaB() {
        return B;
    }
    
    public String getTeksA() {
        if (A < 0) {
           teksA = "(" + A.toString() + ")";
        }
        else {
           teksA = A.toString();
        }
        return teksA;
    }
    
    public String getTeksB() {
        if (B < 0) {
           teksB = "(" + B.toString() + ")";
        }
        else {
           teksB = B.toString();
        }
        return teksB;
    }
    
    public void randomSoal() {
        this.setAngkaA();
        this.setAngkaB();
        this.getAngkaA();
        this.getAngkaB();
        this.getTeksA();
        this.getTeksB();
        if (Level == 1 && A < B) {
            System.out.println("Berapakah hasil dari " + B + " - " + A + " ?");
            hasil = B - A;
        }
        else {
            System.out.println("Berapakah hasil dari " + A + " - " + B + " ?");
            hasil = A - B;
        }
    }
}
