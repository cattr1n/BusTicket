package ticket;

public class BusTicket {
    private String departurePoint; // место отправления
    private String arrivalPoint; // место прибытия
    private String departureDate; // дата отправлния
    private String travelTime; // время пути
    private float distance; // расстояния
    protected float price; // цена билета

    public BusTicket() {
    }
    public BusTicket(String departurePoint, String arrivalPoint, String departureDate, String travelTime, float distance, float price) {
        this.departurePoint = departurePoint;
        this.arrivalPoint = arrivalPoint;
        this.departureDate = departureDate;
        this.travelTime = travelTime;
        this.distance = distance;
        this.price = price;
    }

    public float getPrice() {
        return price;
    }
    public String getTicketType() {
        return "Adult";
    }
}