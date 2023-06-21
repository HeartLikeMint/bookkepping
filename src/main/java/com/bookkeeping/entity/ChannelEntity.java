package com.bookkeeping.entity;

import lombok.Data; 
import lombok.experimental.Accessors; 

/**
 * description: Channel <br>
 * date: 2023-01-30 16:42:40 <br>
 * author: cc heart <br>
 * version: 1.0 <br>
 */
@Accessors(chain = true)
@Data
public class ChannelEntity{

/**
 * null <br>
 * 
 */
  private Long id;

/**
 * 渠道名称 <br>
 * 
 */
  private String name;

/**
 * 渠道类型 0 支出 1 收入 <br>
 * 
 */
  private String type;

/**
 * 渠道图标 <br>
 * 
 */
  private String icon;

/**
 * 创建时间 <br>
 * 
 */
  private String createTime;


}
