package com.company.Adaptors;

import com.company.Abstract.ICustomerCheckService;
import com.company.Entities.Customer;
import com.company.MBSKPSPublicSoap;


public class MernisServiceAdapter implements ICustomerCheckService {
    @Override
    public boolean CheckIfRealPerson(Customer customer) throws Exception {
        MBSKPSPublicSoap client = new MBSKPSPublicSoap();
        return client.TCKimlikNoDogrula(
                Long.parseLong(customer.getNationalityId()),
                customer.getFirstName().toUpperCase(),
                customer.getLastName().toUpperCase(),
                customer.getDateOfBirth().getYear()
        );
    }
}
