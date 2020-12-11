package com.ruoyi.locker.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 对接对象 loc_docking
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
public class LocDocking extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 对接ID */
    @Excel(name = "对接ID")
    private Long dockingId;

    /** 交换ID */
    @Excel(name = "交换ID")
    private Long dockingExchangeId;

    /** 对接人员ID */
    @Excel(name = "对接人员ID")
    private Long dockingPersonId;

    /** 对接（开启格子）时间 */
    @Excel(name = "对接", readConverterExp = "开=启格子")
    private Date dockingTime;

    public void setDockingId(Long dockingId) 
    {
        this.dockingId = dockingId;
    }

    public Long getDockingId() 
    {
        return dockingId;
    }
    public void setDockingExchangeId(Long dockingExchangeId) 
    {
        this.dockingExchangeId = dockingExchangeId;
    }

    public Long getDockingExchangeId() 
    {
        return dockingExchangeId;
    }
    public void setDockingPersonId(Long dockingPersonId) 
    {
        this.dockingPersonId = dockingPersonId;
    }

    public Long getDockingPersonId() 
    {
        return dockingPersonId;
    }
    public void setDockingTime(Date dockingTime) 
    {
        this.dockingTime = dockingTime;
    }

    public Date getDockingTime() 
    {
        return dockingTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("dockingId", getDockingId())
            .append("dockingExchangeId", getDockingExchangeId())
            .append("dockingPersonId", getDockingPersonId())
            .append("dockingTime", getDockingTime())
            .toString();
    }
}
