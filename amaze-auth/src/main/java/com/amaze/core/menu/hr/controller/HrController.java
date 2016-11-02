package com.amaze.core.menu.hr.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("hr")
public class HrController {
    
	@RequestMapping("/getUsers")
	@ResponseBody
	public List<Map> getUsers(){
		Map user1 = new HashMap();
		user1.put("userName", "LCore");
		user1.put("sex","man");
		List<Map> list = new ArrayList<Map>();
		list.add(user1);
		return list;
	}
 }
