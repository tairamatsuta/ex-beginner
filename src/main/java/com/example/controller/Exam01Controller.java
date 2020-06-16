package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * コントローラー
 * 
 * @author taira.matsuta
 *
 */
@Controller
@RequestMapping("/exam01")
public class Exam01Controller {

	/**
	 * HTMLに遷移する
	 * 
	 * @return　名前を入力する画面に遷移
	 */
	@RequestMapping("")
	public String index() {
		return "exam01";
	}
	
	/**
	 * フォームでセットされた名前をリクエストスコープにセットする
	 * 
	 * @param name　フォームで入力された値
	 * @param model　リクエストスコープ
	 * @return　リザルト画面に遷移
	 */
	@RequestMapping("/input")
	public String input(String name, Model model) {
		model.addAttribute("name", name);
		return "exam01-result";
	}
}
