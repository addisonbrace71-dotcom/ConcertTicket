package game;

public class ConcertWorld {

	public ConcertWorld() {
	}
	public static Room buildWorld() {
		Room dorm = new Room("Dorm Room");
		Room library = new Room("Library");
		Room quad = new Room("Campus Quad");
		Room dining = new Room("Dining Hall");
		Room center = new Room("Student Center");
		Room bookstore = new Room("Bookstore");
		Room garage = new Room("Parking Garage");
    
		dorm.setExit(0, quad);
		quad.setExit(1, dorm);
    	dorm.setExit(2, library);
    	library.setExit(3, dorm);
    	quad.setExit(1, dining);
    	dining.setExit(0, quad);
    	quad.setExit(0, center);
    	center.setExit(1, quad);
    	quad.setExit(3, bookstore);
    	bookstore.setExit(2, quad);
    	bookstore.setExit(3, garage);
    	garage.setExit(2, bookstore);

    	dorm.addItem(new Diary());
    	library.addItem(new ConcertSchedule());
    	bookstore.addItem(new TicketEnvelope());
    	center.addItem(new Backpack());

    	return dorm;
	}
}

