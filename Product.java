public class Product
{
    protected int productId ;
    protected String name ;
    protected float price ;

    public Product(int productId , String name , float price)
    {
        setProductId(productId);
        setName(name);
        setPrice(price);
    }

    public int getProductId() {
        return productId;
    }

    private void setProductId(int productId){
            this.productId = Math.abs(productId);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    private void setPrice(float price){
            this.price = Math.abs(price);
    }



}