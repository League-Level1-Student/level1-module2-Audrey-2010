package _02_smurf;

import javax.swing.JOptionPane;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

/* 
 * 1. Watch this Smurf cartoon: https://www.youtube.com/watch?v=7-RDGT5Lsp8 
 * 2. In a Runner class, make a Handy Smurf. Use the methods below to make him eat, and print his name.
 * 3. & 4. see comments in code below
 * 5. Make a Papa Smurf and print his name, hat color and girl or boy.
 * 6. Make a Smurfette and print her name, hat color and girl or boy. 
 */

public class Smurf {

	private String name;

	Smurf(String name) {
		this.name = name;
	}

	public String getName() {
		return "My name is " + name + " Smurf.";
	}

	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}

	// Papa Smurf wears a red hat, all the others are white.
	public String getHatColor() {
		String hat =JOptionPane.showInputDialog("Is "+" Papa Smurf?");
		if(hat.equals("yes")) {
			System.out.println("is red");
			return "red";
		}
		if(hat.equals("no")) {
			System.out.println("is white");
			return "white";
			
		}
		return "";
	}

	// Smurfette is the only female Smurf.
	public String isGirlOrBoy() {
		String gender = JOptionPane.showInputDialog(null,"Is "+name+" a girl or boy?");
		if(gender.equals("girl")) {
			System.out.println("smurfette");
			return "girl";
		}
		if(gender.equals("boy")) {
			System.out.println("smurf");
			return "boy";
			
		}
		return "";
	}

}


