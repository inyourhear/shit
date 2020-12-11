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
import com.ruoyi.locker.domain.LocRuletable;
import com.ruoyi.locker.service.ILocRuletableService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 规则信息Controller
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
@Controller
@RequestMapping("/locker/ruletable")
public class LocRuletableController extends BaseController
{
    private String prefix = "locker/ruletable";

    @Autowired
    private ILocRuletableService locRuletableService;

    @RequiresPermissions("locker:ruletable:view")
    @GetMapping()
    public String ruletable()
    {
        return prefix + "/ruletable";
    }

    /**
     * 查询规则信息列表
     */
    @RequiresPermissions("locker:ruletable:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(LocRuletable locRuletable)
    {
        startPage();
        List<LocRuletable> list = locRuletableService.selectLocRuletableList(locRuletable);
        return getDataTable(list);
    }

    /**
     * 导出规则信息列表
     */
    @RequiresPermissions("locker:ruletable:export")
    @Log(title = "规则信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(LocRuletable locRuletable)
    {
        List<LocRuletable> list = locRuletableService.selectLocRuletableList(locRuletable);
        ExcelUtil<LocRuletable> util = new ExcelUtil<LocRuletable>(LocRuletable.class);
        return util.exportExcel(list, "ruletable");
    }

    /**
     * 新增规则信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存规则信息
     */
    @RequiresPermissions("locker:ruletable:add")
    @Log(title = "规则信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(LocRuletable locRuletable)
    {
        return toAjax(locRuletableService.insertLocRuletable(locRuletable));
    }

    /**
     * 修改规则信息
     */
    @GetMapping("/edit/{ruletableId}")
    public String edit(@PathVariable("ruletableId") Integer ruletableId, ModelMap mmap)
    {
        LocRuletable locRuletable = locRuletableService.selectLocRuletableById(ruletableId);
        mmap.put("locRuletable", locRuletable);
        return prefix + "/edit";
    }

    /**
     * 修改保存规则信息
     */
    @RequiresPermissions("locker:ruletable:edit")
    @Log(title = "规则信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(LocRuletable locRuletable)
    {
        return toAjax(locRuletableService.updateLocRuletable(locRuletable));
    }

    /**
     * 删除规则信息
     */
    @RequiresPermissions("locker:ruletable:remove")
    @Log(title = "规则信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(locRuletableService.deleteLocRuletableByIds(ids));
    }
}
