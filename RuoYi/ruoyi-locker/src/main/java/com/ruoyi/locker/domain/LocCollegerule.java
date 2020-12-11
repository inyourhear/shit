package com.ruoyi.locker.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 开放学院规则对象 loc_collegerule
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
public class LocCollegerule extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 开放学院规则ID */
    @Excel(name = "开放学院规则ID")
    private Integer collegeruleId;

    /** 开放学院 */
    @Excel(name = "开放学院")
    private String collegeruleCollege;

    public void setCollegeruleId(Integer collegeruleId) 
    {
        this.collegeruleId = collegeruleId;
    }

    public Integer getCollegeruleId() 
    {
        return collegeruleId;
    }
    public void setCollegeruleCollege(String collegeruleCollege) 
    {
        this.collegeruleCollege = collegeruleCollege;
    }

    public String getCollegeruleCollege() 
    {
        return collegeruleCollege;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("collegeruleId", getCollegeruleId())
            .append("collegeruleCollege", getCollegeruleCollege())
            .toString();
    }
}
