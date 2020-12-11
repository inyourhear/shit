package com.ruoyi.locker.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.locker.mapper.LocContainerManagerMapper;
import com.ruoyi.locker.domain.LocContainerManager;
import com.ruoyi.locker.service.ILocContainerManagerService;
import com.ruoyi.common.core.text.Convert;

/**
 * 货柜管理员Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
@Service
public class LocContainerManagerServiceImpl implements ILocContainerManagerService 
{
    @Autowired
    private LocContainerManagerMapper locContainerManagerMapper;

    /**
     * 查询货柜管理员
     * 
     * @param id 货柜管理员ID
     * @return 货柜管理员
     */
    @Override
    public LocContainerManager selectLocContainerManagerById(Integer id)
    {
        return locContainerManagerMapper.selectLocContainerManagerById(id);
    }

    /**
     * 查询货柜管理员列表
     * 
     * @param locContainerManager 货柜管理员
     * @return 货柜管理员
     */
    @Override
    public List<LocContainerManager> selectLocContainerManagerList(LocContainerManager locContainerManager)
    {
        return locContainerManagerMapper.selectLocContainerManagerList(locContainerManager);
    }

    /**
     * 新增货柜管理员
     * 
     * @param locContainerManager 货柜管理员
     * @return 结果
     */
    @Override
    public int insertLocContainerManager(LocContainerManager locContainerManager)
    {
        return locContainerManagerMapper.insertLocContainerManager(locContainerManager);
    }

    /**
     * 修改货柜管理员
     * 
     * @param locContainerManager 货柜管理员
     * @return 结果
     */
    @Override
    public int updateLocContainerManager(LocContainerManager locContainerManager)
    {
        return locContainerManagerMapper.updateLocContainerManager(locContainerManager);
    }

    /**
     * 删除货柜管理员对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteLocContainerManagerByIds(String ids)
    {
        return locContainerManagerMapper.deleteLocContainerManagerByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除货柜管理员信息
     * 
     * @param id 货柜管理员ID
     * @return 结果
     */
    @Override
    public int deleteLocContainerManagerById(Integer id)
    {
        return locContainerManagerMapper.deleteLocContainerManagerById(id);
    }
}
