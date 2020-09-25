import java.util.ArrayList;

public class Favourites {
    private final String myInstrument;
    private final ArrayList<Instrument> myFavourites;

    //Constructor
    public Favourites(String myInstrument){
        this.myInstrument = myInstrument;
        this.myFavourites = new ArrayList<>();
    }

    //Same find method as in Collection class. Allows the addNew method to check for duplicates.
    private int findInstrument(String  instrumentTitle){
        for (int i = 0; i < this.myFavourites.size(); i++) {
            Instrument instrument = this.myFavourites.get(i);
            if (instrument.getSerial().equals(instrumentTitle)){
                return i;
            }
        }
        return -1;
    }

    //method to add an Instrument 'record' to myFavourites array to be viewed on request from Main.
    public void addNewFavourite(Instrument record){
        if (findInstrument(record.getSerial()) >= 0){
            System.out.println("\nUnable to proceed; instrument is already in favourites!\n");
            return;
        }
        myFavourites.add(record);
        System.out.println(record.getBrand() + " " + record.getModel() + " " + record.getSerial() +
                " confirmed as added to favourites.\n");
    }

    //method to check if record exists in favourites
    public Instrument existsInFavourites(Instrument instrument){
        for (Instrument ignored : myFavourites) {
            if (myFavourites.contains(instrument)){
                return instrument;
            }
        }return null;
    }

    //method to obtain a record from Favourites
    public Instrument obtainRecord(int choice){
        for (int i = 0; i < myFavourites.size(); i++){
            if (i+1 == choice){
                return this.myFavourites.get(i);
            }
        }return null;
    }

    //method to delete instrument from favourites
    public void deleteFavourite(Instrument instrument){
        myFavourites.remove(instrument);
    }

    //method to print favourites list
    public void printFavourites(){
        System.out.println("Favourites list:\n");
        int i = 0;
        for (Instrument instrument : myFavourites){
            if (instrument instanceof ElectricGuitar){
                System.out.println((i+1) + ". Electric guitar | " +
                        myFavourites.get(i).getBrand() + " | " +
                        myFavourites.get(i).getModel() + " | " +
                        myFavourites.get(i).getColour() + " | " +
                        ((ElectricGuitar) myFavourites.get(i)).getPickupOrientation() + " | " +
                        ((ElectricGuitar) myFavourites.get(i)).getFingerboard() + " | " +
                        ((ElectricGuitar) myFavourites.get(i)).getBodyShape() + " | " +
                        ((ElectricGuitar) myFavourites.get(i)).getNeckShape() + " | " +
                        ((ElectricGuitar) myFavourites.get(i)).getNumberOfFrets() + " | " +
                        ((ElectricGuitar) myFavourites.get(i)).getNumberOfStrings() + " | " +
                        myFavourites.get(i).getSize() + " | " +
                        myFavourites.get(i).getWeight() + " | " +
                        ((ElectricGuitar) myFavourites.get(i)).getBridgeType() + " | " +
                        ((ElectricGuitar) myFavourites.get(i)).getWoodType() + " | " +
                        myFavourites.get(i).getSerial() + " | ");
                i++;
            }else if (instrument instanceof AcousticGuitar){
                System.out.println((i+1) + ". Acoustic guitar | " +
                        myFavourites.get(i).getBrand() + " | " +
                        myFavourites.get(i).getModel() + " | " +
                        ((AcousticGuitar) myFavourites.get(i)).getType() + " | " +
                        myFavourites.get(i).getColour() + " | " +
                        ((AcousticGuitar) myFavourites.get(i)).getBodyShape() + " | " +
                        ((AcousticGuitar) myFavourites.get(i)).getNumberOfFrets() + " | " +
                        ((AcousticGuitar) myFavourites.get(i)).getNumberOfStrings() + " | " +
                        ((AcousticGuitar) myFavourites.get(i)).getPickup() + " | " +
                        myFavourites.get(i).getSize() + " | " +
                        myFavourites.get(i).getWeight() + " | " +
                        ((AcousticGuitar) myFavourites.get(i)).getWoodType() + " | " +
                        myFavourites.get(i).getSerial() + " | ");
                i++;
            }else if (instrument instanceof BassGuitar){
                System.out.println((i+1) + ". Bass guitar | " +
                        myFavourites.get(i).getBrand() + " | " +
                        myFavourites.get(i).getModel() + " | " +
                        myFavourites.get(i).getColour() + " | " +
                        ((BassGuitar) myFavourites.get(i)).getPickupType() + " | " +
                        ((BassGuitar) myFavourites.get(i)).getBodyShape() + " | " +
                        ((BassGuitar) myFavourites.get(i)).getNumberOfFrets() + " | " +
                        ((BassGuitar) myFavourites.get(i)).getNumberOfStrings() + " | " +
                        myFavourites.get(i).getSize() + " | " +
                        myFavourites.get(i).getWeight() + " | " +
                        ((BassGuitar) myFavourites.get(i)).getWoodType() + " | " +
                        myFavourites.get(i).getSerial() + " | ");
                i++;
            }else if (instrument instanceof Pianoforte){
                System.out.println((i+1) + ". Piano | " +
                        myFavourites.get(i).getBrand() + " | " +
                        myFavourites.get(i).getModel() + " | " +
                        ((Pianoforte) myFavourites.get(i)).getType() + " | " +
                        myFavourites.get(i).getColour() + " | " +
                        myFavourites.get(i).getSize() + " | " +
                        myFavourites.get(i).getWeight() + " | " +
                        ((Pianoforte) myFavourites.get(i)).getNumberOfOctaves() + " | " +
                        ((Pianoforte) myFavourites.get(i)).getNumberOfPedals() + " | " +
                        ((Pianoforte) myFavourites.get(i)).getMovable() + " | " +
                        myFavourites.get(i).getSerial() + " | ");
                i++;
            }else if (instrument instanceof  Keyboard){
                System.out.println((i+1) + ". Keyboard | " +
                        myFavourites.get(i).getBrand() + " | " +
                        myFavourites.get(i).getModel() + " | " +
                        ((Keyboard) myFavourites.get(i)).getNumberOfSounds() + " | " +
                        ((Keyboard) myFavourites.get(i)).getWeightedKeys() + " | " +
                        myFavourites.get(i).getColour() + " | " +
                        myFavourites.get(i).getSize() + " | " +
                        myFavourites.get(i).getWeight() + " | " +
                        ((Keyboard) myFavourites.get(i)).getNumberOfOctaves() + " | " +
                        ((Keyboard) myFavourites.get(i)).getNumberOfPedals() + " | " +
                        myFavourites.get(i).getSerial() + " | ");
                i++;
            }else if (instrument instanceof Drumkit){
                System.out.println((i+1) + ". Drumkit | " +
                        myFavourites.get(i).getBrand() + " | " +
                        myFavourites.get(i).getModel() + " | " +
                        ((Drumkit) myFavourites.get(i)).getNumberOfCymbals() + " | " +
                        ((Drumkit) myFavourites.get(i)).getNumberOfToms() + " | " +
                        myFavourites.get(i).getColour() + " | " +
                        myFavourites.get(i).getSize() + " | " +
                        ((Drumkit) myFavourites.get(i)).getPedalType() + " | " +
                        myFavourites.get(i).getWeight() + " | " +
                        myFavourites.get(i).getSerial() + " | ");
                i++;
            }else if (instrument instanceof Eggshaker){
                System.out.println((i+1) + ". Eggshaker | " +
                        myFavourites.get(i).getBrand() + " | " +
                        myFavourites.get(i).getModel() + " | " +
                        myFavourites.get(i).getColour() + " | " +
                        myFavourites.get(i).getSize() + " | " +
                        myFavourites.get(i).getWeight() + " | " +
                        ((Eggshaker) myFavourites.get(i)).getContents() + " | " +
                        myFavourites.get(i).getSerial() + " | ");
                i++;
            }else System.out.println("Error, cannot show info.");
        }
        System.out.println("\n");
    }

}
