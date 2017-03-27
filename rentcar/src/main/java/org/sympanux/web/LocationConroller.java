package org.sympanux.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.sympanux.metier.IMetier;

@Controller
public class LocationConroller {

	@Autowired
	private IMetier metier;
	
    @RequestMapping("/vehicules")
	public String index(){
		return "location";
	}
	
}
