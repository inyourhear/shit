package com.ruoyi.locker.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 交换对象 loc_exchange
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
public class LocExchange extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 交换ID */
    @Excel(name = "交换ID")
    private Long exchangeId;

    /** 格子编码 */
    @Excel(name = "格子编码")
    private String exchangeBoxCode;

    /** 发起交换的人员ID */
    @Excel(name = "发起交换的人员ID")
    private Integer exchangeUserId;

    /** 物品名称 */
    @Excel(name = "物品名称")
    private String exchangeGoods;

    /** 随机码 */
    @Excel(name = "随机码")
    private String exchangeRandomcode;

    /** 交换次数限制 */
    @Excel(name = "交换次数限制")
    private Integer exchangeTimesLimit;

    /** 剩余开启次数 */
    @Excel(name = "剩余开启次数")
    private Integer exchangeCount;

    public void setExchangeId(Long exchangeId) 
    {
        this.exchangeId = exchangeId;
    }

    public Long getExchangeId() 
    {
        return exchangeId;
    }
    public void setExchangeBoxCode(String exchangeBoxCode) 
    {
        this.exchangeBoxCode = exchangeBoxCode;
    }

    public String getExchangeBoxCode() 
    {
        return exchangeBoxCode;
    }
    public void setExchangeUserId(Integer exchangeUserId) 
    {
        this.exchangeUserId = exchangeUserId;
    }

    public Integer getExchangeUserId() 
    {
        return exchangeUserId;
    }
    public void setExchangeGoods(String exchangeGoods) 
    {
        this.exchangeGoods = exchangeGoods;
    }

    public String getExchangeGoods() 
    {
        return exchangeGoods;
    }
    public void setExchangeRandomcode(String exchangeRandomcode) 
    {
        this.exchangeRandomcode = exchangeRandomcode;
    }

    public String getExchangeRandomcode() 
    {
        return exchangeRandomcode;
    }
    public void setExchangeTimesLimit(Integer exchangeTimesLimit) 
    {
        this.exchangeTimesLimit = exchangeTimesLimit;
    }

    public Integer getExchangeTimesLimit() 
    {
        return exchangeTimesLimit;
    }
    public void setExchangeCount(Integer exchangeCount) 
    {
        this.exchangeCount = exchangeCount;
    }

    public Integer getExchangeCount() 
    {
        return exchangeCount;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("exchangeId", getExchangeId())
            .append("exchangeBoxCode", getExchangeBoxCode())
            .append("exchangeUserId", getExchangeUserId())
            .append("exchangeGoods", getExchangeGoods())
            .append("exchangeRandomcode", getExchangeRandomcode())
            .append("exchangeTimesLimit", getExchangeTimesLimit())
            .append("exchangeCount", getExchangeCount())
            .toString();
    }
}
