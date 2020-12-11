package com.ruoyi.locker.service;

import java.util.List;
import com.ruoyi.locker.domain.LocCollegerule;

/**
 * 开放学院规则Service接口
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
public interface ILocCollegeruleService 
{
    /**
     * 查询开放学院规则
     * 
     * @param collegeruleId 开放学院规则ID
     * @return 开放学院规则
     */
    public LocCollegerule selectLocCollegeruleById(Integer collegeruleId);

    /**
     * 查询开放学院规则列表
     * 
     * @param locCollegerule 开放学院规则
     * @return 开放学院规则集合
     */
    public List<LocCollegerule> selectLocCollegeruleList(LocCollegerule locCollegerule);

    /**
     * 新增开放学院规则
     * 
     * @param locCollegerule 开放学院规则
     * @return 结果
     */
    public int insertLocCollegerule(LocCollegerule locCollegerule);

    /**
     * 修改开放学院规则
     * 
     * @param locCollegerule 开放学院规则
     * @return 结果
     */
    public int updateLocCollegerule(LocCollegerule locCollegerule);

    /**
     * 批量删除开放学院规则
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteLocCollegeruleByIds(String ids);

    /**
     * 删除开放学院规则信息
     * 
     * @param collegeruleId 开放学院规则ID
     * @return 结果
     */
    public int deleteLocCollegeruleById(Integer collegeruleId);
}
