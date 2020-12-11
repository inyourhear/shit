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
import com.ruoyi.locker.domain.LocOpenscope;
import com.ruoyi.locker.service.ILocOpenscopeService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 格子开放范围信Controller
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
@Controller
@RequestMapping("/locker/openscope")
public class LocOpenscopeController extends BaseController
{
    private String prefix = "locker/openscope";

    @Autowired
    private ILocOpenscopeService locOpenscopeService;

    @RequiresPermissions("locker:openscope:view")
    @GetMapping()
    public String openscope()
    {
        return prefix + "/openscope";
    }

    /**
     * 查询格子开放范围信列表
     */
    @RequiresPermissions("locker:openscope:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(LocOpenscope locOpenscope)
    {
        startPage();
        List<LocOpenscope> list = locOpenscopeService.selectLocOpenscopeList(locOpenscope);
        return getDataTable(list);
    }

    /**
     * 导出格子开放范围信列表
     */
    @RequiresPermissions("locker:openscope:export")
    @Log(title = "格子开放范围信", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(LocOpenscope locOpenscope)
    {
        List<LocOpenscope> list = locOpenscopeService.selectLocOpenscopeList(locOpenscope);
        ExcelUtil<LocOpenscope> util = new ExcelUtil<LocOpenscope>(LocOpenscope.class);
        return util.exportExcel(list, "openscope");
    }

    /**
     * 新增格子开放范围信
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存格子开放范围信
     */
    @RequiresPermissions("locker:openscope:add")
    @Log(title = "格子开放范围信", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(LocOpenscope locOpenscope)
    {
        return toAjax(locOpenscopeService.insertLocOpenscope(locOpenscope));
    }

    /**
     * 修改格子开放范围信
     */
    @GetMapping("/edit/{openscopeId}")
    public String edit(@PathVariable("openscopeId") Long openscopeId, ModelMap mmap)
    {
        LocOpenscope locOpenscope = locOpenscopeService.selectLocOpenscopeById(openscopeId);
        mmap.put("locOpenscope", locOpenscope);
        return prefix + "/edit";
    }

    /**
     * 修改保存格子开放范围信
     */
    @RequiresPermissions("locker:openscope:edit")
    @Log(title = "格子开放范围信", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(LocOpenscope locOpenscope)
    {
        return toAjax(locOpenscopeService.updateLocOpenscope(locOpenscope));
    }

    /**
     * 删除格子开放范围信
     */
    @RequiresPermissions("locker:openscope:remove")
    @Log(title = "格子开放范围信", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(locOpenscopeService.deleteLocOpenscopeByIds(ids));
    }
}
