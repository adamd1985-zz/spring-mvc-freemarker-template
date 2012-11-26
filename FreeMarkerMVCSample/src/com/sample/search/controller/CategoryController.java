package com.sample.search.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sample.search.model.Category;

@Controller
public class CategoryController {

    /**
     * Static list of users to simulate Database
     */
    private static List<Category> list = new ArrayList<Category>();
 
    //Initialize the list with some data for index screen
    static {
    	list.add(new Category("Category 1"));
    	list.add(new Category("Category 2"));
    	list.add(new Category("Category 3"));
    	list.add(new Category("Category 4"));
    	list.add(new Category("Category 5"));
    }
 
    /**
     * Saves the static list of users in model and renders it 
     * via freemarker template.
     * 
     * @param model
     * @return The categories view (FTL)
     */
//    @PreAuthorize("hasRole('ROLE_USER')")
    @RequestMapping(value = "/categories", method = RequestMethod.GET)
    public String index(@ModelAttribute("model") ModelMap model) {
        model.addAttribute("categories", list);
        return "categories";
    }
	    
}
