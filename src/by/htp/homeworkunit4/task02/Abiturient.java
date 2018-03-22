package by.htp.homeworkunit4.task02;

import java.util.ArrayList;

public class Abiturient {
	
	private String name;
	private String surname;
	private ArrayList<Integer> marks;

	public Abiturient(String name, String surname, int... args) {

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
		
		for (int i : marks) {			
			this.marks.add(i);
		}
	}

	public double getAverageMark() {

		double averageMark = 0;

		for (int i : marks) {
			averageMark += i;
		}

		return averageMark / marks.size();

	}

}
