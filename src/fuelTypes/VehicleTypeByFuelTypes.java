package fuelTypes;

import vehicleMain.VehicleType;

public class VehicleTypeByFuelTypes extends VehicleType {
    public VehicleTypeByFuelTypes(String attribute) {
        super("\"По типу топлива\"");
    }

    @Override
    public String getTypeName() {
        return super.getTypeName();
    }
    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;

        VehicleTypeByFuelTypes that = (VehicleTypeByFuelTypes) object;
        return attribute != null ? attribute.equals(that.attribute) : false;
    }



}
