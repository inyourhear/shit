package com.ruoyi.locker.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.locker.mapper.LocOpenruleMapper;
import com.ruoyi.locker.domain.LocOpenrule;
import com.ruoyi.locker.service.ILocOpenruleService;
import com.ruoyi.common.core.text.Convert;

/**
 * 货柜开放规则Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
@Service
public class LocOpenruleServiceImpl implements ILocOpenruleService 
{
    @Autowired
    private LocOpenruleMapper locOpenruleMapper;

    /**
     * 查询货柜开放规则
     * 
     * @param openruleId 货柜开放规则ID
     * @return 货柜开放规则
     */
    @Override
    public LocOpenrule selectLocOpenruleById(Integer openruleId)
    {
        return locOpenruleMapper.selectLocOpenruleById(openruleId);
    }

    /**
     * 查询货柜开放规则列表
     * 
     * @param locOpenrule 货柜开放规则
     * @return 货柜开放规则
     */
    @Override
    public List<LocOpenrule> selectLocOpenruleList(LocOpenrule locOpenrule)
    {
        return locOpenruleMapper.selectLocOpenruleList(locOpenrule);
    }

    /**
     * 新增货柜开放规则
     * 
     * @param locOpenrule 货柜开放规则
     * @return 结果
     */
    @Override
    public int insertLocOpenrule(LocOpenrule locOpenrule)
    {
        return locOpenruleMapper.insertLocOpenrule(locOpenrule);
    }

    /**
     * 修改货柜开放规则
     * 
     * @param locOpenrule 货柜开放规则
     * @return 结果
     */
    @Override
    public int updateLocOpenrule(LocOpenrule locOpenrule)
    {
        return locOpenruleMapper.updateLocOpenrule(locOpenrule);
    }

    /**
     * 删除货柜开放规则对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteLocOpenruleByIds(String ids)
    {
        return locOpenruleMapper.deleteLocOpenruleByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除货柜开放规则信息
     * 
     * @param openruleId 货柜开放规则ID
     * @return 结果
     */
    @Override
    public int deleteLocOpenruleById(Integer openruleId)
    {
        return locOpenruleMapper.deleteLocOpenruleById(openruleId);
    }
}
