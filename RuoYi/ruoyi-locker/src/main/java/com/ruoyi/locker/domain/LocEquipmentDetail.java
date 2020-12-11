package com.ruoyi.locker.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 设备明细信息对象 loc_equipment_detail
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
public class LocEquipmentDetail extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 设备ID */
    @Excel(name = "设备ID")
    private Integer equipmentDetailId;

    /** 设备类型ID */
    @Excel(name = "设备类型ID")
    private Integer equipmentDetailTypeid;

    /** 设备名 */
    @Excel(name = "设备名")
    private String equipmentDetailName;

    /** 设备编码 */
    @Excel(name = "设备编码")
    private String equipmentDetailCode;

    /** 固定资产号 */
    @Excel(name = "固定资产号")
    private Long equipmentDetailAssetNumber;

    /** 出厂编码 */
    @Excel(name = "出厂编码")
    private String equipmentDetailFactoryCode;

    /** 设备所在格子编码 */
    @Excel(name = "设备所在格子编码")
    private String equipmentDetailBoxCode;

    /** 设备状态 */
    @Excel(name = "设备状态")
    private Long equipmentDetailState;

    public void setEquipmentDetailId(Integer equipmentDetailId) 
    {
        this.equipmentDetailId = equipmentDetailId;
    }

    public Integer getEquipmentDetailId() 
    {
        return equipmentDetailId;
    }
    public void setEquipmentDetailTypeid(Integer equipmentDetailTypeid) 
    {
        this.equipmentDetailTypeid = equipmentDetailTypeid;
    }

    public Integer getEquipmentDetailTypeid() 
    {
        return equipmentDetailTypeid;
    }
    public void setEquipmentDetailName(String equipmentDetailName) 
    {
        this.equipmentDetailName = equipmentDetailName;
    }

    public String getEquipmentDetailName() 
    {
        return equipmentDetailName;
    }
    public void setEquipmentDetailCode(String equipmentDetailCode) 
    {
        this.equipmentDetailCode = equipmentDetailCode;
    }

    public String getEquipmentDetailCode() 
    {
        return equipmentDetailCode;
    }
    public void setEquipmentDetailAssetNumber(Long equipmentDetailAssetNumber) 
    {
        this.equipmentDetailAssetNumber = equipmentDetailAssetNumber;
    }

    public Long getEquipmentDetailAssetNumber() 
    {
        return equipmentDetailAssetNumber;
    }
    public void setEquipmentDetailFactoryCode(String equipmentDetailFactoryCode) 
    {
        this.equipmentDetailFactoryCode = equipmentDetailFactoryCode;
    }

    public String getEquipmentDetailFactoryCode() 
    {
        return equipmentDetailFactoryCode;
    }
    public void setEquipmentDetailBoxCode(String equipmentDetailBoxCode) 
    {
        this.equipmentDetailBoxCode = equipmentDetailBoxCode;
    }

    public String getEquipmentDetailBoxCode() 
    {
        return equipmentDetailBoxCode;
    }
    public void setEquipmentDetailState(Long equipmentDetailState) 
    {
        this.equipmentDetailState = equipmentDetailState;
    }

    public Long getEquipmentDetailState() 
    {
        return equipmentDetailState;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("equipmentDetailId", getEquipmentDetailId())
            .append("equipmentDetailTypeid", getEquipmentDetailTypeid())
            .append("equipmentDetailName", getEquipmentDetailName())
            .append("equipmentDetailCode", getEquipmentDetailCode())
            .append("equipmentDetailAssetNumber", getEquipmentDetailAssetNumber())
            .append("equipmentDetailFactoryCode", getEquipmentDetailFactoryCode())
            .append("equipmentDetailBoxCode", getEquipmentDetailBoxCode())
            .append("equipmentDetailState", getEquipmentDetailState())
            .toString();
    }
}
