package game;
public class InteractiveItem extends Item {
    private boolean opened = false;
    private String message;
    private String type;
    public InteractiveItem(String name, String type, String message) {
        super(name);
        this.type = type;
        this.message = message;
    }
    @Override
    public void open() {
        if (type.equals("read")) {
            System.out.println("You don't need to open this item.");
            return;
        }
        if (opened) {
            System.out.println("It is already open.");
            return;
        }
        opened = true;
        System.out.println("You opened the " + getName() + ".");
        if (getName().equalsIgnoreCase("Backpack")) {
            System.out.println("You found a clue inside!");
            System.out.println("Check the bookstore for an envelope.");
        }
        if (getName().equalsIgnoreCase("Ticket Envelope")) {
            System.out.println("You found your missing concert ticket!");
            if (!Game.hasItem("Concert Ticket")) {
                Game.addInventoryItem(new Item("Concert Ticket"));
            }
 
        }
    }
    @Override
    public void close() {
        if (type.equals("read")) {
            System.out.println("You cannot close that item.");
            return;
        }
        if (!opened) {
            System.out.println("It is already closed.");
            return;
        }
        opened = false;
        System.out.println("You closed the " + getName() + ".");
    }
    @Override
    public void read() {
        if (type.equals("open")) {
            System.out.println("There is nothing to read.");
            return;
        }
        if (type.equals("both") && !opened) {
            System.out.println("You need to open it first.");
            return;
        }
        System.out.println(message);
    }
}