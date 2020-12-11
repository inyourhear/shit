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
import com.ruoyi.locker.domain.LocBoard;
import com.ruoyi.locker.service.ILocBoardService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 板的基本信息Controller
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
@Controller
@RequestMapping("/locker/board")
public class LocBoardController extends BaseController
{
    private String prefix = "locker/board";

    @Autowired
    private ILocBoardService locBoardService;

    @RequiresPermissions("locker:board:view")
    @GetMapping()
    public String board()
    {
        return prefix + "/board";
    }

    /**
     * 查询板的基本信息列表
     */
    @RequiresPermissions("locker:board:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(LocBoard locBoard)
    {
        startPage();
        List<LocBoard> list = locBoardService.selectLocBoardList(locBoard);
        return getDataTable(list);
    }

    /**
     * 导出板的基本信息列表
     */
    @RequiresPermissions("locker:board:export")
    @Log(title = "板的基本信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(LocBoard locBoard)
    {
        List<LocBoard> list = locBoardService.selectLocBoardList(locBoard);
        ExcelUtil<LocBoard> util = new ExcelUtil<LocBoard>(LocBoard.class);
        return util.exportExcel(list, "board");
    }

    /**
     * 新增板的基本信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存板的基本信息
     */
    @RequiresPermissions("locker:board:add")
    @Log(title = "板的基本信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(LocBoard locBoard)
    {
        return toAjax(locBoardService.insertLocBoard(locBoard));
    }

    /**
     * 修改板的基本信息
     */
    @GetMapping("/edit/{boardId}")
    public String edit(@PathVariable("boardId") Integer boardId, ModelMap mmap)
    {
        LocBoard locBoard = locBoardService.selectLocBoardById(boardId);
        mmap.put("locBoard", locBoard);
        return prefix + "/edit";
    }

    /**
     * 修改保存板的基本信息
     */
    @RequiresPermissions("locker:board:edit")
    @Log(title = "板的基本信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(LocBoard locBoard)
    {
        return toAjax(locBoardService.updateLocBoard(locBoard));
    }

    /**
     * 删除板的基本信息
     */
    @RequiresPermissions("locker:board:remove")
    @Log(title = "板的基本信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(locBoardService.deleteLocBoardByIds(ids));
    }
}
