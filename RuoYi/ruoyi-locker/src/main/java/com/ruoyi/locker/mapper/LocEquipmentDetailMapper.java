package com.ruoyi.locker.mapper;

import java.util.List;
import com.ruoyi.locker.domain.LocEquipmentDetail;

/**
 * 设备明细信息Mapper接口
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
public interface LocEquipmentDetailMapper 
{
    /**
     * 查询设备明细信息
     * 
     * @param equipmentDetailId 设备明细信息ID
     * @return 设备明细信息
     */
    public LocEquipmentDetail selectLocEquipmentDetailById(Integer equipmentDetailId);

    /**
     * 查询设备明细信息列表
     * 
     * @param locEquipmentDetail 设备明细信息
     * @return 设备明细信息集合
     */
    public List<LocEquipmentDetail> selectLocEquipmentDetailList(LocEquipmentDetail locEquipmentDetail);

    /**
     * 新增设备明细信息
     * 
     * @param locEquipmentDetail 设备明细信息
     * @return 结果
     */
    public int insertLocEquipmentDetail(LocEquipmentDetail locEquipmentDetail);

    /**
     * 修改设备明细信息
     * 
     * @param locEquipmentDetail 设备明细信息
     * @return 结果
     */
    public int updateLocEquipmentDetail(LocEquipmentDetail locEquipmentDetail);

    /**
     * 删除设备明细信息
     * 
     * @param equipmentDetailId 设备明细信息ID
     * @return 结果
     */
    public int deleteLocEquipmentDetailById(Integer equipmentDetailId);

    /**
     * 批量删除设备明细信息
     * 
     * @param equipmentDetailIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteLocEquipmentDetailByIds(String[] equipmentDetailIds);
}
