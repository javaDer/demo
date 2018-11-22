package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
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
@TableName("netease_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId(type = IdType.UUID)
	private Integer id;

	/**
	 * 
	 */
	private String neteaseaccid;

	/**
	 * 
	 */
	private String phone;

	/**
	 * 
	 */
	private String nickname;

	/**
	 * 
	 */
	private Integer sex;

	/**
	 * 
	 */
	private String avatar;

	/**
	 * 
	 */
	private String title;

	/**
	 * 
	 */
	private String neteasetoken;

	/**
	 * 
	 */
	private String username;

	/**
	 * 
	 */
	private String password;

	/**
	 * 
	 */
	private Integer identification;

}
