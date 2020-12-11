package com.ruoyi.locker.mapper;

import java.util.List;
import com.ruoyi.locker.domain.LocClassrule;

/**
 * 指定班级Mapper接口
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
public interface LocClassruleMapper 
{
    /**
     * 查询指定班级
     * 
     * @param classruleId 指定班级ID
     * @return 指定班级
     */
    public LocClassrule selectLocClassruleById(Integer classruleId);

    /**
     * 查询指定班级列表
     * 
     * @param locClassrule 指定班级
     * @return 指定班级集合
     */
    public List<LocClassrule> selectLocClassruleList(LocClassrule locClassrule);

    /**
     * 新增指定班级
     * 
     * @param locClassrule 指定班级
     * @return 结果
     */
    public int insertLocClassrule(LocClassrule locClassrule);

    /**
     * 修改指定班级
     * 
     * @param locClassrule 指定班级
     * @return 结果
     */
    public int updateLocClassrule(LocClassrule locClassrule);

    /**
     * 删除指定班级
     * 
     * @param classruleId 指定班级ID
     * @return 结果
     */
    public int deleteLocClassruleById(Integer classruleId);

    /**
     * 批量删除指定班级
     * 
     * @param classruleIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteLocClassruleByIds(String[] classruleIds);
}
