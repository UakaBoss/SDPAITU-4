public class Main {
    public static void main(String[] args) {
        CinemaTicketStation ticketStation = new CinemaTicketStation(100);
        CinemaObserver person1 = new CinemaObserver("Anton");
        CinemaObserver person2 = new CinemaObserver("Saule");

        //adding two examples (subscription)
        ticketStation.addObserver(person1);
        ticketStation.addObserver(person2);

        System.out.println("Welcome to the Cinema Ticket Store!");
        System.out.println("Available tickets: " + ticketStation.getAvailableSeats());

        //buying tickets
        ticketStation.buyTicket(2);

        //removing one observer (unsubscription)
        ticketStation.removeObserver(person1);

        //checking for changes
        person1.update(ticketStation);

        //no tickets situation
        ticketStation.buyTicket(99);
    }
}