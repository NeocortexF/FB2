package software.neocortex.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
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
        Criteria criteria = sessionFactory.getCurrentSession().
                createCriteria(FlightDepartmentDataTable.class);
        criteria.add(Restrictions.eq("flightdata_id", id));
        return (FlightDepartmentDataTable) criteria.uniqueResult();
    }

    @Override
    public List<FlightDepartmentDataTable> getFlightDepartmentDataTable() {
        Criteria criteria = sessionFactory.getCurrentSession().
                createCriteria(FlightDepartmentDataTable.class);
        //проблема похоже в том, что критерия лист дает полный перечень всей таблицы
        //а у тебя в моделе данных не все поля и еще и в другом порядке
        //нужно как то вытаскивать поу одном
        return (List<FlightDepartmentDataTable>) criteria.list();
    }
}
