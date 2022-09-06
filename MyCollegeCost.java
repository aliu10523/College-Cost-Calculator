package finalProject;

//create class MyCollegeCost with private data fields: name, college name, required credits, list of semesters
//create default constructor and args constructor to initialize objects
//create accessor and mutator methods for each object
//create toString method that returns properties of college cost in String form
//create getCostSummary method that returns total college cost for all semesters in detail

import java.util.ArrayList;

public class MyCollegeCost {
	
	private String name;
	private String collegeName;
	private int requiredCredits;
	
	//list of semester objects
	ArrayList<Semester> totalSemesters;
	
	
	public MyCollegeCost() {
		
	}
	
	public MyCollegeCost(String name, String collegeName, int requiredCredits, ArrayList<Semester> totalSemesters) {
		
		this.name = name;
		this.collegeName = collegeName;
		this.requiredCredits = requiredCredits;
		this.totalSemesters = totalSemesters;
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String collegeName() {
		return collegeName;
	}
	
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	public int getRequiredCredits() {
		return requiredCredits;
	}
	
	public void setRequiredCredits(int requiredCredits) {
		this.requiredCredits = requiredCredits;
	}
	
	public ArrayList<Semester> getTotalSemesters() {
		return totalSemesters;
	}
	
	public void setTotalSemesters(ArrayList<Semester> totalSemesters) {
		this.totalSemesters = totalSemesters;
	}
	
	public String toString() {
		return "Name: " + name + "\nCollege: " + collegeName + "\nRequired Credits: " + requiredCredits;
	}
	
	//method to return the cost of the sum of every semester in string form
	public void getCostSummary() {
		System.out.println("Name: " + name + "    College: " + collegeName + "    Required Credits: " + requiredCredits);
		
		Semester specificSemester = new Semester();
		double totalCollegeCost = 0;
		
		//loop through the length of semester array
		for (int i = 0; i < totalSemesters.size(); i++) {
			
			//assign semester element at the specified index to specific semester
			specificSemester = totalSemesters.get(i);
			//add cost of specific semester to total college cost
			totalCollegeCost += specificSemester.totalCost();
			
			System.out.println("\nSemester: " + (i + 1) + "\n" + specificSemester.toString());
			System.out.println();
		}
		
		
		System.out.println("\n Your College Cost: " + totalCollegeCost + " dollars");
		
	}
}
