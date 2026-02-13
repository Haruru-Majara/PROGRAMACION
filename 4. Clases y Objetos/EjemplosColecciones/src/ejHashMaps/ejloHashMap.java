package ejHashMaps;

import java.util.HashMap;

public class ejloHashMap {
    public static void main(String[] args) {
    	//Los HashMap son super buenos para busquedas
        // Crear un HashMap para almacenar nombres y edades
        HashMap<String, Integer> edades = new HashMap<>();
        //Necesita los tipos de clase que usa
        
        // Insertar pares clave-valor
        edades.put("Juan", 30);
        edades.put("Marta", 25);
        edades.put("Pedro", 40);

        // Acceder a un valor asociado a una clave
        System.out.println("La edad de Maria es: " + edades.get("Maria"));
        
        //Acceder al numero HashCode
        String nombreClave="Juan";
        System.out.println("HashCode de Juan: "+nombreClave.hashCode());
        nombreClave="Maria";
        System.out.println("HashCode de Maria: "+nombreClave.hashCode());
        nombreClave="Pedro";
        System.out.println("HashCode de Pedro: "+nombreClave.hashCode());
        
        
        // Comprobar si una clave existe
        if (edades.containsKey("Pedro")) {
            System.out.println("Pedro está en el HashMap");
        }

        // Iterar sobre el conjunto de claves **recorrete el conjunto de cosas de mi hasmap**
        for (String nombre : edades.keySet()) {
            System.out.println(nombre + " tiene " + edades.get(nombre) + " años.");
        }

        // Eliminar un elemento
        edades.remove("Juan");

        // Imprimir el tamaño actual del HashMap
        System.out.println("Número de elementos: " + edades.size());
    }
}


	


