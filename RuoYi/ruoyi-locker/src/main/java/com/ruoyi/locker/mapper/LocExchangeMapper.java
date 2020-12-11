package com.ruoyi.locker.mapper;

import java.util.List;
import com.ruoyi.locker.domain.LocExchange;

/**
 * 交换Mapper接口
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
public interface LocExchangeMapper 
{
    /**
     * 查询交换
     * 
     * @param exchangeId 交换ID
     * @return 交换
     */
    public LocExchange selectLocExchangeById(Long exchangeId);

    /**
     * 查询交换列表
     * 
     * @param locExchange 交换
     * @return 交换集合
     */
    public List<LocExchange> selectLocExchangeList(LocExchange locExchange);

    /**
     * 新增交换
     * 
     * @param locExchange 交换
     * @return 结果
     */
    public int insertLocExchange(LocExchange locExchange);

    /**
     * 修改交换
     * 
     * @param locExchange 交换
     * @return 结果
     */
    public int updateLocExchange(LocExchange locExchange);

    /**
     * 删除交换
     * 
     * @param exchangeId 交换ID
     * @return 结果
     */
    public int deleteLocExchangeById(Long exchangeId);

    /**
     * 批量删除交换
     * 
     * @param exchangeIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteLocExchangeByIds(String[] exchangeIds);
}
