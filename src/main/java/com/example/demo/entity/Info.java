package com.example.demo.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Yanghu
 * @since 2018-11-22
 */
@Data
@TableName("user_info")
public class Info implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId(type = IdType.UUID)
	private Integer id;

	/**
	 * 
	 */
	private String homeid;

	/**
	 * 
	 */
	private String password;

	/**
	 * 
	 */
	private String name;

	/**
	 * 
	 */
	@TableField(value="user_name")
	private String user_Name;

	/**
	 * 
	 */
	private String telphone;

	/**
	 * 
	 */
	private String phone;

	/**
	 * 
	 */
	private String remake;

	/**
	 * 
	 */
	private Integer status;

	/**
	 * openid
	 */
	private String op;

}
