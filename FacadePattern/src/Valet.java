public class Valet implements HotelService
{
    String plateNumber = "";
    @Override
    public void execute()
    {
        System.out.println("The vehicle with the plate number " + plateNumber + " will now be picked up.");
    }

    public void pickUpVehicle(String plateNumber)
    {
        this.plateNumber = plateNumber;
    }

}
