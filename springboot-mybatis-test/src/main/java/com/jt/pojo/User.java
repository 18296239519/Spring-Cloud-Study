package com.jt.pojo;

import java.io.Serializable;

import lombok.Data;
import lombok.experimental.Accessors;

@Data//自动生成set/get/tostring等方法
@Accessors(chain=true)//链式加载
public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2293941719496730677L;
	private Integer id;
	private String name;
	private Integer age;
	private String sex;
	

}
