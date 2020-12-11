package com.ruoyi.locker.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 货柜开放规则对象 loc_openrule
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
public class LocOpenrule extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 格子开放规则ID */
    @Excel(name = "格子开放规则ID")
    private Integer openruleId;

    /** 格子编码 */
    @Excel(name = "格子编码")
    private Integer openruleBoxCode;

    /** 开放类型（0全部开放，1根据规则开放） */
    @Excel(name = "开放类型", readConverterExp = "0=全部开放，1根据规则开放")
    private Long openruleType;

    /** 审批方式（需要几级审批,0不需要审批） */
    @Excel(name = "审批方式", readConverterExp = "需=要几级审批,0不需要审批")
    private Integer openruleApproveTimes;

    public void setOpenruleId(Integer openruleId) 
    {
        this.openruleId = openruleId;
    }

    public Integer getOpenruleId() 
    {
        return openruleId;
    }
    public void setOpenruleBoxCode(Integer openruleBoxCode) 
    {
        this.openruleBoxCode = openruleBoxCode;
    }

    public Integer getOpenruleBoxCode() 
    {
        return openruleBoxCode;
    }
    public void setOpenruleType(Long openruleType) 
    {
        this.openruleType = openruleType;
    }

    public Long getOpenruleType() 
    {
        return openruleType;
    }
    public void setOpenruleApproveTimes(Integer openruleApproveTimes) 
    {
        this.openruleApproveTimes = openruleApproveTimes;
    }

    public Integer getOpenruleApproveTimes() 
    {
        return openruleApproveTimes;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("openruleId", getOpenruleId())
            .append("openruleBoxCode", getOpenruleBoxCode())
            .append("openruleType", getOpenruleType())
            .append("openruleApproveTimes", getOpenruleApproveTimes())
            .toString();
    }
}
