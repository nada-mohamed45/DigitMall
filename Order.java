import javax.swing.JOptionPane;

public class Order
{
    private int customerId , orderId ;
    private float totalPrice ;

    private static int orderIds = 1 ;
    private Product[] products ;

    public Order(int customerId , int orderId , float totalPrice )
    {
        setCustomerId(customerId);
        setOrderId(orderIds);
        setTotalPrice(totalPrice);
        orderIds++ ;
    }

    public Order()
    {}

    public int getCustomerId() {
        return customerId;
    }

    private void setCustomerId(int customerId) {
            this.customerId = Math.abs(customerId) ;
    }

    public int getOrderId() {
        return orderId;
    }

    private void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    private void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public static int getOrderIds() {
        return orderIds;
    }

    public void printOrderInfo()
    {
        StringBuilder message = new StringBuilder();

        message.append("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\nHere's your order's summary: \nOrder Id: ").append(getOrderId())
                .append("\nCustomer-Id: ").append(getCustomerId()).append("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

        for(int i = 0; i < products.length; i++)
            message.append(products[i].getName()).append(" - $").append(products[i].getPrice()).append("\n");

        message.append("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\nTotal price: $").append(totalPrice)
                        .append("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\nlooking forward seeing you soon ^_^\n");

        JOptionPane.showMessageDialog(null, message.toString());
    }

}
