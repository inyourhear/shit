package com.ruoyi.locker.mapper;

import java.util.List;
import com.ruoyi.locker.domain.LocBorrow;

/**
 * 借用信息Mapper接口
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
public interface LocBorrowMapper 
{
    /**
     * 查询借用信息
     * 
     * @param borrowId 借用信息ID
     * @return 借用信息
     */
    public LocBorrow selectLocBorrowById(Integer borrowId);

    /**
     * 查询借用信息列表
     * 
     * @param locBorrow 借用信息
     * @return 借用信息集合
     */
    public List<LocBorrow> selectLocBorrowList(LocBorrow locBorrow);

    /**
     * 新增借用信息
     * 
     * @param locBorrow 借用信息
     * @return 结果
     */
    public int insertLocBorrow(LocBorrow locBorrow);

    /**
     * 修改借用信息
     * 
     * @param locBorrow 借用信息
     * @return 结果
     */
    public int updateLocBorrow(LocBorrow locBorrow);

    /**
     * 删除借用信息
     * 
     * @param borrowId 借用信息ID
     * @return 结果
     */
    public int deleteLocBorrowById(Integer borrowId);

    /**
     * 批量删除借用信息
     * 
     * @param borrowIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteLocBorrowByIds(String[] borrowIds);
}
