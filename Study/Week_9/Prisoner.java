package Study.Week_9;

public class Prisoner {
    String name;
    double height;
    int sentence;
    Cell cell; // A reference to the Cell object

    public Prisoner(String name, double height, int sentence, Cell cell) {
        this.name = name;
        this.height = height;
        this.sentence = sentence;
        this.cell = cell;
    }

    // -- Display the prisoner's details --
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Height: " + height);
        System.out.println("Sentence: " + sentence);
        System.out.println("Cell: " + cell.getName());
    }

    public void openDoor() {
        if (!cell.isDoorOpen()) {
            System.out.println("\nThe door is closed! Opening door...");
            cell.setDoorOpen(true);
        } else {
            System.out.println("\nThe door is already open! Closing door...");
            cell.setDoorOpen(false);
        }
    }
}

// -- A Cell object --
class Cell {
    private String name;
    private boolean doorOpen;
    private int securityCode;

    Cell(String name, boolean doorOpen, int securityCode) {
        this.name = name;
        this.doorOpen = doorOpen;
        this.securityCode = securityCode;
    }

    public String setName(String name) {
        return this.name = name;
      }

      public boolean setDoorOpen(boolean doorOpen) {
        return this.doorOpen = doorOpen;
      }

      public String getName() {
        return name;
      }

      public boolean isDoorOpen() {
        return doorOpen;
      }

    public void securityCheck(int securityCode) {
        if (this.securityCode == securityCode) {
            if (this.doorOpen) {
                System.out.println("The door is open.");
                this.doorOpen = false;
                System.out.println("Now the door is closed.");
            } else {
                System.out.println("The door is closed.");
                this.doorOpen = true;
                System.out.println("Now the door is open.");
            }
        } else {
            System.out.println("Invalid security code.");
            this.doorOpen = false;
        }
    }
}
