package com.ebookkeeping.entity;

import lombok.Data; 
import lombok.experimental.Accessors; 

/**
 * description: UserInfo <br>
 * date: 2023-01-30 16:42:40 <br>
 * author: cc heart <br>
 * version: 1.0 <br>
 */
@Accessors(chain = true)
@Data
public class UserInfoEntity{

/**
 * id主键 <br>
 * 
 */
  private Long id;

/**
 * 用户编码 <br>
 * 
 */
  private String code;

/**
 * 用户名 <br>
 * 
 */
  private String name;

/**
 * 密码 <br>
 * 
 */
  private String password;

/**
 * 注册时间 <br>
 * 
 */
  private String createTime;


}
