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
import com.ruoyi.locker.domain.LocTeacher;
import com.ruoyi.locker.service.ILocTeacherService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 教职工Controller
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
@Controller
@RequestMapping("/locker/teacher")
public class LocTeacherController extends BaseController
{
    private String prefix = "locker/teacher";

    @Autowired
    private ILocTeacherService locTeacherService;

    @RequiresPermissions("locker:teacher:view")
    @GetMapping()
    public String teacher()
    {
        return prefix + "/teacher";
    }

    /**
     * 查询教职工列表
     */
    @RequiresPermissions("locker:teacher:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(LocTeacher locTeacher)
    {
        startPage();
        List<LocTeacher> list = locTeacherService.selectLocTeacherList(locTeacher);
        return getDataTable(list);
    }

    /**
     * 导出教职工列表
     */
    @RequiresPermissions("locker:teacher:export")
    @Log(title = "教职工", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(LocTeacher locTeacher)
    {
        List<LocTeacher> list = locTeacherService.selectLocTeacherList(locTeacher);
        ExcelUtil<LocTeacher> util = new ExcelUtil<LocTeacher>(LocTeacher.class);
        return util.exportExcel(list, "teacher");
    }

    /**
     * 新增教职工
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存教职工
     */
    @RequiresPermissions("locker:teacher:add")
    @Log(title = "教职工", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(LocTeacher locTeacher)
    {
        return toAjax(locTeacherService.insertLocTeacher(locTeacher));
    }

    /**
     * 修改教职工
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        LocTeacher locTeacher = locTeacherService.selectLocTeacherById(id);
        mmap.put("locTeacher", locTeacher);
        return prefix + "/edit";
    }

    /**
     * 修改保存教职工
     */
    @RequiresPermissions("locker:teacher:edit")
    @Log(title = "教职工", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(LocTeacher locTeacher)
    {
        return toAjax(locTeacherService.updateLocTeacher(locTeacher));
    }

    /**
     * 删除教职工
     */
    @RequiresPermissions("locker:teacher:remove")
    @Log(title = "教职工", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(locTeacherService.deleteLocTeacherByIds(ids));
    }
}
