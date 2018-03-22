package by.htp.homeworkunit4.task03;

import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class MainTask3 {

	public static void main(String[] args) {
		
		
		/*Note note1 = new Note("note1", new Date(2019, 2, 2), true);
		Note note2 = new Note("note1", new Date(2013, 3, 3), true);
		Note note3 = new Note("аа  note3", new Date(2019, 2, 1), true);
		
		//note1.compareTo(note2);
		
		NoteTextComparator comparator1 = new NoteTextComparator();
		TreeSet<Note> set = new TreeSet<Note>(comparator1);
		
		set.add(note1);
		set.add(note2);
		set.add(note3);
		
		for(Note n : set){
			System.out.println(n.getDate().getYear() + n.getText());
		}
		
		NoteDateComparator comparator = new NoteDateComparator();
		TreeSet<Note> set2 = new TreeSet<Note>(comparator);		
		
		set2.add(note1);
		set2.add(note2);
		set2.add(note3);
		
		for(Note n : set2){
			System.out.println(n.getDate().getYear());
		}
		*/
		
		NoteBook noteBookPetya = new NoteBook("Petya", "Petrov");
		
		noteBookPetya.add("первая запись", 2016, 1, 1);
		noteBookPetya.add("запись", 2016, 2, 2);
		noteBookPetya.add("запись", 2016, 5, 1);
		noteBookPetya.add("не забыть завтра", 2016, 1, 1);
		noteBookPetya.add("555", 2013, 1, 1);
		noteBookPetya.add("note", 2056, 10, 1);
		noteBookPetya.add("test", 2026, 1, 19);
		noteBookPetya.add("завтра запись", 2016, 11,51);
		noteBookPetya.add("завтразавтразавтра", 2015, 1, 1);
		noteBookPetya.add("сегодня", 2014, 1, 1);
		noteBookPetya.add("запись", 2016, 1, 1);
		noteBookPetya.add("test", 2016, 1, 1);
		noteBookPetya.add("Петя Петров", 2016, 1, 13);
		noteBookPetya.add("Новый Год!!!!!", 2018, 1, 1);
		noteBookPetya.add("888", 2017, 6, 6);
		noteBookPetya.add("зaвтра с латиницей", 2020, 1, 1);
		noteBookPetya.add("ввввв", 2020, 1, 2);
		noteBookPetya.add("ббб", 2020, 1, 3);
		noteBookPetya.add("ааа", 2020, 1, 4);
		noteBookPetya.add("гггг", 2020, 1, 5);
		
		
		System.out.println("***Сортировка по дате******************************");
		
		NoteDateComparator noteDateComparator = new NoteDateComparator();
		noteBookPetya.getNotes().sort(noteDateComparator);
		
		noteBookPetya.printNoteBook();
		
		System.out.println("***Сортировка по тексту******************************");


		NoteTextComparator noteTextComparator = new NoteTextComparator();
		noteBookPetya.getNotes().sort(noteTextComparator);

		noteBookPetya.printNoteBook();
		
		System.out.println("***Сортировка по дате и тексту******************************");

		Comparator<Note> noteDateAndTextComparator = new NoteDateComparator().thenComparing(new NoteTextComparator());
		noteBookPetya.getNotes().sort(noteDateAndTextComparator);
		
		noteBookPetya.printNoteBook();

		/*for (Note note : noteBookPetya.getNotes()) {

			note.printNote();

		}*/
		
		System.out.println("***Поиск по тексту******************************");
		
		for (Note note : noteBookPetya.findNote("завтра")) {

			note.printNote();

		}
				
		System.out.println("***Поиск по дате******************************");
		
		for (Note note : noteBookPetya.findNote(new Date(2016, 1, 1))) {

			note.printNote();

		}
				
		System.out.println("***Поиск актуальных******************************");
		
		for (Note note : noteBookPetya.findNoteActual(false)) {

			note.printNote();

		}

			
		
		System.out.println("***Удаление записей по тексту******************************");
		
		noteBookPetya.remove("завтра");

		noteBookPetya.printNoteBook();


	}

}
