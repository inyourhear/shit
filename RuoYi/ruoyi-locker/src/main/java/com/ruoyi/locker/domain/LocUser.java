package com.ruoyi.locker.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 用户对象 loc_user
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
public class LocUser extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 自增索引 */
    @Excel(name = "自增索引")
    private Integer id;

    /** 用户ID */
    @Excel(name = "用户ID")
    private Integer userId;

    /** 用户名 */
    @Excel(name = "用户名")
    private String userName;

    /** 用户类型（0学生，1教职工，2其他） */
    @Excel(name = "用户类型", readConverterExp = "0=学生，1教职工，2其他")
    private Long userType;

    /** open_id */
    @Excel(name = "open_id")
    private String openId;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setUserId(Integer userId) 
    {
        this.userId = userId;
    }

    public Integer getUserId() 
    {
        return userId;
    }
    public void setUserName(String userName) 
    {
        this.userName = userName;
    }

    public String getUserName() 
    {
        return userName;
    }
    public void setUserType(Long userType) 
    {
        this.userType = userType;
    }

    public Long getUserType() 
    {
        return userType;
    }
    public void setOpenId(String openId) 
    {
        this.openId = openId;
    }

    public String getOpenId() 
    {
        return openId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("userId", getUserId())
            .append("userName", getUserName())
            .append("userType", getUserType())
            .append("openId", getOpenId())
            .toString();
    }
}
