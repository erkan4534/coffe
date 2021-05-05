package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager{
    public void save(Customer customer){
        System.out.println("Save db db "+customer.getFirstName());
    }
}
