/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import java.util.Random;

/**
 *
 * @author laptop
 */
public class Penjumlahan extends User{
    public int soalA, soalB;
    Random random = new Random();
    
    public void randomSoal(){
        if (Level == 1){
            soalA = random.nextInt(11);
            soalB = random.nextInt(11);
            System.out.println("Berapakah hasil dari " + soalA + " + " + soalB + " ?");
            int hasil = soalA + soalB;
        }
        
        else if (Level == 2){
            soalA = -10 + (int) (Math.random()*10);
            soalB = -10 + (int) (Math.random()*10);
            System.out.println("Berapakah hasil dari " + "(" + soalA + ")"+ " + " + "(" + soalB + ")"+ " ?");
            int hasil = soalA + soalB;
        }
        
        else if (Level == 3){
            soalA = -10 + (int) (Math.random()*21);
            soalB = -10 + (int) (Math.random()*21);
            if (soalA < 0 && soalB < 0){
                System.out.println("Berapakah hasil dari " + "(" + soalA + ")"+ " + " + "(" + soalB + ")"+ " ?");
            }
            else if (soalA < 0 && soalB >= 0 ){
                System.out.println("Berapakah hasil dari " + "(" + soalA + ")"+ " + " + soalB + " ?");
            }
            else if (soalA >= 0 && soalB < 0){
                System.out.println("Berapakah hasil dari " + soalA + " + " + "(" + soalB + ")"+ " ?");
            }
            else if (soalA >= 0 && soalB >= 0){
                System.out.println("Berapakah hasil dari " + soalA + " + " + soalB + " ?");
            }
            int hasil = soalA + soalB;
        }
    }
}
