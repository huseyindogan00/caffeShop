package gameStoreProject;

import java.rmi.RemoteException;

public interface GamerService {
	public void register(Gamer gamer) throws NumberFormatException, RemoteException;
	public void update(Gamer gamer);
	public void delete(Gamer gamer);
}
