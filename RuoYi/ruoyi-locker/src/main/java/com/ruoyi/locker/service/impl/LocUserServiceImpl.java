package com.ruoyi.locker.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.locker.mapper.LocUserMapper;
import com.ruoyi.locker.domain.LocUser;
import com.ruoyi.locker.service.ILocUserService;
import com.ruoyi.common.core.text.Convert;

/**
 * 用户Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
@Service
public class LocUserServiceImpl implements ILocUserService 
{
    @Autowired
    private LocUserMapper locUserMapper;

    /**
     * 查询用户
     * 
     * @param id 用户ID
     * @return 用户
     */
    @Override
    public LocUser selectLocUserById(Integer id)
    {
        return locUserMapper.selectLocUserById(id);
    }

    /**
     * 查询用户列表
     * 
     * @param locUser 用户
     * @return 用户
     */
    @Override
    public List<LocUser> selectLocUserList(LocUser locUser)
    {
        return locUserMapper.selectLocUserList(locUser);
    }

    /**
     * 新增用户
     * 
     * @param locUser 用户
     * @return 结果
     */
    @Override
    public int insertLocUser(LocUser locUser)
    {
        return locUserMapper.insertLocUser(locUser);
    }

    /**
     * 修改用户
     * 
     * @param locUser 用户
     * @return 结果
     */
    @Override
    public int updateLocUser(LocUser locUser)
    {
        return locUserMapper.updateLocUser(locUser);
    }

    /**
     * 删除用户对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteLocUserByIds(String ids)
    {
        return locUserMapper.deleteLocUserByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除用户信息
     * 
     * @param id 用户ID
     * @return 结果
     */
    @Override
    public int deleteLocUserById(Integer id)
    {
        return locUserMapper.deleteLocUserById(id);
    }
}
