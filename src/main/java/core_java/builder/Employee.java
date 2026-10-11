package core_java.builder;

public final class Employee {
    private final String name;
    private final String department;
    private final int salary;

    private Employee(EmployeeBuilder builder) {
        this.name = builder.name;
        this.department = builder.department;
        this.salary = builder.salary;
    }

    public EmployeeBuilder toBuilder() {
        return new EmployeeBuilder().name(this.name).department(this.department).salary(this.salary);
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", department='" + department + '\'' + ", salary=" + salary + '}';
    }

    public static class EmployeeBuilder {
        private String name;
        private String department;
        private int salary;

        public EmployeeBuilder department(String department) {
            this.department = department;
            return this;
        }

        public EmployeeBuilder name(String name) {
            this.name = name;
            return this;
        }

        public EmployeeBuilder salary(int salary) {
            this.salary = salary;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }

    static void main(String[] args) {
        Employee employee = new EmployeeBuilder().name("Joanna Ross").department("IT").salary(22).build();
        System.out.println(employee);
        System.out.println(employee.toBuilder().salary(24).build());
    }
}
