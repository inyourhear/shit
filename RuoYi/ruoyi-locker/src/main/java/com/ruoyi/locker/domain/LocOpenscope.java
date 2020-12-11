package com.ruoyi.locker.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 格子开放范围信对象 loc_openscope
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
public class LocOpenscope extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 开放范围ID */
    @Excel(name = "开放范围ID")
    private Long openscopeId;

    /** 格子编码 */
    @Excel(name = "格子编码")
    private String openscopeBoxCode;

    /** 规则表ID */
    @Excel(name = "规则表ID")
    private Integer openscopeRuletableId;

    /** 规则ID */
    @Excel(name = "规则ID")
    private Integer openscopeRuleId;

    /** 是否失效(0有效，1失效） */
    @Excel(name = "是否失效(0有效，1失效）")
    private Long openscopeInvalid;

    public void setOpenscopeId(Long openscopeId) 
    {
        this.openscopeId = openscopeId;
    }

    public Long getOpenscopeId() 
    {
        return openscopeId;
    }
    public void setOpenscopeBoxCode(String openscopeBoxCode) 
    {
        this.openscopeBoxCode = openscopeBoxCode;
    }

    public String getOpenscopeBoxCode() 
    {
        return openscopeBoxCode;
    }
    public void setOpenscopeRuletableId(Integer openscopeRuletableId) 
    {
        this.openscopeRuletableId = openscopeRuletableId;
    }

    public Integer getOpenscopeRuletableId() 
    {
        return openscopeRuletableId;
    }
    public void setOpenscopeRuleId(Integer openscopeRuleId) 
    {
        this.openscopeRuleId = openscopeRuleId;
    }

    public Integer getOpenscopeRuleId() 
    {
        return openscopeRuleId;
    }
    public void setOpenscopeInvalid(Long openscopeInvalid) 
    {
        this.openscopeInvalid = openscopeInvalid;
    }

    public Long getOpenscopeInvalid() 
    {
        return openscopeInvalid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("openscopeId", getOpenscopeId())
            .append("openscopeBoxCode", getOpenscopeBoxCode())
            .append("openscopeRuletableId", getOpenscopeRuletableId())
            .append("openscopeRuleId", getOpenscopeRuleId())
            .append("openscopeInvalid", getOpenscopeInvalid())
            .toString();
    }
}
