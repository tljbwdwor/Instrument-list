public abstract class Guitar extends Instrument {
    //Private instance variables for abstract class
    private final String bodyShape;
    private final String numberOfFrets;
    private final String numberOfStrings;
    private final String woodType;

    public Guitar(String brand, String model, String colour, String bodyShape, String numberOfFrets,
                  String numberOfStrings, String size, String weight, String woodType, String serial) {
        super(brand, model, colour, size, weight, serial);
        this.bodyShape = bodyShape;
        this.numberOfFrets = numberOfFrets;
        this.numberOfStrings = numberOfStrings;
        this.woodType = woodType;
    }

    //get and set methods
    public String getBodyShape() { return bodyShape; }
    //public void setBodyShape(String bodyShape) { this.bodyShape = bodyShape; }

    public String getWoodType() { return woodType; }
    //public void setWoodType(String woodType) { this.woodType = woodType; }

    public String getNumberOfFrets() { return numberOfFrets; }
    //public void setNumberOfFrets(String numberOfFrets) { this.numberOfFrets = numberOfFrets; }

    public String getNumberOfStrings() { return numberOfStrings; }
    //public void setNumberOfStrings(String numberOfStrings) { this.numberOfStrings = numberOfStrings; }

    //Abstract methods to be inherited
    public abstract void replaceStrings();
}
