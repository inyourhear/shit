package com.ruoyi.locker.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 指定班级对象 loc_classrule
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
public class LocClassrule extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 班级规则ID */
    @Excel(name = "班级规则ID")
    private Integer classruleId;

    /** 开放班级 */
    @Excel(name = "开放班级")
    private String classruleClass;

    public void setClassruleId(Integer classruleId) 
    {
        this.classruleId = classruleId;
    }

    public Integer getClassruleId() 
    {
        return classruleId;
    }
    public void setClassruleClass(String classruleClass) 
    {
        this.classruleClass = classruleClass;
    }

    public String getClassruleClass() 
    {
        return classruleClass;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("classruleId", getClassruleId())
            .append("classruleClass", getClassruleClass())
            .toString();
    }
}
