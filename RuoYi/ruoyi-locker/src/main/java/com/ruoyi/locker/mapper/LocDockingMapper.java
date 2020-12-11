package com.ruoyi.locker.mapper;

import java.util.List;
import com.ruoyi.locker.domain.LocDocking;

/**
 * 对接Mapper接口
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
public interface LocDockingMapper 
{
    /**
     * 查询对接
     * 
     * @param dockingId 对接ID
     * @return 对接
     */
    public LocDocking selectLocDockingById(Long dockingId);

    /**
     * 查询对接列表
     * 
     * @param locDocking 对接
     * @return 对接集合
     */
    public List<LocDocking> selectLocDockingList(LocDocking locDocking);

    /**
     * 新增对接
     * 
     * @param locDocking 对接
     * @return 结果
     */
    public int insertLocDocking(LocDocking locDocking);

    /**
     * 修改对接
     * 
     * @param locDocking 对接
     * @return 结果
     */
    public int updateLocDocking(LocDocking locDocking);

    /**
     * 删除对接
     * 
     * @param dockingId 对接ID
     * @return 结果
     */
    public int deleteLocDockingById(Long dockingId);

    /**
     * 批量删除对接
     * 
     * @param dockingIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteLocDockingByIds(String[] dockingIds);
}
