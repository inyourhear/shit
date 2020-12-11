package com.ruoyi.locker.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 开放专业对象 loc_majorrule
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
public class LocMajorrule extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 专业规则ID */
    @Excel(name = "专业规则ID")
    private Long majorruleId;

    /** 开放专业 */
    @Excel(name = "开放专业")
    private String majorruleMajor;

    public void setMajorruleId(Long majorruleId) 
    {
        this.majorruleId = majorruleId;
    }

    public Long getMajorruleId() 
    {
        return majorruleId;
    }
    public void setMajorruleMajor(String majorruleMajor) 
    {
        this.majorruleMajor = majorruleMajor;
    }

    public String getMajorruleMajor() 
    {
        return majorruleMajor;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("majorruleId", getMajorruleId())
            .append("majorruleMajor", getMajorruleMajor())
            .toString();
    }
}
