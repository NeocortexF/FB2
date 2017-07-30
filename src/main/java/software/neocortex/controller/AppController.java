package software.neocortex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import software.neocortex.service.FlightDepartmentService;

@Controller
public class AppController {
    @Autowired
    private FlightDepartmentService flightDepartmentService;

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String getEventsList(Model model) {
        model.addAttribute("allEvents", flightDepartmentService.getFlightDepartmentDataTable());
        return "testFromBase";
      //  return flightDepartmentService.getFlightDepartmentDataTable();
    }



//    @RequestMapping("/")
//    public String hello(Model model) {
//        model.addAttribute("allEvents", flightDepartmentDataTable.getHelloMessage());
//        return "testFromBase";
//   }

//    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
//    @ResponseBody
//    public List<FlightDepartmentDataTable> showAllEventsForFlightDepartment(Model model) {
//        return flightDepartmentDataTable.;
//    }
//    @RequestMapping("/create")
//    public String create(Model model) {
//        model.addAttribute("createVariable", queryExample.tableCreation());
//        return "creatingPage";
//    }

}
