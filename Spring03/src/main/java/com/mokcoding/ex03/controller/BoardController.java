package com.mokcoding.ex03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/board")
@Log4j
public class BoardController {
	
	@GetMapping("/detail")
	public void detail(Integer num) { // Integer num 매개변수는 오류 확인용으로 들어가있는 변수.
		log.info("detail()");
		
	}
	
}
