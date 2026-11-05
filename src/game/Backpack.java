package game;
public class Backpack extends Item {
    private boolean opened;
    public Backpack() {
        super("backpack");
        opened = false;
    }
    @Override
    public void open() {
        if (opened) {
            Game.print("The backpack is already open.");
        } else {
            opened = true;
            Game.print("You opened the backpack.");
            Game.print("You found a clue inside!");
            Game.print("Check the bookstore for your ticket.");
        }
    }
    @Override
    public void close() {
        if (!opened) {
            Game.print("The backpack is already closed.");
        } else {
            opened = false;
            Game.print("You closed the backpack.");
        }
    }
    @Override
    public void read() {
        Game.print("There is nothing to read on the backpack.");
    }
}
