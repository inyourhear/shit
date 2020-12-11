package com.ruoyi.locker.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.locker.mapper.LocBorrowMapper;
import com.ruoyi.locker.domain.LocBorrow;
import com.ruoyi.locker.service.ILocBorrowService;
import com.ruoyi.common.core.text.Convert;

/**
 * 借用信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
@Service
public class LocBorrowServiceImpl implements ILocBorrowService 
{
    @Autowired
    private LocBorrowMapper locBorrowMapper;

    /**
     * 查询借用信息
     * 
     * @param borrowId 借用信息ID
     * @return 借用信息
     */
    @Override
    public LocBorrow selectLocBorrowById(Integer borrowId)
    {
        return locBorrowMapper.selectLocBorrowById(borrowId);
    }

    /**
     * 查询借用信息列表
     * 
     * @param locBorrow 借用信息
     * @return 借用信息
     */
    @Override
    public List<LocBorrow> selectLocBorrowList(LocBorrow locBorrow)
    {
        return locBorrowMapper.selectLocBorrowList(locBorrow);
    }

    /**
     * 新增借用信息
     * 
     * @param locBorrow 借用信息
     * @return 结果
     */
    @Override
    public int insertLocBorrow(LocBorrow locBorrow)
    {
        return locBorrowMapper.insertLocBorrow(locBorrow);
    }

    /**
     * 修改借用信息
     * 
     * @param locBorrow 借用信息
     * @return 结果
     */
    @Override
    public int updateLocBorrow(LocBorrow locBorrow)
    {
        return locBorrowMapper.updateLocBorrow(locBorrow);
    }

    /**
     * 删除借用信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteLocBorrowByIds(String ids)
    {
        return locBorrowMapper.deleteLocBorrowByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除借用信息信息
     * 
     * @param borrowId 借用信息ID
     * @return 结果
     */
    @Override
    public int deleteLocBorrowById(Integer borrowId)
    {
        return locBorrowMapper.deleteLocBorrowById(borrowId);
    }
}
