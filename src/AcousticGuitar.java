public class AcousticGuitar extends Guitar{
    //Private instance variables AcousticGuitar
    private final String type;
    private final String pickup;

    //Constructor
    public AcousticGuitar(String brand, String model, String type, String colour, String bodyShape,
                          String numberOfFrets, String numberOfStrings, String pickup, String size, String weight,
                          String woodType, String serial) {
        super(brand, model, colour, bodyShape, numberOfFrets, numberOfStrings, size, weight, woodType, serial);
        this.type = type;
        this.pickup = pickup;
    }

    //get + set methods
    public String getType() { return type; }
    //public void setType(String type) { this.type = type; }

    public String getPickup() { return pickup; }
    //public void setPickup(String pickup) { this.pickup = pickup; }

    //Method overrides from abstract Superclass
    @Override
    public void replaceStrings() {
        System.out.println("D'Addario phosphor bronze added.");
    }

    @Override
    public void plugIn() {
        System.out.println("Unless I'm an electro-acoustic, that's not gonna happen.");
    }

    @Override
    public void tuneUp() {
        System.out.println("Tuned and ready.");
    }

    @Override
    public void changeVolume() {
        System.out.println("You gotta hit me harder for that to happen.");
    }

    //Method to create instance of AcousticGuitar
    /*public static AcousticGuitar createAcousticGuitar(String brand, String model, String type, String colour,
                                                      String bodyShape, String numberOfFrets, String numberOfStrings,
                                                      String pickup, String size, String weight, String woodType,
                                                      String serial){
        return new AcousticGuitar(brand,model,type,colour,bodyShape,numberOfFrets,numberOfStrings,pickup,size,weight,
                woodType,serial);
    }*/

    //Method to show info of object AcousticGuitar
    public static void showAcousticGuitarInfo( AcousticGuitar acousticGuitar){
        System.out.println("Acoustic Guitar | Brand: " + acousticGuitar.getBrand() + " | Model: " + acousticGuitar.getModel() +
                " | Type: " + acousticGuitar.getType() + "\nColour: " + acousticGuitar.getColour() + " | Body Shape: " +
                acousticGuitar.getBodyShape() + " | Number of Frets: " + acousticGuitar.getNumberOfFrets() +
                "\nNumber of Strings: " + acousticGuitar.getNumberOfStrings() + " | Pickup: " +
                acousticGuitar.getPickup() + " | Size: " + acousticGuitar.getSize() + "\nWeight: " +
                acousticGuitar.getWeight() + " | Wood Type: " + acousticGuitar.getWoodType() + " | Serial Number: " +
                acousticGuitar.getSerial());
    }
}
