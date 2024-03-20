package purposeTypes;

import vehicleMain.VehicleTypeEnum;

public class Passenger extends VehicleTypeByPurpose{
    public Passenger(String attribute) {
        super(attribute);
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.Passenger.name();
    }
}

