/*
* @author Craig Sullivan
* 11/05/2017
* Discount.java
*/

//Name of class
public class Discount{

//Declaration of data members/instance variables
	private String member;
	private String time;
	private int cost;
	private double discount;

//Constructor method - No parameters!
	public Discount(){
	}

//Declaring setter methods
	public void setMember(String member){
		this.member=member;
	}

	public void setTime(String time){
		this.time=time;
	}

	public void setCost(int cost){
		this.cost=cost;
	}

//Compute method - to determine which discount should be applied to the customers shopping
	public void compute(){

	if(member.equals("yes")){
		if(time.equals("morning")){
			if(cost<=100){
				discount=(0.025*cost);
			} else if(cost>100){
				discount=(0.05*cost);
			}
		}
	}

	if(member.equals("yes")){
		if(time.equals("evening")){
			if(cost<=100){
				discount=(0.05*cost);
			} else if(cost>100){
				discount=(0.1*cost);
			}
		}
	}

	if(member.equals("no")){
		if(time.equals("morning")){
			if(cost<=100){
				discount=(0*cost);
			} else if(cost>100){
				discount=(0*cost);
			}
		}
	}

	if(member.equals("no")){
		if(time.equals("evening")){
			if(cost<=100){
				discount=(0.02*cost);
			} else if(cost>100){
				discount=(0.04*cost);
			}
		}
	}



}

//Getter method
	public double getDiscount(){
		return discount;
}










} //Ends class
