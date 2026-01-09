/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploCoches;

import java.util.*;

public class EjemClases2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int op, c, v;
        Scanner sc = new Scanner(System.in);
        Coche miCoche1, miCoche2;
        String mat;
        boolean correcto;
        
        do {
        System.out.println("INtroduce matrícula del primer coche: ");
        mat=sc.nextLine();
        correcto=mat.matches("[0-9]{4}[A-Z]{3}");
		if (!correcto)
        	System.out.println("Formato incorrecto");
        }while(!correcto);
        
        miCoche1 = new Coche(mat);
        
        do {
            System.out.println("INtroduce matrícula del segundo coche: ");
            mat=sc.nextLine();
            correcto=mat.matches("[0-9]{4}[A-Z]{3}");
    		if (!correcto)
            	System.out.println("Formato incorrecto");
            }while(!correcto);
        
        miCoche2 = new Coche(mat);

        do {
            System.out.println("1. Acelerar");
            System.out.println("2. Frenar");
            System.out.println("3. Salir");
            System.out.println("Anota opcion:");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Aumentar velocidad:");
                    v = sc.nextInt();

                    do {
                        System.out.println("Coche 1 ó 2?");
                        c = sc.nextInt();
                    } while (c != 1 && c != 2);

                    if (c == 1) {
                    	System.out.println(miCoche1.getMatricula());
                        miCoche1.acelerar(v);
                    } else {
                    	System.out.println(miCoche2.getMatricula());
                        miCoche2.acelerar(v);
                    }
                    break;
                case 2:
                    System.out.println("Disminuir velocidad:");
                    v = sc.nextInt();

                    do {
                        System.out.println("Coche 1 ó 2?");
                        c = sc.nextInt();
                    } while (c != 1 && c != 2);

                    if (c == 1) {
                        miCoche1.frenar(v);
                        System.out.println("No se ha podido realizar la operación");
                    } else {
                        miCoche2.frenar(v);
                        System.out.println("No se ha podido realizar la operación");
                    }
                    break;
                case 3:
                	System.out.println(miCoche1.toString());
                	System.out.println(miCoche2.toString());
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (op != 3);

       

    }

}
