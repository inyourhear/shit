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
import com.ruoyi.locker.domain.LocMajorrule;
import com.ruoyi.locker.service.ILocMajorruleService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 开放专业Controller
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
@Controller
@RequestMapping("/locker/majorrule")
public class LocMajorruleController extends BaseController
{
    private String prefix = "locker/majorrule";

    @Autowired
    private ILocMajorruleService locMajorruleService;

    @RequiresPermissions("locker:majorrule:view")
    @GetMapping()
    public String majorrule()
    {
        return prefix + "/majorrule";
    }

    /**
     * 查询开放专业列表
     */
    @RequiresPermissions("locker:majorrule:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(LocMajorrule locMajorrule)
    {
        startPage();
        List<LocMajorrule> list = locMajorruleService.selectLocMajorruleList(locMajorrule);
        return getDataTable(list);
    }

    /**
     * 导出开放专业列表
     */
    @RequiresPermissions("locker:majorrule:export")
    @Log(title = "开放专业", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(LocMajorrule locMajorrule)
    {
        List<LocMajorrule> list = locMajorruleService.selectLocMajorruleList(locMajorrule);
        ExcelUtil<LocMajorrule> util = new ExcelUtil<LocMajorrule>(LocMajorrule.class);
        return util.exportExcel(list, "majorrule");
    }

    /**
     * 新增开放专业
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存开放专业
     */
    @RequiresPermissions("locker:majorrule:add")
    @Log(title = "开放专业", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(LocMajorrule locMajorrule)
    {
        return toAjax(locMajorruleService.insertLocMajorrule(locMajorrule));
    }

    /**
     * 修改开放专业
     */
    @GetMapping("/edit/{majorruleId}")
    public String edit(@PathVariable("majorruleId") Long majorruleId, ModelMap mmap)
    {
        LocMajorrule locMajorrule = locMajorruleService.selectLocMajorruleById(majorruleId);
        mmap.put("locMajorrule", locMajorrule);
        return prefix + "/edit";
    }

    /**
     * 修改保存开放专业
     */
    @RequiresPermissions("locker:majorrule:edit")
    @Log(title = "开放专业", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(LocMajorrule locMajorrule)
    {
        return toAjax(locMajorruleService.updateLocMajorrule(locMajorrule));
    }

    /**
     * 删除开放专业
     */
    @RequiresPermissions("locker:majorrule:remove")
    @Log(title = "开放专业", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(locMajorruleService.deleteLocMajorruleByIds(ids));
    }
}
