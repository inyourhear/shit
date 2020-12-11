package com.ruoyi.locker.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 审批记录对象 loc_approve
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
public class LocApprove extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 审批ID */
    @Excel(name = "审批ID")
    private Integer approveId;

    /** 借用ID */
    @Excel(name = "借用ID")
    private Integer approveBorrowId;

    /** 审批人员ID（管理员ID） */
    @Excel(name = "审批人员ID", readConverterExp = "管=理员ID")
    private Integer approveAdministratorsId;

    /** 审批时间 */
    @Excel(name = "审批时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date approveTime;

    /** 审批结果 */
    @Excel(name = "审批结果")
    private Integer approveResult;

    /** 下个审批者ID，0表示无 */
    @Excel(name = "下个审批者ID，0表示无")
    private Integer approveNext;

    public void setApproveId(Integer approveId) 
    {
        this.approveId = approveId;
    }

    public Integer getApproveId() 
    {
        return approveId;
    }
    public void setApproveBorrowId(Integer approveBorrowId) 
    {
        this.approveBorrowId = approveBorrowId;
    }

    public Integer getApproveBorrowId() 
    {
        return approveBorrowId;
    }
    public void setApproveAdministratorsId(Integer approveAdministratorsId) 
    {
        this.approveAdministratorsId = approveAdministratorsId;
    }

    public Integer getApproveAdministratorsId() 
    {
        return approveAdministratorsId;
    }
    public void setApproveTime(Date approveTime) 
    {
        this.approveTime = approveTime;
    }

    public Date getApproveTime() 
    {
        return approveTime;
    }
    public void setApproveResult(Integer approveResult) 
    {
        this.approveResult = approveResult;
    }

    public Integer getApproveResult() 
    {
        return approveResult;
    }
    public void setApproveNext(Integer approveNext) 
    {
        this.approveNext = approveNext;
    }

    public Integer getApproveNext() 
    {
        return approveNext;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("approveId", getApproveId())
            .append("approveBorrowId", getApproveBorrowId())
            .append("approveAdministratorsId", getApproveAdministratorsId())
            .append("approveTime", getApproveTime())
            .append("approveResult", getApproveResult())
            .append("approveNext", getApproveNext())
            .toString();
    }
}
