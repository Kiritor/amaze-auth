package com.amaze.core.menu.hr.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.amaze.core.menu.base.controller.BaseController;

@Controller
@RequestMapping("hr")
public class HrURLController extends BaseController{
	@RequestMapping("/userMng")
    public ModelAndView userMng(HttpServletRequest request,HttpServletResponse response) throws Exception{
    	ModelAndView view = createLayoutView("hr/userMng", request, response);
    	return view;
    }
}
