public class ElectronicProduct extends Product {

    private String brand ;
    private int warrentyPeriod ;


    public ElectronicProduct(int productId , String name , float price , String brand , int warrentyPeriod)
    {
        super(productId, name, price);
        setBrand(brand);
        setWarrentyPeriod(warrentyPeriod);
    }


    public String getBrand() {
        return brand;
    }

    private void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWarrentyPeriod() {
        return warrentyPeriod;
    }

    private void setWarrentyPeriod(int warrentyPeriod) {
            this.warrentyPeriod = Math.abs(warrentyPeriod);
    }

}
