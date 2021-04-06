package com.ruoyi.project.system.ticket.controller;

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
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.project.system.ticket.domain.Ticket;
import com.ruoyi.project.system.ticket.service.ITicketService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 工单详情Controller
 * 
 * @author YS
 * @date 2021-04-05
 */
@Controller
@RequestMapping("/system/ticket")
public class TicketController extends BaseController
{
    private String prefix = "system/ticket";

    @Autowired
    private ITicketService ticketService;

    @RequiresPermissions("system:ticket:view")
    @GetMapping()
    public String ticket()
    {
        return prefix + "/ticket";
    }

    /**
     * 查询工单详情列表
     */
    @RequiresPermissions("system:ticket:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Ticket ticket)
    {
        startPage();
        List<Ticket> list = ticketService.selectTicketList(ticket);
        return getDataTable(list);
    }

    /**
     * 导出工单详情列表
     */
    @RequiresPermissions("system:ticket:export")
    @Log(title = "工单详情", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Ticket ticket)
    {
        List<Ticket> list = ticketService.selectTicketList(ticket);
        ExcelUtil<Ticket> util = new ExcelUtil<Ticket>(Ticket.class);
        return util.exportExcel(list, "ticket");
    }

    /**
     * 新增工单详情
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存工单详情
     */
    @RequiresPermissions("system:ticket:add")
    @Log(title = "工单详情", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Ticket ticket)
    {
        return toAjax(ticketService.insertTicket(ticket));
    }

    /**
     * 修改工单详情
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, ModelMap mmap)
    {
        Ticket ticket = ticketService.selectTicketById(id);
        mmap.put("ticket", ticket);
        return prefix + "/edit";
    }

    /**
     * 修改保存工单详情
     */
    @RequiresPermissions("system:ticket:edit")
    @Log(title = "工单详情", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Ticket ticket)
    {
        return toAjax(ticketService.updateTicket(ticket));
    }

    /**
     * 删除工单详情
     */
    @RequiresPermissions("system:ticket:remove")
    @Log(title = "工单详情", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(ticketService.deleteTicketByIds(ids));
    }
}
