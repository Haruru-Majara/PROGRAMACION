package Sintaxis;

import java.util.Objects;


class Alumno {
    String nombre;
    int edad;

    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Para que contains() funcione correctamente
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Alumno a = (Alumno) obj;
        return edad == a.edad && nombre.equals(a.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad);
    }

    @Override
    public String toString() {
        return nombre + " " + edad;
    }
}
	