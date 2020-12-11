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
import com.ruoyi.locker.domain.LocBlacklist;
import com.ruoyi.locker.service.ILocBlacklistService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 黑名单息Controller
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
@Controller
@RequestMapping("/locker/blacklist")
public class LocBlacklistController extends BaseController
{
    private String prefix = "locker/blacklist";

    @Autowired
    private ILocBlacklistService locBlacklistService;

    @RequiresPermissions("locker:blacklist:view")
    @GetMapping()
    public String blacklist()
    {
        return prefix + "/blacklist";
    }

    /**
     * 查询黑名单息列表
     */
    @RequiresPermissions("locker:blacklist:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(LocBlacklist locBlacklist)
    {
        startPage();
        List<LocBlacklist> list = locBlacklistService.selectLocBlacklistList(locBlacklist);
        return getDataTable(list);
    }

    /**
     * 导出黑名单息列表
     */
    @RequiresPermissions("locker:blacklist:export")
    @Log(title = "黑名单息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(LocBlacklist locBlacklist)
    {
        List<LocBlacklist> list = locBlacklistService.selectLocBlacklistList(locBlacklist);
        ExcelUtil<LocBlacklist> util = new ExcelUtil<LocBlacklist>(LocBlacklist.class);
        return util.exportExcel(list, "blacklist");
    }

    /**
     * 新增黑名单息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存黑名单息
     */
    @RequiresPermissions("locker:blacklist:add")
    @Log(title = "黑名单息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(LocBlacklist locBlacklist)
    {
        return toAjax(locBlacklistService.insertLocBlacklist(locBlacklist));
    }

    /**
     * 修改黑名单息
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, ModelMap mmap)
    {
        LocBlacklist locBlacklist = locBlacklistService.selectLocBlacklistById(id);
        mmap.put("locBlacklist", locBlacklist);
        return prefix + "/edit";
    }

    /**
     * 修改保存黑名单息
     */
    @RequiresPermissions("locker:blacklist:edit")
    @Log(title = "黑名单息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(LocBlacklist locBlacklist)
    {
        return toAjax(locBlacklistService.updateLocBlacklist(locBlacklist));
    }

    /**
     * 删除黑名单息
     */
    @RequiresPermissions("locker:blacklist:remove")
    @Log(title = "黑名单息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(locBlacklistService.deleteLocBlacklistByIds(ids));
    }
}
