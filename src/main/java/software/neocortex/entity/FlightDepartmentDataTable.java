package software.neocortex.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FlightDepartmentDataTable {
    @Id
    private int id;

    private String incomingNumber;
    private String dateOfFlight;
    private String flightNumber;
    private String departure;
    private String arrival;
    private String aircraftTailNumber;
    private String airfaseEvent1;
    private String aviaesquadra;
    private String basedRisk;
    private String correctiveActionDeadline;
    private String acceptance;
    private String finalRisk;
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

    public String getAviaesquadra() {
        return aviaesquadra;
    }

    public void setAviaesquadra(String aviaesquadra) {
        this.aviaesquadra = aviaesquadra;
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

    public String getFinalRisk() {
        return finalRisk;
    }

    public void setFinalRisk(String finalRisk) {
        this.finalRisk = finalRisk;
    }

    public String getClosure() {
        return closure;
    }

    public void setClosure(String closure) {
        this.closure = closure;
    }
}
