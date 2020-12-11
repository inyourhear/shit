package com.ruoyi.locker.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 开门指令对象 loc_order
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
public class LocOrder extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 指令ID */
    @Excel(name = "指令ID")
    private Integer orderId;

    /** 端口ID */
    @Excel(name = "端口ID")
    private Integer orderPortId;

    /** 时间 */
    @Excel(name = "时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date orderTime;

    /** 状态 */
    @Excel(name = "状态")
    private Integer orderState;

    public void setOrderId(Integer orderId) 
    {
        this.orderId = orderId;
    }

    public Integer getOrderId() 
    {
        return orderId;
    }
    public void setOrderPortId(Integer orderPortId) 
    {
        this.orderPortId = orderPortId;
    }

    public Integer getOrderPortId() 
    {
        return orderPortId;
    }
    public void setOrderTime(Date orderTime) 
    {
        this.orderTime = orderTime;
    }

    public Date getOrderTime() 
    {
        return orderTime;
    }
    public void setOrderState(Integer orderState) 
    {
        this.orderState = orderState;
    }

    public Integer getOrderState() 
    {
        return orderState;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("orderId", getOrderId())
            .append("orderPortId", getOrderPortId())
            .append("orderTime", getOrderTime())
            .append("orderState", getOrderState())
            .toString();
    }
}
