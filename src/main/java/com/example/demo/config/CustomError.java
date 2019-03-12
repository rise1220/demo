package com.example.demo.config;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomError implements ErrorController {

	private String PATH = "error";
    
    @RequestMapping(value = "/error")
    public String error(Model model, HttpServletRequest request) {
    	
        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
        String statusCode = String.valueOf(status);
        
        if (statusCode.equalsIgnoreCase("404")) {
            return PATH + "404";
        }
        
        model.addAttribute("errorCode", statusCode);
        
        return "error";
    }
	
	@Override
	public String getErrorPath() {
		return "error";
	}
}
