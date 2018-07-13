package binarySearch;

import java.util.*;

public class BasicBinarySearch {
	public static void main(String[] args) {
		List<Student> allStudent = new ArrayList<Student>();
		allStudent.add(new Student("a", 3.83));
		allStudent.add(new Student("b", 3.84));
		allStudent.add(new Student("c", 3.87));
		allStudent.add(new Student("d", 3.88));
		allStudent.add(new Student("e", 3.90));
		allStudent.add(new Student("f", 3.92));
		allStudent.add(new Student("g", 3.96));
		allStudent.add(new Student("h", 4.00));
		
		//allStudent.
		System.out.println(Collections.binarySearch(allStudent, new Student("x", 3.95), new StudentComparator()));
	}
}
