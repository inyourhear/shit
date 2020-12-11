package com.ruoyi.locker.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.locker.mapper.LocAdministratorsMapper;
import com.ruoyi.locker.domain.LocAdministrators;
import com.ruoyi.locker.service.ILocAdministratorsService;
import com.ruoyi.common.core.text.Convert;

/**
 * 管理员信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
@Service
public class LocAdministratorsServiceImpl implements ILocAdministratorsService 
{
    @Autowired
    private LocAdministratorsMapper locAdministratorsMapper;

    /**
     * 查询管理员信息
     * 
     * @param administratorsId 管理员信息ID
     * @return 管理员信息
     */
    @Override
    public LocAdministrators selectLocAdministratorsById(Integer administratorsId)
    {
        return locAdministratorsMapper.selectLocAdministratorsById(administratorsId);
    }

    /**
     * 查询管理员信息列表
     * 
     * @param locAdministrators 管理员信息
     * @return 管理员信息
     */
    @Override
    public List<LocAdministrators> selectLocAdministratorsList(LocAdministrators locAdministrators)
    {
        return locAdministratorsMapper.selectLocAdministratorsList(locAdministrators);
    }

    /**
     * 新增管理员信息
     * 
     * @param locAdministrators 管理员信息
     * @return 结果
     */
    @Override
    public int insertLocAdministrators(LocAdministrators locAdministrators)
    {
        return locAdministratorsMapper.insertLocAdministrators(locAdministrators);
    }

    /**
     * 修改管理员信息
     * 
     * @param locAdministrators 管理员信息
     * @return 结果
     */
    @Override
    public int updateLocAdministrators(LocAdministrators locAdministrators)
    {
        return locAdministratorsMapper.updateLocAdministrators(locAdministrators);
    }

    /**
     * 删除管理员信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteLocAdministratorsByIds(String ids)
    {
        return locAdministratorsMapper.deleteLocAdministratorsByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除管理员信息信息
     * 
     * @param administratorsId 管理员信息ID
     * @return 结果
     */
    @Override
    public int deleteLocAdministratorsById(Integer administratorsId)
    {
        return locAdministratorsMapper.deleteLocAdministratorsById(administratorsId);
    }
}
