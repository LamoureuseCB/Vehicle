package fuelTypes;

import vehicleMain.VehicleTypeEnum;

public class Electric extends VehicleTypeByFuelTypes{
    public Electric(String attribute) {
        super(attribute);
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.Electric.name();
    }
}
