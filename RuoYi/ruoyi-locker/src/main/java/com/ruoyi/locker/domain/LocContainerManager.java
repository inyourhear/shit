package com.ruoyi.locker.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 货柜管理员对象 loc_container_manager
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
public class LocContainerManager extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 索引 */
    @Excel(name = "索引")
    private Integer id;

    /** 货柜ID */
    @Excel(name = "货柜ID")
    private Integer containerManagerContainerId;

    /** 管理员ID */
    @Excel(name = "管理员ID")
    private Integer containerManagerAdministratorsId;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setContainerManagerContainerId(Integer containerManagerContainerId) 
    {
        this.containerManagerContainerId = containerManagerContainerId;
    }

    public Integer getContainerManagerContainerId() 
    {
        return containerManagerContainerId;
    }
    public void setContainerManagerAdministratorsId(Integer containerManagerAdministratorsId) 
    {
        this.containerManagerAdministratorsId = containerManagerAdministratorsId;
    }

    public Integer getContainerManagerAdministratorsId() 
    {
        return containerManagerAdministratorsId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("containerManagerContainerId", getContainerManagerContainerId())
            .append("containerManagerAdministratorsId", getContainerManagerAdministratorsId())
            .toString();
    }
}
