package com.ruoyi.locker.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.locker.mapper.LocEquipmentDetailMapper;
import com.ruoyi.locker.domain.LocEquipmentDetail;
import com.ruoyi.locker.service.ILocEquipmentDetailService;
import com.ruoyi.common.core.text.Convert;

/**
 * 设备明细信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
@Service
public class LocEquipmentDetailServiceImpl implements ILocEquipmentDetailService 
{
    @Autowired
    private LocEquipmentDetailMapper locEquipmentDetailMapper;

    /**
     * 查询设备明细信息
     * 
     * @param equipmentDetailId 设备明细信息ID
     * @return 设备明细信息
     */
    @Override
    public LocEquipmentDetail selectLocEquipmentDetailById(Integer equipmentDetailId)
    {
        return locEquipmentDetailMapper.selectLocEquipmentDetailById(equipmentDetailId);
    }

    /**
     * 查询设备明细信息列表
     * 
     * @param locEquipmentDetail 设备明细信息
     * @return 设备明细信息
     */
    @Override
    public List<LocEquipmentDetail> selectLocEquipmentDetailList(LocEquipmentDetail locEquipmentDetail)
    {
        return locEquipmentDetailMapper.selectLocEquipmentDetailList(locEquipmentDetail);
    }

    /**
     * 新增设备明细信息
     * 
     * @param locEquipmentDetail 设备明细信息
     * @return 结果
     */
    @Override
    public int insertLocEquipmentDetail(LocEquipmentDetail locEquipmentDetail)
    {
        return locEquipmentDetailMapper.insertLocEquipmentDetail(locEquipmentDetail);
    }

    /**
     * 修改设备明细信息
     * 
     * @param locEquipmentDetail 设备明细信息
     * @return 结果
     */
    @Override
    public int updateLocEquipmentDetail(LocEquipmentDetail locEquipmentDetail)
    {
        return locEquipmentDetailMapper.updateLocEquipmentDetail(locEquipmentDetail);
    }

    /**
     * 删除设备明细信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteLocEquipmentDetailByIds(String ids)
    {
        return locEquipmentDetailMapper.deleteLocEquipmentDetailByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除设备明细信息信息
     * 
     * @param equipmentDetailId 设备明细信息ID
     * @return 结果
     */
    @Override
    public int deleteLocEquipmentDetailById(Integer equipmentDetailId)
    {
        return locEquipmentDetailMapper.deleteLocEquipmentDetailById(equipmentDetailId);
    }
}
