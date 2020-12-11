package com.ruoyi.locker.service;

import java.util.List;
import com.ruoyi.locker.domain.LocAdministrators;

/**
 * 管理员信息Service接口
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
public interface ILocAdministratorsService 
{
    /**
     * 查询管理员信息
     * 
     * @param administratorsId 管理员信息ID
     * @return 管理员信息
     */
    public LocAdministrators selectLocAdministratorsById(Integer administratorsId);

    /**
     * 查询管理员信息列表
     * 
     * @param locAdministrators 管理员信息
     * @return 管理员信息集合
     */
    public List<LocAdministrators> selectLocAdministratorsList(LocAdministrators locAdministrators);

    /**
     * 新增管理员信息
     * 
     * @param locAdministrators 管理员信息
     * @return 结果
     */
    public int insertLocAdministrators(LocAdministrators locAdministrators);

    /**
     * 修改管理员信息
     * 
     * @param locAdministrators 管理员信息
     * @return 结果
     */
    public int updateLocAdministrators(LocAdministrators locAdministrators);

    /**
     * 批量删除管理员信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteLocAdministratorsByIds(String ids);

    /**
     * 删除管理员信息信息
     * 
     * @param administratorsId 管理员信息ID
     * @return 结果
     */
    public int deleteLocAdministratorsById(Integer administratorsId);
}
