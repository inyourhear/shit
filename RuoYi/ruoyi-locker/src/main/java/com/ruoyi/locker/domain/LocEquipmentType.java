package com.ruoyi.locker.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 设备类型信息对象 loc_equipment_type
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
public class LocEquipmentType extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 设备类型ID */
    @Excel(name = "设备类型ID")
    private Integer equipmentTypeId;

    /** 设备类型名 */
    @Excel(name = "设备类型名")
    private String equipmentTypeName;

    /** 设备型号 */
    @Excel(name = "设备型号")
    private String equipmentTypeModel;

    /** 设备规格 */
    @Excel(name = "设备规格")
    private String equipmentTypeSpecs;

    /** 设备分类 */
    @Excel(name = "设备分类")
    private String equipmentTypeClassification;

    public void setEquipmentTypeId(Integer equipmentTypeId) 
    {
        this.equipmentTypeId = equipmentTypeId;
    }

    public Integer getEquipmentTypeId() 
    {
        return equipmentTypeId;
    }
    public void setEquipmentTypeName(String equipmentTypeName) 
    {
        this.equipmentTypeName = equipmentTypeName;
    }

    public String getEquipmentTypeName() 
    {
        return equipmentTypeName;
    }
    public void setEquipmentTypeModel(String equipmentTypeModel) 
    {
        this.equipmentTypeModel = equipmentTypeModel;
    }

    public String getEquipmentTypeModel() 
    {
        return equipmentTypeModel;
    }
    public void setEquipmentTypeSpecs(String equipmentTypeSpecs) 
    {
        this.equipmentTypeSpecs = equipmentTypeSpecs;
    }

    public String getEquipmentTypeSpecs() 
    {
        return equipmentTypeSpecs;
    }
    public void setEquipmentTypeClassification(String equipmentTypeClassification) 
    {
        this.equipmentTypeClassification = equipmentTypeClassification;
    }

    public String getEquipmentTypeClassification() 
    {
        return equipmentTypeClassification;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("equipmentTypeId", getEquipmentTypeId())
            .append("equipmentTypeName", getEquipmentTypeName())
            .append("equipmentTypeModel", getEquipmentTypeModel())
            .append("equipmentTypeSpecs", getEquipmentTypeSpecs())
            .append("equipmentTypeClassification", getEquipmentTypeClassification())
            .toString();
    }
}
