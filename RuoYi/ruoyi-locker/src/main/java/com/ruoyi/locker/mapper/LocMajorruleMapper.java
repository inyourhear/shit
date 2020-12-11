package com.ruoyi.locker.mapper;

import java.util.List;
import com.ruoyi.locker.domain.LocMajorrule;

/**
 * 开放专业Mapper接口
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
public interface LocMajorruleMapper 
{
    /**
     * 查询开放专业
     * 
     * @param majorruleId 开放专业ID
     * @return 开放专业
     */
    public LocMajorrule selectLocMajorruleById(Long majorruleId);

    /**
     * 查询开放专业列表
     * 
     * @param locMajorrule 开放专业
     * @return 开放专业集合
     */
    public List<LocMajorrule> selectLocMajorruleList(LocMajorrule locMajorrule);

    /**
     * 新增开放专业
     * 
     * @param locMajorrule 开放专业
     * @return 结果
     */
    public int insertLocMajorrule(LocMajorrule locMajorrule);

    /**
     * 修改开放专业
     * 
     * @param locMajorrule 开放专业
     * @return 结果
     */
    public int updateLocMajorrule(LocMajorrule locMajorrule);

    /**
     * 删除开放专业
     * 
     * @param majorruleId 开放专业ID
     * @return 结果
     */
    public int deleteLocMajorruleById(Long majorruleId);

    /**
     * 批量删除开放专业
     * 
     * @param majorruleIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteLocMajorruleByIds(String[] majorruleIds);
}
