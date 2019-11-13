/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

/**
 *
 * @author laptop
 */
public class User {
    public String Nama;
    public int Skor=0, Lives=3, Level=1;
    
    //Enkapsulasi
    private void setLevel(){
        if (Skor > 100){
            Level = 2;
        } 
        else if (Skor > 200){
            Level = 3;
        }
    }
    
    public int getLevel(){
        return Level;
    }
}
