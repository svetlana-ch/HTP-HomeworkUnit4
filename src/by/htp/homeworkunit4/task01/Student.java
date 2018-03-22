package by.htp.homeworkunit4.task01;

import java.util.ArrayList;

public class Student {
	
	private String name;
	private String surname;
	private ArrayList<Integer> marks;
	
	public Student (String name, String surname, int ...args) {
		
		this.name = name;
		this.surname = surname;
		marks = new ArrayList<>();
		for (int i : args) {			
			this.marks.add(i);			
		}
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public ArrayList<Integer> getMarks() {
		return marks;
	}

	public void setMarks(int ...marks) {
		for (int i = 0; i < marks.length; i++) {			
			this.marks.add(marks[i]);
			
		}
		/*
		for (int i : marks) {			
			this.marks.add(i);			
		}*/
	}
	
	/*public void setMarks(ArrayList<Integer> marks) {
		this.marks = marks;
	}*/
	
	public double getAverageMark() {
		
		double averageMark = 0;

		for (int i : marks) {			
			averageMark += i;			
		}
		
		return averageMark/marks.size();

	}

	
	

}
