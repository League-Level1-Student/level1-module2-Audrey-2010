package _03_tea_maker;

public class TeaMakerRunner {
public static void main(String[] args) {
	

	TeaBag tea = new TeaBag("mint");
Kettle kettle = new Kettle();
Cup cup = new Cup();


kettle.boil();
Kettle.Water hotWater = kettle.getWater();
cup.makeTea(tea,hotWater); 
	

}
}