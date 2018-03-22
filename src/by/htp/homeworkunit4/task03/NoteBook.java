package by.htp.homeworkunit4.task03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NoteBook {
	private String ownerName;
	private String ownerSurname;

	private List<Note> notes;

	public NoteBook(String ownerName, String ownerSurname) {
		this.ownerName = ownerName;
		this.ownerSurname = ownerSurname;

		notes = new ArrayList<Note>();
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerSurname() {
		return ownerSurname;
	}

	public void setOwnerSurname(String ownerSurname) {
		this.ownerSurname = ownerSurname;
	}
	
	

	public List<Note> getNotes() {
		return notes;
	}

	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}

	public void add(String text, int year, int month, int day) {
		Note newNote = new Note(text, new Date(year, month, day), true);
		notes.add(newNote);
	}
	
	
	public List<Note> findNote(String text) {// println
		
		List<Note> results = new ArrayList<>();
		for (Note note : notes) {
			if (note.getText().contains(text)) {
				results.add(note);
			}

		}
		return results;
	}
	
	

	public List<Note> findNote(Date d) {
		List<Note> results = new ArrayList<>();
		for (Note note : notes) {
			if (note.getDate().equals(d)) {
				results.add(note);
			}

		}
		
		return results;
	}
	
	
	public List<Note> findNoteActual(boolean filter) {
		List<Note> results = new ArrayList<>();
		for (Note note : notes) {
			if (note.isActual() == filter) {
				results.add(note);
			}

		}
		
		return results;
	}

	public void remove(String text) {		
			
			Iterator<Note> iter = notes.iterator();
			
			while(iter.hasNext()){
				Note next = iter.next();
				if(next.getText().contains(text))
					iter.remove(); //notes.remove(next);		
			
					
		}
		
		
	}
	
	public void printNoteBook() {// println
		for (Note n : notes) {
		System.out.printf("%d %-2d %-2d  %-30s  %s \n", n.getDate().getYear(), n.getDate().getMonth(), 
				n.getDate().getDay(), n.getText(), n.isActual());
		}
		
	} 

}
