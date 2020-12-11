package com.ruoyi.locker.service;

import java.util.List;
import com.ruoyi.locker.domain.LocUserrule;

/**
 * 开放人员规则Service接口
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
public interface ILocUserruleService 
{
    /**
     * 查询开放人员规则
     * 
     * @param userruleId 开放人员规则ID
     * @return 开放人员规则
     */
    public LocUserrule selectLocUserruleById(Integer userruleId);

    /**
     * 查询开放人员规则列表
     * 
     * @param locUserrule 开放人员规则
     * @return 开放人员规则集合
     */
    public List<LocUserrule> selectLocUserruleList(LocUserrule locUserrule);

    /**
     * 新增开放人员规则
     * 
     * @param locUserrule 开放人员规则
     * @return 结果
     */
    public int insertLocUserrule(LocUserrule locUserrule);

    /**
     * 修改开放人员规则
     * 
     * @param locUserrule 开放人员规则
     * @return 结果
     */
    public int updateLocUserrule(LocUserrule locUserrule);

    /**
     * 批量删除开放人员规则
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteLocUserruleByIds(String ids);

    /**
     * 删除开放人员规则信息
     * 
     * @param userruleId 开放人员规则ID
     * @return 结果
     */
    public int deleteLocUserruleById(Integer userruleId);
}
