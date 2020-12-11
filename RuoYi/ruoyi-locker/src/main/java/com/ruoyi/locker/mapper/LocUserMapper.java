package com.ruoyi.locker.mapper;

import java.util.List;
import com.ruoyi.locker.domain.LocUser;

/**
 * 用户Mapper接口
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
public interface LocUserMapper 
{
    /**
     * 查询用户
     * 
     * @param id 用户ID
     * @return 用户
     */
    public LocUser selectLocUserById(Integer id);

    /**
     * 查询用户列表
     * 
     * @param locUser 用户
     * @return 用户集合
     */
    public List<LocUser> selectLocUserList(LocUser locUser);

    /**
     * 新增用户
     * 
     * @param locUser 用户
     * @return 结果
     */
    public int insertLocUser(LocUser locUser);

    /**
     * 修改用户
     * 
     * @param locUser 用户
     * @return 结果
     */
    public int updateLocUser(LocUser locUser);

    /**
     * 删除用户
     * 
     * @param id 用户ID
     * @return 结果
     */
    public int deleteLocUserById(Integer id);

    /**
     * 批量删除用户
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteLocUserByIds(String[] ids);
}
