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
import com.ruoyi.locker.domain.LocUser;
import com.ruoyi.locker.service.ILocUserService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 用户Controller
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
@Controller
@RequestMapping("/locker/user")
public class LocUserController extends BaseController
{
    private String prefix = "locker/user";

    @Autowired
    private ILocUserService locUserService;

    @RequiresPermissions("locker:user:view")
    @GetMapping()
    public String user()
    {
        return prefix + "/user";
    }

    /**
     * 查询用户列表
     */
    @RequiresPermissions("locker:user:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(LocUser locUser)
    {
        startPage();
        List<LocUser> list = locUserService.selectLocUserList(locUser);
        return getDataTable(list);
    }

    /**
     * 导出用户列表
     */
    @RequiresPermissions("locker:user:export")
    @Log(title = "用户", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(LocUser locUser)
    {
        List<LocUser> list = locUserService.selectLocUserList(locUser);
        ExcelUtil<LocUser> util = new ExcelUtil<LocUser>(LocUser.class);
        return util.exportExcel(list, "user");
    }

    /**
     * 新增用户
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存用户
     */
    @RequiresPermissions("locker:user:add")
    @Log(title = "用户", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(LocUser locUser)
    {
        return toAjax(locUserService.insertLocUser(locUser));
    }

    /**
     * 修改用户
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, ModelMap mmap)
    {
        LocUser locUser = locUserService.selectLocUserById(id);
        mmap.put("locUser", locUser);
        return prefix + "/edit";
    }

    /**
     * 修改保存用户
     */
    @RequiresPermissions("locker:user:edit")
    @Log(title = "用户", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(LocUser locUser)
    {
        return toAjax(locUserService.updateLocUser(locUser));
    }

    /**
     * 删除用户
     */
    @RequiresPermissions("locker:user:remove")
    @Log(title = "用户", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(locUserService.deleteLocUserByIds(ids));
    }
}
