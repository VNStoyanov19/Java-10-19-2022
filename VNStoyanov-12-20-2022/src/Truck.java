public class Truck {
    private double fuelQuantity;
    private double consumption;
    private static final double AIR_CONDITIONING_ADDITIONAL_CONSUMPTION= 0.9;

    public Truck(double fuelQuantity, double consumption) {
        this.fuelQuantity = fuelQuantity;
        this.consumption = consumption + AIR_CONDITIONING_ADDITIONAL_CONSUMPTION;
    }


}
