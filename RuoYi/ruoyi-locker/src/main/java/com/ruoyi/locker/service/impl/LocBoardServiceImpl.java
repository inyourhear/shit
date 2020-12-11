package com.ruoyi.locker.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.locker.mapper.LocBoardMapper;
import com.ruoyi.locker.domain.LocBoard;
import com.ruoyi.locker.service.ILocBoardService;
import com.ruoyi.common.core.text.Convert;

/**
 * 板的基本信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
@Service
public class LocBoardServiceImpl implements ILocBoardService 
{
    @Autowired
    private LocBoardMapper locBoardMapper;

    /**
     * 查询板的基本信息
     * 
     * @param boardId 板的基本信息ID
     * @return 板的基本信息
     */
    @Override
    public LocBoard selectLocBoardById(Integer boardId)
    {
        return locBoardMapper.selectLocBoardById(boardId);
    }

    /**
     * 查询板的基本信息列表
     * 
     * @param locBoard 板的基本信息
     * @return 板的基本信息
     */
    @Override
    public List<LocBoard> selectLocBoardList(LocBoard locBoard)
    {
        return locBoardMapper.selectLocBoardList(locBoard);
    }

    /**
     * 新增板的基本信息
     * 
     * @param locBoard 板的基本信息
     * @return 结果
     */
    @Override
    public int insertLocBoard(LocBoard locBoard)
    {
        return locBoardMapper.insertLocBoard(locBoard);
    }

    /**
     * 修改板的基本信息
     * 
     * @param locBoard 板的基本信息
     * @return 结果
     */
    @Override
    public int updateLocBoard(LocBoard locBoard)
    {
        return locBoardMapper.updateLocBoard(locBoard);
    }

    /**
     * 删除板的基本信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteLocBoardByIds(String ids)
    {
        return locBoardMapper.deleteLocBoardByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除板的基本信息信息
     * 
     * @param boardId 板的基本信息ID
     * @return 结果
     */
    @Override
    public int deleteLocBoardById(Integer boardId)
    {
        return locBoardMapper.deleteLocBoardById(boardId);
    }
}
