package com.ruoyi.locker.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.locker.mapper.LocApproveMapper;
import com.ruoyi.locker.domain.LocApprove;
import com.ruoyi.locker.service.ILocApproveService;
import com.ruoyi.common.core.text.Convert;

/**
 * 审批记录Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
@Service
public class LocApproveServiceImpl implements ILocApproveService 
{
    @Autowired
    private LocApproveMapper locApproveMapper;

    /**
     * 查询审批记录
     * 
     * @param approveId 审批记录ID
     * @return 审批记录
     */
    @Override
    public LocApprove selectLocApproveById(Integer approveId)
    {
        return locApproveMapper.selectLocApproveById(approveId);
    }

    /**
     * 查询审批记录列表
     * 
     * @param locApprove 审批记录
     * @return 审批记录
     */
    @Override
    public List<LocApprove> selectLocApproveList(LocApprove locApprove)
    {
        return locApproveMapper.selectLocApproveList(locApprove);
    }

    /**
     * 新增审批记录
     * 
     * @param locApprove 审批记录
     * @return 结果
     */
    @Override
    public int insertLocApprove(LocApprove locApprove)
    {
        return locApproveMapper.insertLocApprove(locApprove);
    }

    /**
     * 修改审批记录
     * 
     * @param locApprove 审批记录
     * @return 结果
     */
    @Override
    public int updateLocApprove(LocApprove locApprove)
    {
        return locApproveMapper.updateLocApprove(locApprove);
    }

    /**
     * 删除审批记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteLocApproveByIds(String ids)
    {
        return locApproveMapper.deleteLocApproveByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除审批记录信息
     * 
     * @param approveId 审批记录ID
     * @return 结果
     */
    @Override
    public int deleteLocApproveById(Integer approveId)
    {
        return locApproveMapper.deleteLocApproveById(approveId);
    }
}
