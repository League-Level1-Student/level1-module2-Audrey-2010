package _06_tea_party;
import javax.swing.JOptionPane;
public class TeaParty {
	
	    public String welcome(String name, boolean isWoman, boolean isKnighted) {
	     String hello= "Hello ";
	       
	         if(isKnighted&&isWoman) {
	      hello=hello+"Lady "; 	 
	         }
	         else if(isKnighted) {
	        	 hello=hello+"Sir ";
	         }
	         else if(isWoman) {
	        	 hello=hello+"Ms. ";
	         }
	         else {
	        	 hello=hello+"Mr. ";
	         }
	     
	         hello=hello+name;
	         
	        return hello;
	         
			
	    }
 
		
	  }
	

