public class FrontDesk
{
    Valet valet;
    Cart cart;
    HouseKeeping houseKeeping;
    public FrontDesk()
    {
        this.valet = new Valet();
        this.cart = new Cart();
        this.houseKeeping = new HouseKeeping();

    }

    public void ValetService(String plateNumber)
    {
        valet.pickUpVehicle(plateNumber);
        valet.execute();
    }

    public void CartService(int numberOfCarts)
    {
        cart.requestCart(numberOfCarts);
        cart.execute();
    }

    public void HouseKeepingService(int roomNumber)
    {
        houseKeeping.cleanRoom(roomNumber);
        houseKeeping.execute();
    }
}
