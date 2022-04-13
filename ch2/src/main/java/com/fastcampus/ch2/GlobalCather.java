package com.fastcampus.ch2;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//모든 컨트롤러의 에러를 대처
@ControllerAdvice("com.fastcampus.ch2") // 지정된 패키지에서 발생한 예외 처리
//@ControllerAdvice // 모든 패키지 적용
public class GlobalCather {
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
}
