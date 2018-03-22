package by.htp.homeworkunit4.task03;

import java.util.Comparator;

public class NoteTextComparator implements Comparator<Note>{
	

	@Override
	public int compare(Note arg0, Note arg1) {
		String text1;
		String text2;
		
		text1 = arg0.getText().toLowerCase();
		text2 = arg1.getText().toLowerCase();
		
		
		
		return text1.compareTo(text2);
	}

}
