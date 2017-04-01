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
            jdbcTemplate.execute("CREATE TABLE `testschema`.`company` (\n" +
                    "  `Company_ID` INT NOT NULL,\n" +
                    "  `Company_Name` VARCHAR(255) NULL,\n" +
                    "  `CEO` VARCHAR(45) NULL,\n" +
                    "  PRIMARY KEY (`Company_ID`));");
            return "table created";
        } catch (Exception e) {
            return "Error: " + e;

        }
    }

}
