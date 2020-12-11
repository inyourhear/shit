package com.ruoyi.locker.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 其他人员对象 loc_other
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
public class LocOther extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    @Excel(name = "ID")
    private Integer otherId;

    /** 姓名 */
    @Excel(name = "姓名")
    private String otherName;

    /** 电话 */
    @Excel(name = "电话")
    private String otherPhone;

    /** 工作 */
    @Excel(name = "工作")
    private String other_job;

    public void setOtherId(Integer otherId) 
    {
        this.otherId = otherId;
    }

    public Integer getOtherId() 
    {
        return otherId;
    }
    public void setOtherName(String otherName) 
    {
        this.otherName = otherName;
    }

    public String getOtherName() 
    {
        return otherName;
    }
    public void setOtherPhone(String otherPhone) 
    {
        this.otherPhone = otherPhone;
    }

    public String getOtherPhone() 
    {
        return otherPhone;
    }
    public void setOther_job(String other_job)
    {
        this.other_job = other_job;
    }

    public String getOther_job()
    {
        return other_job;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("otherId", getOtherId())
            .append("otherName", getOtherName())
            .append("otherPhone", getOtherPhone())
            .append("other job", getOther_job())
            .toString();
    }
}
