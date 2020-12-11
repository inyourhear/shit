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
import com.ruoyi.locker.domain.LocStudent;
import com.ruoyi.locker.service.ILocStudentService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 学生信息Controller
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
@Controller
@RequestMapping("/locker/student")
public class LocStudentController extends BaseController
{
    private String prefix = "locker/student";

    @Autowired
    private ILocStudentService locStudentService;

    @RequiresPermissions("locker:student:view")
    @GetMapping()
    public String student()
    {
        return prefix + "/student";
    }

    /**
     * 查询学生信息列表
     */
    @RequiresPermissions("locker:student:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(LocStudent locStudent)
    {
        startPage();
        List<LocStudent> list = locStudentService.selectLocStudentList(locStudent);
        return getDataTable(list);
    }

    /**
     * 导出学生信息列表
     */
    @RequiresPermissions("locker:student:export")
    @Log(title = "学生信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(LocStudent locStudent)
    {
        List<LocStudent> list = locStudentService.selectLocStudentList(locStudent);
        ExcelUtil<LocStudent> util = new ExcelUtil<LocStudent>(LocStudent.class);
        return util.exportExcel(list, "student");
    }

    /**
     * 新增学生信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存学生信息
     */
    @RequiresPermissions("locker:student:add")
    @Log(title = "学生信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(LocStudent locStudent)
    {
        return toAjax(locStudentService.insertLocStudent(locStudent));
    }

    /**
     * 修改学生信息
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, ModelMap mmap)
    {
        LocStudent locStudent = locStudentService.selectLocStudentById(id);
        mmap.put("locStudent", locStudent);
        return prefix + "/edit";
    }

    /**
     * 修改保存学生信息
     */
    @RequiresPermissions("locker:student:edit")
    @Log(title = "学生信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(LocStudent locStudent)
    {
        return toAjax(locStudentService.updateLocStudent(locStudent));
    }

    /**
     * 删除学生信息
     */
    @RequiresPermissions("locker:student:remove")
    @Log(title = "学生信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(locStudentService.deleteLocStudentByIds(ids));
    }
}
