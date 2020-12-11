package com.ruoyi.locker.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.locker.mapper.LocPortMapper;
import com.ruoyi.locker.domain.LocPort;
import com.ruoyi.locker.service.ILocPortService;
import com.ruoyi.common.core.text.Convert;

/**
 * 端口信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
@Service
public class LocPortServiceImpl implements ILocPortService 
{
    @Autowired
    private LocPortMapper locPortMapper;

    /**
     * 查询端口信息
     * 
     * @param portId 端口信息ID
     * @return 端口信息
     */
    @Override
    public LocPort selectLocPortById(Integer portId)
    {
        return locPortMapper.selectLocPortById(portId);
    }

    /**
     * 查询端口信息列表
     * 
     * @param locPort 端口信息
     * @return 端口信息
     */
    @Override
    public List<LocPort> selectLocPortList(LocPort locPort)
    {
        return locPortMapper.selectLocPortList(locPort);
    }

    /**
     * 新增端口信息
     * 
     * @param locPort 端口信息
     * @return 结果
     */
    @Override
    public int insertLocPort(LocPort locPort)
    {
        return locPortMapper.insertLocPort(locPort);
    }

    /**
     * 修改端口信息
     * 
     * @param locPort 端口信息
     * @return 结果
     */
    @Override
    public int updateLocPort(LocPort locPort)
    {
        return locPortMapper.updateLocPort(locPort);
    }

    /**
     * 删除端口信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteLocPortByIds(String ids)
    {
        return locPortMapper.deleteLocPortByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除端口信息信息
     * 
     * @param portId 端口信息ID
     * @return 结果
     */
    @Override
    public int deleteLocPortById(Integer portId)
    {
        return locPortMapper.deleteLocPortById(portId);
    }
}
