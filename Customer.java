public class Customer {

    private int customerId ;
    private String name , address ;

    public Customer(int customerId , String name , String address)
    {
        setName(name);
        setCustomerId(customerId);
        setAddress(address);
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
            this.customerId = Math.abs(customerId);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
