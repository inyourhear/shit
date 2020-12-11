package com.ruoyi.locker.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.locker.mapper.LocEquipmentTypeMapper;
import com.ruoyi.locker.domain.LocEquipmentType;
import com.ruoyi.locker.service.ILocEquipmentTypeService;
import com.ruoyi.common.core.text.Convert;

/**
 * 设备类型信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
@Service
public class LocEquipmentTypeServiceImpl implements ILocEquipmentTypeService 
{
    @Autowired
    private LocEquipmentTypeMapper locEquipmentTypeMapper;

    /**
     * 查询设备类型信息
     * 
     * @param equipmentTypeId 设备类型信息ID
     * @return 设备类型信息
     */
    @Override
    public LocEquipmentType selectLocEquipmentTypeById(Integer equipmentTypeId)
    {
        return locEquipmentTypeMapper.selectLocEquipmentTypeById(equipmentTypeId);
    }

    /**
     * 查询设备类型信息列表
     * 
     * @param locEquipmentType 设备类型信息
     * @return 设备类型信息
     */
    @Override
    public List<LocEquipmentType> selectLocEquipmentTypeList(LocEquipmentType locEquipmentType)
    {
        return locEquipmentTypeMapper.selectLocEquipmentTypeList(locEquipmentType);
    }

    /**
     * 新增设备类型信息
     * 
     * @param locEquipmentType 设备类型信息
     * @return 结果
     */
    @Override
    public int insertLocEquipmentType(LocEquipmentType locEquipmentType)
    {
        return locEquipmentTypeMapper.insertLocEquipmentType(locEquipmentType);
    }

    /**
     * 修改设备类型信息
     * 
     * @param locEquipmentType 设备类型信息
     * @return 结果
     */
    @Override
    public int updateLocEquipmentType(LocEquipmentType locEquipmentType)
    {
        return locEquipmentTypeMapper.updateLocEquipmentType(locEquipmentType);
    }

    /**
     * 删除设备类型信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteLocEquipmentTypeByIds(String ids)
    {
        return locEquipmentTypeMapper.deleteLocEquipmentTypeByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除设备类型信息信息
     * 
     * @param equipmentTypeId 设备类型信息ID
     * @return 结果
     */
    @Override
    public int deleteLocEquipmentTypeById(Integer equipmentTypeId)
    {
        return locEquipmentTypeMapper.deleteLocEquipmentTypeById(equipmentTypeId);
    }
}
