package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class Hello {
	
	int iv=10;// �ν��Ͻ� ���� - iv
	static int cv = 20;// static ���� - cv
	
	@RequestMapping("/hello")
	public void main() { // �ν��Ͻ� �޼��� -iv, cv�� �Ѵ� ����
		System.out.println("Hello");
		System.out.println(cv);
		System.out.println(iv);
	}
	
	public static void main2() { // static �޼��� - cv�� ���� 
		System.out.println(cv);
//		System.out.println(iv); // ����
	}
}
