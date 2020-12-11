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
import com.ruoyi.locker.domain.LocEquipmentType;
import com.ruoyi.locker.service.ILocEquipmentTypeService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 设备类型信息Controller
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
@Controller
@RequestMapping("/locker/type")
public class LocEquipmentTypeController extends BaseController
{
    private String prefix = "locker/type";

    @Autowired
    private ILocEquipmentTypeService locEquipmentTypeService;

    @RequiresPermissions("locker:type:view")
    @GetMapping()
    public String type()
    {
        return prefix + "/type";
    }

    /**
     * 查询设备类型信息列表
     */
    @RequiresPermissions("locker:type:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(LocEquipmentType locEquipmentType)
    {
        startPage();
        List<LocEquipmentType> list = locEquipmentTypeService.selectLocEquipmentTypeList(locEquipmentType);
        return getDataTable(list);
    }

    /**
     * 导出设备类型信息列表
     */
    @RequiresPermissions("locker:type:export")
    @Log(title = "设备类型信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(LocEquipmentType locEquipmentType)
    {
        List<LocEquipmentType> list = locEquipmentTypeService.selectLocEquipmentTypeList(locEquipmentType);
        ExcelUtil<LocEquipmentType> util = new ExcelUtil<LocEquipmentType>(LocEquipmentType.class);
        return util.exportExcel(list, "type");
    }

    /**
     * 新增设备类型信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存设备类型信息
     */
    @RequiresPermissions("locker:type:add")
    @Log(title = "设备类型信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(LocEquipmentType locEquipmentType)
    {
        return toAjax(locEquipmentTypeService.insertLocEquipmentType(locEquipmentType));
    }

    /**
     * 修改设备类型信息
     */
    @GetMapping("/edit/{equipmentTypeId}")
    public String edit(@PathVariable("equipmentTypeId") Integer equipmentTypeId, ModelMap mmap)
    {
        LocEquipmentType locEquipmentType = locEquipmentTypeService.selectLocEquipmentTypeById(equipmentTypeId);
        mmap.put("locEquipmentType", locEquipmentType);
        return prefix + "/edit";
    }

    /**
     * 修改保存设备类型信息
     */
    @RequiresPermissions("locker:type:edit")
    @Log(title = "设备类型信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(LocEquipmentType locEquipmentType)
    {
        return toAjax(locEquipmentTypeService.updateLocEquipmentType(locEquipmentType));
    }

    /**
     * 删除设备类型信息
     */
    @RequiresPermissions("locker:type:remove")
    @Log(title = "设备类型信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(locEquipmentTypeService.deleteLocEquipmentTypeByIds(ids));
    }
}
