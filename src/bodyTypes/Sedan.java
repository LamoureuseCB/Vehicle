package bodyTypes;

import vehicleMain.VehicleTypeEnum;

public class Sedan extends VehicleTypeByBodyTypes{

    public Sedan(String attribute) {
        super(attribute);
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.Sedan.name();
    }
}
