package trspoLab1;

public class RebealService {
	public void rebeal(King king) {
        System.out.print("For the cruel things the king " + king.getName() + " was slaved!\n");
        	king.setName("George II"); 
        	System.out.print("Welcome new king - " + king.getName() + "\n");
        
	}
}
