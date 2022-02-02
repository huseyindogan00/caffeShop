package gameStoreProject;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class GameCheckAdapter implements GamerCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) throws NumberFormatException, RemoteException {
		
		KPSPublicSoapProxy authentication = new KPSPublicSoapProxy(); 
		boolean result = authentication.TCKimlikNoDogrula(Long.parseLong(gamer.nationalId), gamer.firstName, gamer.lastName, gamer.dateOfBirthYear);
		return result;
	}

}
