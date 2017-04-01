package software.neocortex.entity;

import javax.persistence.*;

@Entity
@Table(name = "flightdata")
public class FlightDepartmentDataTable {
    @Id
    @Column(name = "flightdata_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Incoming_number")
    private String incomingNumber;

    @Column(name = "Date_of_flight")
    private String dateOfFlight;

    @Column(name = "Flight_number")
    private String flightNumber;

    @Column(name = "Departure")
    private String departure;

    @Column(name = "Arrival")
    private String arrival;

    @Column(name = "Tail_number")
    private String aircraftTailNumber;

    @Column(name = "Event_AirFASE_1")
    private String airfaseEvent1;

    @Column(name = "AE")
    private int aviaSquadron;

    @Column(name = "Necessary_things")
    private String basedRisk;

    @Column(name = "Deadline_cor_act")
    private String correctiveActionDeadline;

    @Column(name = "Cor_act_accepted")
    private String acceptance;

    @Column(name = "Risk_index")
    private int finalRisk;

    @Column(name = "Talon_closure")
    private String closure;

    public FlightDepartmentDataTable() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIncomingNumber() {
        return incomingNumber;
    }

    public void setIncomingNumber(String incomingNumber) {
        this.incomingNumber = incomingNumber;
    }

    public String getDateOfFlight() {
        return dateOfFlight;
    }

    public void setDateOfFlight(String dateOfFlight) {
        this.dateOfFlight = dateOfFlight;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public String getAircraftTailNumber() {
        return aircraftTailNumber;
    }

    public void setAircraftTailNumber(String aircraftTailNumber) {
        this.aircraftTailNumber = aircraftTailNumber;
    }

    public String getAirfaseEvent1() {
        return airfaseEvent1;
    }

    public void setAirfaseEvent1(String airfaseEvent1) {
        this.airfaseEvent1 = airfaseEvent1;
    }

    public int getAviaSquadron() {
        return aviaSquadron;
    }

    public void setAviaSquadron(int aviaSquadron) {
        this.aviaSquadron = aviaSquadron;
    }

    public String getBasedRisk() {
        return basedRisk;
    }

    public void setBasedRisk(String basedRisk) {
        this.basedRisk = basedRisk;
    }

    public String getCorrectiveActionDeadline() {
        return correctiveActionDeadline;
    }

    public void setCorrectiveActionDeadline(String correctiveActionDeadline) {
        this.correctiveActionDeadline = correctiveActionDeadline;
    }

    public String getAcceptance() {
        return acceptance;
    }

    public void setAcceptance(String acceptance) {
        this.acceptance = acceptance;
    }

    public int getFinalRisk() {
        return finalRisk;
    }

    public void setFinalRisk(int finalRisk) {
        this.finalRisk = finalRisk;
    }

    public String getClosure() {
        return closure;
    }

    public void setClosure(String closure) {
        this.closure = closure;
    }
}
