package com.ruoyi.locker.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 端口信息对象 loc_port
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
public class LocPort extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 端口ID */
    @Excel(name = "端口ID")
    private Integer portId;

    /** 板ID */
    @Excel(name = "板ID")
    private Integer portBoardId;

    /** 端口号 */
    @Excel(name = "端口号")
    private Integer portNumber;

    /** 状态 */
    @Excel(name = "状态")
    private Integer portState;

    public void setPortId(Integer portId) 
    {
        this.portId = portId;
    }

    public Integer getPortId() 
    {
        return portId;
    }
    public void setPortBoardId(Integer portBoardId) 
    {
        this.portBoardId = portBoardId;
    }

    public Integer getPortBoardId() 
    {
        return portBoardId;
    }
    public void setPortNumber(Integer portNumber) 
    {
        this.portNumber = portNumber;
    }

    public Integer getPortNumber() 
    {
        return portNumber;
    }
    public void setPortState(Integer portState) 
    {
        this.portState = portState;
    }

    public Integer getPortState() 
    {
        return portState;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("portId", getPortId())
            .append("portBoardId", getPortBoardId())
            .append("portNumber", getPortNumber())
            .append("portState", getPortState())
            .toString();
    }
}
