package purposeTypes;

import vehicleMain.VehicleType;

public class VehicleTypeByPurpose extends VehicleType {
    public VehicleTypeByPurpose(String attribute) {
        super("\"По назначению\"");
    }

    @Override
    public String getTypeName() {
        return super.getTypeName();
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;

        VehicleTypeByPurpose that = (VehicleTypeByPurpose) object;
        return attribute != null ? attribute.equals(that.attribute) : false;
    }
}
