package com.ruoyi.locker.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.locker.mapper.LocMajorruleMapper;
import com.ruoyi.locker.domain.LocMajorrule;
import com.ruoyi.locker.service.ILocMajorruleService;
import com.ruoyi.common.core.text.Convert;

/**
 * 开放专业Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
@Service
public class LocMajorruleServiceImpl implements ILocMajorruleService 
{
    @Autowired
    private LocMajorruleMapper locMajorruleMapper;

    /**
     * 查询开放专业
     * 
     * @param majorruleId 开放专业ID
     * @return 开放专业
     */
    @Override
    public LocMajorrule selectLocMajorruleById(Long majorruleId)
    {
        return locMajorruleMapper.selectLocMajorruleById(majorruleId);
    }

    /**
     * 查询开放专业列表
     * 
     * @param locMajorrule 开放专业
     * @return 开放专业
     */
    @Override
    public List<LocMajorrule> selectLocMajorruleList(LocMajorrule locMajorrule)
    {
        return locMajorruleMapper.selectLocMajorruleList(locMajorrule);
    }

    /**
     * 新增开放专业
     * 
     * @param locMajorrule 开放专业
     * @return 结果
     */
    @Override
    public int insertLocMajorrule(LocMajorrule locMajorrule)
    {
        return locMajorruleMapper.insertLocMajorrule(locMajorrule);
    }

    /**
     * 修改开放专业
     * 
     * @param locMajorrule 开放专业
     * @return 结果
     */
    @Override
    public int updateLocMajorrule(LocMajorrule locMajorrule)
    {
        return locMajorruleMapper.updateLocMajorrule(locMajorrule);
    }

    /**
     * 删除开放专业对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteLocMajorruleByIds(String ids)
    {
        return locMajorruleMapper.deleteLocMajorruleByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除开放专业信息
     * 
     * @param majorruleId 开放专业ID
     * @return 结果
     */
    @Override
    public int deleteLocMajorruleById(Long majorruleId)
    {
        return locMajorruleMapper.deleteLocMajorruleById(majorruleId);
    }
}
