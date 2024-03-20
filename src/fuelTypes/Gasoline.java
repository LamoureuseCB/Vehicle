package fuelTypes;

import vehicleMain.VehicleTypeEnum;

public class Gasoline extends VehicleTypeByFuelTypes{
    public Gasoline(String attribute) {
        super(attribute);
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.Gasoline.name();
    }
}
