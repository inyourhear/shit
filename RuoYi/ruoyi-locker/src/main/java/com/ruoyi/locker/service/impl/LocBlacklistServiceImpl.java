package com.ruoyi.locker.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.locker.mapper.LocBlacklistMapper;
import com.ruoyi.locker.domain.LocBlacklist;
import com.ruoyi.locker.service.ILocBlacklistService;
import com.ruoyi.common.core.text.Convert;

/**
 * 黑名单息Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
@Service
public class LocBlacklistServiceImpl implements ILocBlacklistService 
{
    @Autowired
    private LocBlacklistMapper locBlacklistMapper;

    /**
     * 查询黑名单息
     * 
     * @param id 黑名单息ID
     * @return 黑名单息
     */
    @Override
    public LocBlacklist selectLocBlacklistById(Integer id)
    {
        return locBlacklistMapper.selectLocBlacklistById(id);
    }

    /**
     * 查询黑名单息列表
     * 
     * @param locBlacklist 黑名单息
     * @return 黑名单息
     */
    @Override
    public List<LocBlacklist> selectLocBlacklistList(LocBlacklist locBlacklist)
    {
        return locBlacklistMapper.selectLocBlacklistList(locBlacklist);
    }

    /**
     * 新增黑名单息
     * 
     * @param locBlacklist 黑名单息
     * @return 结果
     */
    @Override
    public int insertLocBlacklist(LocBlacklist locBlacklist)
    {
        return locBlacklistMapper.insertLocBlacklist(locBlacklist);
    }

    /**
     * 修改黑名单息
     * 
     * @param locBlacklist 黑名单息
     * @return 结果
     */
    @Override
    public int updateLocBlacklist(LocBlacklist locBlacklist)
    {
        return locBlacklistMapper.updateLocBlacklist(locBlacklist);
    }

    /**
     * 删除黑名单息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteLocBlacklistByIds(String ids)
    {
        return locBlacklistMapper.deleteLocBlacklistByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除黑名单息信息
     * 
     * @param id 黑名单息ID
     * @return 结果
     */
    @Override
    public int deleteLocBlacklistById(Integer id)
    {
        return locBlacklistMapper.deleteLocBlacklistById(id);
    }
}
