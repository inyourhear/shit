package com.ruoyi.locker.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 借用信息对象 loc_borrow
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
public class LocBorrow extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 借用ID */
    @Excel(name = "借用ID")
    private Integer borrowId;

    /** 用户ID */
    @Excel(name = "用户ID")
    private Integer borrowUserId;

    /** 设备ID */
    @Excel(name = "设备ID")
    private Integer borrowEquipmentId;

    /** 设备名 */
    @Excel(name = "设备名")
    private String borrowEquipmentName;

    /** 设备类型ID */
    @Excel(name = "设备类型ID")
    private Integer borrowEquipmentTypeId;

    /** 格子编码 */
    @Excel(name = "格子编码")
    private String borrowBoxCode;

    /** 借用时间 */
    @Excel(name = "借用时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date borrowTime;

    /** 预计归还时间 */
    @Excel(name = "预计归还时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date borrowExpectTime;

    /** 实际归还时间 */
    @Excel(name = "实际归还时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date borrowRealTime;

    /** 状态 */
    @Excel(name = "状态")
    private Long borrowState;

    /** 是否故障 */
    @Excel(name = "是否故障")
    private Long borrowFault;

    /** 申请时间 */
    @Excel(name = "申请时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date borrowApplyTime;

    public void setBorrowId(Integer borrowId) 
    {
        this.borrowId = borrowId;
    }

    public Integer getBorrowId() 
    {
        return borrowId;
    }
    public void setBorrowUserId(Integer borrowUserId) 
    {
        this.borrowUserId = borrowUserId;
    }

    public Integer getBorrowUserId() 
    {
        return borrowUserId;
    }
    public void setBorrowEquipmentId(Integer borrowEquipmentId) 
    {
        this.borrowEquipmentId = borrowEquipmentId;
    }

    public Integer getBorrowEquipmentId() 
    {
        return borrowEquipmentId;
    }
    public void setBorrowEquipmentName(String borrowEquipmentName) 
    {
        this.borrowEquipmentName = borrowEquipmentName;
    }

    public String getBorrowEquipmentName() 
    {
        return borrowEquipmentName;
    }
    public void setBorrowEquipmentTypeId(Integer borrowEquipmentTypeId) 
    {
        this.borrowEquipmentTypeId = borrowEquipmentTypeId;
    }

    public Integer getBorrowEquipmentTypeId() 
    {
        return borrowEquipmentTypeId;
    }
    public void setBorrowBoxCode(String borrowBoxCode) 
    {
        this.borrowBoxCode = borrowBoxCode;
    }

    public String getBorrowBoxCode() 
    {
        return borrowBoxCode;
    }
    public void setBorrowTime(Date borrowTime) 
    {
        this.borrowTime = borrowTime;
    }

    public Date getBorrowTime() 
    {
        return borrowTime;
    }
    public void setBorrowExpectTime(Date borrowExpectTime) 
    {
        this.borrowExpectTime = borrowExpectTime;
    }

    public Date getBorrowExpectTime() 
    {
        return borrowExpectTime;
    }
    public void setBorrowRealTime(Date borrowRealTime) 
    {
        this.borrowRealTime = borrowRealTime;
    }

    public Date getBorrowRealTime() 
    {
        return borrowRealTime;
    }
    public void setBorrowState(Long borrowState) 
    {
        this.borrowState = borrowState;
    }

    public Long getBorrowState() 
    {
        return borrowState;
    }
    public void setBorrowFault(Long borrowFault) 
    {
        this.borrowFault = borrowFault;
    }

    public Long getBorrowFault() 
    {
        return borrowFault;
    }
    public void setBorrowApplyTime(Date borrowApplyTime) 
    {
        this.borrowApplyTime = borrowApplyTime;
    }

    public Date getBorrowApplyTime() 
    {
        return borrowApplyTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("borrowId", getBorrowId())
            .append("borrowUserId", getBorrowUserId())
            .append("borrowEquipmentId", getBorrowEquipmentId())
            .append("borrowEquipmentName", getBorrowEquipmentName())
            .append("borrowEquipmentTypeId", getBorrowEquipmentTypeId())
            .append("borrowBoxCode", getBorrowBoxCode())
            .append("borrowTime", getBorrowTime())
            .append("borrowExpectTime", getBorrowExpectTime())
            .append("borrowRealTime", getBorrowRealTime())
            .append("borrowState", getBorrowState())
            .append("borrowFault", getBorrowFault())
            .append("borrowApplyTime", getBorrowApplyTime())
            .toString();
    }
}
