package _05_minion;

import javax.swing.JOptionPane;

public class Minion {
	private String name;
	private int eyes;
	private String master;
	private String color;
Minion(String name, int eyes, String color, String master) {
	this.name = name;
	this.eyes = eyes;
	this.master = master;
	this.color = color;
}		

		
		public String getName() {
			return name;
		}	
		
		
		
		
		
		public String getColor() {
			return color;
		}
		
		


	
	
	public int getEyes() {
		return eyes;
	}
	 
	

	
	public String getMaster() {
		return master;
	}
	void setMaster(String newMaster){
	
			
		master=newMaster;
		
	}

}
