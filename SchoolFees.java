package finalProject;

//create class SchoolFees with private data fields: transcript, comprehensive, activity fees
//create args constructor to initialize objects
//create accessor and mutator method for each object
// create toString method to print properties of School fees in string form
//create method that return totalFees by adding all fees

public class SchoolFees {
	
	private int transcriptFee;
	private int comprehensiveFee;
	private int activityFee;
	
	public SchoolFees(int transcriptFee, int comprehensiveFee, int activityFee) {
		
		this.transcriptFee = transcriptFee;
		this.comprehensiveFee = comprehensiveFee;
		this.activityFee = activityFee;
		
	}
	
	public int getTranscriptFee() {
		return transcriptFee;
	}
	
	public void setTranscriptFee(int transcriptFee) {
		this.transcriptFee = transcriptFee;
	}
	
	public int getComprehensiveFee() {
		return comprehensiveFee;
	}
	
	public void setComprehensiveFee(int comprehensiveFee) {
		this.comprehensiveFee = comprehensiveFee;
	}
	
	public int getActivityFee() {
		return activityFee;
	}
	
	public void setActivityFee(int activityFee) {
		this.activityFee = activityFee;
	}
	
	public String toString() {
		
		return "Transcript Fee: " + transcriptFee + "\nComprehensive Fee: " + 
				comprehensiveFee + "\nActivity Fee: " + activityFee;
	}
	
	public int totalFeeCost() {
		
		//find total fee with the sum of each specific fee
		return transcriptFee + comprehensiveFee + activityFee;
	}
	
}
