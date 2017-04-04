package software.neocortex.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import software.neocortex.dao.FlightDepartmentDAO;
import software.neocortex.entity.FlightDepartmentDataTable;

import java.util.List;

@Repository
public class FlightDepartmentDAOImpl implements FlightDepartmentDAO {
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public FlightDepartmentDataTable getFlightDepartmentDataById(int id) {
        return null;
    }

    @Override
    public List<FlightDepartmentDataTable> getFlightDepartmentDataTable() {
        return null;
    }
}
