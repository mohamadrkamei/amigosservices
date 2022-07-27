package com.microservices.customer;

public record CustomerService() {


    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder().firstName((request.firstName())).lastName(request.lastName()).email(request.email()).build();

        //todo : check if email valid
        //todo : check if email not taken
        //todo : check store customer in db


    }
}
