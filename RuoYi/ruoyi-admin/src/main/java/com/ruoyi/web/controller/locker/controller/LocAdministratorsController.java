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
import com.ruoyi.locker.domain.LocAdministrators;
import com.ruoyi.locker.service.ILocAdministratorsService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 管理员信息Controller
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
@Controller
@RequestMapping("/locker/administrators")
public class LocAdministratorsController extends BaseController
{
    private String prefix = "locker/administrators";

    @Autowired
    private ILocAdministratorsService locAdministratorsService;

    @RequiresPermissions("locker:administrators:view")
    @GetMapping()
    public String administrators()
    {
        return prefix + "/administrators";
    }

    /**
     * 查询管理员信息列表
     */
    @RequiresPermissions("locker:administrators:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(LocAdministrators locAdministrators)
    {
        startPage();
        List<LocAdministrators> list = locAdministratorsService.selectLocAdministratorsList(locAdministrators);
        return getDataTable(list);
    }

    /**
     * 导出管理员信息列表
     */
    @RequiresPermissions("locker:administrators:export")
    @Log(title = "管理员信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(LocAdministrators locAdministrators)
    {
        List<LocAdministrators> list = locAdministratorsService.selectLocAdministratorsList(locAdministrators);
        ExcelUtil<LocAdministrators> util = new ExcelUtil<LocAdministrators>(LocAdministrators.class);
        return util.exportExcel(list, "administrators");
    }

    /**
     * 新增管理员信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存管理员信息
     */
    @RequiresPermissions("locker:administrators:add")
    @Log(title = "管理员信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(LocAdministrators locAdministrators)
    {
        return toAjax(locAdministratorsService.insertLocAdministrators(locAdministrators));
    }

    /**
     * 修改管理员信息
     */
    @GetMapping("/edit/{administratorsId}")
    public String edit(@PathVariable("administratorsId") Integer administratorsId, ModelMap mmap)
    {
        LocAdministrators locAdministrators = locAdministratorsService.selectLocAdministratorsById(administratorsId);
        mmap.put("locAdministrators", locAdministrators);
        return prefix + "/edit";
    }

    /**
     * 修改保存管理员信息
     */
    @RequiresPermissions("locker:administrators:edit")
    @Log(title = "管理员信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(LocAdministrators locAdministrators)
    {
        return toAjax(locAdministratorsService.updateLocAdministrators(locAdministrators));
    }

    /**
     * 删除管理员信息
     */
    @RequiresPermissions("locker:administrators:remove")
    @Log(title = "管理员信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(locAdministratorsService.deleteLocAdministratorsByIds(ids));
    }
}
