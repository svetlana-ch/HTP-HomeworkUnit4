package by.htp.homeworkunit4.task01;

public class Main {

	public static void main(String[] args) {
		
		Group groupJP18 = new Group("JP-18");
		
		Student student1 = new Student("Ирина", "Петрова", 3, 5, 4, 3, 4);
		Student student2 = new Student("Степан", "Началов", 5, 5, 5, 5, 5);
		Student student3 = new Student("Тимур", "Кириллов", 5, 5, 5, 5, 5);
		Student student4 = new Student("Захар", "Степанов", 2, 2, 4, 3, 4);
		Student student5 = new Student("Кристина", "Полевая", 5, 2, 2, 3, 4);
		Student student6 = new Student("Вероника", "Сергеева", 2, 5, 4, 3, 2);
		Student student7 = new Student("Андрей", "Александров", 5, 5, 5, 5, 4);
		Student student8 = new Student("Петр", "Назаров", 5, 5, 5, 5, 5);
		Student student9 = new Student("Любовь", "Апполонова", 4, 5, 2, 5);
		
		groupJP18.addStudent(student1); 
		groupJP18.addStudent(student2);
		groupJP18.addStudent(student3);
		groupJP18.addStudent(student4);
		groupJP18.addStudent(student5);
		groupJP18.addStudent(student6);
		groupJP18.addStudent(student7);
		groupJP18.addStudent(student8);
		groupJP18.addStudent(student9);
		
		System.out.printf("Средний балл учебной группы " + groupJP18.getGroupName() + " %f\n", groupJP18.getGroupAverageMark());
		
		for (Student student : groupJP18.getStudents()) {

            System.out.println("Средний балл студента " + student.getName() + " " +student.getSurname() + " " + student.getAverageMark());

        }
		
		System.out.println("Число отличников в группе равно  " + groupJP18.getNumberExcellentStudents());
		
		System.out.println("Количество студентов, имеющих \"2\" -  " + groupJP18.getNumberStudentsHavingTwo());
		
	}

}
