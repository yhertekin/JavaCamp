package com.company;

import com.company.Abstract.BaseCustomerManager;
import com.company.Adaptors.MernisServiceAdapter;
import com.company.Concrete.NeroCustomerManager;
import com.company.Concrete.StarbucksCustomerManager;
import com.company.Entities.Customer;

import java.sql.Date;

public class Main {

    public static void main(String[] args) throws Exception {

        BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());

        Customer customer = new Customer(1, "Yasef", "Ertekin",
                Date.valueOf("2000-01-01"), "123123131231");

        customerManager.save(customer);
    }
}
