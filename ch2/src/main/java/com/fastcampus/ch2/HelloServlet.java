package com.fastcampus.ch2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet{
	@Override
	public void init() throws ServletException {
		// 서블릿이 초기화될때 자동 호출된느 메서드
		// 1. 서블릿의 초기화 작업을 담당
		System.out.println("helloServlet init");
	}

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response){
		// 1. 입력
		// 2. 처리
		// 3. 출력
		System.out.println("helloServlet service");
	}

	@Override
	public void destroy() {
		System.out.println("helloServlet destroy");
	}


}
