package trspoLab1;
import java.util.Scanner;
public class King {
	private String name = "Georg I";
	private String position = "King";
	
	public String getName() {
		return name;
	}
	
	public String getPosition() {
		return position;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public String issueAdecreee() {
		try {
		Scanner in = new Scanner(System.in);
        System.out.print("Input decree: ");
        String decree = in.nextLine();
        in.close();
        return decree;
        }catch(Exception e) {
        	return "Another not important decree";
        }
	}
}
