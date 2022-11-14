/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author pauline
 */
public class Armes {
    private String nom;
    private int attaque=101;     
    }
    public void Armes( String name, int i){

}
    
        














    public int getAttaque() {
        return attaque;
    }

    public void setAttaque(int attaque) {
        if (attaque<0){
        this.attaque = attaque;
        }
    }

    @Override
    public String toString() {
        return "Armes{" + "nom=" + nom + ", attaque=" + attaque + '}';
    }


}
