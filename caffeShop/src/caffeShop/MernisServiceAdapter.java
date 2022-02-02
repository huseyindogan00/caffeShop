package caffeShop;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) throws NumberFormatException, RemoteException {
		  
		KPSPublicSoapProxy kpspControl = new KPSPublicSoapProxy();
		boolean result = kpspControl.TCKimlikNoDogrula(
				Long.parseLong(customer.nationalId),
				customer.firstName.toUpperCase(),
				customer.lastName.toUpperCase(), 
				customer.year
				);
		
		return result;
	}

}
