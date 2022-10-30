/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_libert;

/**
 *
 * @author pauline
 */
public class TP2_manip_LIBERT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Initialisation des assiettes 
        Tartiflette assiette1= new Tartiflette (500);
        Tartiflette assiette2= new Tartiflette (600);
        Tartiflette assiette3 = assiette2;
        
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ;
        //On remarque bien que le nombre de calories sont identiques 
        
        //Changement entre assiette 1 et assiette 2
  
        assiette2=assiette1;
        assiette1=assiette3; // car assiette2=assiette3
        
        //Moussaka assiette666 =assiette1;Moussaka assiette667 = new Tartiflette() ;
        //Ce n'est pas possible car il ne font pas partie de la meme classe d'objet 
 
      Moussaka assiettes[] = new Moussaka[10];
      
       for (int i = 0; i <10; i++) {
           assiettes[i] = new Moussaka(i*100);
       }
    }   
    // C'est possible car on a fait un tableau de reference et on pourrait assigner cette reference dans un objet plutot qu'un tableau . 
}
