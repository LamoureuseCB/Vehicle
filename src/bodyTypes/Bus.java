package bodyTypes;

import vehicleMain.VehicleTypeEnum;

public class Bus extends VehicleTypeByBodyTypes{
    public Bus(String attribute) {
        super(attribute);
    }

    @Override
    public String getTypeName() {

        return VehicleTypeEnum.Bus.name();
    }
}
