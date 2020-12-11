package com.ruoyi.locker.mapper;

import java.util.List;
import com.ruoyi.locker.domain.LocRuletable;

/**
 * 规则信息Mapper接口
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
public interface LocRuletableMapper 
{
    /**
     * 查询规则信息
     * 
     * @param ruletableId 规则信息ID
     * @return 规则信息
     */
    public LocRuletable selectLocRuletableById(Integer ruletableId);

    /**
     * 查询规则信息列表
     * 
     * @param locRuletable 规则信息
     * @return 规则信息集合
     */
    public List<LocRuletable> selectLocRuletableList(LocRuletable locRuletable);

    /**
     * 新增规则信息
     * 
     * @param locRuletable 规则信息
     * @return 结果
     */
    public int insertLocRuletable(LocRuletable locRuletable);

    /**
     * 修改规则信息
     * 
     * @param locRuletable 规则信息
     * @return 结果
     */
    public int updateLocRuletable(LocRuletable locRuletable);

    /**
     * 删除规则信息
     * 
     * @param ruletableId 规则信息ID
     * @return 结果
     */
    public int deleteLocRuletableById(Integer ruletableId);

    /**
     * 批量删除规则信息
     * 
     * @param ruletableIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteLocRuletableByIds(String[] ruletableIds);
}
