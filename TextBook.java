package finalProject;

//create class Textbook with private data fields: price, title, dateOwned
//create default constructor and args-constructor to initialize object
//create accessor and mutator methods for price and title
//create toString method to return properties in String form

public class TextBook {
	
	private double price;
	private String title;
	private java.util.Date dateOwned;
	
	public TextBook() {
		dateOwned = new java.util.Date();
		
	}
	
	public TextBook(double price, String title) {
		this.price = price;
		this.title = title;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String toString() {
		return "Title: " + title + "\nPrice: " + price + " dollars"; 
	}
	
}
