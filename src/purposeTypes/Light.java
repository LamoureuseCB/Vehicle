package purposeTypes;

import vehicleMain.VehicleTypeEnum;

public class Light extends VehicleTypeByPurpose{
    public Light(String attribute) {
        super(attribute);
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.Light.name();
    }
}
