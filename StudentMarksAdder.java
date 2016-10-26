package testSuper;

import java.util.Arrays;

class Student {
    private String name;
    private int marks;
    public static int rank;
    
    public Student(String name, int marks){
    	this.name = name;
    	this.marks = marks;
    	this.rank = rank;
    }
    
    public void printStudent(){
    	System.out.println("Name: " + name + "\nMarks: " + marks + "\n");
    }
}

public class StudentMarksAdder{
	public static void main(String[] args){
		Student[] students = new Student[]{
				new Student("Ritwick", 55),
				new Student("Testy", 100),
				new Student("Deepanshu", 0),
		};
		

		for (Student s : students) {
			s.printStudent();
		}
	}
}