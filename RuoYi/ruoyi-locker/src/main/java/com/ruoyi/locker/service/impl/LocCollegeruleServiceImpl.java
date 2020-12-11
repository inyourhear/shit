package com.ruoyi.locker.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.locker.mapper.LocCollegeruleMapper;
import com.ruoyi.locker.domain.LocCollegerule;
import com.ruoyi.locker.service.ILocCollegeruleService;
import com.ruoyi.common.core.text.Convert;

/**
 * 开放学院规则Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
@Service
public class LocCollegeruleServiceImpl implements ILocCollegeruleService 
{
    @Autowired
    private LocCollegeruleMapper locCollegeruleMapper;

    /**
     * 查询开放学院规则
     * 
     * @param collegeruleId 开放学院规则ID
     * @return 开放学院规则
     */
    @Override
    public LocCollegerule selectLocCollegeruleById(Integer collegeruleId)
    {
        return locCollegeruleMapper.selectLocCollegeruleById(collegeruleId);
    }

    /**
     * 查询开放学院规则列表
     * 
     * @param locCollegerule 开放学院规则
     * @return 开放学院规则
     */
    @Override
    public List<LocCollegerule> selectLocCollegeruleList(LocCollegerule locCollegerule)
    {
        return locCollegeruleMapper.selectLocCollegeruleList(locCollegerule);
    }

    /**
     * 新增开放学院规则
     * 
     * @param locCollegerule 开放学院规则
     * @return 结果
     */
    @Override
    public int insertLocCollegerule(LocCollegerule locCollegerule)
    {
        return locCollegeruleMapper.insertLocCollegerule(locCollegerule);
    }

    /**
     * 修改开放学院规则
     * 
     * @param locCollegerule 开放学院规则
     * @return 结果
     */
    @Override
    public int updateLocCollegerule(LocCollegerule locCollegerule)
    {
        return locCollegeruleMapper.updateLocCollegerule(locCollegerule);
    }

    /**
     * 删除开放学院规则对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteLocCollegeruleByIds(String ids)
    {
        return locCollegeruleMapper.deleteLocCollegeruleByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除开放学院规则信息
     * 
     * @param collegeruleId 开放学院规则ID
     * @return 结果
     */
    @Override
    public int deleteLocCollegeruleById(Integer collegeruleId)
    {
        return locCollegeruleMapper.deleteLocCollegeruleById(collegeruleId);
    }
}
