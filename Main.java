package finalProject;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	
		//required textbooks for each course for semester1
		ArrayList<TextBook> physicsTextBooks = new ArrayList<>();
		physicsTextBooks.add(new TextBook(34.34, "Intro to Physics"));
		ArrayList<TextBook> csTextBooks = new ArrayList<>();
		csTextBooks.add(new TextBook(50, "Intro to Java"));
		
	    //textbooks for semester2
		ArrayList<TextBook> dramaBooks = new ArrayList<>();
		dramaBooks.add(new TextBook(30, "Drama Studies"));
		
		
		//Courses for semester1
		ArrayList<Course> semester1Courses = new ArrayList<>();
		semester1Courses.add(new Course("Introduction to CS", csTextBooks, 4));
		semester1Courses.add(new Course("Physics", physicsTextBooks, 3));
		
		//Courses for semester2
		ArrayList<Course> semester2Courses = new ArrayList<>();
		semester2Courses.add(new Course("Drama", dramaBooks, 3));
		
		//First semester 
		Semester semester1 = new Semester(semester1Courses, 45, new SchoolFees(34, 431, 343));
		//Second semester
		Semester semester2 = new Semester(semester2Courses,45, new SchoolFees(40, 500, 455));
		
		ArrayList<Semester> allSemesters = new ArrayList<>();
		allSemesters.add(semester1);
		allSemesters.add(semester2);
		
		MyCollegeCost myCollege = new MyCollegeCost("Andrew Liu", "University of Virginia", 34, allSemesters);
		
		myCollege.getCostSummary();
	}

}
