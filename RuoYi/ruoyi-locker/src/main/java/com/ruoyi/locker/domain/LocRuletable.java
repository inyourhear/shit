package com.ruoyi.locker.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 规则信息对象 loc_ruletable
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
public class LocRuletable extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 规则表ID */
    @Excel(name = "规则表ID")
    private Integer ruletableId;

    /** 规则表名 */
    @Excel(name = "规则表名")
    private String ruletableName;

    /** 规则类型名 */
    @Excel(name = "规则类型名")
    private String ruletableType;

    public void setRuletableId(Integer ruletableId) 
    {
        this.ruletableId = ruletableId;
    }

    public Integer getRuletableId() 
    {
        return ruletableId;
    }
    public void setRuletableName(String ruletableName) 
    {
        this.ruletableName = ruletableName;
    }

    public String getRuletableName() 
    {
        return ruletableName;
    }
    public void setRuletableType(String ruletableType) 
    {
        this.ruletableType = ruletableType;
    }

    public String getRuletableType() 
    {
        return ruletableType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("ruletableId", getRuletableId())
            .append("ruletableName", getRuletableName())
            .append("ruletableType", getRuletableType())
            .toString();
    }
}
