package com.ruoyi.locker.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 格子信息对象 loc_box
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
public class LocBox extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 货柜ID */
    @Excel(name = "货柜ID")
    private Integer boxContainerId;

    /** 编码 */
    @Excel(name = "编码")
    private String boxCode;

    /** 控制端口ID */
    @Excel(name = "控制端口ID")
    private Integer boxPortId;

    /** 状态（0关、1开） */
    @Excel(name = "状态", readConverterExp = "0=关、1开")
    private Integer boxState;

    /** 使用类型（0借用设备，1交换箱，2信箱） */
    @Excel(name = "使用类型", readConverterExp = "0=借用设备，1交换箱，2信箱")
    private Long boxType;

    /** 当前所属人员 */
    @Excel(name = "当前所属人员")
    private Integer boxUserId;

    public void setBoxContainerId(Integer boxContainerId) 
    {
        this.boxContainerId = boxContainerId;
    }

    public Integer getBoxContainerId() 
    {
        return boxContainerId;
    }
    public void setBoxCode(String boxCode) 
    {
        this.boxCode = boxCode;
    }

    public String getBoxCode() 
    {
        return boxCode;
    }
    public void setBoxPortId(Integer boxPortId) 
    {
        this.boxPortId = boxPortId;
    }

    public Integer getBoxPortId() 
    {
        return boxPortId;
    }
    public void setBoxState(Integer boxState) 
    {
        this.boxState = boxState;
    }

    public Integer getBoxState() 
    {
        return boxState;
    }
    public void setBoxType(Long boxType) 
    {
        this.boxType = boxType;
    }

    public Long getBoxType() 
    {
        return boxType;
    }
    public void setBoxUserId(Integer boxUserId) 
    {
        this.boxUserId = boxUserId;
    }

    public Integer getBoxUserId() 
    {
        return boxUserId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("boxContainerId", getBoxContainerId())
            .append("boxCode", getBoxCode())
            .append("boxPortId", getBoxPortId())
            .append("boxState", getBoxState())
            .append("boxType", getBoxType())
            .append("boxUserId", getBoxUserId())
            .toString();
    }
}
