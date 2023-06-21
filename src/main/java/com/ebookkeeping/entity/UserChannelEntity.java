package com.ebookkeeping.entity;

import lombok.Data; 
import lombok.experimental.Accessors; 

/**
 * description: UserChannel <br>
 * date: 2023-01-30 16:42:40 <br>
 * author: cc heart <br>
 * version: 1.0 <br>
 */
@Accessors(chain = true)
@Data
public class UserChannelEntity{

/**
 * 关系ID <br>
 * 
 */
  private Long id;

/**
 * 用户ID <br>
 * 
 */
  private Long userId;

/**
 * 账本ID <br>
 * 
 */
  private Long channelId;


}
