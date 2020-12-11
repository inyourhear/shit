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
import com.ruoyi.locker.domain.LocOrder;
import com.ruoyi.locker.service.ILocOrderService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 开门指令Controller
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
@Controller
@RequestMapping("/locker/order")
public class LocOrderController extends BaseController
{
    private String prefix = "locker/order";

    @Autowired
    private ILocOrderService locOrderService;

    @RequiresPermissions("locker:order:view")
    @GetMapping()
    public String order()
    {
        return prefix + "/order";
    }

    /**
     * 查询开门指令列表
     */
    @RequiresPermissions("locker:order:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(LocOrder locOrder)
    {
        startPage();
        List<LocOrder> list = locOrderService.selectLocOrderList(locOrder);
        return getDataTable(list);
    }

    /**
     * 导出开门指令列表
     */
    @RequiresPermissions("locker:order:export")
    @Log(title = "开门指令", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(LocOrder locOrder)
    {
        List<LocOrder> list = locOrderService.selectLocOrderList(locOrder);
        ExcelUtil<LocOrder> util = new ExcelUtil<LocOrder>(LocOrder.class);
        return util.exportExcel(list, "order");
    }

    /**
     * 新增开门指令
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存开门指令
     */
    @RequiresPermissions("locker:order:add")
    @Log(title = "开门指令", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(LocOrder locOrder)
    {
        return toAjax(locOrderService.insertLocOrder(locOrder));
    }

    /**
     * 修改开门指令
     */
    @GetMapping("/edit/{orderId}")
    public String edit(@PathVariable("orderId") Integer orderId, ModelMap mmap)
    {
        LocOrder locOrder = locOrderService.selectLocOrderById(orderId);
        mmap.put("locOrder", locOrder);
        return prefix + "/edit";
    }

    /**
     * 修改保存开门指令
     */
    @RequiresPermissions("locker:order:edit")
    @Log(title = "开门指令", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(LocOrder locOrder)
    {
        return toAjax(locOrderService.updateLocOrder(locOrder));
    }

    /**
     * 删除开门指令
     */
    @RequiresPermissions("locker:order:remove")
    @Log(title = "开门指令", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(locOrderService.deleteLocOrderByIds(ids));
    }
}
