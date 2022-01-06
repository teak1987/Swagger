package com.swagger.swagger;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Details about contact")
public class Contact {
	@ApiModelProperty(notes = "The unique id")
	private Integer id;
	@ApiModelProperty(notes = "The person's name")
	private String name;
	@ApiModelProperty(notes = "The person's phone number")
	private String phone;

	public Contact() {
		
	}
	
	public Contact(Integer id, String name, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
