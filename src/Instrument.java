public abstract class Instrument {

//Super class Instrument is abstract, ie all subclasses inherit from it, yet no object of Instrument can be made.
    /*private String name;

    public Instrument(String name){
        this.name = name;
    }*/

    //private instance variables for Superclass
    private String brand;
    private String model;
    private String colour;
    private String size;
    private String weight;
    private String serial;

    //Constructor
    public Instrument(String brand, String model, String colour, String size, String weight, String serial){
        this.brand = brand;
        this.model = model;
        this.colour = colour;
        this.size = size;
        this.weight = weight;
        this.serial = serial;
    }

    //get + set methods for variables
    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public String getColour() { return colour; }
    public void setColour(String colour) { this.colour = colour; }

    public String getSize() { return size; }
    public void setSize(String size) { this.size = size; }

    public String getWeight() { return weight; }
    public void setWeight(String weight) { this.weight = weight; }

    public String getSerial() { return serial; }
    public void setSerial(String serial) { this.serial = serial; }


    //Abstract methods to be inherited
    public abstract void plugIn();
    public abstract void tuneUp();
    public abstract void changeVolume();
}
