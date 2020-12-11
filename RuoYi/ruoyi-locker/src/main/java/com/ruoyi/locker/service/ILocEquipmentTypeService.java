package com.ruoyi.locker.service;

import java.util.List;
import com.ruoyi.locker.domain.LocEquipmentType;

/**
 * 设备类型信息Service接口
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
public interface ILocEquipmentTypeService 
{
    /**
     * 查询设备类型信息
     * 
     * @param equipmentTypeId 设备类型信息ID
     * @return 设备类型信息
     */
    public LocEquipmentType selectLocEquipmentTypeById(Integer equipmentTypeId);

    /**
     * 查询设备类型信息列表
     * 
     * @param locEquipmentType 设备类型信息
     * @return 设备类型信息集合
     */
    public List<LocEquipmentType> selectLocEquipmentTypeList(LocEquipmentType locEquipmentType);

    /**
     * 新增设备类型信息
     * 
     * @param locEquipmentType 设备类型信息
     * @return 结果
     */
    public int insertLocEquipmentType(LocEquipmentType locEquipmentType);

    /**
     * 修改设备类型信息
     * 
     * @param locEquipmentType 设备类型信息
     * @return 结果
     */
    public int updateLocEquipmentType(LocEquipmentType locEquipmentType);

    /**
     * 批量删除设备类型信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteLocEquipmentTypeByIds(String ids);

    /**
     * 删除设备类型信息信息
     * 
     * @param equipmentTypeId 设备类型信息ID
     * @return 结果
     */
    public int deleteLocEquipmentTypeById(Integer equipmentTypeId);
}
