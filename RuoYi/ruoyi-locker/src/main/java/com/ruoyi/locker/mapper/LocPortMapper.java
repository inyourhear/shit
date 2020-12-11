package com.ruoyi.locker.mapper;

import java.util.List;
import com.ruoyi.locker.domain.LocPort;

/**
 * 端口信息Mapper接口
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
public interface LocPortMapper 
{
    /**
     * 查询端口信息
     * 
     * @param portId 端口信息ID
     * @return 端口信息
     */
    public LocPort selectLocPortById(Integer portId);

    /**
     * 查询端口信息列表
     * 
     * @param locPort 端口信息
     * @return 端口信息集合
     */
    public List<LocPort> selectLocPortList(LocPort locPort);

    /**
     * 新增端口信息
     * 
     * @param locPort 端口信息
     * @return 结果
     */
    public int insertLocPort(LocPort locPort);

    /**
     * 修改端口信息
     * 
     * @param locPort 端口信息
     * @return 结果
     */
    public int updateLocPort(LocPort locPort);

    /**
     * 删除端口信息
     * 
     * @param portId 端口信息ID
     * @return 结果
     */
    public int deleteLocPortById(Integer portId);

    /**
     * 批量删除端口信息
     * 
     * @param portIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteLocPortByIds(String[] portIds);
}
