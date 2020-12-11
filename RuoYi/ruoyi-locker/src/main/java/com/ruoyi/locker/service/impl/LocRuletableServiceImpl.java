package com.ruoyi.locker.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.locker.mapper.LocRuletableMapper;
import com.ruoyi.locker.domain.LocRuletable;
import com.ruoyi.locker.service.ILocRuletableService;
import com.ruoyi.common.core.text.Convert;

/**
 * 规则信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
@Service
public class LocRuletableServiceImpl implements ILocRuletableService 
{
    @Autowired
    private LocRuletableMapper locRuletableMapper;

    /**
     * 查询规则信息
     * 
     * @param ruletableId 规则信息ID
     * @return 规则信息
     */
    @Override
    public LocRuletable selectLocRuletableById(Integer ruletableId)
    {
        return locRuletableMapper.selectLocRuletableById(ruletableId);
    }

    /**
     * 查询规则信息列表
     * 
     * @param locRuletable 规则信息
     * @return 规则信息
     */
    @Override
    public List<LocRuletable> selectLocRuletableList(LocRuletable locRuletable)
    {
        return locRuletableMapper.selectLocRuletableList(locRuletable);
    }

    /**
     * 新增规则信息
     * 
     * @param locRuletable 规则信息
     * @return 结果
     */
    @Override
    public int insertLocRuletable(LocRuletable locRuletable)
    {
        return locRuletableMapper.insertLocRuletable(locRuletable);
    }

    /**
     * 修改规则信息
     * 
     * @param locRuletable 规则信息
     * @return 结果
     */
    @Override
    public int updateLocRuletable(LocRuletable locRuletable)
    {
        return locRuletableMapper.updateLocRuletable(locRuletable);
    }

    /**
     * 删除规则信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteLocRuletableByIds(String ids)
    {
        return locRuletableMapper.deleteLocRuletableByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除规则信息信息
     * 
     * @param ruletableId 规则信息ID
     * @return 结果
     */
    @Override
    public int deleteLocRuletableById(Integer ruletableId)
    {
        return locRuletableMapper.deleteLocRuletableById(ruletableId);
    }
}
