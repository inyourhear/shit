package com.ruoyi.locker.mapper;

import java.util.List;
import com.ruoyi.locker.domain.LocUserrule;

/**
 * 开放人员规则Mapper接口
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
public interface LocUserruleMapper 
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
     * 删除开放人员规则
     * 
     * @param userruleId 开放人员规则ID
     * @return 结果
     */
    public int deleteLocUserruleById(Integer userruleId);

    /**
     * 批量删除开放人员规则
     * 
     * @param userruleIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteLocUserruleByIds(String[] userruleIds);
}
