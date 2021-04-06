package com.ruoyi.project.system.ticket.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.ticket.mapper.TicketMapper;
import com.ruoyi.project.system.ticket.domain.Ticket;
import com.ruoyi.project.system.ticket.service.ITicketService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 工单详情Service业务层处理
 * 
 * @author YS
 * @date 2021-04-05
 */
@Service
public class TicketServiceImpl implements ITicketService 
{
    @Autowired
    private TicketMapper ticketMapper;

    /**
     * 查询工单详情
     * 
     * @param id 工单详情ID
     * @return 工单详情
     */
    @Override
    public Ticket selectTicketById(Integer id)
    {
        return ticketMapper.selectTicketById(id);
    }

    /**
     * 查询工单详情列表
     * 
     * @param ticket 工单详情
     * @return 工单详情
     */
    @Override
    public List<Ticket> selectTicketList(Ticket ticket)
    {
        return ticketMapper.selectTicketList(ticket);
    }

    /**
     * 新增工单详情
     * 
     * @param ticket 工单详情
     * @return 结果
     */
    @Override
    public int insertTicket(Ticket ticket)
    {
        return ticketMapper.insertTicket(ticket);
    }

    /**
     * 修改工单详情
     * 
     * @param ticket 工单详情
     * @return 结果
     */
    @Override
    public int updateTicket(Ticket ticket)
    {
        return ticketMapper.updateTicket(ticket);
    }

    /**
     * 删除工单详情对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTicketByIds(String ids)
    {
        return ticketMapper.deleteTicketByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除工单详情信息
     * 
     * @param id 工单详情ID
     * @return 结果
     */
    @Override
    public int deleteTicketById(Integer id)
    {
        return ticketMapper.deleteTicketById(id);
    }
}
