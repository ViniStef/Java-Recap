package academy.devdojo.javaoneforall.javacore.Hinheritance.domain;

public class Employee {
    // When using protect, all subclasses extending this class will have access to the attributes by using this.name, for example.
    // All other classes within this package, even if they're not extending this one, can also achieve the same.
    protected String name;
    protected String socialSecurityNumber;
    protected Address address;
    protected double salary;

    static {
        System.out.println("Inside employee static init block");
    }
    {
        System.out.println("Inside employee non-static init block 1");
    }
    {
        System.out.println("Inside employee non-static init block 2");
    }

    public Employee(String name) {
        this.name = name;
        System.out.println("Inside employee constructor");
    }

    public void print() {
        System.out.println(this.name);
        System.out.println(this.socialSecurityNumber);
        System.out.println(this.salary);
        System.out.println(this.address.getStreet() + " " + this.address.getZipcode());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
