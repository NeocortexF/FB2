package software.neocortex.model;

import org.springframework.jdbc.core.JdbcTemplate;

public class FlightDepartmentDataTable {

    private JdbcTemplate jdbcTemplate;

    public FlightDepartmentDataTable(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public FlightDepartmentDataTable() {
    }


}
