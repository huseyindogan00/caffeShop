package gameStoreProject;

import java.rmi.RemoteException;

public interface GamerCheckService {
	
	public boolean checkIfRealPerson(Gamer gamer) throws NumberFormatException, RemoteException;
}
