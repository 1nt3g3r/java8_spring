package springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController {
    @Autowired
    private HttpServletRequest request;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String showHello(ModelMap model) {
        model.put("greeting", request.getParameter("val"));
        return "hello";
    }
}
