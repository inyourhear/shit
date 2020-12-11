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
import com.ruoyi.locker.domain.LocBox;
import com.ruoyi.locker.service.ILocBoxService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 格子信息Controller
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
@Controller
@RequestMapping("/locker/box")
public class LocBoxController extends BaseController
{
    private String prefix = "locker/box";

    @Autowired
    private ILocBoxService locBoxService;

    @RequiresPermissions("locker:box:view")
    @GetMapping()
    public String box()
    {
        return prefix + "/box";
    }

    /**
     * 查询格子信息列表
     */
    @RequiresPermissions("locker:box:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(LocBox locBox)
    {
        startPage();
        List<LocBox> list = locBoxService.selectLocBoxList(locBox);
        return getDataTable(list);
    }

    /**
     * 导出格子信息列表
     */
    @RequiresPermissions("locker:box:export")
    @Log(title = "格子信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(LocBox locBox)
    {
        List<LocBox> list = locBoxService.selectLocBoxList(locBox);
        ExcelUtil<LocBox> util = new ExcelUtil<LocBox>(LocBox.class);
        return util.exportExcel(list, "box");
    }

    /**
     * 新增格子信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存格子信息
     */
    @RequiresPermissions("locker:box:add")
    @Log(title = "格子信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(LocBox locBox)
    {
        return toAjax(locBoxService.insertLocBox(locBox));
    }

    /**
     * 修改格子信息
     */
    @GetMapping("/edit/{boxCode}")
    public String edit(@PathVariable("boxCode") String boxCode, ModelMap mmap)
    {
        LocBox locBox = locBoxService.selectLocBoxById(boxCode);
        mmap.put("locBox", locBox);
        return prefix + "/edit";
    }

    /**
     * 修改保存格子信息
     */
    @RequiresPermissions("locker:box:edit")
    @Log(title = "格子信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(LocBox locBox)
    {
        return toAjax(locBoxService.updateLocBox(locBox));
    }

    /**
     * 删除格子信息
     */
    @RequiresPermissions("locker:box:remove")
    @Log(title = "格子信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(locBoxService.deleteLocBoxByIds(ids));
    }
}
