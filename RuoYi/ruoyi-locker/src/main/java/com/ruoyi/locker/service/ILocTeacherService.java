package com.ruoyi.locker.service;

import java.util.List;
import com.ruoyi.locker.domain.LocTeacher;

/**
 * 教职工Service接口
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
public interface ILocTeacherService 
{
    /**
     * 查询教职工
     * 
     * @param id 教职工ID
     * @return 教职工
     */
    public LocTeacher selectLocTeacherById(Long id);

    /**
     * 查询教职工列表
     * 
     * @param locTeacher 教职工
     * @return 教职工集合
     */
    public List<LocTeacher> selectLocTeacherList(LocTeacher locTeacher);

    /**
     * 新增教职工
     * 
     * @param locTeacher 教职工
     * @return 结果
     */
    public int insertLocTeacher(LocTeacher locTeacher);

    /**
     * 修改教职工
     * 
     * @param locTeacher 教职工
     * @return 结果
     */
    public int updateLocTeacher(LocTeacher locTeacher);

    /**
     * 批量删除教职工
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteLocTeacherByIds(String ids);

    /**
     * 删除教职工信息
     * 
     * @param id 教职工ID
     * @return 结果
     */
    public int deleteLocTeacherById(Long id);
}
