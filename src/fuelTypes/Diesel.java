package fuelTypes;

import vehicleMain.VehicleTypeEnum;

public class Diesel extends VehicleTypeByFuelTypes{
    public Diesel(String attribute) {
        super(attribute);
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.Diesel.name();
    }
}
