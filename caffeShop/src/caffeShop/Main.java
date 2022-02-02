package caffeShop;

import java.rmi.RemoteException;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		 
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer("HÜSEYÝN", "DOÐAN", "12312514113", 1991)); 
		 
	}

}
