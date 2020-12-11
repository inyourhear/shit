package com.ruoyi.locker.mapper;

import java.util.List;
import com.ruoyi.locker.domain.LocOpenrule;

/**
 * 货柜开放规则Mapper接口
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
public interface LocOpenruleMapper 
{
    /**
     * 查询货柜开放规则
     * 
     * @param openruleId 货柜开放规则ID
     * @return 货柜开放规则
     */
    public LocOpenrule selectLocOpenruleById(Integer openruleId);

    /**
     * 查询货柜开放规则列表
     * 
     * @param locOpenrule 货柜开放规则
     * @return 货柜开放规则集合
     */
    public List<LocOpenrule> selectLocOpenruleList(LocOpenrule locOpenrule);

    /**
     * 新增货柜开放规则
     * 
     * @param locOpenrule 货柜开放规则
     * @return 结果
     */
    public int insertLocOpenrule(LocOpenrule locOpenrule);

    /**
     * 修改货柜开放规则
     * 
     * @param locOpenrule 货柜开放规则
     * @return 结果
     */
    public int updateLocOpenrule(LocOpenrule locOpenrule);

    /**
     * 删除货柜开放规则
     * 
     * @param openruleId 货柜开放规则ID
     * @return 结果
     */
    public int deleteLocOpenruleById(Integer openruleId);

    /**
     * 批量删除货柜开放规则
     * 
     * @param openruleIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteLocOpenruleByIds(String[] openruleIds);
}
