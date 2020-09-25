public class Eggshaker extends Percussion{
    //Private instance variables
    private final String contents;

    public Eggshaker(String brand, String model, String colour, String size, String weight, String contents,
                     String serial) {
        super(brand, model, colour, size, weight, serial);
        this.contents = contents;
    }

    public String getContents() { return contents; }
    //public void setContents(String contents) { this.contents = contents; }

    @Override
    public void plugIn() {
        System.out.println("No. What?!");    
    }

    @Override
    public void tuneUp() {
        System.out.println("I'm an EGG SHAKER...");
    }

    @Override
    public void changeVolume() {
        System.out.println("But that's all I have!");
    }

    /*public static Eggshaker createEggshaker(String brand, String model, String colour, String size, String weight,
                                            String contents, String serial){
        return new Eggshaker(brand, model, colour, size, weight, contents, serial);
    }*/

    public static void showEggshakerInfo(Eggshaker eggshaker){
        System.out.println("Eggshaker | Brand: " + eggshaker.getBrand() + " | Model: " + eggshaker.getModel() + " | Colour: " +
                eggshaker.getColour() + "\nSize: " + eggshaker.getSize() + " | Weight: " + eggshaker.getWeight() +
                " | Contents: " + eggshaker.getContents() + "\nSerial Number: " + eggshaker.getSerial());
    }
}
