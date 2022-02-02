package caffeShop;

import java.rmi.RemoteException;

public class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) throws NumberFormatException, RemoteException {
		 System.out.println("Müþteri Kaydedildi "+customer.firstName);		
	}

	
}
