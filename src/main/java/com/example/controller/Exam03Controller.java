package com.example.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 合計金額を計算するコントローラー
 * 
 * @author taira.matsuta
 *
 */
@Controller
@RequestMapping("/exam03")
public class Exam03Controller {
	
	/** 税率 */
	private static final double TAX = 1.1;

	/**
	 * アプリケーションスコープの準備
	 */
	@Autowired
	private ServletContext application;
	
	/**
	 * @return　金額入力画面へ遷移
	 */
	@RequestMapping("")
	public String index() {
		return "exam03";
	}
	
	/**
	 * 合計金額の計算
	 * 
	 * @param item1 商品1の価格
	 * @param item2 商品2の価格
	 * @param item3 商品3の価格
	 * @return　合計金額表示画面へ遷移
	 */
	@RequestMapping("/input")
	public String input(String item1, String item2, String item3) {
		Integer item1Price = Integer.parseInt(item1);
		Integer item2Price = Integer.parseInt(item2);
		Integer item3Price = Integer.parseInt(item3);
		int taxFreePrice = item1Price + item2Price + item3Price;
		int totalPrice = (int) (taxFreePrice * TAX);
		application.setAttribute("taxFree", taxFreePrice);
		application.setAttribute("total", totalPrice);
		
		return "exam03-result";
	}
}
