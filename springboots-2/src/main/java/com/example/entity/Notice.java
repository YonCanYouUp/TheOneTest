package com.example.entity;

import java.util.Date;

public class Notice {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notice.notice_id
     *
     * @mbg.generated Sat Dec 15 14:40:57 CST 2018
     */
    private Integer noticeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notice.notice_name
     *
     * @mbg.generated Sat Dec 15 14:40:57 CST 2018
     */
    private String noticeName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notice.notice_time
     *
     * @mbg.generated Sat Dec 15 14:40:57 CST 2018
     */
    private Date noticeTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notice.notice_content
     *
     * @mbg.generated Sat Dec 15 14:40:57 CST 2018
     */
    private String noticeContent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notice.notice_dept
     *
     * @mbg.generated Sat Dec 15 14:40:57 CST 2018
     */
    private Integer noticeDept;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notice.type_id
     *
     * @mbg.generated Sat Dec 15 14:40:57 CST 2018
     */
    private Integer typeId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notice.notice_id
     *
     * @return the value of notice.notice_id
     *
     * @mbg.generated Sat Dec 15 14:40:57 CST 2018
     */
    public Integer getNoticeId() {
        return noticeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notice.notice_id
     *
     * @param noticeId the value for notice.notice_id
     *
     * @mbg.generated Sat Dec 15 14:40:57 CST 2018
     */
    public void setNoticeId(Integer noticeId) {
        this.noticeId = noticeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notice.notice_name
     *
     * @return the value of notice.notice_name
     *
     * @mbg.generated Sat Dec 15 14:40:57 CST 2018
     */
    public String getNoticeName() {
        return noticeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notice.notice_name
     *
     * @param noticeName the value for notice.notice_name
     *
     * @mbg.generated Sat Dec 15 14:40:57 CST 2018
     */
    public void setNoticeName(String noticeName) {
        this.noticeName = noticeName == null ? null : noticeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notice.notice_time
     *
     * @return the value of notice.notice_time
     *
     * @mbg.generated Sat Dec 15 14:40:57 CST 2018
     */
    public Date getNoticeTime() {
        return noticeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notice.notice_time
     *
     * @param noticeTime the value for notice.notice_time
     *
     * @mbg.generated Sat Dec 15 14:40:57 CST 2018
     */
    public void setNoticeTime(Date noticeTime) {
        this.noticeTime = noticeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notice.notice_content
     *
     * @return the value of notice.notice_content
     *
     * @mbg.generated Sat Dec 15 14:40:57 CST 2018
     */
    public String getNoticeContent() {
        return noticeContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notice.notice_content
     *
     * @param noticeContent the value for notice.notice_content
     *
     * @mbg.generated Sat Dec 15 14:40:57 CST 2018
     */
    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent == null ? null : noticeContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notice.notice_dept
     *
     * @return the value of notice.notice_dept
     *
     * @mbg.generated Sat Dec 15 14:40:57 CST 2018
     */
    public Integer getNoticeDept() {
        return noticeDept;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notice.notice_dept
     *
     * @param noticeDept the value for notice.notice_dept
     *
     * @mbg.generated Sat Dec 15 14:40:57 CST 2018
     */
    public void setNoticeDept(Integer noticeDept) {
        this.noticeDept = noticeDept;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notice.type_id
     *
     * @return the value of notice.type_id
     *
     * @mbg.generated Sat Dec 15 14:40:57 CST 2018
     */
    public Integer getTypeId() {
        return typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notice.type_id
     *
     * @param typeId the value for notice.type_id
     *
     * @mbg.generated Sat Dec 15 14:40:57 CST 2018
     */
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }
}