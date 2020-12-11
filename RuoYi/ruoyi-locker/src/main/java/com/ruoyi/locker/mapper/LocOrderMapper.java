package com.ruoyi.locker.mapper;

import java.util.List;
import com.ruoyi.locker.domain.LocOrder;

/**
 * 开门指令Mapper接口
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
public interface LocOrderMapper 
{
    /**
     * 查询开门指令
     * 
     * @param orderId 开门指令ID
     * @return 开门指令
     */
    public LocOrder selectLocOrderById(Integer orderId);

    /**
     * 查询开门指令列表
     * 
     * @param locOrder 开门指令
     * @return 开门指令集合
     */
    public List<LocOrder> selectLocOrderList(LocOrder locOrder);

    /**
     * 新增开门指令
     * 
     * @param locOrder 开门指令
     * @return 结果
     */
    public int insertLocOrder(LocOrder locOrder);

    /**
     * 修改开门指令
     * 
     * @param locOrder 开门指令
     * @return 结果
     */
    public int updateLocOrder(LocOrder locOrder);

    /**
     * 删除开门指令
     * 
     * @param orderId 开门指令ID
     * @return 结果
     */
    public int deleteLocOrderById(Integer orderId);

    /**
     * 批量删除开门指令
     * 
     * @param orderIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteLocOrderByIds(String[] orderIds);
}
