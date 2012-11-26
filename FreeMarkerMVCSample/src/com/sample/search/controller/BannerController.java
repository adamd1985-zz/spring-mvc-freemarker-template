package com.sample.search.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sample.search.model.Banner;


@Controller
public class BannerController {

    /**
     * Static list of users to simulate Database
     */
    private static List<Banner> list = new ArrayList<Banner>();
 
    //Initialize the list with some data for index screen
    static {
    	list.add(new Banner("Banner 1"));
    	list.add(new Banner("Banner 2"));
    	list.add(new Banner("Banner 3"));
    	list.add(new Banner("Banner 4"));
    	list.add(new Banner("Banner 5"));
    }
 
    /**
     * Saves the static list of users in model and renders it 
     * via freemarker template.
     * 
     * @param model
     * @return The categories view (FTL)
     */
    @RequestMapping(value = "/banners", method = RequestMethod.GET)
    public String index(@ModelAttribute("model") ModelMap model) {
 
        model.addAttribute("list", list);
 
        return "banners";
    }
	    
}
