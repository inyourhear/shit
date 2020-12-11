package com.ruoyi.locker.service;

import java.util.List;
import com.ruoyi.locker.domain.LocTimerule;

/**
 * 时间规则明细Service接口
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
public interface ILocTimeruleService 
{
    /**
     * 查询时间规则明细
     * 
     * @param timeruleId 时间规则明细ID
     * @return 时间规则明细
     */
    public LocTimerule selectLocTimeruleById(Integer timeruleId);

    /**
     * 查询时间规则明细列表
     * 
     * @param locTimerule 时间规则明细
     * @return 时间规则明细集合
     */
    public List<LocTimerule> selectLocTimeruleList(LocTimerule locTimerule);

    /**
     * 新增时间规则明细
     * 
     * @param locTimerule 时间规则明细
     * @return 结果
     */
    public int insertLocTimerule(LocTimerule locTimerule);

    /**
     * 修改时间规则明细
     * 
     * @param locTimerule 时间规则明细
     * @return 结果
     */
    public int updateLocTimerule(LocTimerule locTimerule);

    /**
     * 批量删除时间规则明细
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteLocTimeruleByIds(String ids);

    /**
     * 删除时间规则明细信息
     * 
     * @param timeruleId 时间规则明细ID
     * @return 结果
     */
    public int deleteLocTimeruleById(Integer timeruleId);
}
