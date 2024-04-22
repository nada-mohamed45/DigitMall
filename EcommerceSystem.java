import javax.swing.JOptionPane;

public class EcommerceSystem
{
    public static void main(String[] args) 
    {
        Product p1 = new ElectronicProduct(1, "smartphone", 599.99f , "Samsung", 1);
        Product p2 = new ElectronicProduct(2, "Iron",299.99f, "Toshiba", 2);
        Product p3 = new ElectronicProduct(3, "vacuum cleaner",599.99f, "Fresh", 3);
        Product p4 = new ElectronicProduct(4, "fridge",1999.99f, "Samsung", 5);
        Product p5 = new ClothingProduct(5, "T-shirt", 19.99f, "small", "cotton");
        Product p6 = new ClothingProduct(6, "pants", 59.99f, "medium", "jeans");
        Product p7 = new ClothingProduct(7, "chemise", 29.99f, "large", "cotton");
        Product p8 = new ClothingProduct(8, "jacket", 79.99f, "x-large", "leather");
        Product p9 = new BookProduct(9, "OOP", 39.99f , "O'Reilly", "X Publications");
        Product p10 = new BookProduct(10, "Harry Potter and the chambre of secrets",49.99f , "J. K. Rolling", "bla bla bla");
        Product p11 = new BookProduct(11, "Fire and Blood", 45.0f , "George R. R. Martin", "bla bla bla2");
        Product p12 = new BookProduct(12, "Rich dad poor dad", 29.99f , "Robert T. Kiyosaki and Sharon Lechter", "bla bla bla3");   

        int customerId = Integer.parseInt(JOptionPane.showInputDialog("Welcome to DigitMall ^_^\nenter you id")) ;
        String name = JOptionPane.showInputDialog("enter you name");
        String address = JOptionPane.showInputDialog("enter you address");
        Customer c1 = new Customer(customerId, name, address);

        int nProducts = Integer.parseInt(JOptionPane.showInputDialog("how many products would you like to add to your cart? ")) ;
        Cart cart1 = new Cart(c1.getCustomerId(), nProducts);
        for(int i = 0 ; i < nProducts ;)
        {
            int option = Integer.parseInt(JOptionPane.showInputDialog("which product would you like to add ? 1- smartphone 2- Iron  3- vacuum cleaner  4- fridge    5- t-shirt  6- pants   7- chemise   8- jacket 9- OOP 10- harry potter & the chambre of secrets 11- Fire & Blood 12- rich dad poor dad"));
            boolean validOption = true ;
            switch (option)
            {
                case 1:
                    cart1.addProduct(p1);
                    break;
                case 2:
                    cart1.addProduct(p2);
                    break;
                case 3:
                    cart1.addProduct(p3);
                    break;
                case 4:
                    cart1.addProduct(p4);
                    break;
                case 5:
                    cart1.addProduct(p5);
                    break;
                case 6:
                    cart1.addProduct(p6);
                    break;
                case 7:
                    cart1.addProduct(p7);
                    break;
                case 8:
                    cart1.addProduct(p8);
                    break;
                case 9:
                    cart1.addProduct(p9);
                    break;
                case 10:
                    cart1.addProduct(p10);
                    break;
                case 11:
                    cart1.addProduct(p11);
                    break;
                case 12:
                    cart1.addProduct(p12);
                    break;
                default:
                {
                    JOptionPane.showMessageDialog(null, "invalid option");
                    validOption = false ;
                    break;
                }
            }
            if(validOption)
                i++;
        }

        Order order1 = new Order();
        int option = Integer.parseInt(JOptionPane.showInputDialog("the total price is $" + cart1.calculatePrice() + "\nwould you like to place the order ? 1- Yes 2- No"));
        switch (option) 
        {
            case 1:
            {
                order1 = cart1.placOrder();
                order1.printOrderInfo();
                break;
            }
            case 2:
            {
                int option2 = Integer.parseInt(JOptionPane.showInputDialog("would you like to remove any product from the cart and add another ? 1- Yes   2- No"));
                switch (option2) 
                {
                    case 1:
                    {
                        int option3 = Integer.parseInt(JOptionPane.showInputDialog("which product you want to remove ? 1- smartphone 2- Iron  3- vacuum cleaner  4- fridge    5- t-shirt  6- pants   7- chemise   8- jacket 9- OOP 10- harry potter & the chambre of secrets 11- Fire & Blood 12- rich dad poor dad"));
                        switch (option3)
                        {
                            case 1:
                                cart1.removeProduct(p1);
                                break;
                            case 2:
                                cart1.removeProduct(p2);
                                break;
                            case 3:
                                cart1.removeProduct(p3);
                                break;
                            case 4:
                                cart1.removeProduct(p4);
                                break;
                            case 5:
                                cart1.removeProduct(p5);
                                break;
                            case 6:
                                cart1.removeProduct(p6);
                                break;
                            case 7:
                                cart1.removeProduct(p7);
                                break;
                            case 8:
                                cart1.removeProduct(p8);
                                break;
                            case 9:
                                cart1.removeProduct(p9);
                                break;
                            case 10:
                                cart1.removeProduct(p10);
                                break;
                            case 11:
                                cart1.removeProduct(p11);
                                break;
                            case 12:
                                cart1.removeProduct(p12);
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "invalid option");
                                break;
                        }
                        int option5 = Integer.parseInt(JOptionPane.showInputDialog("which product would you like to add instead of the one you've just removed ? 1- smartphone 2- Iron  3- vacuum cleaner  4- fridge    5- t-shirt  6- pants   7- chemise   8- jacket 9- OOP 10- harry potter & the chambre of secrets 11- Fire & Blood 12- rich dad poor dad"));
                        switch (option5)
                        {
                            case 1:
                                cart1.addProduct(p1);
                                break;
                            case 2:
                                cart1.addProduct(p2);
                                break;
                            case 3:
                                cart1.addProduct(p3);
                                break;
                            case 4:
                                cart1.addProduct(p4);
                                break;
                            case 5:
                                cart1.addProduct(p5);
                                break;
                            case 6:
                                cart1.addProduct(p6);
                                break;
                            case 7:
                                cart1.addProduct(p7);
                                break;
                            case 8:
                                cart1.addProduct(p8);
                                break;
                            case 9:
                                cart1.addProduct(p9);
                                break;
                            case 10:
                                cart1.addProduct(p10);
                                break;
                            case 11:
                                cart1.addProduct(p11);
                                break;
                            case 12:
                                cart1.addProduct(p12);
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "invalid option");
                                break;
                        }
                        int option4 = Integer.parseInt(JOptionPane.showInputDialog("would you like to place the order ? 1- Yes   2- No "));
                        switch (option4) 
                        {
                            case 1:
                                {
                                    order1 = cart1.placOrder();
                                    order1.printOrderInfo();
                                    break;
                                }
                            case 2:
                                JOptionPane.showMessageDialog(null, "it was nice having you. GoodBye ^_^");
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "invalid option");
                                break;
                        }
                        break;
                    }
                    case 2:
                    {
                        JOptionPane.showMessageDialog(null, "it was nice having you. GoodBye ^_^");
                        break;
                    }
                    default:
                        JOptionPane.showMessageDialog(null, "invaild option");
                        break;
                }
                break;
            }
            default:
                JOptionPane.showMessageDialog(null, "invaild option");
                break;
        }

    }//////////////////////////////////////////////////////////////////////////////////////////////////////////////
}