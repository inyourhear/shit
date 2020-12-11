package com.ruoyi.locker.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.locker.mapper.LocExchangeMapper;
import com.ruoyi.locker.domain.LocExchange;
import com.ruoyi.locker.service.ILocExchangeService;
import com.ruoyi.common.core.text.Convert;

/**
 * 交换Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
@Service
public class LocExchangeServiceImpl implements ILocExchangeService 
{
    @Autowired
    private LocExchangeMapper locExchangeMapper;

    /**
     * 查询交换
     * 
     * @param exchangeId 交换ID
     * @return 交换
     */
    @Override
    public LocExchange selectLocExchangeById(Long exchangeId)
    {
        return locExchangeMapper.selectLocExchangeById(exchangeId);
    }

    /**
     * 查询交换列表
     * 
     * @param locExchange 交换
     * @return 交换
     */
    @Override
    public List<LocExchange> selectLocExchangeList(LocExchange locExchange)
    {
        return locExchangeMapper.selectLocExchangeList(locExchange);
    }

    /**
     * 新增交换
     * 
     * @param locExchange 交换
     * @return 结果
     */
    @Override
    public int insertLocExchange(LocExchange locExchange)
    {
        return locExchangeMapper.insertLocExchange(locExchange);
    }

    /**
     * 修改交换
     * 
     * @param locExchange 交换
     * @return 结果
     */
    @Override
    public int updateLocExchange(LocExchange locExchange)
    {
        return locExchangeMapper.updateLocExchange(locExchange);
    }

    /**
     * 删除交换对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteLocExchangeByIds(String ids)
    {
        return locExchangeMapper.deleteLocExchangeByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除交换信息
     * 
     * @param exchangeId 交换ID
     * @return 结果
     */
    @Override
    public int deleteLocExchangeById(Long exchangeId)
    {
        return locExchangeMapper.deleteLocExchangeById(exchangeId);
    }
}
