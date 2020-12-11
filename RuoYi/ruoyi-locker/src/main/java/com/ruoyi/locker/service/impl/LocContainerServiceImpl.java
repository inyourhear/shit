package com.ruoyi.locker.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.locker.mapper.LocContainerMapper;
import com.ruoyi.locker.domain.LocContainer;
import com.ruoyi.locker.service.ILocContainerService;
import com.ruoyi.common.core.text.Convert;

/**
 * 货柜信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
@Service
public class LocContainerServiceImpl implements ILocContainerService 
{
    @Autowired
    private LocContainerMapper locContainerMapper;

    /**
     * 查询货柜信息
     * 
     * @param containerId 货柜信息ID
     * @return 货柜信息
     */
    @Override
    public LocContainer selectLocContainerById(Integer containerId)
    {
        return locContainerMapper.selectLocContainerById(containerId);
    }

    /**
     * 查询货柜信息列表
     * 
     * @param locContainer 货柜信息
     * @return 货柜信息
     */
    @Override
    public List<LocContainer> selectLocContainerList(LocContainer locContainer)
    {
        return locContainerMapper.selectLocContainerList(locContainer);
    }

    /**
     * 新增货柜信息
     * 
     * @param locContainer 货柜信息
     * @return 结果
     */
    @Override
    public int insertLocContainer(LocContainer locContainer)
    {
        return locContainerMapper.insertLocContainer(locContainer);
    }

    /**
     * 修改货柜信息
     * 
     * @param locContainer 货柜信息
     * @return 结果
     */
    @Override
    public int updateLocContainer(LocContainer locContainer)
    {
        return locContainerMapper.updateLocContainer(locContainer);
    }

    /**
     * 删除货柜信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteLocContainerByIds(String ids)
    {
        return locContainerMapper.deleteLocContainerByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除货柜信息信息
     * 
     * @param containerId 货柜信息ID
     * @return 结果
     */
    @Override
    public int deleteLocContainerById(Integer containerId)
    {
        return locContainerMapper.deleteLocContainerById(containerId);
    }
}
