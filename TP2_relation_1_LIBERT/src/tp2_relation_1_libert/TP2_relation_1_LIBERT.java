/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_libert;

/**
 *
 * @author pauline
 */
public class TP2_relation_1_LIBERT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Création de nouveaux objet voitures 
        Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture Suzuki = new Voiture ("baleno","Suzuki",5);
        Voiture Totoya = new Voiture ("rav4","Toyota",9);
        Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
        
        //Creation des personnes
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");
        
        System.out.println("liste des voitures disponibles "+ uneClio + "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;

        // Filiation des classes Personnes et Voiture 
        bob.bagnoles[bob.nbVoitures] = uneClio ; // affection de l'objet uneclio dans l'attribut bagnole de l'objet bob
        bob.nbVoitures++ ; // Implementation du nombre de voiture sur la personnne choisi
        uneClio.LeProprio = bob ;// Affiliaion de l'objet Bob à une Clio
        bob.bagnoles[bob.nbVoitures] = Suzuki;// affectation de l'objet uneclio dans l'attribut bagnole de l'objet bob
        bob.nbVoitures++;// Implementation du nombre de voiture sur la personnne choisi
        Suzuki.LeProprio=bob;//Affiliaion de l'objet bob avec l'objet Suzuki
        
        reno.bagnoles[reno.nbVoitures]= Totoya;// affectation de l'objet Totoya dans l'attribut bagnole de l'objet reno
        reno.nbVoitures++;// Implementation du nombre de voiture sur la personnne choisi
        Totoya.LeProprio = reno;//Affiliaion de l'objet bob avec l'objet Totoya
        
        reno.ajouter_voiture(uneMicra);//Appel de la fonction ajouter_voiture          
        System.out.println("la premiere voiture de Bob est " +bob.bagnoles[0]+ "La seconde voiture de Bob est " +bob.bagnoles[1] ) ;
        System.out.println("la premiere voiture de reno est " +reno.bagnoles[0]+ "La seconde voiture de Reno est " +reno.bagnoles[1] ) ;

    }
    
}
