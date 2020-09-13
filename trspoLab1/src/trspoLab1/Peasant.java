package trspoLab1;

public class Peasant {
	private String name = "Joe";
	private String position = "Farmer";
	private boolean status = true;
	
	public String getName() {
		return name;
	}
	
	public String getPosition() {
		return position;
	}
	
	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void doWork(){
		if(status) {
			System.out.println(name + " doing some " + position + " work...");
		}
		else {
			System.out.println(name + " is already dead!");
		}
	}
	
	public void rebeal(){
		if(status) {
			System.out.println(name + " hate curent King and don't want to work");
		}
		else {
			System.out.println(name + " is already dead!");
		}
		
	}
}
