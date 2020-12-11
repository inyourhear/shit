package com.ruoyi.locker.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 货柜信息对象 loc_container
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
public class LocContainer extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 货柜ID */
    @Excel(name = "货柜ID")
    private Integer containerId;

    /** 所在学院 */
    @Excel(name = "所在学院")
    private String containerCollege;

    /** 具体地址 */
    @Excel(name = "具体地址")
    private String containerAddress;

    /** GPS定位 */
    @Excel(name = "GPS定位")
    private String containerGps;

    /** 编码 */
    @Excel(name = "编码")
    private String containerCode;

    /** 空闲数 */
    @Excel(name = "空闲数")
    private Integer containerFreeNumber;

    /** 状态 */
    @Excel(name = "状态")
    private Integer containerState;

    /** 层数 */
    @Excel(name = "层数")
    private Integer containerFloor;

    /** 每层数量 */
    @Excel(name = "每层数量")
    private Integer containerNumberPerFloor;

    public void setContainerId(Integer containerId) 
    {
        this.containerId = containerId;
    }

    public Integer getContainerId() 
    {
        return containerId;
    }
    public void setContainerCollege(String containerCollege) 
    {
        this.containerCollege = containerCollege;
    }

    public String getContainerCollege() 
    {
        return containerCollege;
    }
    public void setContainerAddress(String containerAddress) 
    {
        this.containerAddress = containerAddress;
    }

    public String getContainerAddress() 
    {
        return containerAddress;
    }
    public void setContainerGps(String containerGps) 
    {
        this.containerGps = containerGps;
    }

    public String getContainerGps() 
    {
        return containerGps;
    }
    public void setContainerCode(String containerCode) 
    {
        this.containerCode = containerCode;
    }

    public String getContainerCode() 
    {
        return containerCode;
    }
    public void setContainerFreeNumber(Integer containerFreeNumber) 
    {
        this.containerFreeNumber = containerFreeNumber;
    }

    public Integer getContainerFreeNumber() 
    {
        return containerFreeNumber;
    }
    public void setContainerState(Integer containerState) 
    {
        this.containerState = containerState;
    }

    public Integer getContainerState() 
    {
        return containerState;
    }
    public void setContainerFloor(Integer containerFloor) 
    {
        this.containerFloor = containerFloor;
    }

    public Integer getContainerFloor() 
    {
        return containerFloor;
    }
    public void setContainerNumberPerFloor(Integer containerNumberPerFloor) 
    {
        this.containerNumberPerFloor = containerNumberPerFloor;
    }

    public Integer getContainerNumberPerFloor() 
    {
        return containerNumberPerFloor;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("containerId", getContainerId())
            .append("containerCollege", getContainerCollege())
            .append("containerAddress", getContainerAddress())
            .append("containerGps", getContainerGps())
            .append("containerCode", getContainerCode())
            .append("containerFreeNumber", getContainerFreeNumber())
            .append("containerState", getContainerState())
            .append("containerFloor", getContainerFloor())
            .append("containerNumberPerFloor", getContainerNumberPerFloor())
            .toString();
    }
}
