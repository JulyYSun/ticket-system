package com.ruoyi.project.system.ticket.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 工单详情对象 ticket
 * 
 * @author YS
 * @date 2021-04-05
 */
public class Ticket extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Integer id;

    /** 申请人姓名 */
    @Excel(name = "申请人姓名")
    private String applicantName;

    /** 咨询问题一 */
    @Excel(name = "咨询问题一")
    private String question1;

    /** 回答一 */
    @Excel(name = "回答一")
    private String answer1;

    /** 咨询问题二 */
    @Excel(name = "咨询问题二")
    private String question2;

    /** 回答二 */
    @Excel(name = "回答二")
    private String answer2;

    /** 是否终止 */
    @Excel(name = "是否终止")
    private Integer canceled;

    public void setId(Integer id)
    {
        this.id = id;
    }

    public Integer getId()
    {
        return id;
    }
    public void setApplicantName(String applicantName)
    {
        this.applicantName = applicantName;
    }

    public String getApplicantName()
    {
        return applicantName;
    }
    public void setQuestion1(String question1)
    {
        this.question1 = question1;
    }

    public String getQuestion1()
    {
        return question1;
    }
    public void setAnswer1(String answer1)
    {
        this.answer1 = answer1;
    }

    public String getAnswer1()
    {
        return answer1;
    }
    public void setQuestion2(String question2)
    {
        this.question2 = question2;
    }

    public String getQuestion2()
    {
        return question2;
    }
    public void setAnswer2(String answer2)
    {
        this.answer2 = answer2;
    }

    public String getAnswer2()
    {
        return answer2;
    }
    public void setCanceled(Integer canceled)
    {
        this.canceled = canceled;
    }

    public Integer getCanceled()
    {
        return canceled;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("applicantName", getApplicantName())
            .append("question1", getQuestion1())
            .append("answer1", getAnswer1())
            .append("question2", getQuestion2())
            .append("answer2", getAnswer2())
            .append("canceled", getCanceled())
            .toString();
    }
}
