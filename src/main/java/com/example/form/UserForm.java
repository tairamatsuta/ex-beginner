package com.example.form;

import javax.validation.constraints.NotBlank;

public class UserForm {

	@NotBlank(message="入力は必須です")
	private String name;
	@NotBlank(message="入力は必須です")
	private Integer age;
	@NotBlank(message="入力は必須です")
	private String comment;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	@Override
	public String toString() {
		return "UserForm [name=" + name + ", age=" + age + ", comment=" + comment + "]";
	}
	
}
