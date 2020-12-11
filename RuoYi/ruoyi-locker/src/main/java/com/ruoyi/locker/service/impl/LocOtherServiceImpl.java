package com.ruoyi.locker.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.locker.mapper.LocOtherMapper;
import com.ruoyi.locker.domain.LocOther;
import com.ruoyi.locker.service.ILocOtherService;
import com.ruoyi.common.core.text.Convert;

/**
 * 其他人员Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
@Service
public class LocOtherServiceImpl implements ILocOtherService 
{
    @Autowired
    private LocOtherMapper locOtherMapper;

    /**
     * 查询其他人员
     * 
     * @param otherId 其他人员ID
     * @return 其他人员
     */
    @Override
    public LocOther selectLocOtherById(Integer otherId)
    {
        return locOtherMapper.selectLocOtherById(otherId);
    }

    /**
     * 查询其他人员列表
     * 
     * @param locOther 其他人员
     * @return 其他人员
     */
    @Override
    public List<LocOther> selectLocOtherList(LocOther locOther)
    {
        return locOtherMapper.selectLocOtherList(locOther);
    }

    /**
     * 新增其他人员
     * 
     * @param locOther 其他人员
     * @return 结果
     */
    @Override
    public int insertLocOther(LocOther locOther)
    {
        return locOtherMapper.insertLocOther(locOther);
    }

    /**
     * 修改其他人员
     * 
     * @param locOther 其他人员
     * @return 结果
     */
    @Override
    public int updateLocOther(LocOther locOther)
    {
        return locOtherMapper.updateLocOther(locOther);
    }

    /**
     * 删除其他人员对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteLocOtherByIds(String ids)
    {
        return locOtherMapper.deleteLocOtherByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除其他人员信息
     * 
     * @param otherId 其他人员ID
     * @return 结果
     */
    @Override
    public int deleteLocOtherById(Integer otherId)
    {
        return locOtherMapper.deleteLocOtherById(otherId);
    }
}
