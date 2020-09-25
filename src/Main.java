import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Collection list = new Collection("Electric", "Acoustic", "Bass",
            "Pianoforte", "Keyboard", "Drumkit", "Eggshaker");
    private static final Favourites topList = new Favourites("Instrument");

    //instance variables of each subclass to be able to reach their methods
    private static final ElectricGuitar electricGuitar = new ElectricGuitar("", "", "", "", "", "", "", "", "", "", "", "", "", "");
    private static final AcousticGuitar acousticGuitar = new AcousticGuitar("", "", "", "", "", "", "", "", "", "", "", "");
    private static final BassGuitar bassGuitar = new BassGuitar("", "", "", "", "", "", "", "", "", "", "");
    private static final Pianoforte pianoforte = new Pianoforte("", "", "", "", "", "", "", "", "", "");
    private static final Keyboard keyboard = new Keyboard("", "", "", "", "", "", "", "", "", "");
    private static final Drumkit drumkit = new Drumkit("", "", "", "", "", "", "", "", "");
    private static final Eggshaker eggshaker = new Eggshaker("", "", "", "", "", "", "");

    public static void main(String[] args) {

        //Interface with user. Scanner retrieves inputs.
        boolean quit = false;
        startProgramme();
        printOptions();
        while (!quit) {
            System.out.println("Enter 13 to see full options list.");
            int menuChoice = scanner.nextInt();

            switch (menuChoice) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;

                case 1:
                    list.printCollection();
                    break;

                case 2:
                    topList.printFavourites();
                    break;

                case 3:
                    addNewInstrument();
                    break;

                case 4:
                    addFavourite();
                    break;

                case 5:
                    quickView();
                    break;

                case 6:
                    deleteInstrument();
                    break;

                case 7:
                    deleteFavourite();
                    break;

                case 8:
                    plugIn();
                    break;

                case 9:
                    tuneUp();
                    break;

                case 10:
                    changeVolume();
                    break;

                case 11:
                    replaceStrings();
                    break;

                case 12:
                    list.addExampleInstruments();
                    break;

                case 13:
                    printOptions();
                    break;
            }
        }
    }

    //Method to provide intro message
    private static void startProgramme() {
        System.out.println("INSTRUMENT MANAGEMENT LIST v1.3 \nPlease choose from the following options.");
    }

    //Method to print options, switch in Main implements choices.
    private static void printOptions() {
        System.out.println("\n0 - Shutdown. \n" +
                "1 - Show all instruments.\n" +
                "2 - Show favourites.\n" +
                "3 - Add new instrument to collection.\n" +
                "4 - Add instrument to favourites.\n" +
                "5 - Check an instrument by searching for record number in collection.\n" +
                "6 - Remove an instrument from the collection.\n" +
                "7 - Remove an instrument from Favourites.\n" +
                "8 - Plug in an instrument.\n" +
                "9 - Tune an instrument.\n" +
                "10 - Change volume.\n" +
                "11 - Replace strings on an instrument.\n" +
                "12 - Add example instrument packet.\n" +
                "13 - Show all options.");
    }

    //Method to add new instrument. First using do while loop to decide upon which class to add, then which subclass.
    // Using switch to be able to add all subclass types.
    private static void addNewInstrument() {
        int superChoice = 0;
        int subChoice;

        try {
            do {
                System.out.println("Which type of instrument are you adding?" +
                        "\n1: Guitar. " +
                        "\n2. Piano. " +
                        "\n3. Percussion. ");
                superChoice = scanner.nextInt();
            }
            while ((superChoice != 1) && (superChoice != 2) && (superChoice != 3));
        } catch (Exception wrongType) {
            System.out.println("Please enter a number only.");
        }


        if (superChoice == 1) {
            do {
                System.out.println("Which type of guitar are you adding?" +
                        "\n1: Electric guitar. " +
                        "\n2. Acoustic guitar. " +
                        "\n3. Bass guitar. ");
                subChoice = scanner.nextInt();
            }
            while ((subChoice != 1) && (subChoice != 2) && (subChoice != 3));

            //Create array of variable names for electric, acoustic and bass guitar types to prompt user via for loop
            String[] electricChoices = {"manufacturer", "model", "colour", "pickup arrangement", "fingerboard type",
                    "body shape", "neck shape", "number of frets", "number of strings", "size", "weight", "bridge type", "wood type",
                    "serial number"};
            String[] acousticChoices = {"manufacturer", "model", "type", "colour", "bodyshape", "number of frets",
                    "number of strings", "pickup", "size", "weight", "wood type", "serial number"};
            String[] bassChoices = {"manufacturer", "model", "colour", "pickup type", "body shape", "number of frets",
                    "number of strings", "size", "weight", "wood type", "serial number"};

            //Create array of variable names for electric, acoustic and bass guitar types to collect from user via for loop
            String[] electricVariables = {"electricBrand", "electricModel", "electricColour", "electricPickup",
                    "electricFingerboard", "electricBody", "electricNeck", "electricFrets", "electricStrings",
                    "electricSize", "electricWeight", "electricBridge", "electricWood", "electricSerial"};
            String[] acousticVariables = {"acousticBrand", "acousticModel", "acousticType", "acousticColour",
                    "acousticBody", "acousticFrets", "acousticStrings", "acousticPickup", "acousticSize", "acousticWeight",
                    "acousticWood", "acousticSerial"};
            String[] bassVariables = {"bassBrand", "BassModel", "bassColour", "bassPickup", "bassBody", "bassFrets",
                    "bassStrings", "bassSize", "bassWeight", "bassWood", "bassSerial"};

            //switch to select between which type of guitar chosen, and a for loop for each to get input data
            switch (subChoice) {
                case 1:
                    System.out.println("Enter " + electricChoices[0] + ": ");
                    electricVariables[0] = scanner.next();
                    scanner.nextLine();
                    for (int i = 1; i < electricChoices.length; i++) {
                        System.out.println("Enter " + electricChoices[i] + ": ");
                        electricVariables[i] = scanner.nextLine();
                    }
                    //new instanceof electric guitar
                    ElectricGuitar newElectric = new ElectricGuitar(electricVariables[0], electricVariables[1],
                            electricVariables[2], electricVariables[3], electricVariables[4], electricVariables[5],
                            electricVariables[6], electricVariables[7], electricVariables[8], electricVariables[9],
                            electricVariables[10], electricVariables[11], electricVariables[12], electricVariables[13]);

                    if (list.addNewInstrument(newElectric)) {
                        System.out.println("New electric guitar added:\n");
                        for (int i = 0; i < electricChoices.length; i++) {
                            System.out.print(electricChoices[i]);
                            System.out.print(": ");
                            System.out.print(electricVariables[i]);
                            System.out.print("\n");
                        }
                    } else {
                        System.out.println("Cannot add: " + electricVariables[13] + " is a duplicate serial number.");
                    }
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Enter " + acousticChoices[0] + ": ");
                    acousticVariables[0] = scanner.next();
                    scanner.nextLine();
                    for (int i = 1; i < acousticChoices.length; i++) {
                        System.out.println("Enter " + acousticChoices[i] + ": ");
                        acousticVariables[i] = scanner.nextLine();
                    }
                    //new instanceof acoustic guitar
                    AcousticGuitar newAcoustic = new AcousticGuitar(acousticVariables[0], acousticVariables[1],
                            acousticVariables[2], acousticVariables[3], acousticVariables[4], acousticVariables[5], acousticVariables[6],
                            acousticVariables[7], acousticVariables[8], acousticVariables[9], acousticVariables[10],
                            acousticVariables[11]);

                    if (list.addNewInstrument(newAcoustic)) {
                        System.out.println("New acoustic guitar added:\n");
                        for (int i = 0; i < acousticChoices.length; i++) {
                            System.out.print(acousticChoices[i]);
                            System.out.print(": ");
                            System.out.print(acousticVariables[i]);
                            System.out.print("\n");
                        }
                    } else {
                        System.out.println("Cannot add: " + acousticVariables[11] + " is a duplicate serial number.");
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Enter " + bassChoices[0] + ": ");
                    bassVariables[0] = scanner.next();
                    scanner.nextLine();
                    for (int i = 1; i < bassChoices.length; i++) {
                        System.out.println("Enter " + bassChoices[i] + ": ");
                        bassVariables[i] = scanner.nextLine();
                    }
                    //new instanceof bass guitar
                    BassGuitar newBass = new BassGuitar(bassVariables[0], bassVariables[1], bassVariables[2],
                            bassVariables[3], bassVariables[4], bassVariables[5], bassVariables[6], bassVariables[7],
                            bassVariables[8], bassVariables[9], bassVariables[10]);

                    if (list.addNewInstrument(newBass)) {
                        System.out.println("New bass guitar added:\n");
                        for (int i = 0; i < bassChoices.length; i++) {
                            System.out.print(bassChoices[i]);
                            System.out.print(": ");
                            System.out.print(bassVariables[i]);
                            System.out.print("\n");
                        }
                    } else {
                        System.out.println("Cannot add: " + bassVariables[10] + " is a duplicate serial number.");
                    }
                    System.out.println();
                    break;
            }

            //method continues, now going to SUPER choice 2.
        } else if (superChoice == 2) {
            do {
                System.out.println("Which type of piano are you adding?" +
                        "\n1: Pianoforte. " +
                        "\n2. Keyboard. ");
                subChoice = scanner.nextInt();
            }
            while ((subChoice != 1) && (subChoice != 2));

            //Create array of variable names for piano, and keyboard types to prompt user via for loop
            String[] pianoChoices = {"brand", "model", "type", "colour", "size", "weight", "number of octaves",
                    "number of pedals", "movable", "serial number"};
            String[] keyboardChoices = {"brand", "model", "number of sounds", "weighted keys", "colour", "size", "weight",
                    "number of octaves", "number of pedals", "serial number"};
            //Create array of variable names for piano and keyboard types to collect from user via for loop
            String[] pianoVariables = {"pianoBrand", "pianoModel", "pianoType", "pianoColour", "pianoSize", "pianoWeight",
                    "pianoOctaves", "pianoPedals", "pianoMovable", "pianoSerial"};
            String[] keyboardVariables = {"keyBrand", "keyModel", "keySounds", "keyKeys", "keyColour", "keySize",
                    "keyWeight", "keyOctaves", "keyPedals", "keySerial"};

            //switch to select between which type of guitar chosen, and a for loop for each to get input data
            switch (subChoice) {
                case 1:
                    System.out.println("Enter " + pianoChoices[0] + ": ");
                    pianoVariables[0] = scanner.next();
                    scanner.nextLine();
                    for (int i = 1; i < pianoChoices.length; i++) {
                        System.out.println("Enter " + pianoChoices[i] + ": ");
                        pianoVariables[i] = scanner.nextLine();
                    }
                    //new instanceof piano
                    Pianoforte newPiano = new Pianoforte(pianoVariables[0], pianoVariables[1], pianoVariables[2],
                            pianoVariables[3], pianoVariables[4], pianoVariables[5], pianoVariables[6], pianoVariables[7],
                            pianoVariables[8], pianoVariables[9]);

                    if (list.addNewInstrument(newPiano)) {
                        System.out.println("New piano added:\n");
                        for (int i = 0; i < pianoChoices.length; i++) {
                            System.out.print(pianoChoices[i]);
                            System.out.print(": ");
                            System.out.print(pianoVariables[i]);
                            System.out.print("\n");
                        }
                    } else {
                        System.out.println("Cannot add: " + pianoVariables[9] + " is a duplicate serial number.");
                    }
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Enter " + keyboardChoices[0] + ": ");
                    keyboardVariables[0] = scanner.next();
                    scanner.nextLine();
                    for (int i = 1; i < keyboardChoices.length; i++) {
                        System.out.println("Enter " + keyboardChoices[i] + ": ");
                        keyboardVariables[i] = scanner.nextLine();
                    }
                    //new instanceof Keyboard
                    Keyboard newKeyboard = new Keyboard(keyboardVariables[0], keyboardVariables[1], keyboardVariables[2],
                            keyboardVariables[3], keyboardVariables[4], keyboardVariables[5], keyboardVariables[6], keyboardVariables[7],
                            keyboardVariables[8], keyboardVariables[9]);

                    if (list.addNewInstrument(newKeyboard)) {
                        System.out.println("New keyboard added:\n");
                        for (int i = 0; i < keyboardChoices.length; i++) {
                            System.out.print(keyboardChoices[i]);
                            System.out.print(": ");
                            System.out.print(keyboardVariables[i]);
                            System.out.print("\n");
                        }
                    } else {
                        System.out.println("Cannot add: " + keyboardVariables[9] + " is a duplicate serial number.");
                    }
                    System.out.println();
                    break;
            }

            //method continues, now going to SUPER choice 3.
        } else if (superChoice == 3) {
            do {
                System.out.println("Which type of percussion are you adding?" +
                        "\n1: Drumkit. " +
                        "\n2. Eggshaker. ");
                subChoice = scanner.nextInt();
            }
            while ((subChoice != 1) && (subChoice != 2));

            //Create array of variable names for drums and shaker types to prompt user via for loop
            String[] drumChoices = {"brand", "model", "number of cymbals", "number of toms", "colour", "size",
                    "pedal type", "weight", "serial number"};
            String[] shakerChoices = {"brand", "model", "colour", "size", "weight", "contents", "serial number"};
            //Create array of variable names for drums and shaker types to collect from user via for loop
            String[] drumVariables = {"drumBrand", "drumModel", "drumCymbal", "drumToms", "drumColour", "drumSize",
                    "drumPedal", "drumWeight", "drumSerial"};
            String[] shakerVariables = {"shakerBrand", "shakerModel", "shakerColour", "shakerSize", "shakerWeight",
                    "shakerContents", "shakerSerial"};

            switch (subChoice) {
                case 1:
                    System.out.println("Enter " + drumChoices[0] + ": ");
                    drumVariables[0] = scanner.next();
                    scanner.nextLine();
                    for (int i = 1; i < drumChoices.length; i++) {
                        System.out.println("Enter " + drumChoices[i] + ": ");
                        drumVariables[i] = scanner.nextLine();
                    }
                    //new instanceof drumkit
                    Drumkit newDrumkit = new Drumkit(drumVariables[0], drumVariables[1], drumVariables[2],
                            drumVariables[3], drumVariables[4], drumVariables[5], drumVariables[6], drumVariables[7],
                            drumVariables[8]);

                    if (list.addNewInstrument(newDrumkit)) {
                        System.out.println("New drumkit added:\n");
                        for (int i = 0; i < drumChoices.length; i++) {
                            System.out.print(drumChoices[i]);
                            System.out.print(": ");
                            System.out.print(drumVariables[i]);
                            System.out.print("\n");
                        }
                    } else {
                        System.out.println("Cannot add: " + drumVariables[8] + " is a duplicate serial number.");
                    }
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Enter " + shakerChoices[0] + ": ");
                    shakerVariables[0] = scanner.next();
                    scanner.nextLine();
                    for (int i = 1; i < shakerChoices.length; i++) {
                        System.out.println("Enter " + shakerChoices[i] + ": ");
                        shakerVariables[i] = scanner.nextLine();
                    }
                    //new instanceof shaker
                    Eggshaker newEggshaker = new Eggshaker(shakerVariables[0], shakerVariables[1], shakerVariables[2],
                            shakerVariables[3], shakerVariables[4], shakerVariables[5], shakerVariables[6]);

                    if (list.addNewInstrument(newEggshaker)) {
                        System.out.println("New egg shaker added:\n");
                        for (int i = 0; i < shakerChoices.length; i++) {
                            System.out.print(shakerChoices[i]);
                            System.out.print(": ");
                            System.out.print(shakerVariables[i]);
                            System.out.print("\n");
                        }
                    } else {
                        System.out.println("Cannot add: " + shakerVariables[6] + " is a duplicate serial number.");
                    }
                    System.out.println();
                    break;
            }
        }
    }


    //method to add record to favourites (topList)
    public static void addFavourite() {
        System.out.println("Select the list number of the instrument you are adding to favourites: ");
        int choice = scanner.nextInt();
        Instrument record;
        if ((list.obtainRecord(choice) != null)) {
            record = list.obtainRecord(choice);
            System.out.println("You are adding: " + record.getBrand() + " " + record.getModel() + " " + record.getSerial());
            topList.addNewFavourite(record);
        } else System.out.println("Invalid entry");
    }


    //method to see a specific item by position in list
    public static void quickView() {
        System.out.println("What number in the list do you want to view? ");
        int position = scanner.nextInt();
        Instrument found = list.obtainRecord(position);
        if (found != null) {
            if (found instanceof ElectricGuitar){
                ElectricGuitar.showElectricGuitarInfo((ElectricGuitar) found);
            }else
            if (found instanceof AcousticGuitar){
                AcousticGuitar.showAcousticGuitarInfo((AcousticGuitar) found);
            }else
            if (found instanceof BassGuitar){
                BassGuitar.showBassGuitarInfo((BassGuitar) found);
            }else
            if (found instanceof Pianoforte){
                Pianoforte.showPianoforteInfo((Pianoforte) found);
            }else
            if (found instanceof Keyboard){
                Keyboard.showKeyboardInfo((Keyboard) found);
            }else
            if (found instanceof Drumkit){
                Drumkit.showDrumkitInfo((Drumkit) found);
            }else
            if (found instanceof Eggshaker){
                Eggshaker.showEggshakerInfo((Eggshaker) found);
            }
        } else System.out.println("Record not found.");
    }

    //method to delete a record from Collection (with option to delete from Favourites if it exists there also)
    public static void deleteInstrument() {
        System.out.println("Enter list number of item to remove: ");
        int deleteMe = scanner.nextInt();
        Instrument toDelete = list.obtainRecord(deleteMe);
        if (toDelete != null) {
            list.deleteInstrument(toDelete);
            System.out.println(toDelete.getBrand() + " " + toDelete.getModel() + " deleted from Collection.");
        } else System.out.println("Item not found.");

        Instrument deleteFav = topList.existsInFavourites(toDelete);
        if (topList.existsInFavourites(toDelete) != null) {
            System.out.println("Instrument also found in favourites. Delete also?");
            String choice = scanner.next();
            if (choice.equalsIgnoreCase("y")) {
                topList.deleteFavourite(deleteFav);
                System.out.println("Also deleted from favourites.");
            }
        }
    }

    //method to delete directly from Favourites
    public static void deleteFavourite() {
        System.out.println("Enter list number of item to remove from Favourites: ");
        int deleteMe = scanner.nextInt();
        Instrument toDelete;
        if (topList.obtainRecord(deleteMe) != null) {
            toDelete = topList.obtainRecord(deleteMe);
            topList.deleteFavourite(toDelete);
            System.out.println(toDelete.getBrand() + " " + toDelete.getModel() + " " + toDelete.getSerial() +
                    " removed from Favourites.");
        } else System.out.println("Not found.");
    }

    //method to plug in
    public static void plugIn() {
        System.out.println("Enter item number of instrument to plug in: ");
        int choice = scanner.nextInt();
        Instrument plug = list.obtainRecord(choice);
        if (plug != null) {
            if (plug instanceof ElectricGuitar) {
                electricGuitar.plugIn();
            } else if (plug instanceof AcousticGuitar) {
                acousticGuitar.plugIn();
            } else if (plug instanceof BassGuitar) {
                bassGuitar.plugIn();
            } else if (plug instanceof Pianoforte) {
                pianoforte.plugIn();
            } else if (plug instanceof Keyboard) {
                keyboard.plugIn();
            } else if (plug instanceof Drumkit) {
                drumkit.plugIn();
            } else if (plug instanceof Eggshaker) {
                eggshaker.plugIn();
            }
        }else
            System.out.println("Instrument not found.");
    }

    //method to tune up
    public static void tuneUp() {
        System.out.println("Enter item number of instrument to tune up: ");
        int choice = scanner.nextInt();
        Instrument plug = list.obtainRecord(choice);
        if (plug != null) {
            if (plug instanceof ElectricGuitar) {
                electricGuitar.tuneUp();
            } else if (plug instanceof AcousticGuitar) {
                acousticGuitar.tuneUp();
            } else if (plug instanceof BassGuitar) {
                bassGuitar.tuneUp();
            } else if (plug instanceof Pianoforte) {
                pianoforte.tuneUp();
            } else if (plug instanceof Keyboard) {
                keyboard.tuneUp();
            } else if (plug instanceof Drumkit) {
                drumkit.tuneUp();
            } else if (plug instanceof Eggshaker) {
                eggshaker.tuneUp();
            }
        }else
            System.out.println("Instrument not found.");
    }

    //method to change volume
    public static void changeVolume() {
        System.out.println("Enter item number of instrument of which to change volume: ");
        int choice = scanner.nextInt();
        Instrument plug = list.obtainRecord(choice);
        if (plug != null) {
            if (plug instanceof ElectricGuitar) {
                electricGuitar.changeVolume();
            } else if (plug instanceof AcousticGuitar) {
                acousticGuitar.changeVolume();
            } else if (plug instanceof BassGuitar) {
                bassGuitar.changeVolume();
            } else if (plug instanceof Pianoforte) {
                pianoforte.changeVolume();
            } else if (plug instanceof Keyboard) {
                keyboard.changeVolume();
            } else if (plug instanceof Drumkit) {
                drumkit.changeVolume();
            } else if (plug instanceof Eggshaker) {
                eggshaker.changeVolume();
            }
        }else
            System.out.println("Instrument not found.");
    }

    //method to replace strings
    public static void replaceStrings(){
        System.out.println("Which instrument will you change strings for? Enter list number. ");
        int choice = scanner.nextInt();
        Instrument strings = list.obtainRecord(choice);
        if (strings != null) {
            if (strings instanceof ElectricGuitar){
                electricGuitar.replaceStrings();
            }else
            if (strings instanceof AcousticGuitar){
                acousticGuitar.replaceStrings();
            }else
            if (strings instanceof BassGuitar){
                bassGuitar.replaceStrings();
            }else
                System.out.println("No strings to replace!!");
        }
    }
}
