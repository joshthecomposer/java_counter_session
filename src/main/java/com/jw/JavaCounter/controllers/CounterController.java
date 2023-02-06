package com.jw.JavaCounter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CounterController {
	@RequestMapping("/")
	public String index(HttpSession session) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
		else {
			session.setAttribute("count",(int)session.getAttribute("count") + 1);
		}
		return "/index.jsp";
	}

	@RequestMapping("/counter")
	public String counter(HttpSession session) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
		else {
			session.setAttribute("count",(int)session.getAttribute("count") + 1);
		}
		return "/counter.jsp";
		
	}
	
	@RequestMapping("/counter/2")
	public String counterTwo(HttpSession session) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
		else {
			session.setAttribute("count",(int)session.getAttribute("count") + 2);
		}
		return "/counterTwo.jsp";
	}
	
	@RequestMapping("/clear")
	public String clear(HttpSession session) {
		if (session.getAttribute("count") != null) {
			session.removeAttribute("count");
		}
		return "redirect:/";
	}
	
}
