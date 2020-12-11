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
import com.ruoyi.locker.domain.LocEquipmentDetail;
import com.ruoyi.locker.service.ILocEquipmentDetailService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 设备明细信息Controller
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
@Controller
@RequestMapping("/locker/detail")
public class LocEquipmentDetailController extends BaseController
{
    private String prefix = "locker/detail";

    @Autowired
    private ILocEquipmentDetailService locEquipmentDetailService;

    @RequiresPermissions("locker:detail:view")
    @GetMapping()
    public String detail()
    {
        return prefix + "/detail";
    }

    /**
     * 查询设备明细信息列表
     */
    @RequiresPermissions("locker:detail:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(LocEquipmentDetail locEquipmentDetail)
    {
        startPage();
        List<LocEquipmentDetail> list = locEquipmentDetailService.selectLocEquipmentDetailList(locEquipmentDetail);
        return getDataTable(list);
    }

    /**
     * 导出设备明细信息列表
     */
    @RequiresPermissions("locker:detail:export")
    @Log(title = "设备明细信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(LocEquipmentDetail locEquipmentDetail)
    {
        List<LocEquipmentDetail> list = locEquipmentDetailService.selectLocEquipmentDetailList(locEquipmentDetail);
        ExcelUtil<LocEquipmentDetail> util = new ExcelUtil<LocEquipmentDetail>(LocEquipmentDetail.class);
        return util.exportExcel(list, "detail");
    }

    /**
     * 新增设备明细信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存设备明细信息
     */
    @RequiresPermissions("locker:detail:add")
    @Log(title = "设备明细信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(LocEquipmentDetail locEquipmentDetail)
    {
        return toAjax(locEquipmentDetailService.insertLocEquipmentDetail(locEquipmentDetail));
    }

    /**
     * 修改设备明细信息
     */
    @GetMapping("/edit/{equipmentDetailId}")
    public String edit(@PathVariable("equipmentDetailId") Integer equipmentDetailId, ModelMap mmap)
    {
        LocEquipmentDetail locEquipmentDetail = locEquipmentDetailService.selectLocEquipmentDetailById(equipmentDetailId);
        mmap.put("locEquipmentDetail", locEquipmentDetail);
        return prefix + "/edit";
    }

    /**
     * 修改保存设备明细信息
     */
    @RequiresPermissions("locker:detail:edit")
    @Log(title = "设备明细信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(LocEquipmentDetail locEquipmentDetail)
    {
        return toAjax(locEquipmentDetailService.updateLocEquipmentDetail(locEquipmentDetail));
    }

    /**
     * 删除设备明细信息
     */
    @RequiresPermissions("locker:detail:remove")
    @Log(title = "设备明细信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(locEquipmentDetailService.deleteLocEquipmentDetailByIds(ids));
    }
}
