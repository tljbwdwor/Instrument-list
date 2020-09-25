import java.util.ArrayList;
import java.util.Arrays;

public class Collection {
    //private instance variables of subclasses for list
    private final String myElectric;
    private final String myAcoustic;
    private final String myBass;
    private final String myPianoforte;
    private final String myKeyboard;
    private final String myDrumkit;
    private final String myEggshaker;
    private final ArrayList<Instrument> myInstruments;

    //private subclass examples to be added at user's request
    private static final ElectricGuitar Charvel = new ElectricGuitar("Charvel","DK 24 Pro Mod 2pt HSH","Orange Satin Crush","HSH","Roasted Maple","SuperStrat","Speed neck","24 Jumbo","6","1m","3kg","Gotoh Custom 10 Tremolo","Alder","MC197820");
    private static final ElectricGuitar IbanezRG548 = new ElectricGuitar("Ibanez","RG548","Transparent Blue","HSH","Rosewood","SuperStrat","Wizard II","24 Jumbo","6","1m","4.5kg","Edge 2, bolted","Ash","F9721285");
    private static final ElectricGuitar SchecterSuperShredder = new ElectricGuitar("Schecter","Super Shredder FRS","Birch Green","HH","Ebony","SuperStrat","Speed neck","24 X-Jumbo","6","1m","5kg","Floyd Rose","Mahogany","IW19100914");
    private static final ElectricGuitar SchecterC1 = new ElectricGuitar("Schecter","Diamond Series C-1 Elite","Gloss Black","HH","Rosewood","SuperStrat","Speed neck","24 Jumbo","6","1m","3.5kg","Fixed","Mahogany","C1GBL4CK");
    private static final ElectricGuitar MaverickF3 = new ElectricGuitar("Maverick","F3 Evolution","Metallic Green","HSH","Rosewood","SuperStrat","Speed neck","24 Jumbo","6","1m","4kg","Floyd Rose","Alder","M4V3R1CK");
    private static final ElectricGuitar IbanezRG470 = new ElectricGuitar("Ibanez","RG470TI","Titanium Ice","HSH","Rosewood","SuperStrat","Wizard II","24 Jumbo","6","1m","3.5kg","Floyd Licensed","Basswood","IBZ470TI");
    private static final ElectricGuitar Chapter = new ElectricGuitar("Chapter","Chapter 1","Natural","HSH","Rosewood","SuperStrat","Thin","22 Narrow","6","0.95m","4kg","Gotoh","Horse Chestnut","CHAPTER1");
    private static final ElectricGuitar PGM = new ElectricGuitar("Ibanez","PGMM31","White","HH","Maple","Superstrat","Wizard","24 narrow","6","0.65m","2kg","Fixed","Poplar","GS200306013");
    private static final ElectricGuitar WhiteStrat = new ElectricGuitar("Fender","Player Series Stratocaster","Polar White","SSS","Maple","Strat","Modern C","22 Medium Jumbo","6","1m","4kg","Fender 2pt Tremolo","Alder","MX19184695");
    private static final ElectricGuitar BlackStrat = new ElectricGuitar("Fender","Standard Stratocaster","Black","SSS","Maple","Strat","Standard","21 Narrow","6","1m","3.5kg","Fender 6pt Tremolo","Alder","MN8272285");
    private static final ElectricGuitar Chester = new ElectricGuitar("Chester","Strat","Black","SSS","Rosewood","Strat","Standard","21 Narrow","6","1m","2.5kg","Chester Tremolo","Unknown","CHESTER");
    private static final ElectricGuitar LesPaul = new ElectricGuitar("Epiphone","Les Paul Standard","Honeyburst","HH","Rosewood","Les Paul","Set LP","22 Medium Jumbo","6","1m","5kg","Fixed","Mahogany","EPLP1");
    private static final ElectricGuitar Gryphon7 = new ElectricGuitar("Schecter","Gryphon 7","Transparent Black","HH","Rosewood","SuperStrat","Speed Neck","24 Jumbo","7","1m","4.5kg","Fixed","Mahogany","SCHG7");
    private static final ElectricGuitar Tele = new ElectricGuitar("Squier","Affinity Telecaster","Arctic White","SS","Maple","Tele","Standard Tele","21 Narrow","6","1m","4kg","Fixed","Alder","CY170200384");
    private static final AcousticGuitar Alvarez = new AcousticGuitar("Alvarez","Masterworks MD350","Steel Stringed","Natural","Dreadnaught","20 Medium Jumbo","6","S","1.1m","4.5kg","Spruce","F512280353");
    private static final AcousticGuitar Norman = new AcousticGuitar("Norman","Protege B18","Steel Stringed","Cedar Black","Dreadnaught","21","6","N/A","1.2m","4kg","Cedar","021017000182");
    private static final AcousticGuitar Samick = new AcousticGuitar("Samick","Unknown","Steel Stringed","Natural","Dreadnaught","20","6","N/A","1.2m","4kg","Unknown","SAMICKDN");
    private static final AcousticGuitar SmallClassical = new AcousticGuitar("Unknown","Unknown","Classical","Natural","Classical","20","6","N/A","0.85m","2kg","Unknown","SMALLCLASSIC");
    private static final AcousticGuitar RenoClassical = new AcousticGuitar("Reno","SCG-V190","Classical","Natural","Classical","20","6","N/A","1m","3kg","Unknown","RENOCLASSIC");
    private static final BassGuitar PurpleBass = new BassGuitar("Yamaha","RBX 270J","Purple Mist","SS","Double cutaway","24","4","1.4m","4.5kg","Alder","QK0133411");
    private static final BassGuitar RedBass = new BassGuitar("Yamaha","BA501R","Red","SS","Double cutaway","24","4","1.4m","4.5kg","Alder","YBGR");
    private static final Pianoforte Zimmermann = new Pianoforte("Zimmermann","ZMNU1","Upright","Natural","2m","100kg","8","2","No","ZM1");
    private static final Keyboard X50 = new Keyboard("Korg","X-50","500+","No","Black","1m","2kg","5","1","012928");
    private static final Keyboard PA50 = new Keyboard("Korg","PA50","500+","No","Grey","1.2m","13.5kg","5","0","102938");
    private static final Drumkit PearlKit = new Drumkit("Pearl","PK105","5","3","Black","1.5sqm","Iron Kobra","50kg","PK105");
    private static final Eggshaker Shaker = new Eggshaker("EggzRUs","Egg Shaker Pro","Luminous torquoise","7cm","0.1kg","Pro Standard Rice","EGG1");

    public void addExampleInstruments() {
        Instrument[] exampleList = {Charvel,IbanezRG548,SchecterSuperShredder,SchecterC1,MaverickF3,IbanezRG470,Chapter,PGM,
        WhiteStrat,BlackStrat,Chester,LesPaul,Gryphon7,Tele,Alvarez,Norman,Samick,SmallClassical,RenoClassical,
        PurpleBass,RedBass,Zimmermann,X50,PA50,PearlKit,Shaker};

        myInstruments.addAll(Arrays.asList(exampleList));

        System.out.println("Example records added.\n");
    }

    //constructor
    public Collection(String myElectric, String myAcoustic, String myBass, String myPianoforte, String myKeyboard,
                      String myDrumkit, String myEggshaker){
        this.myElectric = myElectric;
        this.myAcoustic = myAcoustic;
        this.myBass = myBass;
        this.myPianoforte = myPianoforte;
        this.myKeyboard = myKeyboard;
        this.myDrumkit = myDrumkit;
        this.myEggshaker = myEggshaker;
        this.myInstruments = new ArrayList<>();
    }

    //private method to index an instruments position in the arraylist
    /*private int indexInstrument(Instrument instrument){
        return this.myInstruments.indexOf(instrument);
    }*/

    //method for finding an instrument by serial number by moving through Arraylist via for loop
    private int findInstrument(String serial){
        for (int i = 0; i < this.myInstruments.size(); i++) {
            Instrument instrument = this.myInstruments.get(i);
            if (instrument.getSerial().equals(serial)){
                return i;
            }
        }
        return -1;
    }

    //method to add a new instrument
    public boolean addNewInstrument(Instrument instrument){
        if ((findInstrument(instrument.getSerial()) >= 0 )){
            System.out.println("Instrument is already saved.");
            return false;
        }
        myInstruments.add(instrument);
        return true;
    }

    //method to obtain record and send back to main. Used for adding a favourite; it will give
    //the relevant Instrument object back to implement in class Favourites from Main.
    public Instrument obtainRecord(int choice){
        for (int i = 0; i < myInstruments.size(); i++){
            if (i+1 == choice){
                return this.myInstruments.get(i);
            }
        }return null;
    }

    //method to delete an instrument from Collection
    public void deleteInstrument(Instrument instrument){
        myInstruments.remove(instrument);
    }


    //method to print instrument list
    public void printCollection(){
        System.out.println("Full instrument collection:\n");
        int i = 0;
        for (Instrument instrument : myInstruments){
            if (instrument instanceof ElectricGuitar){
                System.out.println((i+1) + ". Electric guitar | " +
                        myInstruments.get(i).getBrand() + " | " +
                        myInstruments.get(i).getModel() + " | " +
                        myInstruments.get(i).getColour() + " | " +
                        ((ElectricGuitar) myInstruments.get(i)).getPickupOrientation() + " | " +
                        ((ElectricGuitar) myInstruments.get(i)).getFingerboard() + " | " +
                        ((ElectricGuitar) myInstruments.get(i)).getBodyShape() + " | " +
                        ((ElectricGuitar) myInstruments.get(i)).getNeckShape() + " | " +
                        ((ElectricGuitar) myInstruments.get(i)).getNumberOfFrets() + " | " +
                        ((ElectricGuitar) myInstruments.get(i)).getNumberOfStrings() + " | " +
                        myInstruments.get(i).getSize() + " | " +
                        myInstruments.get(i).getWeight() + " | " +
                        ((ElectricGuitar) myInstruments.get(i)).getBridgeType() + " | " +
                        ((ElectricGuitar) myInstruments.get(i)).getWoodType() + " | " +
                        myInstruments.get(i).getSerial() + " | ");
                i++;
            }else if (instrument instanceof AcousticGuitar){
                System.out.println((i+1) + ". Acoustic guitar | " +
                        myInstruments.get(i).getBrand() + " | " +
                        myInstruments.get(i).getModel() + " | " +
                        ((AcousticGuitar) myInstruments.get(i)).getType() + " | " +
                        myInstruments.get(i).getColour() + " | " +
                        ((AcousticGuitar) myInstruments.get(i)).getBodyShape() + " | " +
                        ((AcousticGuitar) myInstruments.get(i)).getNumberOfFrets() + " | " +
                        ((AcousticGuitar) myInstruments.get(i)).getNumberOfStrings() + " | " +
                        ((AcousticGuitar) myInstruments.get(i)).getPickup() + " | " +
                        myInstruments.get(i).getSize() + " | " +
                        myInstruments.get(i).getWeight() + " | " +
                        ((AcousticGuitar) myInstruments.get(i)).getWoodType() + " | " +
                        myInstruments.get(i).getSerial() + " | ");
                i++;
            }else if (instrument instanceof BassGuitar){
                System.out.println((i+1) + ". Bass guitar | " +
                        myInstruments.get(i).getBrand() + " | " +
                        myInstruments.get(i).getModel() + " | " +
                        myInstruments.get(i).getColour() + " | " +
                        ((BassGuitar) myInstruments.get(i)).getPickupType() + " | " +
                        ((BassGuitar) myInstruments.get(i)).getBodyShape() + " | " +
                        ((BassGuitar) myInstruments.get(i)).getNumberOfFrets() + " | " +
                        ((BassGuitar) myInstruments.get(i)).getNumberOfStrings() + " | " +
                        myInstruments.get(i).getSize() + " | " +
                        myInstruments.get(i).getWeight() + " | " +
                        ((BassGuitar) myInstruments.get(i)).getWoodType() + " | " +
                        myInstruments.get(i).getSerial() + " | ");
                i++;
            }else if (instrument instanceof Pianoforte){
                System.out.println((i+1) + ". Piano | " +
                        myInstruments.get(i).getBrand() + " | " +
                        myInstruments.get(i).getModel() + " | " +
                        ((Pianoforte) myInstruments.get(i)).getType() + " | " +
                        myInstruments.get(i).getColour() + " | " +
                        myInstruments.get(i).getSize() + " | " +
                        myInstruments.get(i).getWeight() + " | " +
                        ((Pianoforte) myInstruments.get(i)).getNumberOfOctaves() + " | " +
                        ((Pianoforte) myInstruments.get(i)).getNumberOfPedals() + " | " +
                        ((Pianoforte) myInstruments.get(i)).getMovable() + " | " +
                        myInstruments.get(i).getSerial() + " | ");
                i++;
            }else if (instrument instanceof  Keyboard){
                System.out.println((i+1) + ". Keyboard | " +
                        myInstruments.get(i).getBrand() + " | " +
                        myInstruments.get(i).getModel() + " | " +
                        ((Keyboard) myInstruments.get(i)).getNumberOfSounds() + " | " +
                        ((Keyboard) myInstruments.get(i)).getWeightedKeys() + " | " +
                        myInstruments.get(i).getColour() + " | " +
                        myInstruments.get(i).getSize() + " | " +
                        myInstruments.get(i).getWeight() + " | " +
                        ((Keyboard) myInstruments.get(i)).getNumberOfOctaves() + " | " +
                        ((Keyboard) myInstruments.get(i)).getNumberOfPedals() + " | " +
                        myInstruments.get(i).getSerial() + " | ");
                i++;
            }else if (instrument instanceof Drumkit){
                System.out.println((i+1) + ". Drumkit | " +
                        myInstruments.get(i).getBrand() + " | " +
                        myInstruments.get(i).getModel() + " | " +
                        ((Drumkit) myInstruments.get(i)).getNumberOfCymbals() + " | " +
                        ((Drumkit) myInstruments.get(i)).getNumberOfToms() + " | " +
                        myInstruments.get(i).getColour() + " | " +
                        myInstruments.get(i).getSize() + " | " +
                        ((Drumkit) myInstruments.get(i)).getPedalType() + " | " +
                        myInstruments.get(i).getWeight() + " | " +
                        myInstruments.get(i).getSerial() + " | ");
                i++;
            }else if (instrument instanceof Eggshaker){
                System.out.println((i+1) + ". Eggshaker | " +
                        myInstruments.get(i).getBrand() + " | " +
                        myInstruments.get(i).getModel() + " | " +
                        myInstruments.get(i).getColour() + " | " +
                        myInstruments.get(i).getSize() + " | " +
                        myInstruments.get(i).getWeight() + " | " +
                        ((Eggshaker) myInstruments.get(i)).getContents() + " | " +
                        myInstruments.get(i).getSerial() + " | ");
                i++;
            }else System.out.println("Error, cannot show info.");
        }
        System.out.println("\n");
    }
}
/*EGuitar: brand,model,colour,pickupOrientation,fingerboard,bodyShape,neckShape,numberOfFrets,numberOfStrings,size,weight,bridgeType,woodType,serial
AGuitar: brand,model,type,colour,bodyShape,numberOfFrets,numberOfStrings,pickup,size,weight,woodType,serial
BGuitar:brand,model,colour,pickupType,bodyShape,numberOfFrets,numberOfStrings,size,weight,woodType,serial
Piano:brand, model, type, colour, size, weight, numberOfOctaves, numberOfPedals, movable, serial
Keyboard:brand,model,numberOfSounds,weightedKeys,colour,size,weight,numberOfOctaves,numberOfPedals,serial
Drums:brand, model, numberOfCymbals, numberOfToms, colour, size, pedalType, weight, serial
ES:brand, model, colour, size, weight, contents, serial
 */