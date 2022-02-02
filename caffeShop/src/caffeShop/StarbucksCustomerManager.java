package caffeShop;

import java.rmi.RemoteException;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void save(Customer customer) throws NumberFormatException, RemoteException {
		
		 if (this.customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("Starbucks M��terisi kaydedildi.");
		} else {
			System.out.println("Starbucks M��terisi kaydedilmedi.");
		} 
	}
}
