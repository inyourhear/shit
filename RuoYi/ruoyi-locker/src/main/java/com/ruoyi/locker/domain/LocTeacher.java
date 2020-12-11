package com.ruoyi.locker.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 教职工对象 loc_teacher
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
public class LocTeacher extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 自增索引 */
    @Excel(name = "自增索引")
    private Long id;

    /** 教职工号 */
    @Excel(name = "教职工号")
    private Long teacherId;

    /** 姓名 */
    @Excel(name = "姓名")
    private String teacherName;

    /** 联系方式 */
    @Excel(name = "联系方式")
    private String teacherPhone;

    /** 所在学院 */
    @Excel(name = "所在学院")
    private String teacherCollege;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setTeacherId(Long teacherId) 
    {
        this.teacherId = teacherId;
    }

    public Long getTeacherId() 
    {
        return teacherId;
    }
    public void setTeacherName(String teacherName) 
    {
        this.teacherName = teacherName;
    }

    public String getTeacherName() 
    {
        return teacherName;
    }
    public void setTeacherPhone(String teacherPhone) 
    {
        this.teacherPhone = teacherPhone;
    }

    public String getTeacherPhone() 
    {
        return teacherPhone;
    }
    public void setTeacherCollege(String teacherCollege) 
    {
        this.teacherCollege = teacherCollege;
    }

    public String getTeacherCollege() 
    {
        return teacherCollege;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("teacherId", getTeacherId())
            .append("teacherName", getTeacherName())
            .append("teacherPhone", getTeacherPhone())
            .append("teacherCollege", getTeacherCollege())
            .toString();
    }
}
