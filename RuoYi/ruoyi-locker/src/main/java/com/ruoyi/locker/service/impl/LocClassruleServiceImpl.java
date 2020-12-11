package com.ruoyi.locker.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.locker.mapper.LocClassruleMapper;
import com.ruoyi.locker.domain.LocClassrule;
import com.ruoyi.locker.service.ILocClassruleService;
import com.ruoyi.common.core.text.Convert;

/**
 * 指定班级Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
@Service
public class LocClassruleServiceImpl implements ILocClassruleService 
{
    @Autowired
    private LocClassruleMapper locClassruleMapper;

    /**
     * 查询指定班级
     * 
     * @param classruleId 指定班级ID
     * @return 指定班级
     */
    @Override
    public LocClassrule selectLocClassruleById(Integer classruleId)
    {
        return locClassruleMapper.selectLocClassruleById(classruleId);
    }

    /**
     * 查询指定班级列表
     * 
     * @param locClassrule 指定班级
     * @return 指定班级
     */
    @Override
    public List<LocClassrule> selectLocClassruleList(LocClassrule locClassrule)
    {
        return locClassruleMapper.selectLocClassruleList(locClassrule);
    }

    /**
     * 新增指定班级
     * 
     * @param locClassrule 指定班级
     * @return 结果
     */
    @Override
    public int insertLocClassrule(LocClassrule locClassrule)
    {
        return locClassruleMapper.insertLocClassrule(locClassrule);
    }

    /**
     * 修改指定班级
     * 
     * @param locClassrule 指定班级
     * @return 结果
     */
    @Override
    public int updateLocClassrule(LocClassrule locClassrule)
    {
        return locClassruleMapper.updateLocClassrule(locClassrule);
    }

    /**
     * 删除指定班级对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteLocClassruleByIds(String ids)
    {
        return locClassruleMapper.deleteLocClassruleByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除指定班级信息
     * 
     * @param classruleId 指定班级ID
     * @return 结果
     */
    @Override
    public int deleteLocClassruleById(Integer classruleId)
    {
        return locClassruleMapper.deleteLocClassruleById(classruleId);
    }
}
