package com.ruoyi.locker.service;

import java.util.List;
import com.ruoyi.locker.domain.LocContainerManager;

/**
 * 货柜管理员Service接口
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
public interface ILocContainerManagerService 
{
    /**
     * 查询货柜管理员
     * 
     * @param id 货柜管理员ID
     * @return 货柜管理员
     */
    public LocContainerManager selectLocContainerManagerById(Integer id);

    /**
     * 查询货柜管理员列表
     * 
     * @param locContainerManager 货柜管理员
     * @return 货柜管理员集合
     */
    public List<LocContainerManager> selectLocContainerManagerList(LocContainerManager locContainerManager);

    /**
     * 新增货柜管理员
     * 
     * @param locContainerManager 货柜管理员
     * @return 结果
     */
    public int insertLocContainerManager(LocContainerManager locContainerManager);

    /**
     * 修改货柜管理员
     * 
     * @param locContainerManager 货柜管理员
     * @return 结果
     */
    public int updateLocContainerManager(LocContainerManager locContainerManager);

    /**
     * 批量删除货柜管理员
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteLocContainerManagerByIds(String ids);

    /**
     * 删除货柜管理员信息
     * 
     * @param id 货柜管理员ID
     * @return 结果
     */
    public int deleteLocContainerManagerById(Integer id);
}
