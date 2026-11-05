package game;
public class World {
    public static Room buildWorld() {
        Room.rooms.clear();
        Room dorm = new Room("Dorm Room");
        Room library = new Room("Library");
        Room quad = new Room("Campus Quad");
        Room dining = new Room("Dining Hall");
        Room center = new Room("Student Center");
        Room bookstore = new Room("Bookstore");
        Room garage = new Room("Parking Garage");
        // Connect all rooms
        dorm.setExit(2, library);
        library.setExit(3, dorm);
        dorm.setExit(3, quad);
        quad.setExit(2, dorm);
        quad.setExit(1, dining);
        dining.setExit(0, quad);
        quad.setExit(0, center);
        center.setExit(1, quad);
        quad.setExit(3, bookstore);
        bookstore.setExit(2, quad);
        bookstore.setExit(3, garage);
        garage.setExit(2, bookstore);
        // Room descriptions
        dorm.setDescription(
            "Your concert ticket is missing! "
            + "A bookstore receipt is on your desk.");
        library.setDescription(
            "Study lamps light the tables. "
            + "Look for the concert schedule.");
        quad.setDescription(
            "The center of campus. "
            + "The Student Center is east "
            + "and the Dining Hall is west.");
        dining.setDescription(
            "Addison is sitting at a table. "
            + "She might know something about your ticket.");
        center.setDescription(
            "Your backpack is here. "
            + "Maybe there is a clue inside.");
        bookstore.setDescription(
            "The cashier remembers seeing your ticket. "
            + "Look for an envelope.");
        garage.setDescription(
            "Your ride to the concert is waiting!");
        // Original items
        dorm.addItem(new Item("receipt"));
        dorm.addItem(new Item("bed", true));
        // Four interactive items
        dorm.addItem(new InteractiveItem(
            "diary",
            "both",
            "I remember leaving my concert ticket "
            + "somewhere near the bookstore."));
        library.addItem(new InteractiveItem(
            "concert schedule",
            "read",
            "The concert starts tonight! "
            + "Get to the Parking Garage on time."));
        center.addItem(new InteractiveItem(
            "backpack",
            "open",
            ""));
        bookstore.addItem(new InteractiveItem(
            "ticket envelope",
            "open",
            ""));
        return dorm;
    }
}

