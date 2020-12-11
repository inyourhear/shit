package com.ruoyi.web.controller.locker.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.locker.domain.LocOther;
import com.ruoyi.locker.service.ILocOtherService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 其他人员Controller
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
@Controller
@RequestMapping("/locker/other")
public class LocOtherController extends BaseController
{
    private String prefix = "locker/other";

    @Autowired
    private ILocOtherService locOtherService;

    @RequiresPermissions("locker:other:view")
    @GetMapping()
    public String other()
    {
        return prefix + "/other";
    }

    /**
     * 查询其他人员列表
     */
    @RequiresPermissions("locker:other:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(LocOther locOther)
    {
        startPage();
        List<LocOther> list = locOtherService.selectLocOtherList(locOther);
        return getDataTable(list);
    }

    /**
     * 导出其他人员列表
     */
    @RequiresPermissions("locker:other:export")
    @Log(title = "其他人员", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(LocOther locOther)
    {
        List<LocOther> list = locOtherService.selectLocOtherList(locOther);
        ExcelUtil<LocOther> util = new ExcelUtil<LocOther>(LocOther.class);
        return util.exportExcel(list, "other");
    }

    /**
     * 新增其他人员
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存其他人员
     */
    @RequiresPermissions("locker:other:add")
    @Log(title = "其他人员", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(LocOther locOther)
    {
        return toAjax(locOtherService.insertLocOther(locOther));
    }

    /**
     * 修改其他人员
     */
    @GetMapping("/edit/{otherId}")
    public String edit(@PathVariable("otherId") Integer otherId, ModelMap mmap)
    {
        LocOther locOther = locOtherService.selectLocOtherById(otherId);
        mmap.put("locOther", locOther);
        return prefix + "/edit";
    }

    /**
     * 修改保存其他人员
     */
    @RequiresPermissions("locker:other:edit")
    @Log(title = "其他人员", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(LocOther locOther)
    {
        return toAjax(locOtherService.updateLocOther(locOther));
    }

    /**
     * 删除其他人员
     */
    @RequiresPermissions("locker:other:remove")
    @Log(title = "其他人员", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(locOtherService.deleteLocOtherByIds(ids));
    }
}
