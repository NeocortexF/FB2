package software.neocortex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import software.neocortex.entity.FlightDepartmentDataTable;
import software.neocortex.service.FlightDepartmentService;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    FlightDepartmentService flightDepartmentService;

    @RequestMapping(value = "/FD/all", method = RequestMethod.GET)
    public List<FlightDepartmentDataTable> getFlightDepartmentTable() {
        return flightDepartmentService.getFlightDepartmentDataTable();
    }

    @RequestMapping(value = "/FD/{id}", method = RequestMethod.GET, produces = "application/json; encoding=UTF-8")
    @ResponseBody
    public Object getFlightEvent(@PathVariable(value = "id") String inputId, HttpServletResponse response) {
        try {
            int flightDataId = Integer.valueOf(inputId);
            FlightDepartmentDataTable flightDepartmentDataTable = flightDepartmentService.getFlightDepartmentDataById(flightDataId);
            if (flightDepartmentDataTable != null) {
                return flightDepartmentDataTable;
            } else {
                response.setStatus(HttpServletResponse.SC_NOT_FOUND);
                return "Flight event with id: " + flightDataId + " not found.";
            }
        } catch (NumberFormatException e) {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            return "Bad event id format: " + inputId;
        }
    }
}
