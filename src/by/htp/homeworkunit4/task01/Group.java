package by.htp.homeworkunit4.task01;

import java.util.ArrayList;

public class Group {
	
	private String groupName;
	private ArrayList<Student> students;
	
	public Group(String groupName) {
		students = new ArrayList<Student>();
		this.groupName = groupName;
	}
	
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public ArrayList<Student> getStudents() {
		return students;
	}
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	
	
	public void addStudent(Student student) {

        students.add(student);

    }



    public void deleteStudent(Student student) {

        students.remove(student);
    }
    
    
    
    public double getGroupAverageMark() {

        double sum = 0;

        for (Student student : students) {

            sum += student.getAverageMark();

        }

        return sum / students.size();

    }
	
    public int getNumberExcellentStudents() {

        int count = 0;

        for (Student student : students) {

        	if (student.getAverageMark() == 5) {

				count++;

			};

        }

        return count;

    }
    
    
    public int getNumberStudentsHavingTwo() {

        int count = 0;

        for (Student student : students) {
        	for (int mark : student.getMarks()) {
        		if (mark ==2) {
        			count ++;
        			break;
        		}
        		
        	}
        	
        }

        return count;

    }
	
	

}
