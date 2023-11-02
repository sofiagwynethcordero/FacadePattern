public class HouseKeeping implements HotelService
{
    int roomNumber;
    @Override
    public void execute()
    {
        System.out.println("The room " + roomNumber + " will now be cleaned.");
    }

    public void cleanRoom(int roomNumber)
    {
        this.roomNumber = roomNumber;
    }
}
