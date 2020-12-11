package com.ruoyi.locker.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.locker.mapper.LocFixMapper;
import com.ruoyi.locker.domain.LocFix;
import com.ruoyi.locker.service.ILocFixService;
import com.ruoyi.common.core.text.Convert;

/**
 * 维修信息单Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
@Service
public class LocFixServiceImpl implements ILocFixService 
{
    @Autowired
    private LocFixMapper locFixMapper;

    /**
     * 查询维修信息单
     * 
     * @param fixId 维修信息单ID
     * @return 维修信息单
     */
    @Override
    public LocFix selectLocFixById(Integer fixId)
    {
        return locFixMapper.selectLocFixById(fixId);
    }

    /**
     * 查询维修信息单列表
     * 
     * @param locFix 维修信息单
     * @return 维修信息单
     */
    @Override
    public List<LocFix> selectLocFixList(LocFix locFix)
    {
        return locFixMapper.selectLocFixList(locFix);
    }

    /**
     * 新增维修信息单
     * 
     * @param locFix 维修信息单
     * @return 结果
     */
    @Override
    public int insertLocFix(LocFix locFix)
    {
        return locFixMapper.insertLocFix(locFix);
    }

    /**
     * 修改维修信息单
     * 
     * @param locFix 维修信息单
     * @return 结果
     */
    @Override
    public int updateLocFix(LocFix locFix)
    {
        return locFixMapper.updateLocFix(locFix);
    }

    /**
     * 删除维修信息单对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteLocFixByIds(String ids)
    {
        return locFixMapper.deleteLocFixByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除维修信息单信息
     * 
     * @param fixId 维修信息单ID
     * @return 结果
     */
    @Override
    public int deleteLocFixById(Integer fixId)
    {
        return locFixMapper.deleteLocFixById(fixId);
    }
}
