package com.ruoyi.locker.service;

import java.util.List;
import com.ruoyi.locker.domain.LocStudent;

/**
 * 学生信息Service接口
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
public interface ILocStudentService 
{
    /**
     * 查询学生信息
     * 
     * @param id 学生信息ID
     * @return 学生信息
     */
    public LocStudent selectLocStudentById(Integer id);

    /**
     * 查询学生信息列表
     * 
     * @param locStudent 学生信息
     * @return 学生信息集合
     */
    public List<LocStudent> selectLocStudentList(LocStudent locStudent);

    /**
     * 新增学生信息
     * 
     * @param locStudent 学生信息
     * @return 结果
     */
    public int insertLocStudent(LocStudent locStudent);

    /**
     * 修改学生信息
     * 
     * @param locStudent 学生信息
     * @return 结果
     */
    public int updateLocStudent(LocStudent locStudent);

    /**
     * 批量删除学生信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteLocStudentByIds(String ids);

    /**
     * 删除学生信息信息
     * 
     * @param id 学生信息ID
     * @return 结果
     */
    public int deleteLocStudentById(Integer id);
}
