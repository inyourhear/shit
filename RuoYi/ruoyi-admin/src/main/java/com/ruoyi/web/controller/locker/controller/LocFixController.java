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
import com.ruoyi.locker.domain.LocFix;
import com.ruoyi.locker.service.ILocFixService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 维修信息单Controller
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
@Controller
@RequestMapping("/locker/fix")
public class LocFixController extends BaseController
{
    private String prefix = "locker/fix";

    @Autowired
    private ILocFixService locFixService;

    @RequiresPermissions("locker:fix:view")
    @GetMapping()
    public String fix()
    {
        return prefix + "/fix";
    }

    /**
     * 查询维修信息单列表
     */
    @RequiresPermissions("locker:fix:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(LocFix locFix)
    {
        startPage();
        List<LocFix> list = locFixService.selectLocFixList(locFix);
        return getDataTable(list);
    }

    /**
     * 导出维修信息单列表
     */
    @RequiresPermissions("locker:fix:export")
    @Log(title = "维修信息单", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(LocFix locFix)
    {
        List<LocFix> list = locFixService.selectLocFixList(locFix);
        ExcelUtil<LocFix> util = new ExcelUtil<LocFix>(LocFix.class);
        return util.exportExcel(list, "fix");
    }

    /**
     * 新增维修信息单
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存维修信息单
     */
    @RequiresPermissions("locker:fix:add")
    @Log(title = "维修信息单", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(LocFix locFix)
    {
        return toAjax(locFixService.insertLocFix(locFix));
    }

    /**
     * 修改维修信息单
     */
    @GetMapping("/edit/{fixId}")
    public String edit(@PathVariable("fixId") Integer fixId, ModelMap mmap)
    {
        LocFix locFix = locFixService.selectLocFixById(fixId);
        mmap.put("locFix", locFix);
        return prefix + "/edit";
    }

    /**
     * 修改保存维修信息单
     */
    @RequiresPermissions("locker:fix:edit")
    @Log(title = "维修信息单", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(LocFix locFix)
    {
        return toAjax(locFixService.updateLocFix(locFix));
    }

    /**
     * 删除维修信息单
     */
    @RequiresPermissions("locker:fix:remove")
    @Log(title = "维修信息单", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(locFixService.deleteLocFixByIds(ids));
    }
}
