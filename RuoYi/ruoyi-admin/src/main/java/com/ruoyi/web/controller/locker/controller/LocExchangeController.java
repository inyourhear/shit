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
import com.ruoyi.locker.domain.LocExchange;
import com.ruoyi.locker.service.ILocExchangeService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 交换Controller
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
@Controller
@RequestMapping("/locker/exchange")
public class LocExchangeController extends BaseController
{
    private String prefix = "locker/exchange";

    @Autowired
    private ILocExchangeService locExchangeService;

    @RequiresPermissions("locker:exchange:view")
    @GetMapping()
    public String exchange()
    {
        return prefix + "/exchange";
    }

    /**
     * 查询交换列表
     */
    @RequiresPermissions("locker:exchange:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(LocExchange locExchange)
    {
        startPage();
        List<LocExchange> list = locExchangeService.selectLocExchangeList(locExchange);
        return getDataTable(list);
    }

    /**
     * 导出交换列表
     */
    @RequiresPermissions("locker:exchange:export")
    @Log(title = "交换", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(LocExchange locExchange)
    {
        List<LocExchange> list = locExchangeService.selectLocExchangeList(locExchange);
        ExcelUtil<LocExchange> util = new ExcelUtil<LocExchange>(LocExchange.class);
        return util.exportExcel(list, "exchange");
    }

    /**
     * 新增交换
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存交换
     */
    @RequiresPermissions("locker:exchange:add")
    @Log(title = "交换", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(LocExchange locExchange)
    {
        return toAjax(locExchangeService.insertLocExchange(locExchange));
    }

    /**
     * 修改交换
     */
    @GetMapping("/edit/{exchangeId}")
    public String edit(@PathVariable("exchangeId") Long exchangeId, ModelMap mmap)
    {
        LocExchange locExchange = locExchangeService.selectLocExchangeById(exchangeId);
        mmap.put("locExchange", locExchange);
        return prefix + "/edit";
    }

    /**
     * 修改保存交换
     */
    @RequiresPermissions("locker:exchange:edit")
    @Log(title = "交换", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(LocExchange locExchange)
    {
        return toAjax(locExchangeService.updateLocExchange(locExchange));
    }

    /**
     * 删除交换
     */
    @RequiresPermissions("locker:exchange:remove")
    @Log(title = "交换", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(locExchangeService.deleteLocExchangeByIds(ids));
    }
}
