package purposeTypes;

import vehicleMain.VehicleTypeEnum;

public class Cargo extends VehicleTypeByPurpose{
    public Cargo(String attribute) {
        super(attribute);
    }

    @Override
    public String getTypeName() {

        return VehicleTypeEnum.Cargo.name();
    }

}
