package com.ruoyi.locker.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 时间规则明细对象 loc_timerule
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
public class LocTimerule extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 时间规则ID */
    @Excel(name = "时间规则ID")
    private Integer timeruleId;

    /** 开始时间 */
    @Excel(name = "开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date timeruleStartTime;

    /** 结束时间 */
    @Excel(name = "结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date timeruleEndTime;

    public void setTimeruleId(Integer timeruleId) 
    {
        this.timeruleId = timeruleId;
    }

    public Integer getTimeruleId() 
    {
        return timeruleId;
    }
    public void setTimeruleStartTime(Date timeruleStartTime) 
    {
        this.timeruleStartTime = timeruleStartTime;
    }

    public Date getTimeruleStartTime() 
    {
        return timeruleStartTime;
    }
    public void setTimeruleEndTime(Date timeruleEndTime) 
    {
        this.timeruleEndTime = timeruleEndTime;
    }

    public Date getTimeruleEndTime() 
    {
        return timeruleEndTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("timeruleId", getTimeruleId())
            .append("timeruleStartTime", getTimeruleStartTime())
            .append("timeruleEndTime", getTimeruleEndTime())
            .toString();
    }
}
