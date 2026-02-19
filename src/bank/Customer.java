package bank;

public class Customer {
    private String name;
    private String phone;
    private String address;
    private int customerId;
    private static int idCounter = 1000;

    //constructor
    public Customer(String name,String phone,String address){
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.customerId = idCounter++;
    }
    @Override   //as before this the output is weird to convert that into string
    public String toString(){
        return "Customer ID: " + customerId +
                "\nName: " + name +
                "\nPhone: " + phone +
                "\nAddress: " + address;

    }
}
