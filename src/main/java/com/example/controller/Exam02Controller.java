package com.example.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 足し算のコントローラー
 * 
 * @author taira.matsuta
 *
 */
@Controller
@RequestMapping("/exam02")
public class Exam02Controller {
	
	/**
	 * セッションスコープの準備
	 */
	@Autowired
	private HttpSession session;
	
	/**
	 * HTMLへの遷移
	 * 
	 * @return 数字入力画面へ遷移
	 */
	@RequestMapping("")
	public String index() {
		return "exam02";
	}
	
	/**
	 * 足し算の計算
	 * 
	 * @param num1 入力された数字1
	 * @param num2 入力された数字2
	 * @return 結果画面1へ遷移
	 */
	@RequestMapping("add")
	public String add(String num1, String num2) {
		Integer number1 = Integer.parseInt(num1);
		Integer number2 = Integer.parseInt(num2);
		int ans = number1 + number2;
		session.setAttribute("num1", num1);
		session.setAttribute("num2", num2);
		session.setAttribute("ans", ans);
		
		return "exam02-result";
	}
	
	/**
	 * @return 結果画面2へ遷移
	 */
	@RequestMapping("output")
	public String output() {
		return "exam02-result2";
	}
	
}
