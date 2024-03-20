package bodyTypes;


import vehicleMain.VehicleType;


public class VehicleTypeByBodyTypes extends VehicleType {
    public VehicleTypeByBodyTypes(String attribute) {

        super("\"По типу кузова\"");
    }

    @Override
    public String getTypeName() {
        return super.getTypeName();
    }

    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;

        VehicleTypeByBodyTypes that = (VehicleTypeByBodyTypes) object;
        return attribute != null ? attribute.equals(that.attribute) : false;
    }
}
