package com.ruoyi.locker.service;

import java.util.List;
import com.ruoyi.locker.domain.LocApprove;

/**
 * 审批记录Service接口
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
public interface ILocApproveService 
{
    /**
     * 查询审批记录
     * 
     * @param approveId 审批记录ID
     * @return 审批记录
     */
    public LocApprove selectLocApproveById(Integer approveId);

    /**
     * 查询审批记录列表
     * 
     * @param locApprove 审批记录
     * @return 审批记录集合
     */
    public List<LocApprove> selectLocApproveList(LocApprove locApprove);

    /**
     * 新增审批记录
     * 
     * @param locApprove 审批记录
     * @return 结果
     */
    public int insertLocApprove(LocApprove locApprove);

    /**
     * 修改审批记录
     * 
     * @param locApprove 审批记录
     * @return 结果
     */
    public int updateLocApprove(LocApprove locApprove);

    /**
     * 批量删除审批记录
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteLocApproveByIds(String ids);

    /**
     * 删除审批记录信息
     * 
     * @param approveId 审批记录ID
     * @return 结果
     */
    public int deleteLocApproveById(Integer approveId);
}
