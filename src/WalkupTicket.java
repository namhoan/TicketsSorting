/**
 Namho An
 COSI 12b 
 PAO3 Part1
 3/5/2015
 */
//This class defines behavior for purchasing tickets as walkups.
//It extends the regular ticket class.
public class WalkupTicket extends RegularTicket{
	//This is the constructor for WalkupTicket, and set the price to $50.
	public WalkupTicket(int ticketNumber){
	    super(ticketNumber);
		super.price = 50.0;
	}
	
	//toString returns ticket data as a string.
	public String toString(){
		return super.toString() + "This is a walkup ticket.\n"; //printing out same is RegularTicket toString
	}//end of method toString
	
}