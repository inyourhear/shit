package com.ruoyi.locker.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.locker.mapper.LocUserruleMapper;
import com.ruoyi.locker.domain.LocUserrule;
import com.ruoyi.locker.service.ILocUserruleService;
import com.ruoyi.common.core.text.Convert;

/**
 * 开放人员规则Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
@Service
public class LocUserruleServiceImpl implements ILocUserruleService 
{
    @Autowired
    private LocUserruleMapper locUserruleMapper;

    /**
     * 查询开放人员规则
     * 
     * @param userruleId 开放人员规则ID
     * @return 开放人员规则
     */
    @Override
    public LocUserrule selectLocUserruleById(Integer userruleId)
    {
        return locUserruleMapper.selectLocUserruleById(userruleId);
    }

    /**
     * 查询开放人员规则列表
     * 
     * @param locUserrule 开放人员规则
     * @return 开放人员规则
     */
    @Override
    public List<LocUserrule> selectLocUserruleList(LocUserrule locUserrule)
    {
        return locUserruleMapper.selectLocUserruleList(locUserrule);
    }

    /**
     * 新增开放人员规则
     * 
     * @param locUserrule 开放人员规则
     * @return 结果
     */
    @Override
    public int insertLocUserrule(LocUserrule locUserrule)
    {
        return locUserruleMapper.insertLocUserrule(locUserrule);
    }

    /**
     * 修改开放人员规则
     * 
     * @param locUserrule 开放人员规则
     * @return 结果
     */
    @Override
    public int updateLocUserrule(LocUserrule locUserrule)
    {
        return locUserruleMapper.updateLocUserrule(locUserrule);
    }

    /**
     * 删除开放人员规则对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteLocUserruleByIds(String ids)
    {
        return locUserruleMapper.deleteLocUserruleByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除开放人员规则信息
     * 
     * @param userruleId 开放人员规则ID
     * @return 结果
     */
    @Override
    public int deleteLocUserruleById(Integer userruleId)
    {
        return locUserruleMapper.deleteLocUserruleById(userruleId);
    }
}
