public class CinemaObserver {
    private String name;
    public CinemaObserver(String name) {
        this.name = name;
    }
    public void update(CinemaTicketStation ticketStation) {
        System.out.println("Hi " + this.name + ". There are " + ticketStation.getAvailableSeats() + " seats available out of " + ticketStation.getTotalSeats() + " total seats.");
    }
}