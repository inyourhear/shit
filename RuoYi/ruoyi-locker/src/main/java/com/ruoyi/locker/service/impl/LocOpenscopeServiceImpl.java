package com.ruoyi.locker.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.locker.mapper.LocOpenscopeMapper;
import com.ruoyi.locker.domain.LocOpenscope;
import com.ruoyi.locker.service.ILocOpenscopeService;
import com.ruoyi.common.core.text.Convert;

/**
 * 格子开放范围信Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
@Service
public class LocOpenscopeServiceImpl implements ILocOpenscopeService 
{
    @Autowired
    private LocOpenscopeMapper locOpenscopeMapper;

    /**
     * 查询格子开放范围信
     * 
     * @param openscopeId 格子开放范围信ID
     * @return 格子开放范围信
     */
    @Override
    public LocOpenscope selectLocOpenscopeById(Long openscopeId)
    {
        return locOpenscopeMapper.selectLocOpenscopeById(openscopeId);
    }

    /**
     * 查询格子开放范围信列表
     * 
     * @param locOpenscope 格子开放范围信
     * @return 格子开放范围信
     */
    @Override
    public List<LocOpenscope> selectLocOpenscopeList(LocOpenscope locOpenscope)
    {
        return locOpenscopeMapper.selectLocOpenscopeList(locOpenscope);
    }

    /**
     * 新增格子开放范围信
     * 
     * @param locOpenscope 格子开放范围信
     * @return 结果
     */
    @Override
    public int insertLocOpenscope(LocOpenscope locOpenscope)
    {
        return locOpenscopeMapper.insertLocOpenscope(locOpenscope);
    }

    /**
     * 修改格子开放范围信
     * 
     * @param locOpenscope 格子开放范围信
     * @return 结果
     */
    @Override
    public int updateLocOpenscope(LocOpenscope locOpenscope)
    {
        return locOpenscopeMapper.updateLocOpenscope(locOpenscope);
    }

    /**
     * 删除格子开放范围信对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteLocOpenscopeByIds(String ids)
    {
        return locOpenscopeMapper.deleteLocOpenscopeByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除格子开放范围信信息
     * 
     * @param openscopeId 格子开放范围信ID
     * @return 结果
     */
    @Override
    public int deleteLocOpenscopeById(Long openscopeId)
    {
        return locOpenscopeMapper.deleteLocOpenscopeById(openscopeId);
    }
}
