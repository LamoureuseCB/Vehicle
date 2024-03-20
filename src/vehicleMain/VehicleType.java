package vehicleMain;

public class VehicleType {
    String typeName;
    protected String attribute;

    public VehicleType(String attribute) {

        this.attribute = attribute;
    }
    public String getAttributeOfType() {

        return attribute;
    }
    public String getTypeName() {

        return typeName;
    }


}
