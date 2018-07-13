package binarySearch;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student student1, Student student2) {		
		return Double.compare(student1.getGPA(), student2.getGPA());
	}

}
