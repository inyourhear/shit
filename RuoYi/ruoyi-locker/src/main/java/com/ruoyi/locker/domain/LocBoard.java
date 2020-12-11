package com.ruoyi.locker.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 板的基本信息对象 loc_board
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
public class LocBoard extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 板ID */
    @Excel(name = "板ID")
    private Integer boardId;

    /** 编码 */
    @Excel(name = "编码")
    private String boardCode;

    /** 货柜ID */
    @Excel(name = "货柜ID")
    private Integer boardContainerId;

    /** 板号 */
    @Excel(name = "板号")
    private Integer boardNumber;

    /** IP地址 */
    @Excel(name = "IP地址")
    private String boardIpAddress;

    public void setBoardId(Integer boardId) 
    {
        this.boardId = boardId;
    }

    public Integer getBoardId() 
    {
        return boardId;
    }
    public void setBoardCode(String boardCode) 
    {
        this.boardCode = boardCode;
    }

    public String getBoardCode() 
    {
        return boardCode;
    }
    public void setBoardContainerId(Integer boardContainerId) 
    {
        this.boardContainerId = boardContainerId;
    }

    public Integer getBoardContainerId() 
    {
        return boardContainerId;
    }
    public void setBoardNumber(Integer boardNumber) 
    {
        this.boardNumber = boardNumber;
    }

    public Integer getBoardNumber() 
    {
        return boardNumber;
    }
    public void setBoardIpAddress(String boardIpAddress) 
    {
        this.boardIpAddress = boardIpAddress;
    }

    public String getBoardIpAddress() 
    {
        return boardIpAddress;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("boardId", getBoardId())
            .append("boardCode", getBoardCode())
            .append("boardContainerId", getBoardContainerId())
            .append("boardNumber", getBoardNumber())
            .append("boardIpAddress", getBoardIpAddress())
            .toString();
    }
}
