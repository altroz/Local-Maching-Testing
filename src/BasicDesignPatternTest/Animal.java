package BasicDesignPatternTest;

public class Animal {
	private String name;
	private double height;
	private int weight;
	private String sound;
	// Getter & Setter Methods for Name
	public void setName(String newName){name = newName;}
	public String getName(){return name;}
	
	//Getter & Setter methods for Weight
	public void setWeight(int newWeight){
		if(newWeight>0)
			weight = newWeight;
		else
			System.out.println("Weight must be greater than zero");
	}
	public int getWeight(){return weight;}
	
	//Getter & Setter methods for Sound
	public void setSound(String newSound){sound = newSound;}
	public String getSound(){return sound;}
	
}
