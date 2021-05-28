package _06_tea_party;
import javax.swing.JOptionPane;
public class TeaParty {
	
	    public String welcome(String name, boolean isWoman, boolean isKnighted) {
	       String knighted=JOptionPane.showInputDialog("Are you knighted?");
	       if(knighted.equalsIgnoreCase("yes")) {
	    	   isKnighted = true; 
	       }
	       String gender=JOptionPane.showInputDialog("What is your gender?");
	       if(gender.equalsIgnoreCase("girl")) {
	    	   isWoman = true;
	       }
	         if(isKnighted||isWoman) {
	        name="lady "+name;  	 
	         }
	         else if(isKnighted) {
	        	 name="sir "+name;
	         }
	         else if(isWoman) {
	        	 name="ms. "+name;
	         }
	         else {
	        	 name="mr."+name;
	         }
	    }
	  void welcome (String name){
		System.out.println("Welcome, "+name);  
		
	  }
	}
}
