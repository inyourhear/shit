package com.ruoyi.locker.mapper;

import java.util.List;
import com.ruoyi.locker.domain.LocOther;

/**
 * 其他人员Mapper接口
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
public interface LocOtherMapper 
{
    /**
     * 查询其他人员
     * 
     * @param otherId 其他人员ID
     * @return 其他人员
     */
    public LocOther selectLocOtherById(Integer otherId);

    /**
     * 查询其他人员列表
     * 
     * @param locOther 其他人员
     * @return 其他人员集合
     */
    public List<LocOther> selectLocOtherList(LocOther locOther);

    /**
     * 新增其他人员
     * 
     * @param locOther 其他人员
     * @return 结果
     */
    public int insertLocOther(LocOther locOther);

    /**
     * 修改其他人员
     * 
     * @param locOther 其他人员
     * @return 结果
     */
    public int updateLocOther(LocOther locOther);

    /**
     * 删除其他人员
     * 
     * @param otherId 其他人员ID
     * @return 结果
     */
    public int deleteLocOtherById(Integer otherId);

    /**
     * 批量删除其他人员
     * 
     * @param otherIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteLocOtherByIds(String[] otherIds);
}
