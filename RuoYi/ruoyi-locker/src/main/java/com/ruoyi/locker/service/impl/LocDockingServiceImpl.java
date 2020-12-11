package com.ruoyi.locker.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.locker.mapper.LocDockingMapper;
import com.ruoyi.locker.domain.LocDocking;
import com.ruoyi.locker.service.ILocDockingService;
import com.ruoyi.common.core.text.Convert;

/**
 * 对接Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
@Service
public class LocDockingServiceImpl implements ILocDockingService 
{
    @Autowired
    private LocDockingMapper locDockingMapper;

    /**
     * 查询对接
     * 
     * @param dockingId 对接ID
     * @return 对接
     */
    @Override
    public LocDocking selectLocDockingById(Long dockingId)
    {
        return locDockingMapper.selectLocDockingById(dockingId);
    }

    /**
     * 查询对接列表
     * 
     * @param locDocking 对接
     * @return 对接
     */
    @Override
    public List<LocDocking> selectLocDockingList(LocDocking locDocking)
    {
        return locDockingMapper.selectLocDockingList(locDocking);
    }

    /**
     * 新增对接
     * 
     * @param locDocking 对接
     * @return 结果
     */
    @Override
    public int insertLocDocking(LocDocking locDocking)
    {
        return locDockingMapper.insertLocDocking(locDocking);
    }

    /**
     * 修改对接
     * 
     * @param locDocking 对接
     * @return 结果
     */
    @Override
    public int updateLocDocking(LocDocking locDocking)
    {
        return locDockingMapper.updateLocDocking(locDocking);
    }

    /**
     * 删除对接对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteLocDockingByIds(String ids)
    {
        return locDockingMapper.deleteLocDockingByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除对接信息
     * 
     * @param dockingId 对接ID
     * @return 结果
     */
    @Override
    public int deleteLocDockingById(Long dockingId)
    {
        return locDockingMapper.deleteLocDockingById(dockingId);
    }
}
