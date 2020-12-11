package com.ruoyi.locker.service;

import java.util.List;
import com.ruoyi.locker.domain.LocContainer;

/**
 * 货柜信息Service接口
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
public interface ILocContainerService 
{
    /**
     * 查询货柜信息
     * 
     * @param containerId 货柜信息ID
     * @return 货柜信息
     */
    public LocContainer selectLocContainerById(Integer containerId);

    /**
     * 查询货柜信息列表
     * 
     * @param locContainer 货柜信息
     * @return 货柜信息集合
     */
    public List<LocContainer> selectLocContainerList(LocContainer locContainer);

    /**
     * 新增货柜信息
     * 
     * @param locContainer 货柜信息
     * @return 结果
     */
    public int insertLocContainer(LocContainer locContainer);

    /**
     * 修改货柜信息
     * 
     * @param locContainer 货柜信息
     * @return 结果
     */
    public int updateLocContainer(LocContainer locContainer);

    /**
     * 批量删除货柜信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteLocContainerByIds(String ids);

    /**
     * 删除货柜信息信息
     * 
     * @param containerId 货柜信息ID
     * @return 结果
     */
    public int deleteLocContainerById(Integer containerId);
}
