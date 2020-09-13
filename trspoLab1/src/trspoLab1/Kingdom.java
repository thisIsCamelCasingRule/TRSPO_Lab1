package trspoLab1;

public class Kingdom {
	private String name = "England";
	private double sqare = 39856.23;
	private int population = 1500;
	private int amountOfBuildings = 650;
	private King king;
	
	public String getName(){
		return name;
	}
	
	public double getSqare() {
		return sqare;
	}
	
	public int getPopulation() {
		return population;
	}
	
	public int getAmountOfBuildings() {
		return amountOfBuildings; 
	}
	
	public King getKing() {
		return king;
	}

	public void setKing(King king) {
		this.king = king;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setPopulation(int population) {
		this.population = population;
	}
	
	public void setSqare(double sqare) {
		this.sqare = sqare;
	}
	
	public void setAmountOfBuildings(int amountOfBuildings) {
		this.amountOfBuildings = amountOfBuildings;
	}
	
	public void showInfo() {
		System.out.println("The Kingdom " + getName() + " with sqare " + getSqare() + " and population " + getPopulation() + " is under the control of " + king.getName()+ ". Amount of buildings " + getAmountOfBuildings() + ".");
	}
	
	public void close() {
		this.amountOfBuildings = 0;
		this.king = null;
		this.name = null;
		this.population = 0;
		this.sqare = 0;
	}
	
}
