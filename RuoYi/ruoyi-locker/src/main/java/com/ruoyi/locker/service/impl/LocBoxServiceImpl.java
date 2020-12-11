package com.ruoyi.locker.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.locker.mapper.LocBoxMapper;
import com.ruoyi.locker.domain.LocBox;
import com.ruoyi.locker.service.ILocBoxService;
import com.ruoyi.common.core.text.Convert;

/**
 * 格子信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
@Service
public class LocBoxServiceImpl implements ILocBoxService 
{
    @Autowired
    private LocBoxMapper locBoxMapper;

    /**
     * 查询格子信息
     * 
     * @param boxCode 格子信息ID
     * @return 格子信息
     */
    @Override
    public LocBox selectLocBoxById(String boxCode)
    {
        return locBoxMapper.selectLocBoxById(boxCode);
    }

    /**
     * 查询格子信息列表
     * 
     * @param locBox 格子信息
     * @return 格子信息
     */
    @Override
    public List<LocBox> selectLocBoxList(LocBox locBox)
    {
        return locBoxMapper.selectLocBoxList(locBox);
    }

    /**
     * 新增格子信息
     * 
     * @param locBox 格子信息
     * @return 结果
     */
    @Override
    public int insertLocBox(LocBox locBox)
    {
        return locBoxMapper.insertLocBox(locBox);
    }

    /**
     * 修改格子信息
     * 
     * @param locBox 格子信息
     * @return 结果
     */
    @Override
    public int updateLocBox(LocBox locBox)
    {
        return locBoxMapper.updateLocBox(locBox);
    }

    /**
     * 删除格子信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteLocBoxByIds(String ids)
    {
        return locBoxMapper.deleteLocBoxByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除格子信息信息
     * 
     * @param boxCode 格子信息ID
     * @return 结果
     */
    @Override
    public int deleteLocBoxById(String boxCode)
    {
        return locBoxMapper.deleteLocBoxById(boxCode);
    }
}
