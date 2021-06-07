package com.chobo.book;


import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HelloController {
	
	@GetMapping("/ex12_1")
	String hello() {
		System.out.println("GET Ex12");
		return "ex12";
	}

	@PostMapping("/ex12")
	void hello2(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("POST Ex12");
		String str = request.getParameter("str");
		
		PrintWriter out = response.getWriter();
		out.println("Post str : " + str);
		
		
	}

//	@RequestMapping(value = "/ex12_1", method = RequestMethod.GET)
//	String hello() {
//		System.out.println("GET Ex12");
//		return "ex12";
//	}
//	
//	@RequestMapping(value = "/ex12", method = RequestMethod.POST)
//	void hello2(HttpServletRequest request, HttpServletResponse response) throws IOException {
//		System.out.println("POST Ex12");
//		String str = request.getParameter("str");
//		
//		PrintWriter out = response.getWriter();
//		out.println("Post str : " + str);
//		
//		
//	}

	
	//-------------------------------------------------------
	
	
	
//	@RequestMapping(value = "/ex09", method = RequestMethod.GET) 
//	void hello(@DateTimeFormat(pattern = "yyyy-MM-dd") Date d) {
//		System.out.println(d);
//	}

//	@InitBinder
//	public void initBinder(WebDataBinder webDataBinder) {
//		System.out.println("initBinder-Ex09_2");
//		
//		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
//		webDataBinder.registerCustomEditor( java.util.Date.class, new CustomDateEditor(df, false));
//		
//	}
//	
//	@RequestMapping(value = "/ex09_2", method = RequestMethod.GET) 
//	public void hello(String d) {
//		System.out.println("Ex09_2");
//		System.out.println(d);
//		
//	}
	
//	@RequestMapping(value = "/ex10", method = RequestMethod.GET)
//	void hello(HttpServletRequest req, HttpServletResponse res) throws IOException {
//		System.out.println("Ex10");
//		
//		String id = req.getParameter("id");
//		PrintWriter out = res.getWriter();
//		out.println("id="+id);
//	}
//
//	@RequestMapping(value = "/ex11", method = RequestMethod.GET)
//	void hello(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
//		System.out.println("Ex11");
//		
//		String id = req.getParameter("id");
//		PrintWriter out = res.getWriter();
//		out.println("id="+id);
//		
//		RequestDispatcher rd = req.getRequestDispatcher("/ex11_2");
//		req.setAttribute("id", id+"ex11");
//		rd.forward(req, res);
//		
//	}
//	
//	@RequestMapping(value = "/ex11_2", method = RequestMethod.GET)
//	void hello2() throws IOException, ServletException {
//		System.out.println("Ex11_2");
//	}
//
//	
	

	
}
