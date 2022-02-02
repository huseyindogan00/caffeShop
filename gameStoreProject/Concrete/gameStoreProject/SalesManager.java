package gameStoreProject;

public class SalesManager {
	   
	
	public double hesapla(double satisFiyati, double kampanyaOrani) {
		
		return satisFiyati-(satisFiyati*(kampanyaOrani*0.01));
	}
}
