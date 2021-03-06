package com.fastcampus.ch2;

import java.net.URLEncoder;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {
	//@RequestMapping("/register/add")
//	@GetMapping("/register/add")
//	public String register() {
//		return "registerForm";
//	}
	
	//@RequestMapping(value="/register/save", method=RequestMethod.POST)
	@PostMapping("/register/save") // 스프링 4.3 버전 이상부터 지원
	public String save(User user, Model m) throws Exception{
		//1. 유효성 검사
		if(!isValid(user)) {
			String msg = URLEncoder.encode("id를 잘못 입력 하엿습니다", "utf-8");
			
			m.addAttribute("msg",msg);
			return "redirect:/register/add";
//			return "redirect:/register/add?msg="+msg; // URL재작성(rewriting)
		}
		//2. DB에 신규회원 정보를 저장
		
		return "registerInfo";
	}

	private boolean isValid(User user) {
		return true;
	}
}
