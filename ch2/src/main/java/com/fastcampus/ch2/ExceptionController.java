package com.fastcampus.ch2;

import java.io.FileNotFoundException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExceptionController {
	
	//2개이 쓸때는 배열로 나타나게함
	//@ExceptionHandler({NullPointerException.class, FileNotFoundException.class})
	@ExceptionHandler(NullPointerException.class)
	public String catcher2(Exception ex, Model m) {
		m.addAttribute("ex",ex);
		return "error";
	}
	
	@ExceptionHandler(Exception.class)
	public String catcher(Exception ex,Model m) {
		m.addAttribute("ex",ex);
		return "error";
	}
	
	
	@RequestMapping("/ex")
	public String main() throws Exception{
		throw new Exception("예외가 발생했습니다");
		
	}
	
	@RequestMapping("/ex2")
	public String main2() throws Exception{
		throw new Exception("예외가 발생했습니다");
	}
	
	@RequestMapping("/ex3")
	public String main3() throws Exception{
		throw new FileNotFoundException("예외가 발생했습니다");
	}
}
