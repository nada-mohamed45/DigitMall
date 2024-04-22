public class ClothingProduct extends Product 
{

    private String size , fabric ;

    public ClothingProduct(int productId , String name , float price , String size , String fabric)
    {
        super(productId, name, price);
        setFabric(fabric);
        setSize(size);

    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFabric() {
        return fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }
}
