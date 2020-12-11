package com.ruoyi.locker.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.locker.mapper.LocTeacherMapper;
import com.ruoyi.locker.domain.LocTeacher;
import com.ruoyi.locker.service.ILocTeacherService;
import com.ruoyi.common.core.text.Convert;

/**
 * 教职工Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
@Service
public class LocTeacherServiceImpl implements ILocTeacherService 
{
    @Autowired
    private LocTeacherMapper locTeacherMapper;

    /**
     * 查询教职工
     * 
     * @param id 教职工ID
     * @return 教职工
     */
    @Override
    public LocTeacher selectLocTeacherById(Long id)
    {
        return locTeacherMapper.selectLocTeacherById(id);
    }

    /**
     * 查询教职工列表
     * 
     * @param locTeacher 教职工
     * @return 教职工
     */
    @Override
    public List<LocTeacher> selectLocTeacherList(LocTeacher locTeacher)
    {
        return locTeacherMapper.selectLocTeacherList(locTeacher);
    }

    /**
     * 新增教职工
     * 
     * @param locTeacher 教职工
     * @return 结果
     */
    @Override
    public int insertLocTeacher(LocTeacher locTeacher)
    {
        return locTeacherMapper.insertLocTeacher(locTeacher);
    }

    /**
     * 修改教职工
     * 
     * @param locTeacher 教职工
     * @return 结果
     */
    @Override
    public int updateLocTeacher(LocTeacher locTeacher)
    {
        return locTeacherMapper.updateLocTeacher(locTeacher);
    }

    /**
     * 删除教职工对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteLocTeacherByIds(String ids)
    {
        return locTeacherMapper.deleteLocTeacherByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除教职工信息
     * 
     * @param id 教职工ID
     * @return 结果
     */
    @Override
    public int deleteLocTeacherById(Long id)
    {
        return locTeacherMapper.deleteLocTeacherById(id);
    }
}
