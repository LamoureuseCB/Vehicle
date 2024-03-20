package fuelTypes;

import vehicleMain.VehicleTypeEnum;

public class Hybrid extends VehicleTypeByFuelTypes{
    public Hybrid(String attribute) {
        super(attribute);
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.Hybrid.name();
    }
}
