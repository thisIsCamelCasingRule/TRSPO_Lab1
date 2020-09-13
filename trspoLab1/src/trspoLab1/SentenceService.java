package trspoLab1;

public class SentenceService {
	public void execute(Peasant peasant, Kingdom kingdom) {
		if(peasant.getStatus()) {
			System.out.println("For the word of King citizen " + peasant.getName() + " was executed! Rest in piace.");
			peasant.setStatus(false);
			kingdom.setPopulation(kingdom.getPopulation() - 1);
		}
		else {
			System.out.println(peasant.getName() + " is already dead! You can't kill the deadman.");
		}
	}
	
	public void pardon(Peasant peasant) {
		System.out.println("For the word of King citizen " + peasant.getName() + " was pardoned! Congratulations!!!");
	}
}
