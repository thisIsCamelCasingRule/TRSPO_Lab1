package trspoLab1;

public class WarService {
	public void war(Kingdom kingdom1, Kingdom kingdom2) {
		double kingdomPower1 = kingdom1.getAmountOfBuildings()*kingdom1.getPopulation() / kingdom1.getPopulation();
		double kingdomPower2 = kingdom2.getAmountOfBuildings()*kingdom2.getPopulation() / kingdom2.getPopulation();
		
		int prewPopulation1 = kingdom1.getPopulation();
		int prewPopulation2 = kingdom2.getPopulation();
		
		if(kingdomPower1 > kingdomPower2) {
			kingdom1.setPopulation((kingdom1.getPopulation() / 2) + (int) (Math.random() * (kingdom1.getPopulation() / 2)));
			kingdom1.setAmountOfBuildings(kingdom1.getAmountOfBuildings() + kingdom2.getAmountOfBuildings());
			kingdom1.setSqare(kingdom1.getSqare() + kingdom2.getSqare());
			
			kingdom2.setPopulation( (kingdom2.getPopulation() / 2 - (int) (Math.random() * (kingdom2.getPopulation() / 2))));
			
			System.out.println("The Great War is over! Winer is " + kingdom1.getName() + ". The population after war has changed:  " + kingdom1.getPopulation() +"(" + (kingdom1.getPopulation() - prewPopulation1) +") for " + kingdom1.getName() + ", and " + kingdom2.getPopulation() + "(" + (kingdom2.getPopulation() - prewPopulation2) +") for " + kingdom2.getName() + ".");
		
			kingdom1.setPopulation(kingdom1.getPopulation() + kingdom2.getPopulation());
			
			kingdom2.close();
		}
		else if(kingdomPower1 < kingdomPower2) {
			kingdom2.setPopulation((kingdom2.getPopulation() / 2) + (int) Math.random() * (kingdom2.getPopulation() / 2) + (kingdom1.getPopulation() / 2 - (int) Math.random() * (kingdom1.getPopulation() / 2)));
			kingdom2.setAmountOfBuildings(kingdom2.getAmountOfBuildings() + kingdom1.getAmountOfBuildings());
			kingdom2.setSqare(kingdom2.getSqare() + kingdom1.getSqare());
			
			kingdom1.setPopulation( (kingdom1.getPopulation() / 2 - (int) (Math.random() * (kingdom1.getPopulation() / 2))));
			
			System.out.println("The Great War is over! Winer is " + kingdom2.getName() + ". The population after war has changed:  " + kingdom2.getPopulation() +"(" + (kingdom2.getPopulation() - prewPopulation2) +") for " + kingdom2.getName() + ", and " + kingdom1.getPopulation() + "(" + (kingdom1.getPopulation() - prewPopulation1) +") for " + kingdom1.getName() + ".");
		
			kingdom2.setPopulation(kingdom2.getPopulation() + kingdom1.getPopulation());
			
			kingdom1.close();
			}
		else {
			kingdom1.setPopulation((kingdom1.getPopulation() / 2) + (int) Math.random() * (kingdom1.getPopulation() / 2));
			kingdom2.setPopulation((kingdom2.getPopulation() / 2) + (int) Math.random() * (kingdom2.getPopulation() / 2));
			System.out.println("The Great War is over! It is a thie. The population after war:  " + kingdom2.getPopulation() +"(" + (kingdom2.getPopulation() - prewPopulation2) +") for " + kingdom2.getName() + ", and " + kingdom1.getPopulation() + "(" + (kingdom1.getPopulation() - prewPopulation1) +") for " + kingdom1.getName() + ".");
		}
	}

}
