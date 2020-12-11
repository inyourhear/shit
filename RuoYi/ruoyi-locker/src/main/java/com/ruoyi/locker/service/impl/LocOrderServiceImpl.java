package com.ruoyi.locker.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.locker.mapper.LocOrderMapper;
import com.ruoyi.locker.domain.LocOrder;
import com.ruoyi.locker.service.ILocOrderService;
import com.ruoyi.common.core.text.Convert;

/**
 * 开门指令Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
@Service
public class LocOrderServiceImpl implements ILocOrderService 
{
    @Autowired
    private LocOrderMapper locOrderMapper;

    /**
     * 查询开门指令
     * 
     * @param orderId 开门指令ID
     * @return 开门指令
     */
    @Override
    public LocOrder selectLocOrderById(Integer orderId)
    {
        return locOrderMapper.selectLocOrderById(orderId);
    }

    /**
     * 查询开门指令列表
     * 
     * @param locOrder 开门指令
     * @return 开门指令
     */
    @Override
    public List<LocOrder> selectLocOrderList(LocOrder locOrder)
    {
        return locOrderMapper.selectLocOrderList(locOrder);
    }

    /**
     * 新增开门指令
     * 
     * @param locOrder 开门指令
     * @return 结果
     */
    @Override
    public int insertLocOrder(LocOrder locOrder)
    {
        return locOrderMapper.insertLocOrder(locOrder);
    }

    /**
     * 修改开门指令
     * 
     * @param locOrder 开门指令
     * @return 结果
     */
    @Override
    public int updateLocOrder(LocOrder locOrder)
    {
        return locOrderMapper.updateLocOrder(locOrder);
    }

    /**
     * 删除开门指令对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteLocOrderByIds(String ids)
    {
        return locOrderMapper.deleteLocOrderByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除开门指令信息
     * 
     * @param orderId 开门指令ID
     * @return 结果
     */
    @Override
    public int deleteLocOrderById(Integer orderId)
    {
        return locOrderMapper.deleteLocOrderById(orderId);
    }
}
