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
import com.ruoyi.locker.domain.LocPort;
import com.ruoyi.locker.service.ILocPortService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 端口信息Controller
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
@Controller
@RequestMapping("/locker/port")
public class LocPortController extends BaseController
{
    private String prefix = "locker/port";

    @Autowired
    private ILocPortService locPortService;

    @RequiresPermissions("locker:port:view")
    @GetMapping()
    public String port()
    {
        return prefix + "/port";
    }

    /**
     * 查询端口信息列表
     */
    @RequiresPermissions("locker:port:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(LocPort locPort)
    {
        startPage();
        List<LocPort> list = locPortService.selectLocPortList(locPort);
        return getDataTable(list);
    }

    /**
     * 导出端口信息列表
     */
    @RequiresPermissions("locker:port:export")
    @Log(title = "端口信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(LocPort locPort)
    {
        List<LocPort> list = locPortService.selectLocPortList(locPort);
        ExcelUtil<LocPort> util = new ExcelUtil<LocPort>(LocPort.class);
        return util.exportExcel(list, "port");
    }

    /**
     * 新增端口信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存端口信息
     */
    @RequiresPermissions("locker:port:add")
    @Log(title = "端口信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(LocPort locPort)
    {
        return toAjax(locPortService.insertLocPort(locPort));
    }

    /**
     * 修改端口信息
     */
    @GetMapping("/edit/{portId}")
    public String edit(@PathVariable("portId") Integer portId, ModelMap mmap)
    {
        LocPort locPort = locPortService.selectLocPortById(portId);
        mmap.put("locPort", locPort);
        return prefix + "/edit";
    }

    /**
     * 修改保存端口信息
     */
    @RequiresPermissions("locker:port:edit")
    @Log(title = "端口信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(LocPort locPort)
    {
        return toAjax(locPortService.updateLocPort(locPort));
    }

    /**
     * 删除端口信息
     */
    @RequiresPermissions("locker:port:remove")
    @Log(title = "端口信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(locPortService.deleteLocPortByIds(ids));
    }
}
