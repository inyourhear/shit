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
import com.ruoyi.locker.domain.LocApprove;
import com.ruoyi.locker.service.ILocApproveService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 审批记录Controller
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
@Controller
@RequestMapping("/locker/approve")
public class LocApproveController extends BaseController
{
    private String prefix = "locker/approve";

    @Autowired
    private ILocApproveService locApproveService;

    @RequiresPermissions("locker:approve:view")
    @GetMapping()
    public String approve()
    {
        return prefix + "/approve";
    }

    /**
     * 查询审批记录列表
     */
    @RequiresPermissions("locker:approve:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(LocApprove locApprove)
    {
        startPage();
        List<LocApprove> list = locApproveService.selectLocApproveList(locApprove);
        return getDataTable(list);
    }

    /**
     * 导出审批记录列表
     */
    @RequiresPermissions("locker:approve:export")
    @Log(title = "审批记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(LocApprove locApprove)
    {
        List<LocApprove> list = locApproveService.selectLocApproveList(locApprove);
        ExcelUtil<LocApprove> util = new ExcelUtil<LocApprove>(LocApprove.class);
        return util.exportExcel(list, "approve");
    }

    /**
     * 新增审批记录
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存审批记录
     */
    @RequiresPermissions("locker:approve:add")
    @Log(title = "审批记录", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(LocApprove locApprove)
    {
        return toAjax(locApproveService.insertLocApprove(locApprove));
    }

    /**
     * 修改审批记录
     */
    @GetMapping("/edit/{approveId}")
    public String edit(@PathVariable("approveId") Integer approveId, ModelMap mmap)
    {
        LocApprove locApprove = locApproveService.selectLocApproveById(approveId);
        mmap.put("locApprove", locApprove);
        return prefix + "/edit";
    }

    /**
     * 修改保存审批记录
     */
    @RequiresPermissions("locker:approve:edit")
    @Log(title = "审批记录", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(LocApprove locApprove)
    {
        return toAjax(locApproveService.updateLocApprove(locApprove));
    }

    /**
     * 删除审批记录
     */
    @RequiresPermissions("locker:approve:remove")
    @Log(title = "审批记录", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(locApproveService.deleteLocApproveByIds(ids));
    }
}
