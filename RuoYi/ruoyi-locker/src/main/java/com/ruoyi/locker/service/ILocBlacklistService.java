package com.ruoyi.locker.service;

import java.util.List;
import com.ruoyi.locker.domain.LocBlacklist;

/**
 * 黑名单息Service接口
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
public interface ILocBlacklistService 
{
    /**
     * 查询黑名单息
     * 
     * @param id 黑名单息ID
     * @return 黑名单息
     */
    public LocBlacklist selectLocBlacklistById(Integer id);

    /**
     * 查询黑名单息列表
     * 
     * @param locBlacklist 黑名单息
     * @return 黑名单息集合
     */
    public List<LocBlacklist> selectLocBlacklistList(LocBlacklist locBlacklist);

    /**
     * 新增黑名单息
     * 
     * @param locBlacklist 黑名单息
     * @return 结果
     */
    public int insertLocBlacklist(LocBlacklist locBlacklist);

    /**
     * 修改黑名单息
     * 
     * @param locBlacklist 黑名单息
     * @return 结果
     */
    public int updateLocBlacklist(LocBlacklist locBlacklist);

    /**
     * 批量删除黑名单息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteLocBlacklistByIds(String ids);

    /**
     * 删除黑名单息信息
     * 
     * @param id 黑名单息ID
     * @return 结果
     */
    public int deleteLocBlacklistById(Integer id);
}
