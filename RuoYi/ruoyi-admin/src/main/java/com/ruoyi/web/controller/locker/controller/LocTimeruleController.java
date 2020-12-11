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
import com.ruoyi.locker.domain.LocTimerule;
import com.ruoyi.locker.service.ILocTimeruleService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 时间规则明细Controller
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
@Controller
@RequestMapping("/locker/timerule")
public class LocTimeruleController extends BaseController
{
    private String prefix = "locker/timerule";

    @Autowired
    private ILocTimeruleService locTimeruleService;

    @RequiresPermissions("locker:timerule:view")
    @GetMapping()
    public String timerule()
    {
        return prefix + "/timerule";
    }

    /**
     * 查询时间规则明细列表
     */
    @RequiresPermissions("locker:timerule:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(LocTimerule locTimerule)
    {
        startPage();
        List<LocTimerule> list = locTimeruleService.selectLocTimeruleList(locTimerule);
        return getDataTable(list);
    }

    /**
     * 导出时间规则明细列表
     */
    @RequiresPermissions("locker:timerule:export")
    @Log(title = "时间规则明细", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(LocTimerule locTimerule)
    {
        List<LocTimerule> list = locTimeruleService.selectLocTimeruleList(locTimerule);
        ExcelUtil<LocTimerule> util = new ExcelUtil<LocTimerule>(LocTimerule.class);
        return util.exportExcel(list, "timerule");
    }

    /**
     * 新增时间规则明细
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存时间规则明细
     */
    @RequiresPermissions("locker:timerule:add")
    @Log(title = "时间规则明细", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(LocTimerule locTimerule)
    {
        return toAjax(locTimeruleService.insertLocTimerule(locTimerule));
    }

    /**
     * 修改时间规则明细
     */
    @GetMapping("/edit/{timeruleId}")
    public String edit(@PathVariable("timeruleId") Integer timeruleId, ModelMap mmap)
    {
        LocTimerule locTimerule = locTimeruleService.selectLocTimeruleById(timeruleId);
        mmap.put("locTimerule", locTimerule);
        return prefix + "/edit";
    }

    /**
     * 修改保存时间规则明细
     */
    @RequiresPermissions("locker:timerule:edit")
    @Log(title = "时间规则明细", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(LocTimerule locTimerule)
    {
        return toAjax(locTimeruleService.updateLocTimerule(locTimerule));
    }

    /**
     * 删除时间规则明细
     */
    @RequiresPermissions("locker:timerule:remove")
    @Log(title = "时间规则明细", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(locTimeruleService.deleteLocTimeruleByIds(ids));
    }
}
