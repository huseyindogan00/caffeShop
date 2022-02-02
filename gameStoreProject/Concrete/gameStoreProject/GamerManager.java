package gameStoreProject;

import java.rmi.RemoteException;

public class GamerManager implements GamerService {

	private GamerCheckService checkService;
	
	public GamerManager(GameCheckAdapter checkService) {
		this.checkService = checkService;
	}
	
	@Override
	public void register(Gamer gamer) throws NumberFormatException, RemoteException {
		
		
		if (checkService.checkIfRealPerson(gamer)) {
			System.out.println(gamer.firstName + " isimli oyuncu kaydedildi");
		} else {
			System.out.println(gamer.firstName + " isimli oyuncu kaydedilemedi");
		}
		
	}

	@Override
	public void update(Gamer gamer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Gamer gamer) {
		// TODO Auto-generated method stub
		
	}
 

}
