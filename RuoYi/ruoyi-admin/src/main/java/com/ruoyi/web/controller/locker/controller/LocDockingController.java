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
import com.ruoyi.locker.domain.LocDocking;
import com.ruoyi.locker.service.ILocDockingService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 对接Controller
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
@Controller
@RequestMapping("/locker/docking")
public class LocDockingController extends BaseController
{
    private String prefix = "locker/docking";

    @Autowired
    private ILocDockingService locDockingService;

    @RequiresPermissions("locker:docking:view")
    @GetMapping()
    public String docking()
    {
        return prefix + "/docking";
    }

    /**
     * 查询对接列表
     */
    @RequiresPermissions("locker:docking:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(LocDocking locDocking)
    {
        startPage();
        List<LocDocking> list = locDockingService.selectLocDockingList(locDocking);
        return getDataTable(list);
    }

    /**
     * 导出对接列表
     */
    @RequiresPermissions("locker:docking:export")
    @Log(title = "对接", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(LocDocking locDocking)
    {
        List<LocDocking> list = locDockingService.selectLocDockingList(locDocking);
        ExcelUtil<LocDocking> util = new ExcelUtil<LocDocking>(LocDocking.class);
        return util.exportExcel(list, "docking");
    }

    /**
     * 新增对接
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存对接
     */
    @RequiresPermissions("locker:docking:add")
    @Log(title = "对接", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(LocDocking locDocking)
    {
        return toAjax(locDockingService.insertLocDocking(locDocking));
    }

    /**
     * 修改对接
     */
    @GetMapping("/edit/{dockingId}")
    public String edit(@PathVariable("dockingId") Long dockingId, ModelMap mmap)
    {
        LocDocking locDocking = locDockingService.selectLocDockingById(dockingId);
        mmap.put("locDocking", locDocking);
        return prefix + "/edit";
    }

    /**
     * 修改保存对接
     */
    @RequiresPermissions("locker:docking:edit")
    @Log(title = "对接", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(LocDocking locDocking)
    {
        return toAjax(locDockingService.updateLocDocking(locDocking));
    }

    /**
     * 删除对接
     */
    @RequiresPermissions("locker:docking:remove")
    @Log(title = "对接", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(locDockingService.deleteLocDockingByIds(ids));
    }
}
