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
import com.ruoyi.locker.domain.LocUserrule;
import com.ruoyi.locker.service.ILocUserruleService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 开放人员规则Controller
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
@Controller
@RequestMapping("/locker/userrule")
public class LocUserruleController extends BaseController
{
    private String prefix = "locker/userrule";

    @Autowired
    private ILocUserruleService locUserruleService;

    @RequiresPermissions("locker:userrule:view")
    @GetMapping()
    public String userrule()
    {
        return prefix + "/userrule";
    }

    /**
     * 查询开放人员规则列表
     */
    @RequiresPermissions("locker:userrule:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(LocUserrule locUserrule)
    {
        startPage();
        List<LocUserrule> list = locUserruleService.selectLocUserruleList(locUserrule);
        return getDataTable(list);
    }

    /**
     * 导出开放人员规则列表
     */
    @RequiresPermissions("locker:userrule:export")
    @Log(title = "开放人员规则", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(LocUserrule locUserrule)
    {
        List<LocUserrule> list = locUserruleService.selectLocUserruleList(locUserrule);
        ExcelUtil<LocUserrule> util = new ExcelUtil<LocUserrule>(LocUserrule.class);
        return util.exportExcel(list, "userrule");
    }

    /**
     * 新增开放人员规则
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存开放人员规则
     */
    @RequiresPermissions("locker:userrule:add")
    @Log(title = "开放人员规则", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(LocUserrule locUserrule)
    {
        return toAjax(locUserruleService.insertLocUserrule(locUserrule));
    }

    /**
     * 修改开放人员规则
     */
    @GetMapping("/edit/{userruleId}")
    public String edit(@PathVariable("userruleId") Integer userruleId, ModelMap mmap)
    {
        LocUserrule locUserrule = locUserruleService.selectLocUserruleById(userruleId);
        mmap.put("locUserrule", locUserrule);
        return prefix + "/edit";
    }

    /**
     * 修改保存开放人员规则
     */
    @RequiresPermissions("locker:userrule:edit")
    @Log(title = "开放人员规则", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(LocUserrule locUserrule)
    {
        return toAjax(locUserruleService.updateLocUserrule(locUserrule));
    }

    /**
     * 删除开放人员规则
     */
    @RequiresPermissions("locker:userrule:remove")
    @Log(title = "开放人员规则", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(locUserruleService.deleteLocUserruleByIds(ids));
    }
}
