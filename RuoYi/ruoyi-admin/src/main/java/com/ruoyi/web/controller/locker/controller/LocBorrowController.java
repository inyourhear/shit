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
import com.ruoyi.locker.domain.LocBorrow;
import com.ruoyi.locker.service.ILocBorrowService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 借用信息Controller
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
@Controller
@RequestMapping("/locker/borrow")
public class LocBorrowController extends BaseController
{
    private String prefix = "locker/borrow";

    @Autowired
    private ILocBorrowService locBorrowService;

    @RequiresPermissions("locker:borrow:view")
    @GetMapping()
    public String borrow()
    {
        return prefix + "/borrow";
    }

    /**
     * 查询借用信息列表
     */
    @RequiresPermissions("locker:borrow:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(LocBorrow locBorrow)
    {
        startPage();
        List<LocBorrow> list = locBorrowService.selectLocBorrowList(locBorrow);
        return getDataTable(list);
    }

    /**
     * 导出借用信息列表
     */
    @RequiresPermissions("locker:borrow:export")
    @Log(title = "借用信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(LocBorrow locBorrow)
    {
        List<LocBorrow> list = locBorrowService.selectLocBorrowList(locBorrow);
        ExcelUtil<LocBorrow> util = new ExcelUtil<LocBorrow>(LocBorrow.class);
        return util.exportExcel(list, "borrow");
    }

    /**
     * 新增借用信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存借用信息
     */
    @RequiresPermissions("locker:borrow:add")
    @Log(title = "借用信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(LocBorrow locBorrow)
    {
        return toAjax(locBorrowService.insertLocBorrow(locBorrow));
    }

    /**
     * 修改借用信息
     */
    @GetMapping("/edit/{borrowId}")
    public String edit(@PathVariable("borrowId") Integer borrowId, ModelMap mmap)
    {
        LocBorrow locBorrow = locBorrowService.selectLocBorrowById(borrowId);
        mmap.put("locBorrow", locBorrow);
        return prefix + "/edit";
    }

    /**
     * 修改保存借用信息
     */
    @RequiresPermissions("locker:borrow:edit")
    @Log(title = "借用信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(LocBorrow locBorrow)
    {
        return toAjax(locBorrowService.updateLocBorrow(locBorrow));
    }

    /**
     * 删除借用信息
     */
    @RequiresPermissions("locker:borrow:remove")
    @Log(title = "借用信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(locBorrowService.deleteLocBorrowByIds(ids));
    }
}
