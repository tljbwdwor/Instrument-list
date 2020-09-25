public class Pianoforte extends Piano{
    //private instance variables
    private final String type;
    private final String movable;

    //Constructor
    public Pianoforte(String brand, String model, String type, String colour, String size, String weight,
                      String numberOfOctaves, String numberOfPedals, String movable, String serial) {
        super(brand, model, colour, size, weight, numberOfOctaves, numberOfPedals, serial);
        this.type = type;
        this.movable = movable;
    }

    //get + set
    public String getType() { return type; }
    //public void setType(String type) { this.type = type; }

    public String getMovable() { return movable; }
    //public void setMovable(String movable) { this.movable = movable; }

    //Method override
    @Override
    public void plugIn() {
        System.out.println("Does not apply here.");
    }

    @Override
    public void tuneUp() {
        System.out.println("This will take a while...");
    }

    @Override
    public void changeVolume() {
        System.out.println("That's up to how you play.");
    }

  //Method to create object Pianoforte
    /*public static Pianoforte createPianoforte(String brand, String model, String type, String colour, String size,
                                              String weight, String numberOfOctaves, String numberOfPedals,
                                              String movable, String serial){
        return new Pianoforte(brand, model, type, colour, size, weight, numberOfOctaves, numberOfPedals, movable,
                serial);
    }*/

    //showInfo method
    public static void showPianoforteInfo(Pianoforte pianoforte){
        System.out.println("Piano | Brand: " + pianoforte.getBrand() + " | Model: " + pianoforte.getModel() + " | Type: " +
                pianoforte.getType() + "\nColour: " + pianoforte.getColour() + " | Size: " + pianoforte.getSize() +
                " | Weight: " + pianoforte.getWeight() + "\nNumber of Octaves: " + pianoforte.getNumberOfOctaves() +
                " | Number of Pedals: " + pianoforte.getNumberOfPedals() + " | Serial Number: " +
                pianoforte.getSerial());
    }
}
