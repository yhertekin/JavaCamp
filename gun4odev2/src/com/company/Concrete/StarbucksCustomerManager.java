package com.company.Concrete;

import com.company.Abstract.BaseCustomerManager;
import com.company.Abstract.ICustomerCheckService;
import com.company.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

    private ICustomerCheckService customerCheckService;

    public StarbucksCustomerManager(ICustomerCheckService customerCheckService){
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void save(Customer customer) throws Exception {
        if(customerCheckService.CheckIfRealPerson(customer)){
            super.save(customer);
        }
        else {
            throw new Exception("Not a valid person");
        }
    }



}
