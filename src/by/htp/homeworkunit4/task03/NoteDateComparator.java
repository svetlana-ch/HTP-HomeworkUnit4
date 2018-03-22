package by.htp.homeworkunit4.task03;

import java.util.Comparator;

public class NoteDateComparator implements Comparator<Note>{
	
	@Override
	public int compare(Note arg0, Note arg1) {
		int year1;
		int year2;
		int month1;
		int month2;
		int day1;
		int day2;
		
		year1 = arg0.getDate().getYear();
		year2 = arg1.getDate().getYear();
		month1 = arg0.getDate().getMonth();
		month2 = arg1.getDate().getMonth();
		day1 = arg0.getDate().getDay();		
		day2 = arg1.getDate().getDay();
		
		
		if(year1 > year2){
			return 1;
		}
		
		if(year1 < year2){
			return -1;
		}

		if(month1 > month2){
			return 1;
		}
		
		if(month1 < month2){
			return -1;
		}

		if(day1 > day2){
			return 1;
		}
		
		if(day1 < day2){
			return -1;
		}
		
		return 0;
	}

}
