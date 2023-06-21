package com.ccheart.bookkeeping.entity;

import lombok.Data; 
import lombok.experimental.Accessors; 

/**
 * description: LedgerBook <br>
 * date: 2023-01-30 16:42:40 <br>
 * author: cc heart <br>
 * version: 1.0 <br>
 */
@Accessors(chain = true)
@Data
public class LedgerBookEntity{

/**
 * 账本ID <br>
 * 
 */
  private Long id;

/**
 * 账本管理员ID <br>
 * 
 */
  private Long adminUserId;

/**
 * 账本名称 <br>
 * 
 */
  private String name;

/**
 * 账本图标 <br>
 * 
 */
  private String icon;

/**
 * 父级ID <br>
 * 
 */
  private Long parentId;

/**
 * 长ID <br>
 * 
 */
  private String longId;

/**
 * 创建时间 <br>
 * 
 */
  private String createTime;

/**
 * 更新时间 <br>
 * 
 */
  private String updateTime;


}
