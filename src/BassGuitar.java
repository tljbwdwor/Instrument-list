public class BassGuitar extends Guitar {
    //Private instance variables
    private final String pickupType;

    //Constructor
    public BassGuitar(String brand, String model, String colour, String pickupType, String bodyShape,
                      String numberOfFrets, String numberOfStrings, String size, String weight, String woodType,
                      String serial) {
        super(brand, model, colour, bodyShape, numberOfFrets, numberOfStrings, size, weight, woodType, serial);
        this.pickupType = pickupType;
    }

    //get + set
    public String getPickupType() { return pickupType; }
    //public void setPickupType(String pickupType) { this.pickupType = pickupType; }

    //Method dverride
    @Override
    public void replaceStrings() {
        System.out.println("That was expensive...");
    }

    @Override
    public void plugIn() {
        System.out.println("Get ready for the low end.");
    }

    @Override
    public void tuneUp() {
        System.out.println("I tune down, not up.");
    }

    @Override
    public void changeVolume() {
        System.out.println("This song goes where I say!");
    }

    //creator
    /*public static BassGuitar createBassGuitar(String brand, String model, String colour, String pickupType,
                                              String bodyShape, String numberOfFrets, String numberOfStrings,
                                              String size, String weight, String woodType, String serial){
        return new BassGuitar(brand,model,colour,pickupType,bodyShape,numberOfFrets,numberOfStrings,size,weight,
                woodType,serial);
    }*/

    //Showinfo method
    public static void showBassGuitarInfo(BassGuitar bassGuitar){
        System.out.println("Bass Guitar | Brand: " + bassGuitar.getBrand() + " | Model: " + bassGuitar.getModel() + " | Colour: " +
                bassGuitar.getColour() + "\nType of pickups: " + bassGuitar.getPickupType() + " | Body Shape: " +
                bassGuitar.getBodyShape() + " | Number of Frets: " + bassGuitar.getNumberOfFrets() +
                "\nNumber of Strings: " + bassGuitar.getNumberOfStrings() + " | Size: " + bassGuitar.getSize() +
                " | Weight: " + bassGuitar.getWeight() + "\nWood Type: " + bassGuitar.getWoodType() +
                " | Serial Number: " + bassGuitar.getSerial());
    }
}
