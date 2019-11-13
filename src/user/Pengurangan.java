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
public class Pengurangan {
    private int A, B;
    public int hasil;
    Random rand = new Random();
    
    public void randomSoal() {
        switch (level) {
            case 1: // Random number dari 0 - 10
                A = rand.nextInt(11);
                B = rand.nextInt(11);
                if (B > A) {
                    hasil = B - A;
                }
                else {
                    hasil = A - B;
                }
                break;
            case 2:
                A = -10 + rand.nextInt(10);
                B = -10 + rand.nextInt(10);
                hasil = A - B;
                break;
            case 3:
                A = -10 + rand.nextInt(21);
                B = -10 + rand.nextInt(21);
                hasil = A - B;
                break;
            default:
                break;
        }
    }
}
