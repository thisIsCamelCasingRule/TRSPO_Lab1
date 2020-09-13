package trspoLab1;

public class HeraldService {
	public void executeAdecree(King king) {
		String decree = king.issueAdecreee();
		System.out.println("New decree of king " + king.getName() + " was executed: " + decree);
	}
}
