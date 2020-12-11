package com.ruoyi.locker.mapper;

import java.util.List;
import com.ruoyi.locker.domain.LocBoard;

/**
 * 板的基本信息Mapper接口
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
public interface LocBoardMapper 
{
    /**
     * 查询板的基本信息
     * 
     * @param boardId 板的基本信息ID
     * @return 板的基本信息
     */
    public LocBoard selectLocBoardById(Integer boardId);

    /**
     * 查询板的基本信息列表
     * 
     * @param locBoard 板的基本信息
     * @return 板的基本信息集合
     */
    public List<LocBoard> selectLocBoardList(LocBoard locBoard);

    /**
     * 新增板的基本信息
     * 
     * @param locBoard 板的基本信息
     * @return 结果
     */
    public int insertLocBoard(LocBoard locBoard);

    /**
     * 修改板的基本信息
     * 
     * @param locBoard 板的基本信息
     * @return 结果
     */
    public int updateLocBoard(LocBoard locBoard);

    /**
     * 删除板的基本信息
     * 
     * @param boardId 板的基本信息ID
     * @return 结果
     */
    public int deleteLocBoardById(Integer boardId);

    /**
     * 批量删除板的基本信息
     * 
     * @param boardIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteLocBoardByIds(String[] boardIds);
}
