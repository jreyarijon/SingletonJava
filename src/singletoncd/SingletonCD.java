/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletoncd;

/**
 *
 * @author Josemolamazo
 */
public class SingletonCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persoa Gael= Persoa.getSingletonInstance("Gael", "Menendez", 21);
       Persoa Devena=Persoa.getSingletonInstance("Devena", "Breogan", 20);
        System.out.println(Gael.getNome());
        System.out.println(Devena.getNome());
    }
    
}
