/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package animales;

/**
 *
 * @author rcerrato
 */
public class Animales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Animal a;
    Carnivoro c;
    Herbivoro h;
    a=new Animal("aaaaa",1); //nombre,edad
    c=new Carnivoro("ccccc",5,50); //nombre,edad,kgCarne
    h=new Herbivoro("hhhhh",3,"heno"); //nombre,edad,tipoHierba
    System.out.println(a.toString());
    System.out.println(c.toString());
    System.out.println(h.toString());
    
    }
}
