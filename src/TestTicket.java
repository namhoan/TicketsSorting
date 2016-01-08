/**
 Namho An
 COSI 12b 
 PAO3 Part1
 3/5/2015
 */
//This class is a client code on part1 and calculates the total tickets 
public class TestTicket{
    //The total amount of tickets the array can store is 15
    private static int TOTAL_TICKETS = 15;
    
    public static void main(String [] args)
    {      
        //Initializing ticketArray
        RegularTicket [] ticketArray;
        ticketArray = new RegularTicket[TOTAL_TICKETS];
        int daysInAdvance = 30;//preset the dayInAdvance to use in the AdvanceTicket and StudentAdvanceTicket
        //Initial ticket number is set to 1.
        int ticketNumber = 1;
        
        
        //While the amount of tickets is less than the maximum, add these tickets to the database.
        while (ticketNumber <= TOTAL_TICKETS){
            //If the ticket is in positions 0-2 or 11-15 then store as RegularTickets
            if (ticketNumber - 1 < 3 || ticketNumber - 1 > 10)
            {
                ticketArray[ticketNumber - 1]= new RegularTicket(ticketNumber);
            }
            //If the ticket is in positions 3 and 4 in array then store as WalupTicket
            else if (ticketNumber - 1 < 5)
            {
                ticketArray[ticketNumber - 1] = new WalkupTicket(ticketNumber);
            }
            //If the ticket is in positions 5, 6 and 7 in array then store as AdvanceTicket
            else if (ticketNumber - 1 < 8)
            {
            	ticketArray[ticketNumber - 1] = new AdvanceTicket(ticketNumber, daysInAdvance);
            	if (ticketNumber - 1 == 5){
            		daysInAdvance = 15;
            	}
            	if (ticketNumber - 1 == 6){
            		daysInAdvance = 3;
            	}
            	if (ticketNumber - 1 == 7){
            		daysInAdvance = 30;
            	}
            }
            //If the ticket is in positions 8, 9, 10 in array then store as StudentAdvanceTicket
            else if (ticketNumber - 1 < 11)
            {
            	ticketArray[ticketNumber - 1] = new StudentAdvanceTicket(ticketNumber, daysInAdvance);
            	if (ticketNumber - 1 == 8){
            		daysInAdvance = 15;
            	}
            	if (ticketNumber - 1 == 9){
            		daysInAdvance = 3;
            	}
            	if (ticketNumber - 1 == 10){
            		daysInAdvance = 30;
            	}
            }
            ++ticketNumber;
        }
        //Print the tickets in the array.
        printTickets(ticketArray);
        System.out.format("The total price of the tickets is $%.2f\n", getTotalPrice(ticketArray));
    }
    
    //printTickets goes through the array of objects and calls their toString()
    // methods to print tickets
    public static void printTickets(RegularTicket [] ticketArray)
    {
        for (int i = 0; i < TOTAL_TICKETS; i++)
        {
            System.out.println(ticketArray[i].toString());
        }
    }//End of printTickets
    
    //getTotalPrice increments through the ticketArray and adds prices together,
    // returning it as a double.
    public static double getTotalPrice(RegularTicket[] ticketArray)
    {
        double totalPrice = 0.00;
        for (int i = 0; i < TOTAL_TICKETS; i++)
        {
            totalPrice += ticketArray[i].getPrice();
        }
        return totalPrice;
    }//End of getTotalPrice

}//End of class Test Ticket.
