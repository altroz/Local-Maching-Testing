package FactoryDesignTest;
import java.util.Scanner;
public class EnemyShipTest {
	public static void main(String[]args){
		EnemyShipFactory shipFactory = new EnemyShipFactory();
		EnemyShip theEnemy= null;
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("What kind of EnemyShip do you want? (U/R/B)");
		if(userInput.hasNextLine()){
			String typeOfShip = userInput.nextLine();
			theEnemy= shipFactory.makeEnemyShip(typeOfShip);
			if(theEnemy != null){doStuffEnemy(theEnemy);}
			else System.out.println("Please enter the right values.");
		}
	}
	
	public static void doStuffEnemy(EnemyShip anEnemyShip){
		anEnemyShip.displayEnemy();
		anEnemyShip.followHeroShip();
		anEnemyShip.enemyShipShoots();
	}
}
