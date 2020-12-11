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
import com.ruoyi.locker.domain.LocCollegerule;
import com.ruoyi.locker.service.ILocCollegeruleService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 开放学院规则Controller
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
@Controller
@RequestMapping("/locker/collegerule")
public class LocCollegeruleController extends BaseController
{
    private String prefix = "locker/collegerule";

    @Autowired
    private ILocCollegeruleService locCollegeruleService;

    @RequiresPermissions("locker:collegerule:view")
    @GetMapping()
    public String collegerule()
    {
        return prefix + "/collegerule";
    }

    /**
     * 查询开放学院规则列表
     */
    @RequiresPermissions("locker:collegerule:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(LocCollegerule locCollegerule)
    {
        startPage();
        List<LocCollegerule> list = locCollegeruleService.selectLocCollegeruleList(locCollegerule);
        return getDataTable(list);
    }

    /**
     * 导出开放学院规则列表
     */
    @RequiresPermissions("locker:collegerule:export")
    @Log(title = "开放学院规则", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(LocCollegerule locCollegerule)
    {
        List<LocCollegerule> list = locCollegeruleService.selectLocCollegeruleList(locCollegerule);
        ExcelUtil<LocCollegerule> util = new ExcelUtil<LocCollegerule>(LocCollegerule.class);
        return util.exportExcel(list, "collegerule");
    }

    /**
     * 新增开放学院规则
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存开放学院规则
     */
    @RequiresPermissions("locker:collegerule:add")
    @Log(title = "开放学院规则", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(LocCollegerule locCollegerule)
    {
        return toAjax(locCollegeruleService.insertLocCollegerule(locCollegerule));
    }

    /**
     * 修改开放学院规则
     */
    @GetMapping("/edit/{collegeruleId}")
    public String edit(@PathVariable("collegeruleId") Integer collegeruleId, ModelMap mmap)
    {
        LocCollegerule locCollegerule = locCollegeruleService.selectLocCollegeruleById(collegeruleId);
        mmap.put("locCollegerule", locCollegerule);
        return prefix + "/edit";
    }

    /**
     * 修改保存开放学院规则
     */
    @RequiresPermissions("locker:collegerule:edit")
    @Log(title = "开放学院规则", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(LocCollegerule locCollegerule)
    {
        return toAjax(locCollegeruleService.updateLocCollegerule(locCollegerule));
    }

    /**
     * 删除开放学院规则
     */
    @RequiresPermissions("locker:collegerule:remove")
    @Log(title = "开放学院规则", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(locCollegeruleService.deleteLocCollegeruleByIds(ids));
    }
}
