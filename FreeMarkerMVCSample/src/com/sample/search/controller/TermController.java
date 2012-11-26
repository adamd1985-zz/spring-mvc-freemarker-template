package com.sample.search.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sample.search.model.Term;


@Controller
public class TermController {

    /**
     * Static list of users to simulate Database
     */
    private static List<Term> list = new ArrayList<Term>();
 
    //Initialize the list with some data for index screen
    static {
    	list.add(new Term("Term 1"));
    	list.add(new Term("Term 2"));
    	list.add(new Term("Term 3"));
    	list.add(new Term("Term 4"));
    	list.add(new Term("Term 5"));
    }
 
    /**
     * Saves the static list of users in model and renders it 
     * via freemarker template.
     * 
     * @param model
     * @return The categories view (FTL)
     */
    @RequestMapping(value = "/terms", method = RequestMethod.GET)
    public String index(@ModelAttribute("model") ModelMap model) {
 
        model.addAttribute("terms", list);
 
        return "terms";
    }
	    
}
