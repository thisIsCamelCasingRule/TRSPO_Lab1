package trspoLab1;

public class Main {

	public static void main(String[] args) {
		
		Kingdom kingdom1 = new Kingdom();
		King king = new King();
		Peasant peasant = new Peasant();
		Building building = new Building();
		UseBuildingService useBuilding = new UseBuildingService();
		HeraldService herald = new HeraldService();
		RebealService rebeal = new RebealService();
		SentenceService sentence = new SentenceService();
		
		kingdom1.setKing(king);
		kingdom1.showInfo();
		peasant.doWork();
		
		useBuilding.useBuilding(building, peasant);
		
		herald.executeAdecree(king);
		peasant.rebeal();
		rebeal.rebeal(king);
		
		sentence.execute(peasant, kingdom1);
		sentence.execute(peasant, kingdom1);
		
		Peasant peasant2 = new Peasant();
		peasant2.setName("Laura");
		
		sentence.pardon(peasant2);
		kingdom1.showInfo();
		
		Kingdom kingdom2 = new Kingdom();
		King king2 = new King();
		king2.setName("Jonatan III");
		kingdom2.setName("Ireland");
		kingdom2.setAmountOfBuildings(350);
		kingdom2.setPopulation(500);
		kingdom2.setSqare(15000.5);
		kingdom2.setKing(king2);
		
		kingdom2.showInfo();
		
		WarService war = new WarService();
		war.war(kingdom1, kingdom2);
		
		kingdom1.showInfo();

		try{
			kingdom2.showInfo();
		}catch(Exception e) {
			
			System.out.println("Such kingdom do not exist!!!");	
		}
		
	}

}
