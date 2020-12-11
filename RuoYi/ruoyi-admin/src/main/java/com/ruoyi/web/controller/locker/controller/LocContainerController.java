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
import com.ruoyi.locker.domain.LocContainer;
import com.ruoyi.locker.service.ILocContainerService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 货柜信息Controller
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
@Controller
@RequestMapping("/locker/container")
public class LocContainerController extends BaseController
{
    private String prefix = "locker/container";

    @Autowired
    private ILocContainerService locContainerService;

    @RequiresPermissions("locker:container:view")
    @GetMapping()
    public String container()
    {
        return prefix + "/container";
    }

    /**
     * 查询货柜信息列表
     */
    @RequiresPermissions("locker:container:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(LocContainer locContainer)
    {
        startPage();
        List<LocContainer> list = locContainerService.selectLocContainerList(locContainer);
        return getDataTable(list);
    }

    /**
     * 导出货柜信息列表
     */
    @RequiresPermissions("locker:container:export")
    @Log(title = "货柜信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(LocContainer locContainer)
    {
        List<LocContainer> list = locContainerService.selectLocContainerList(locContainer);
        ExcelUtil<LocContainer> util = new ExcelUtil<LocContainer>(LocContainer.class);
        return util.exportExcel(list, "container");
    }

    /**
     * 新增货柜信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存货柜信息
     */
    @RequiresPermissions("locker:container:add")
    @Log(title = "货柜信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(LocContainer locContainer)
    {
        return toAjax(locContainerService.insertLocContainer(locContainer));
    }

    /**
     * 修改货柜信息
     */
    @GetMapping("/edit/{containerId}")
    public String edit(@PathVariable("containerId") Integer containerId, ModelMap mmap)
    {
        LocContainer locContainer = locContainerService.selectLocContainerById(containerId);
        mmap.put("locContainer", locContainer);
        return prefix + "/edit";
    }

    /**
     * 修改保存货柜信息
     */
    @RequiresPermissions("locker:container:edit")
    @Log(title = "货柜信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(LocContainer locContainer)
    {
        return toAjax(locContainerService.updateLocContainer(locContainer));
    }

    /**
     * 删除货柜信息
     */
    @RequiresPermissions("locker:container:remove")
    @Log(title = "货柜信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(locContainerService.deleteLocContainerByIds(ids));
    }
}
