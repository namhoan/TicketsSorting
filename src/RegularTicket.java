/**
 Namho An
 COSI 12b 
 PAO3 Part1
 3/5/2015
 */
//This class creates RegularTicket and is extended by other classes such as advanced and WalkUpticket.
public class RegularTicket{
	//set the constructors
	double price = 40.00; //set the regular ticket price as 40 dollars
	private int ticketNumber; 
	
	//This is the constructor for a Regular Ticket object
	public RegularTicket(int ticketNumber){
		this.ticketNumber = ticketNumber;
	}//end of constructor
	
	//getPrice method returns price as a double.
	public double getPrice(){
		return this.price;
	}//end of method getPrice
	
	//toString with printing out in String.format.
	public String toString(){
	    String output = String.format("Ticket number: %d and price: $%.2f\n", this.ticketNumber, this.getPrice());
		return output;
	}//end of method toString
	
}