package game;
public class Diary extends Item {
    private boolean opened;
    public Diary() {
        super("diary");
        opened = false;
    }
    @Override
    public void open() {
        if (opened) {
            Game.print("The diary is already open.");
        } else {
            opened = true;
            Game.print("You opened your diary.");
        }
    }
    @Override
    public void close() {
        if (!opened) {
            Game.print("The diary is already closed.");
        } else {
            opened = false;
            Game.print("You closed your diary.");
        }
    }
    @Override
    public void read() {
        if (!opened) {
            Game.print("You need to open the diary first.");
        } else {
            Game.print("Dear Diary,");
            Game.print("I remember having my concert ticket");
            Game.print("when I visited the bookstore.");
            Game.print("Maybe I left it there!");
        }
    }
}
