package bodyTypes;

import vehicleMain.VehicleTypeEnum;

public class Van extends VehicleTypeByBodyTypes{
    public Van(String attribute) {
        super(attribute);
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.Van.name();
    }
}
