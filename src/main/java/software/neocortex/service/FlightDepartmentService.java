package software.neocortex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import software.neocortex.dao.FlightDepartmentDAO;
import software.neocortex.entity.FlightDepartmentDataTable;

import java.util.List;

@Component
@Transactional
public class FlightDepartmentService {
    @Autowired
    FlightDepartmentDAO flightDepartmentDAO;

    public FlightDepartmentDataTable getFlightDepartmentDataById(int id) {
        return flightDepartmentDAO.getFlightDepartmentDataById(id);
    }

    public List<FlightDepartmentDataTable> getFlightDepartmentDataTable() {
        return flightDepartmentDAO.getFlightDepartmentDataTable();
    }
}
