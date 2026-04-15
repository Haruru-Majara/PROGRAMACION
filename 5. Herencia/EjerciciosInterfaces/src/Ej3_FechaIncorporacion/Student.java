package Ej3_FechaIncorporacion;

import java.time.LocalDate;

class Student implements Comparable<Student>{
	private int number;
	private String name;
	private int age;
	private LocalDate finCorporacion;

	Student(int nu, String name, int age) {
		this.number = nu;
		this.name = name;
		this.age = age;
	}
	
	public Student(int number, String name, int age, LocalDate finCorporacion) {
		super();
		this.number = number;
		this.name = name;
		this.age = age;
		this.finCorporacion = finCorporacion;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Student [number=" + number + ", name=" + name + ", age=" + age + "]";
	}

	//Para ordenar por edad de menor a mayor y a misma edad por fincorporacion
	public int compareTo(Student st) {
		if (age<st.age)
			return -1;
		if (age>st.age)
			return 1;
		return finCorporacion.compareTo(st.finCorporacion);
	}
	@Override
	public int compareTo(Student st) {
		// TODO Auto-generated method stub
		return finCorporacion.compareTo(st.finCorporacion);
	}

}
