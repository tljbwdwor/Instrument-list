public class ElectricGuitar extends Guitar{
    //Private instance variables for ElectricGuitar
    private final String pickupOrientation;
    private final String fingerboard;
    private final String neckShape;
    private final String bridgeType;

    //Constructor
    public ElectricGuitar(String brand, String model, String colour, String pickupOrientation, String fingerboard,
                          String bodyShape, String neckShape, String numberOfFrets, String numberOfStrings, String size,
                          String weight, String bridgeType, String woodType, String serial) {
        super(brand, model, colour, bodyShape, numberOfFrets, numberOfStrings, size, weight, woodType, serial);
        this.pickupOrientation = pickupOrientation;
        this.fingerboard = fingerboard;
        this.neckShape = neckShape;
        this.bridgeType = bridgeType;
    }

    //get + set methods for private instance variables
    public String getPickupOrientation() { return pickupOrientation; }
    //public void setPickupOrientation(String pickupOrientation) { this.pickupOrientation = pickupOrientation; }

    public String getFingerboard() { return fingerboard; }
    //public void setFingerboard(String fingerboard) { this.fingerboard = fingerboard; }

    public String getNeckShape() { return neckShape; }
    //public void setNeckShape(String neckShape) { this.neckShape = neckShape; }

    public String getBridgeType() { return bridgeType; }
    //public void setBridgeType(String bridgeType) { this.bridgeType = bridgeType; }


    //Override methods from abstract Superclasses
    @Override
    public void replaceStrings() {
        System.out.println("Ernie Ball Super Slinky 9' to 42' added.");
    }

    @Override
    public void plugIn() {
        System.out.println("HHHUUUMMMMMMMMMZZZZZZ 'click'---> aaand perfection.");
    }

    @Override
    public void tuneUp() {
        System.out.println("Tuning is good enough for rock n roll.");
    }

    @Override
    public void changeVolume() {
        System.out.println("Volume increased. What does decrease volume even mean?");
    }

    //Method to create instance of ElectricGuitar
    /*public static ElectricGuitar createElectricGuitar(String brand, String model, String colour,
                                                      String pickupOrientation, String fingerboard, String bodyShape,
                                                      String neckShape, String numberOfFrets, String numberOfStrings,
                                                      String size, String weight, String bridgeType, String woodType,
                                                      String serial){
        return new ElectricGuitar(brand,model,colour,pickupOrientation,fingerboard,bodyShape,neckShape,numberOfFrets,
                numberOfStrings,size,weight,bridgeType,woodType,serial);
    }*/

    //Method to show info of object ElectricGuitar
    public static void showElectricGuitarInfo(ElectricGuitar electricGuitar){
        System.out.println("Electric Guitar | Brand: " + electricGuitar.getBrand() + " | Model: " + electricGuitar.getModel() +
                " | Colour: " + electricGuitar.getColour() + "\nPickup Orientation: "
                + electricGuitar.getPickupOrientation() + " | Fingerboard: " + electricGuitar.getFingerboard() +
                " | Body Shape: " + electricGuitar.getBodyShape() + "\nNeck Shape: " + electricGuitar.getNeckShape() +
                " | Number of Frets: " + electricGuitar.getNumberOfFrets() + " | Number of Strings: " +
                electricGuitar.getNumberOfStrings() + "\nSize: " + electricGuitar.getSize() +
                " | Weight: " + electricGuitar.getWeight() + " | Bridge Type: " + electricGuitar.getBridgeType() +
                " | Wood Type: " + electricGuitar.getWoodType() + " | Serial Number: " + electricGuitar.getSerial());
    }
}
