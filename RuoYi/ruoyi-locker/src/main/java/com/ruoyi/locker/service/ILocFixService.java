package com.ruoyi.locker.service;

import java.util.List;
import com.ruoyi.locker.domain.LocFix;

/**
 * 维修信息单Service接口
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
public interface ILocFixService 
{
    /**
     * 查询维修信息单
     * 
     * @param fixId 维修信息单ID
     * @return 维修信息单
     */
    public LocFix selectLocFixById(Integer fixId);

    /**
     * 查询维修信息单列表
     * 
     * @param locFix 维修信息单
     * @return 维修信息单集合
     */
    public List<LocFix> selectLocFixList(LocFix locFix);

    /**
     * 新增维修信息单
     * 
     * @param locFix 维修信息单
     * @return 结果
     */
    public int insertLocFix(LocFix locFix);

    /**
     * 修改维修信息单
     * 
     * @param locFix 维修信息单
     * @return 结果
     */
    public int updateLocFix(LocFix locFix);

    /**
     * 批量删除维修信息单
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteLocFixByIds(String ids);

    /**
     * 删除维修信息单信息
     * 
     * @param fixId 维修信息单ID
     * @return 结果
     */
    public int deleteLocFixById(Integer fixId);
}
