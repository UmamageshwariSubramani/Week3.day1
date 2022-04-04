package org.student;

import org.college.College;

public class Student extends College {
	
	public void studentName() {
		System.out.println("Display the student name");
		
	}
    public void studentDept() {
    	System.out.println("Display the student department");
		
	}

    public void studentId() {
    	System.out.println("Display the studen id");
	
}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student details = new Student ();
		details.collegeCode();
		details.collegeName();
		details.collegeRank();
		details.deptName();
		details.studentDept();
		details.studentId();
		details.studentName();

	}

}
