package finalProject;

//create class Course with private data fields: course name, textbooks, credits
//create default constructor and args constructor to initialize objects
//create accessor and mutator methods for each data field
//create toString method to display properties in String form
//create getTextBooks costs method to return total book costs in String form

import java.util.ArrayList;

public class Course {
	
	private String courseName;
	private ArrayList<TextBook> textbooks;
	private int credits;
	
	public Course() {
		
	}
	
	public Course(String courseName, int credits) {
		this.courseName = courseName;
		this.credits = credits;
	}
	
	public Course(String courseName, ArrayList<TextBook> textbooks, int credits) {
		this.courseName = courseName;
		this.textbooks = textbooks;
		this.credits = credits;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public ArrayList<TextBook> getTextBooks() {
		return textbooks;
	}
	
	public void setTextBooks(ArrayList<TextBook> textbooks) {
		this.textbooks = textbooks;
	}
	
	public int getCredits() {
		return credits;
	}
	
	public void setCredits(int credits) {
		this.credits = credits;
	}
	
	public String toString() {
		return "Course: " + courseName + "    TextBooks: " + textbooks + "    Credits: " + credits;
	}
	
	//method that returns total textbook costs for every course
	public double getTextBookCosts() {
	
		double totalTextBookCosts = 0;
		TextBook specificTextbook;
		
		//iterate through array list of textbooks to get each textbook and add its price to total book costs
		for (int i = 0; i < textbooks.size(); i++) {
			
			//gets textbook object at specified index and assigns to specificTextbook
			specificTextbook = textbooks.get(i);
			
			//add price of specific textbook to total textbook costs
			totalTextBookCosts += specificTextbook.getPrice();
			
		}
		
		return totalTextBookCosts;
		
	}
	
}
	
