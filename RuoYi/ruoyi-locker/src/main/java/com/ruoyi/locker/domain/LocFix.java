package com.ruoyi.locker.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 维修信息单对象 loc_fix
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
public class LocFix extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 维修单ID */
    @Excel(name = "维修单ID")
    private Integer fixId;

    /** 上报人ID */
    @Excel(name = "上报人ID")
    private Integer fixReportPersonId;

    /** 设备ID */
    @Excel(name = "设备ID")
    private Integer fixEquipmentId;

    /** 维修人员ID */
    @Excel(name = "维修人员ID")
    private Integer fixRepairPersonId;

    /** 维修原因 */
    @Excel(name = "维修原因")
    private String fixReason;

    /** 维修状态 */
    @Excel(name = "维修状态")
    private Integer fixState;

    /** 报修时间 */
    @Excel(name = "报修时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date fixReportTime;

    /** 修复时间 */
    @Excel(name = "修复时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date fixRepairTime;

    public void setFixId(Integer fixId) 
    {
        this.fixId = fixId;
    }

    public Integer getFixId() 
    {
        return fixId;
    }
    public void setFixReportPersonId(Integer fixReportPersonId) 
    {
        this.fixReportPersonId = fixReportPersonId;
    }

    public Integer getFixReportPersonId() 
    {
        return fixReportPersonId;
    }
    public void setFixEquipmentId(Integer fixEquipmentId) 
    {
        this.fixEquipmentId = fixEquipmentId;
    }

    public Integer getFixEquipmentId() 
    {
        return fixEquipmentId;
    }
    public void setFixRepairPersonId(Integer fixRepairPersonId) 
    {
        this.fixRepairPersonId = fixRepairPersonId;
    }

    public Integer getFixRepairPersonId() 
    {
        return fixRepairPersonId;
    }
    public void setFixReason(String fixReason) 
    {
        this.fixReason = fixReason;
    }

    public String getFixReason() 
    {
        return fixReason;
    }
    public void setFixState(Integer fixState) 
    {
        this.fixState = fixState;
    }

    public Integer getFixState() 
    {
        return fixState;
    }
    public void setFixReportTime(Date fixReportTime) 
    {
        this.fixReportTime = fixReportTime;
    }

    public Date getFixReportTime() 
    {
        return fixReportTime;
    }
    public void setFixRepairTime(Date fixRepairTime) 
    {
        this.fixRepairTime = fixRepairTime;
    }

    public Date getFixRepairTime() 
    {
        return fixRepairTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("fixId", getFixId())
            .append("fixReportPersonId", getFixReportPersonId())
            .append("fixEquipmentId", getFixEquipmentId())
            .append("fixRepairPersonId", getFixRepairPersonId())
            .append("fixReason", getFixReason())
            .append("fixState", getFixState())
            .append("fixReportTime", getFixReportTime())
            .append("fixRepairTime", getFixRepairTime())
            .toString();
    }
}
