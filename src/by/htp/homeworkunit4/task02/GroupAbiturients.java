package by.htp.homeworkunit4.task02;

import java.util.ArrayList;

public class GroupAbiturients {
	
	private String groupName;	
	private ArrayList<Abiturient> abiturients;
	
	public GroupAbiturients(String groupName) {
		abiturients = new ArrayList<Abiturient>();
		this.groupName = groupName;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public ArrayList<Abiturient> getAbiturients() {
		return abiturients;
	}

	public void setAbiturients(ArrayList<Abiturient> abiturients) {
		this.abiturients = abiturients;
	}
	
	public void addAbiturient(Abiturient ...args) {

		for (int i = 0; i < args.length; i++) {
		
			abiturients.add(args[i]);
		
		}

    }



    public void deleteAbiturient(Abiturient abiturient) {

    	abiturients.remove(abiturient);
    }
    
    
    
    public double getGroupAverageMark() {

        double sum = 0;

        for (Abiturient abiturient : abiturients) {

            sum += abiturient.getAverageMark();

        }

        return sum / abiturients.size();

    }
    
    
    public Abiturient[] sortAbiturients(ArrayList<Abiturient> list) {

        Abiturient temp = null;
        Abiturient[] array = new Abiturient[list.size()];
        array = (Abiturient[]) list.toArray(array);

        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length; j++) {

                if (array[i].getAverageMark() < array[j].getAverageMark()) {

                    temp = array[i];

                    array[i] = array[j];

                    array[j] = temp;

                }

            }

        }



        return array;

    }
    
   
}
