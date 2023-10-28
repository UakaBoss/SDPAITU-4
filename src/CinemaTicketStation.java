import java.util.ArrayList;
import java.util.List;

public class CinemaTicketStation {
    private int totalSeats;
    private int availableSeats;
    private List<CinemaObserver> observers = new ArrayList<>();
    public CinemaTicketStation(int totalSeats) {
        this.totalSeats = totalSeats;
        this.availableSeats = totalSeats;
    }
    public int getTotalSeats() {
        return totalSeats;
    }
    public int getAvailableSeats() {
        return availableSeats;
    }

    //checking if
    public void buyTicket(int numTickets) {
        if (numTickets > 0 && numTickets <= availableSeats) {
            availableSeats -= numTickets;
            notifyObservers();
        }
        else {
            System.out.println("SORRY, NO AVAILABLE TICKETS :(");
        }
    }
    public void addObserver(CinemaObserver observer) {
        observers.add(observer);
    }
    public void removeObserver(CinemaObserver observer) {
        observers.remove(observer);
    }

    //notify every observer
    private void notifyObservers() {
        for (CinemaObserver observer : observers) {
            observer.update(this);
        }
    }
}
