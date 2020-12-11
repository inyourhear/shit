package com.ruoyi.locker.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 黑名单息对象 loc_blacklist
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
public class LocBlacklist extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 索引 */
    @Excel(name = "索引")
    private Integer id;

    /** 用户ID */
    @Excel(name = "用户ID")
    private Integer blacklistUserId;

    /** 原因 */
    @Excel(name = "原因")
    private String blacklistReason;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setBlacklistUserId(Integer blacklistUserId) 
    {
        this.blacklistUserId = blacklistUserId;
    }

    public Integer getBlacklistUserId() 
    {
        return blacklistUserId;
    }
    public void setBlacklistReason(String blacklistReason) 
    {
        this.blacklistReason = blacklistReason;
    }

    public String getBlacklistReason() 
    {
        return blacklistReason;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("blacklistUserId", getBlacklistUserId())
            .append("blacklistReason", getBlacklistReason())
            .toString();
    }
}
