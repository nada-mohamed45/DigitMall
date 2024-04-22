public class Cart 
{
    private int customerId , nProducts , nLoggedProducts = 0 ;
    Product[] products ;

    public Cart(int customerId , int nProducts)
    {
        setCustomerId(customerId);
        setnProducts(nProducts);
        products = new Product[nProducts];
    }

    public int getnLoggedProducts() {
        return nLoggedProducts;
    }

    public int getCustomerId() {
        return customerId;
    }

    private void setCustomerId(int customerId) {
            this.customerId = Math.abs(customerId) ;
    }

    public int getnProducts() {
        return nProducts;
    }

    private void setnProducts(int nProducts) {
            this.nProducts = Math.abs(nProducts);
    }

    public void addProduct(Product p)
    {
        if(nLoggedProducts < nProducts)
        {
            products[nLoggedProducts] = p ;
            nLoggedProducts++ ;
        }
        else
            System.out.println("you exceeded the maximum number of products");
    }

    public void removeProduct(Product p)
    {
        for(int i = 0 ; i < nLoggedProducts ; i++)
        {
            if(products[i].getProductId() == p.getProductId())
            {
                for(int j = i ; j < nLoggedProducts-1 ; j++)       //? an array that shift the rest of the products in the array after one is removed  (this's so if the array is full and you remove a product and add another this new product object will be added to the last array element removing the one already there)
                    products[j] = products[j+1] ;

                products[nLoggedProducts-1] = null ;
                nLoggedProducts-- ;
                return ;
            }
        }

        System.out.println("not found");
    }

    public float calculatePrice()
    {
        float totalPrice = 0 ;
        for(int i = 0 ; i < products.length ; i++)
            totalPrice += products[i].getPrice() ;

        return totalPrice ;
    }

    public Order placOrder()
    {
        Order order1 = new Order(this.getCustomerId() , Order.getOrderIds() , this.calculatePrice() );
        order1.setProducts(this.products);
        return order1 ;
    }

}
