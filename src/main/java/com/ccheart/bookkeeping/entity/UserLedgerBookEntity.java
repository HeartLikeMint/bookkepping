package com.ccheart.bookkeeping.entity;

import lombok.Data; 
import lombok.experimental.Accessors; 

/**
 * description: UserLedgerBook <br>
 * date: 2023-01-30 16:42:40 <br>
 * author: cc heart <br>
 * version: 1.0 <br>
 */
@Accessors(chain = true)
@Data
public class UserLedgerBookEntity{

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
  private Long ledgerBookId;


}
