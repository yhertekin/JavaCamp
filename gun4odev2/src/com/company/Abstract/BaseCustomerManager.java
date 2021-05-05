package com.company.Abstract;

import com.company.Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService{
    @Override
    public void save(Customer customer) throws Exception {
        System.out.println("Saved to DB : " + customer.getFirstName());
    }
}
