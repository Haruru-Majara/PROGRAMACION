package ejemploInterface3;

import java.util.Comparator;

public class StudentPorEdad implements Comparator<Student>{
	
	@Override
	public int compare(Student arg0, Student arg1) {
		// TODO Auto-generated method stub
		if (arg0.getAge()==arg1.getAge())
			return 0;
		if (arg0.getAge()<arg1.getAge())
			return -1;
		
		return 1;
	}
}
