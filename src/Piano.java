public abstract class Piano extends Instrument {
    //Private instance variables
    private final String numberOfOctaves;
    private final String numberOfPedals;

    //Constructor
    public Piano(String brand, String model, String colour, String size, String weight, String numberOfOctaves,
                 String numberOfPedals, String serial) {
        super(brand, model, colour, size, weight, serial);
        this.numberOfOctaves = numberOfOctaves;
        this.numberOfPedals = numberOfPedals;
    }

    //get + set
    public String getNumberOfOctaves() { return numberOfOctaves; }
    //public void setNumberOfOctaves(String numberOfOctaves) { this.numberOfOctaves = numberOfOctaves; }

    public String getNumberOfPedals() { return numberOfPedals; }
    //public void setNumberOfPedals(String numberOfPedals) { this.numberOfPedals = numberOfPedals; }
}
