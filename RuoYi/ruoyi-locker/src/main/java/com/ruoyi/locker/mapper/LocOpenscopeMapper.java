package com.ruoyi.locker.mapper;

import java.util.List;
import com.ruoyi.locker.domain.LocOpenscope;

/**
 * 格子开放范围信Mapper接口
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
public interface LocOpenscopeMapper 
{
    /**
     * 查询格子开放范围信
     * 
     * @param openscopeId 格子开放范围信ID
     * @return 格子开放范围信
     */
    public LocOpenscope selectLocOpenscopeById(Long openscopeId);

    /**
     * 查询格子开放范围信列表
     * 
     * @param locOpenscope 格子开放范围信
     * @return 格子开放范围信集合
     */
    public List<LocOpenscope> selectLocOpenscopeList(LocOpenscope locOpenscope);

    /**
     * 新增格子开放范围信
     * 
     * @param locOpenscope 格子开放范围信
     * @return 结果
     */
    public int insertLocOpenscope(LocOpenscope locOpenscope);

    /**
     * 修改格子开放范围信
     * 
     * @param locOpenscope 格子开放范围信
     * @return 结果
     */
    public int updateLocOpenscope(LocOpenscope locOpenscope);

    /**
     * 删除格子开放范围信
     * 
     * @param openscopeId 格子开放范围信ID
     * @return 结果
     */
    public int deleteLocOpenscopeById(Long openscopeId);

    /**
     * 批量删除格子开放范围信
     * 
     * @param openscopeIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteLocOpenscopeByIds(String[] openscopeIds);
}
