public class Keyboard extends Piano{
    //private instance variables
    private final String numberOfSounds;
    private final String weightedKeys;

    public Keyboard(String brand, String model, String numberOfSounds, String weightedKeys, String colour, String size,
                    String weight, String numberOfOctaves, String numberOfPedals, String serial) {
        super(brand, model, colour, size, weight, numberOfOctaves, numberOfPedals, serial);
        this.numberOfSounds = numberOfSounds;
        this.weightedKeys = weightedKeys;
    }

    //get + set
    public String getNumberOfSounds() { return numberOfSounds; }
    //public void setNumberOfSounds(String numberOfSounds) { this.numberOfSounds = numberOfSounds; }

    public String getWeightedKeys() { return weightedKeys; }
    //public void setWeightedKeys(String weightedKeys) { this.weightedKeys = weightedKeys; }

    //Method overrides
    @Override
    public void plugIn() {
        System.out.println("Ready to go.");
    }

    @Override
    public void tuneUp() {
        System.out.println("Really, everyone should tune to my digital perfection.");
    }

    @Override
    public void changeVolume() {
        System.out.println("Not a problem.");
    }

    //create instance
    /*public static Keyboard createKeyboard(String brand, String model, String numberOfSounds, String weightedKeys,
                                          String colour, String size, String weight, String numberOfOctaves,
                                          String numberOfPedals, String serial){
        return  new Keyboard(brand,model,numberOfSounds,weightedKeys,colour,size,weight,numberOfOctaves,numberOfPedals,
                serial);
    }*/

    //ShowInfo
    public static void showKeyboardInfo(Keyboard keyboard){
        System.out.println("Keyboard | Brand: " + keyboard.getBrand() + " | Model: " + keyboard.getModel() +
                " | Number of Sounds: " + keyboard.getNumberOfSounds() + "\nWeighted Keys: " +
                keyboard.getWeightedKeys() + " | Colour: " + keyboard.getColour() + " | Size: " + keyboard.getSize() +
                "\nWeight: " + keyboard.getWeight() + " | Number of Octaves: " + keyboard.getNumberOfOctaves() +
                " | Number of Pedals: " + keyboard.getNumberOfPedals() + "\nSerial Number: " + keyboard.getSerial());
    }
}
