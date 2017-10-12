/*
* @author Craig Sullivan
* 11/05/2017
* DiscountApp.java
*/

import javax.swing.JOptionPane; //Imports GUI input/output window

//Class Name
public class DiscountApp{

//Main method
	public static void main (String args[]){

//Users Inputs
		String member="";
		String time="";
		int cost=0;
		double discount=0.0;

//Declare Objects
	Discount myDiscount=new Discount();


//Input - Welcome
	JOptionPane.showMessageDialog(null, "Welcome to your local Market. Please enter iwhether or not, you are a member; followed by the time of day; and finally the total cost of your shopping. We will then calculate your discount!");

//Asking of the questions and storing answers

	member=JOptionPane.showInputDialog(null, "Are you a Market member? Please answer 'Yes' or 'No'.");
//Sends to instan class
		myDiscount.setMember(member);

	time=JOptionPane.showInputDialog(null, "What time of day is it? Please answer 'Morning' or 'Evening'.");
	myDiscount.setTime(time);

	cost=Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the total cost of your shopping."));
	myDiscount.setCost(cost);

//Compute the process
	myDiscount.compute();

//Output
	discount=myDiscount.getDiscount();
	JOptionPane.showMessageDialog(null, " Your total discount for the cost of your shopping is " +discount);


}











}
