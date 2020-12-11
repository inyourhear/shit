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
import com.ruoyi.locker.domain.LocOpenrule;
import com.ruoyi.locker.service.ILocOpenruleService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 货柜开放规则Controller
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
@Controller
@RequestMapping("/locker/openrule")
public class LocOpenruleController extends BaseController
{
    private String prefix = "locker/openrule";

    @Autowired
    private ILocOpenruleService locOpenruleService;

    @RequiresPermissions("locker:openrule:view")
    @GetMapping()
    public String openrule()
    {
        return prefix + "/openrule";
    }

    /**
     * 查询货柜开放规则列表
     */
    @RequiresPermissions("locker:openrule:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(LocOpenrule locOpenrule)
    {
        startPage();
        List<LocOpenrule> list = locOpenruleService.selectLocOpenruleList(locOpenrule);
        return getDataTable(list);
    }

    /**
     * 导出货柜开放规则列表
     */
    @RequiresPermissions("locker:openrule:export")
    @Log(title = "货柜开放规则", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(LocOpenrule locOpenrule)
    {
        List<LocOpenrule> list = locOpenruleService.selectLocOpenruleList(locOpenrule);
        ExcelUtil<LocOpenrule> util = new ExcelUtil<LocOpenrule>(LocOpenrule.class);
        return util.exportExcel(list, "openrule");
    }

    /**
     * 新增货柜开放规则
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存货柜开放规则
     */
    @RequiresPermissions("locker:openrule:add")
    @Log(title = "货柜开放规则", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(LocOpenrule locOpenrule)
    {
        return toAjax(locOpenruleService.insertLocOpenrule(locOpenrule));
    }

    /**
     * 修改货柜开放规则
     */
    @GetMapping("/edit/{openruleId}")
    public String edit(@PathVariable("openruleId") Integer openruleId, ModelMap mmap)
    {
        LocOpenrule locOpenrule = locOpenruleService.selectLocOpenruleById(openruleId);
        mmap.put("locOpenrule", locOpenrule);
        return prefix + "/edit";
    }

    /**
     * 修改保存货柜开放规则
     */
    @RequiresPermissions("locker:openrule:edit")
    @Log(title = "货柜开放规则", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(LocOpenrule locOpenrule)
    {
        return toAjax(locOpenruleService.updateLocOpenrule(locOpenrule));
    }

    /**
     * 删除货柜开放规则
     */
    @RequiresPermissions("locker:openrule:remove")
    @Log(title = "货柜开放规则", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(locOpenruleService.deleteLocOpenruleByIds(ids));
    }
}
