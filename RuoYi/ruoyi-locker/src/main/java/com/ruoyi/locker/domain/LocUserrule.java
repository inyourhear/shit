package com.ruoyi.locker.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 开放人员规则对象 loc_userrule
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
public class LocUserrule extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 用户规则ID */
    @Excel(name = "用户规则ID")
    private Integer userruleId;

    /** 用户ID */
    @Excel(name = "用户ID")
    private Integer userruleUserId;

    public void setUserruleId(Integer userruleId) 
    {
        this.userruleId = userruleId;
    }

    public Integer getUserruleId() 
    {
        return userruleId;
    }
    public void setUserruleUserId(Integer userruleUserId) 
    {
        this.userruleUserId = userruleUserId;
    }

    public Integer getUserruleUserId() 
    {
        return userruleUserId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("userruleId", getUserruleId())
            .append("userruleUserId", getUserruleUserId())
            .toString();
    }
}
