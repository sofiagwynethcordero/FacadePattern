public class HotelApp
{
    public static void main(String[] args)
    {
        FrontDesk frontdesk = new FrontDesk();
        frontdesk.ValetService("WCN 668");
        frontdesk.CartService(5);
        frontdesk.HouseKeepingService(101);
    }
}