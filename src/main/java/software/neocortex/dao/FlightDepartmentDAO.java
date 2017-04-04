package software.neocortex.dao;

import software.neocortex.entity.FlightDepartmentDataTable;

import java.util.List;

public interface FlightDepartmentDAO {

    FlightDepartmentDataTable getFlightDepartmentDataById(int id);

    List<FlightDepartmentDataTable> getFlightDepartmentDataTable();
}
