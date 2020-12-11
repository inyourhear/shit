package com.ruoyi.locker.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 管理员信息对象 loc_administrators
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
public class LocAdministrators extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 管理员ID */
    @Excel(name = "管理员ID")
    private Integer administratorsId;

    /** 姓名 */
    @Excel(name = "姓名")
    private String administratorsName;

    /** 联系方式 */
    @Excel(name = "联系方式")
    private String administratorsPhone;

    public void setAdministratorsId(Integer administratorsId) 
    {
        this.administratorsId = administratorsId;
    }

    public Integer getAdministratorsId() 
    {
        return administratorsId;
    }
    public void setAdministratorsName(String administratorsName) 
    {
        this.administratorsName = administratorsName;
    }

    public String getAdministratorsName() 
    {
        return administratorsName;
    }
    public void setAdministratorsPhone(String administratorsPhone) 
    {
        this.administratorsPhone = administratorsPhone;
    }

    public String getAdministratorsPhone() 
    {
        return administratorsPhone;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("administratorsId", getAdministratorsId())
            .append("administratorsName", getAdministratorsName())
            .append("administratorsPhone", getAdministratorsPhone())
            .toString();
    }
}
