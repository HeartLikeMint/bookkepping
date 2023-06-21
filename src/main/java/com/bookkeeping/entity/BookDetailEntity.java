package com.bookkeeping.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * description: BookDetail <br>
 * date: 2023-01-30 16:11:13 <br>
 * author: cc heart <br>
 * version: 1.0 <br>
 */
@Accessors(chain = true)
@Data
public class BookDetailEntity {

    /**
     * 主键 <br>
     */
    private Long id;

    /**
     * 账本主键 <br>
     */
    private Long ledgerBookId;

    /**
     * 收支渠道类型 0 支出 1 收入
     * <br>
     */
    private String channel;

    /**
     * 收支渠道ID <br>
     */
    private Long channelTypeId;

    /**
     * 动账类型ID <br>
     */
    private Long activeTypeId;

    /**
     * 金额 <br>
     */
    private double money;

    /**
     * 账户余额 <br>
     */
    private double balance;

    /**
     * 创建时间 <br>
     */
    private String createTime;

    /**
     * 动账日期 <br>
     */
    private String activeDate;

    /**
     * 备注 <br>
     */
    private String remark;


}
