
package game;
public class TicketEnvelope extends Item {
    private boolean opened;
    private boolean ticketFound;
    public TicketEnvelope() {
        super("ticket envelope");
        opened = false;
        ticketFound = false;
    }
    @Override
    public void open() {
        if (opened) {
            Game.print("The envelope is already open.");
        } else {
            opened = true;
            Game.print("You opened the ticket envelope!");
            if (!ticketFound) {
                Game.print("You found your missing concert ticket!");
                Item ticket = new Item("concert ticket");
                Game.addInventoryItem(ticket);
                ticketFound = true;
                Game.print("The ticket was added to your inventory!");
            }
        }
    }
    @Override
    public void close() {
        if (!opened) {
            Game.print("The envelope is already closed.");
        } else {
            opened = false;
            Game.print("You closed the ticket envelope.");
        }
    }
    @Override
    public void read() {
        Game.print("The envelope says: CONCERT TICKET.");
    }
}
