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
import com.ruoyi.locker.domain.LocClassrule;
import com.ruoyi.locker.service.ILocClassruleService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 指定班级Controller
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
@Controller
@RequestMapping("/locker/classrule")
public class LocClassruleController extends BaseController
{
    private String prefix = "locker/classrule";

    @Autowired
    private ILocClassruleService locClassruleService;

    @RequiresPermissions("locker:classrule:view")
    @GetMapping()
    public String classrule()
    {
        return prefix + "/classrule";
    }

    /**
     * 查询指定班级列表
     */
    @RequiresPermissions("locker:classrule:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(LocClassrule locClassrule)
    {
        startPage();
        List<LocClassrule> list = locClassruleService.selectLocClassruleList(locClassrule);
        return getDataTable(list);
    }

    /**
     * 导出指定班级列表
     */
    @RequiresPermissions("locker:classrule:export")
    @Log(title = "指定班级", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(LocClassrule locClassrule)
    {
        List<LocClassrule> list = locClassruleService.selectLocClassruleList(locClassrule);
        ExcelUtil<LocClassrule> util = new ExcelUtil<LocClassrule>(LocClassrule.class);
        return util.exportExcel(list, "classrule");
    }

    /**
     * 新增指定班级
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存指定班级
     */
    @RequiresPermissions("locker:classrule:add")
    @Log(title = "指定班级", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(LocClassrule locClassrule)
    {
        return toAjax(locClassruleService.insertLocClassrule(locClassrule));
    }

    /**
     * 修改指定班级
     */
    @GetMapping("/edit/{classruleId}")
    public String edit(@PathVariable("classruleId") Integer classruleId, ModelMap mmap)
    {
        LocClassrule locClassrule = locClassruleService.selectLocClassruleById(classruleId);
        mmap.put("locClassrule", locClassrule);
        return prefix + "/edit";
    }

    /**
     * 修改保存指定班级
     */
    @RequiresPermissions("locker:classrule:edit")
    @Log(title = "指定班级", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(LocClassrule locClassrule)
    {
        return toAjax(locClassruleService.updateLocClassrule(locClassrule));
    }

    /**
     * 删除指定班级
     */
    @RequiresPermissions("locker:classrule:remove")
    @Log(title = "指定班级", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(locClassruleService.deleteLocClassruleByIds(ids));
    }
}
