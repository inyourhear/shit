package com.ruoyi.locker.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.locker.mapper.LocStudentMapper;
import com.ruoyi.locker.domain.LocStudent;
import com.ruoyi.locker.service.ILocStudentService;
import com.ruoyi.common.core.text.Convert;

/**
 * 学生信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
@Service
public class LocStudentServiceImpl implements ILocStudentService 
{
    @Autowired
    private LocStudentMapper locStudentMapper;

    /**
     * 查询学生信息
     * 
     * @param id 学生信息ID
     * @return 学生信息
     */
    @Override
    public LocStudent selectLocStudentById(Integer id)
    {
        return locStudentMapper.selectLocStudentById(id);
    }

    /**
     * 查询学生信息列表
     * 
     * @param locStudent 学生信息
     * @return 学生信息
     */
    @Override
    public List<LocStudent> selectLocStudentList(LocStudent locStudent)
    {
        return locStudentMapper.selectLocStudentList(locStudent);
    }

    /**
     * 新增学生信息
     * 
     * @param locStudent 学生信息
     * @return 结果
     */
    @Override
    public int insertLocStudent(LocStudent locStudent)
    {
        return locStudentMapper.insertLocStudent(locStudent);
    }

    /**
     * 修改学生信息
     * 
     * @param locStudent 学生信息
     * @return 结果
     */
    @Override
    public int updateLocStudent(LocStudent locStudent)
    {
        return locStudentMapper.updateLocStudent(locStudent);
    }

    /**
     * 删除学生信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteLocStudentByIds(String ids)
    {
        return locStudentMapper.deleteLocStudentByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除学生信息信息
     * 
     * @param id 学生信息ID
     * @return 结果
     */
    @Override
    public int deleteLocStudentById(Integer id)
    {
        return locStudentMapper.deleteLocStudentById(id);
    }
}
