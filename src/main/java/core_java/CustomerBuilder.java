package core_java;

import static core_java.CustomerType.NEW;

public class CustomerBuilder {
    private long id;
    private String name;
    private double purchase;
    private CustomerType customerType;

    public CustomerBuilder() {
        this.id = 0L;
        this.name = "";
        this.purchase = 0.0;
        this.customerType = NEW;
    }

    public CustomerBuilder id(long id) {
        this.id = id;
        return this;
    }

    public CustomerBuilder name(String name) {
        this.name = name;
        return this;
    }

    public CustomerBuilder purchase(double purchase) {
        this.purchase = purchase;
        return this;
    }

    public CustomerBuilder customerType(CustomerType customerType) {
        this.customerType = customerType;
        return this;
    }

    public Customer build() {
        // return new Customer(this);
        return new Customer(id, name, purchase, customerType);
    }
}
