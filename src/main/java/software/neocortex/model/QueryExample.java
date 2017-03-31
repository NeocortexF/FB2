package software.neocortex.model;

import org.springframework.jdbc.core.JdbcTemplate;

public class QueryExample {

    private JdbcTemplate jdbcTemplate;

    public QueryExample(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public QueryExample() {
    }

    public String tableCreation() {
        try {
            jdbcTemplate.execute("CREATE TABLE COMPANY(" +
                    "ID INT PRIMARY KEY NOT NULL, " +
                    "NAME TEXT NOT NULL, " +
                    "AGE INT NOT NULL," +
                    ");");
            return "table created";
        } catch (Exception e) {
            return "Error: " + e;

        }
    }

}
