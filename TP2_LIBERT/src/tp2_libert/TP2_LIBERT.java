/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_libert;

/**
 *
 * @author pauline
 */
public class TP2_LIBERT {
    
    public static void main(String[] args) {
        // TODO code application logic here
         
                
        BouteilleBiere Troll = new BouteilleBiere("Cuvée des trolls ",7.0 ,"Dubuisson") ;
        BouteilleBiere Phiphi = new BouteilleBiere("Leffe ", 6.6, "Abbaye de Leffe");
        BouteilleBiere Duval = new BouteilleBiere ("Orval ",6.2,"Abbaye d'Orval");
        BouteilleBiere Francomtoise = new BouteilleBiere ("Malt&Hops ",8.9,"Saint Germain");
        BouteilleBiere Beber = new BouteilleBiere ("Bernache",7,"Saint Rieul");
        BouteilleBiere Auvergnate = new BouteilleBiere ("La Fournaise",8,"Brasserie Volcane");
        BouteilleBiere Trop = new BouteilleBiere ("La bikini",5.5,"Brasseriecarteron");
        BouteilleBiere Sam = new BouteilleBiere ("Samsberg bleu",4.7,"Samsberg");
     
        Troll.Decapsuler();
        Phiphi.Decapsuler();
        Sam.Decapsuler();
        
        System.out.println(Troll);
        System.out.println(Phiphi);
        System.out.println(Sam);
        System.out.println(Trop);
        
    }
    }

