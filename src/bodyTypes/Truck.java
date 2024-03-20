package bodyTypes;

import vehicleMain.VehicleTypeEnum;

public class Truck extends VehicleTypeByBodyTypes{


    public Truck(String attribute) {
        super(attribute);
    }



    @Override
    public String getTypeName() {
        return VehicleTypeEnum.Truck.name();
    }
}
