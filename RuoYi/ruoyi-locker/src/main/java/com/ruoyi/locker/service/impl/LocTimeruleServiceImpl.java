package com.ruoyi.locker.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.locker.mapper.LocTimeruleMapper;
import com.ruoyi.locker.domain.LocTimerule;
import com.ruoyi.locker.service.ILocTimeruleService;
import com.ruoyi.common.core.text.Convert;

/**
 * 时间规则明细Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
@Service
public class LocTimeruleServiceImpl implements ILocTimeruleService 
{
    @Autowired
    private LocTimeruleMapper locTimeruleMapper;

    /**
     * 查询时间规则明细
     * 
     * @param timeruleId 时间规则明细ID
     * @return 时间规则明细
     */
    @Override
    public LocTimerule selectLocTimeruleById(Integer timeruleId)
    {
        return locTimeruleMapper.selectLocTimeruleById(timeruleId);
    }

    /**
     * 查询时间规则明细列表
     * 
     * @param locTimerule 时间规则明细
     * @return 时间规则明细
     */
    @Override
    public List<LocTimerule> selectLocTimeruleList(LocTimerule locTimerule)
    {
        return locTimeruleMapper.selectLocTimeruleList(locTimerule);
    }

    /**
     * 新增时间规则明细
     * 
     * @param locTimerule 时间规则明细
     * @return 结果
     */
    @Override
    public int insertLocTimerule(LocTimerule locTimerule)
    {
        return locTimeruleMapper.insertLocTimerule(locTimerule);
    }

    /**
     * 修改时间规则明细
     * 
     * @param locTimerule 时间规则明细
     * @return 结果
     */
    @Override
    public int updateLocTimerule(LocTimerule locTimerule)
    {
        return locTimeruleMapper.updateLocTimerule(locTimerule);
    }

    /**
     * 删除时间规则明细对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteLocTimeruleByIds(String ids)
    {
        return locTimeruleMapper.deleteLocTimeruleByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除时间规则明细信息
     * 
     * @param timeruleId 时间规则明细ID
     * @return 结果
     */
    @Override
    public int deleteLocTimeruleById(Integer timeruleId)
    {
        return locTimeruleMapper.deleteLocTimeruleById(timeruleId);
    }
}
