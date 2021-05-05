package Adapter;

import Abstract.ICustomerCheckService;
import Entities.Customer;

public class MernisServiceAdapter implements ICustomerCheckService {

    @Override
    public boolean checkIfRealPerson(Customer customer) {
        System.out.println("Mernis dogrulandi");
        return true;
    }
}
