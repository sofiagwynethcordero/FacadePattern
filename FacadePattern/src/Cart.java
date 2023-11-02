public class Cart implements HotelService
{
    int numberOfCarts;
    @Override
    public void execute()
    {
        System.out.println( numberOfCarts + " carts are requested and will now be delivered. ");
    }

    public void requestCart(int numberOfCarts)
    {
        this.numberOfCarts = numberOfCarts;
    }
}
