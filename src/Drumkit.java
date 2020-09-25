public class Drumkit extends Percussion{
    //Private instance variables
    private final String numberOfToms;
    private final String pedalType;
    private final String numberOfCymbals;

    public Drumkit(String brand, String model, String numberOfCymbals, String numberOfToms, String colour, String size,
                   String pedalType, String weight, String serial) {
        super(brand, model, colour, size, weight, serial);
        this.numberOfCymbals = numberOfCymbals;
        this.numberOfToms = numberOfToms;
        this.pedalType = pedalType;
    }

    //get + set
    public String getNumberOfCymbals() { return numberOfCymbals; }
    //public void setNumberOfCymbals(String numberOfCymbals) { this.numberOfCymbals = numberOfCymbals; }

    public String getNumberOfToms() { return numberOfToms; }
    //public void setNumberOfToms(String numberOfToms) { this.numberOfToms = numberOfToms; }

    public String getPedalType() { return pedalType; }
    //public void setPedalType(String pedalType) { this.pedalType = pedalType; }

    //Overrides
    @Override
    public void plugIn() {
        System.out.println("Not unless I'm an electric kit.");
    }

    @Override
    public void tuneUp() {
        System.out.println("Need a drum key in that case...");
    }

    @Override
    public void changeVolume() {
        System.out.println("Never ask me to reduce my playing volume. Never.");
    }

    //Create object
    /*public static Drumkit createDrumkit(String brand, String model, String numberOfCymbals, String numberOfToms,
                                        String colour, String size, String pedalType, String weight, String serial){
        return new Drumkit(brand, model, numberOfCymbals, numberOfToms, colour, size, pedalType, weight, serial);
    }*/

    //showInfo
    public static void showDrumkitInfo(Drumkit drumkit){
        System.out.println("Drumkit | Brand: " + drumkit.getBrand() + " | Model: " + drumkit.getModel() + " | Number of Cymbals: "
                + drumkit.getNumberOfCymbals() + "\nNumber of Toms: " + drumkit.getNumberOfToms() + " | Colour: " +
                drumkit.getColour() + " | Size: " + drumkit.getSize() + "\nPedal type: " + drumkit.getPedalType() +
                " | Weight: " + drumkit.getWeight() + " | Serial Number: " + drumkit.getSerial());
    }
}

