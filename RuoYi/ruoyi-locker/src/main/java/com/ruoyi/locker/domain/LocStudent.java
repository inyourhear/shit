package com.ruoyi.locker.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 学生信息对象 loc_student
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
public class LocStudent extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 索引 */
    @Excel(name = "索引")
    private Integer id;

    /** 学号 */
    @Excel(name = "学号")
    private Integer studentId;

    /** 学院 */
    @Excel(name = "学院")
    private String studentCollege;

    /** 专业 */
    @Excel(name = "专业")
    private String studentMajor;

    /** 班级 */
    @Excel(name = "班级")
    private String studentClass;

    /** 名字 */
    @Excel(name = "名字")
    private String studentName;

    /** 手机号码 */
    @Excel(name = "手机号码")
    private String studentPhone;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setStudentId(Integer studentId) 
    {
        this.studentId = studentId;
    }

    public Integer getStudentId() 
    {
        return studentId;
    }
    public void setStudentCollege(String studentCollege) 
    {
        this.studentCollege = studentCollege;
    }

    public String getStudentCollege() 
    {
        return studentCollege;
    }
    public void setStudentMajor(String studentMajor) 
    {
        this.studentMajor = studentMajor;
    }

    public String getStudentMajor() 
    {
        return studentMajor;
    }
    public void setStudentClass(String studentClass) 
    {
        this.studentClass = studentClass;
    }

    public String getStudentClass() 
    {
        return studentClass;
    }
    public void setStudentName(String studentName) 
    {
        this.studentName = studentName;
    }

    public String getStudentName() 
    {
        return studentName;
    }
    public void setStudentPhone(String studentPhone) 
    {
        this.studentPhone = studentPhone;
    }

    public String getStudentPhone() 
    {
        return studentPhone;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("studentId", getStudentId())
            .append("studentCollege", getStudentCollege())
            .append("studentMajor", getStudentMajor())
            .append("studentClass", getStudentClass())
            .append("studentName", getStudentName())
            .append("studentPhone", getStudentPhone())
            .toString();
    }
}
