package core_java;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Customer {
    private long id;
    private String name;
    private double purchase;
    private CustomerType customerType;

    public Customer(long id, String name, double purchase, CustomerType customerType) {
        this.id = id;
        this.name = name;
        this.purchase = purchase;
        this.customerType = customerType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPurchase() {
        return purchase;
    }

    public void setPurchase(double purchase) {
        this.purchase = purchase;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    static void main(String[] args) {
        Customer customer0 = new Customer(1L, "John Smith", 25.26, CustomerType.NEW);
        Customer customer1 = new Customer(2L, "Joanna Ross", 11.04, CustomerType.RETURNING);
        Customer customer2 = new Customer(3L, "Steve Chris", 32.12, CustomerType.EXISTING);
        Map<Long, Double> customerIdToCurrentBalance = new HashMap<>();
        for (Customer customer : List.of(customer0, customer1, customer2)) {
            double existingBalance = customerIdToCurrentBalance.getOrDefault(customer.getId(), 0.0);
            double updatedBalance = switch (customer.customerType) {
                case NEW, EXISTING -> existingBalance + customer.purchase;
                case RETURNING -> existingBalance - customer.purchase;
                default -> existingBalance;
            };
            customerIdToCurrentBalance.put(customer.getId(), updatedBalance);
        }
        System.out.println(customerIdToCurrentBalance);

        Customer c0 = new Customer(1L, "John Smith", 25.26, CustomerType.NEW);
        Customer c1 = c0;
        System.out.println("hashCode0 = " + c0.hashCode());
        System.out.println("hashCode1 = " + c1.hashCode());
    }
}
