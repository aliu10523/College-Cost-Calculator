package finalProject;

//create class Semester with private data fields: courses, tuition rate, schoolFees
//create default constructor and args constructor to initialize objects
//create accessor and mutator methods for each data field
//create toString method to return properties in String form
//create method to return total cost of tuition and fees in String form

import java.util.ArrayList;

public class Semester {
	
	private ArrayList<Course> courses;
	private int tuitionRate;
	private SchoolFees schoolFees;
	
	public Semester() {
		
	}
	
	public Semester(ArrayList<Course> courses, int tuitionRate, SchoolFees schoolFees) {
		
		this.courses = courses;
		this.tuitionRate = tuitionRate;
		this.schoolFees = schoolFees;
		
	}

	public ArrayList<Course> getCourses() {
		return courses;
	}
	
	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}
	
	public int getTuitionRate() {
		return tuitionRate;
	}
	
	public void setTuitionRate(int tuitionRate) {
		this.tuitionRate = tuitionRate;
	}
	
	public SchoolFees getSchoolFees() {
		return schoolFees;
	}
	
	public void setSchoolFees(SchoolFees schoolFees) {
		this.schoolFees = schoolFees;
	}
	
	public String toString() {
		return courses + "\nTuition Rate: " + tuitionRate + " dollars per credit";
		
	}
	
	//method to return String form of total cost of everything for this semester
	public double totalCost() {
		
		//Object to store number of credits for each distinct course
		Course courseCredits = new Course();
		int totalCredits = 0; 
		
		//iterate to get each element of index of array then add to totalCredits 
		for (int i = 0; i < courses.size(); i++) {
			
			courseCredits = courses.get(i);
			totalCredits += courseCredits.getCredits();
			totalCredits += courseCredits.getTextBookCosts();			
		}
		//multiply tuitionRate to total number of credits to find tuition cost for this semester
		double totalCost = tuitionRate * totalCredits;
		//add total fees to total cost
		totalCost += schoolFees.totalFeeCost();
		return totalCost;
	}
}
