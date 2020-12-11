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
import com.ruoyi.locker.domain.LocContainerManager;
import com.ruoyi.locker.service.ILocContainerManagerService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 货柜管理员Controller
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
@Controller
@RequestMapping("/locker/manager")
public class LocContainerManagerController extends BaseController
{
    private String prefix = "locker/manager";

    @Autowired
    private ILocContainerManagerService locContainerManagerService;

    @RequiresPermissions("locker:manager:view")
    @GetMapping()
    public String manager()
    {
        return prefix + "/manager";
    }

    /**
     * 查询货柜管理员列表
     */
    @RequiresPermissions("locker:manager:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(LocContainerManager locContainerManager)
    {
        startPage();
        List<LocContainerManager> list = locContainerManagerService.selectLocContainerManagerList(locContainerManager);
        return getDataTable(list);
    }

    /**
     * 导出货柜管理员列表
     */
    @RequiresPermissions("locker:manager:export")
    @Log(title = "货柜管理员", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(LocContainerManager locContainerManager)
    {
        List<LocContainerManager> list = locContainerManagerService.selectLocContainerManagerList(locContainerManager);
        ExcelUtil<LocContainerManager> util = new ExcelUtil<LocContainerManager>(LocContainerManager.class);
        return util.exportExcel(list, "manager");
    }

    /**
     * 新增货柜管理员
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存货柜管理员
     */
    @RequiresPermissions("locker:manager:add")
    @Log(title = "货柜管理员", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(LocContainerManager locContainerManager)
    {
        return toAjax(locContainerManagerService.insertLocContainerManager(locContainerManager));
    }

    /**
     * 修改货柜管理员
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, ModelMap mmap)
    {
        LocContainerManager locContainerManager = locContainerManagerService.selectLocContainerManagerById(id);
        mmap.put("locContainerManager", locContainerManager);
        return prefix + "/edit";
    }

    /**
     * 修改保存货柜管理员
     */
    @RequiresPermissions("locker:manager:edit")
    @Log(title = "货柜管理员", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(LocContainerManager locContainerManager)
    {
        return toAjax(locContainerManagerService.updateLocContainerManager(locContainerManager));
    }

    /**
     * 删除货柜管理员
     */
    @RequiresPermissions("locker:manager:remove")
    @Log(title = "货柜管理员", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(locContainerManagerService.deleteLocContainerManagerByIds(ids));
    }
}
