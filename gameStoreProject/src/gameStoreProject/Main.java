package gameStoreProject;

import java.rmi.RemoteException;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		 
		GamerManager gamerManager = new GamerManager(new GameCheckAdapter());
		gamerManager.register(new Gamer(1, "HÜSEYÝN", "DOÐAN", "43243245906", 1991));
		
		Game game = new Game(1,"GTA 5",2000);
		GameManager gameManager = new GameManager();
		gameManager.save(game);
		
		Campaign campaign = new Campaign(1, 20, "1 hafta");
		
		SalesManager salesManager=new SalesManager();
		System.out.println("Ýndirim Oraný : "+ ((campaign.getDiscount()*0.01)*game.getGamePrice()));
		System.out.println(salesManager.hesapla(game.getGamePrice(),campaign.getDiscount()));
	}

}
