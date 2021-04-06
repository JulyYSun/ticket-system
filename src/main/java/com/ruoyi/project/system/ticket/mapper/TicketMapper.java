package com.ruoyi.project.system.ticket.mapper;

import java.util.List;
import com.ruoyi.project.system.ticket.domain.Ticket;

/**
 * 工单详情Mapper接口
 * 
 * @author YS
 * @date 2021-04-05
 */
public interface TicketMapper 
{
    /**
     * 查询工单详情
     * 
     * @param id 工单详情ID
     * @return 工单详情
     */
    public Ticket selectTicketById(Integer id);

    /**
     * 查询工单详情列表
     * 
     * @param ticket 工单详情
     * @return 工单详情集合
     */
    public List<Ticket> selectTicketList(Ticket ticket);

    /**
     * 新增工单详情
     * 
     * @param ticket 工单详情
     * @return 结果
     */
    public int insertTicket(Ticket ticket);

    /**
     * 修改工单详情
     * 
     * @param ticket 工单详情
     * @return 结果
     */
    public int updateTicket(Ticket ticket);

    /**
     * 删除工单详情
     * 
     * @param id 工单详情ID
     * @return 结果
     */
    public int deleteTicketById(Integer id);

    /**
     * 批量删除工单详情
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTicketByIds(String[] ids);
}
