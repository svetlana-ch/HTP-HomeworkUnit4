package by.htp.homeworkunit4.task02;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		GroupAbiturients groupMath = new GroupAbiturients("Математика");

		Abiturient ab1 = new Abiturient("Ирина", "Петрова", 3, 5, 4, 3);
		Abiturient ab2 = new Abiturient("Степан", "Началов", 5, 5, 5, 5);
		Abiturient ab3 = new Abiturient("Тимур", "Кириллов", 5, 5, 5, 5);
		Abiturient ab4 = new Abiturient("Захар", "Степанов", 4, 4, 4, 4);
		Abiturient ab5 = new Abiturient("Кристина", "Полевая", 5, 5, 3, 4);
		Abiturient ab6 = new Abiturient("Вероника", "Сергеева", 5, 4, 3, 3);
		Abiturient ab7 = new Abiturient("Андрей", "Александров", 5, 5, 5, 4);
		Abiturient ab8 = new Abiturient("Петр", "Назаров", 5, 5, 5, 5);
		Abiturient ab9 = new Abiturient("Любовь", "Апполонова", 4, 5, 5, 5);
		Abiturient ab10 = new Abiturient("Денис", "Радчук", 4, 5, 2, 5);
		Abiturient ab11 = new Abiturient("Кирилл", "Захарчук", 4, 5, 3, 5);
		Abiturient ab12 = new Abiturient("Степан", "Стасюк", 4, 3, 5, 5);
		Abiturient ab13 = new Abiturient("Любовь", "Сидорова", 4, 5, 4, 5);
		
		groupMath.addAbiturient(ab1, ab2, ab3, ab4, ab5, ab6, ab7, ab8, ab9, ab10, ab11, ab12, ab13);
		/*groupMath.addAbiturient(ab2);
		groupMath.addAbiturient(ab3);
		groupMath.addAbiturient(ab4);
		groupMath.addAbiturient(ab5);
		groupMath.addAbiturient(ab6);
		groupMath.addAbiturient(ab7);
		groupMath.addAbiturient(ab8);
		groupMath.addAbiturient(ab9);
		groupMath.addAbiturient(ab10);
		groupMath.addAbiturient(ab11);
		groupMath.addAbiturient(ab12);
		groupMath.addAbiturient(ab13);*/
				
		
			
		for (Abiturient ab : groupMath.getAbiturients()) {

            System.out.println("Средний балл студента " + ab.getName() + " " +ab.getSurname() + " " + ab.getAverageMark());

        }
		
		
		Abiturient[] sortArray = groupMath.sortAbiturients(groupMath.getAbiturients());
		
		 System.out.println(sortArray.length);
		
		for (Abiturient ab : sortArray) {	
			
            System.out.println("Средний балл абитуриента " + ab.getName() + " " +ab.getSurname() + " " + ab.getAverageMark());

        }
		
		int places = readFromConsole("Введите число мест: ");
		System.out.println("Поступившие абитуриенты: ");
		
		for (int i = 0; i< places; i++) {
			
			System.out.println("Средний балл абитуриента " + sortArray[i].getName() + " " + sortArray[i].getSurname() + " " + sortArray[i].getAverageMark());

			
		}
		
				
	}
	
	
	
	
	public static int readFromConsole(String massage) {
		Scanner sc = new Scanner(System.in);
		int x = 0;
		
		System.out.print(massage);
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print(massage);			
		}
		x =  sc.nextInt();
		
		return x;
	}

}
