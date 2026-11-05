package game;
public class ConcertSchedule extends Item {
    public ConcertSchedule() {
        super("concert schedule");
    }
    @Override
    public void read() {
        Game.print("CONCERT SCHEDULE");
        Game.print("The concert starts tonight!");
        Game.print("Make sure you have your ticket.");
        Game.print("Go to the Parking Garage before the concert.");
    }
    @Override
    public void open() {
        Game.print("The concert schedule does not need to be opened.");
    }
    @Override
    public void close() {
        Game.print("You cannot close the concert schedule.");
    }
}
