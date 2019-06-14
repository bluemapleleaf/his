package edu.neu.hoso.model;

import java.util.Date;

public class DayCal {
    private Integer dayCalId;

    private Integer userId;

    private Date dayCalStartdate;

    private Date dayCalEnddate;

    private Double dayCalTotal;

    public DayCal(Integer dayCalId, Integer userId, Date dayCalStartdate, Date dayCalEnddate, Double dayCalTotal) {
        this.dayCalId = dayCalId;
        this.userId = userId;
        this.dayCalStartdate = dayCalStartdate;
        this.dayCalEnddate = dayCalEnddate;
        this.dayCalTotal = dayCalTotal;
    }

    public DayCal() {
        super();
    }

    public Integer getDayCalId() {
        return dayCalId;
    }

    public void setDayCalId(Integer dayCalId) {
        this.dayCalId = dayCalId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getDayCalStartdate() {
        return dayCalStartdate;
    }

    public void setDayCalStartdate(Date dayCalStartdate) {
        this.dayCalStartdate = dayCalStartdate;
    }

    public Date getDayCalEnddate() {
        return dayCalEnddate;
    }

    public void setDayCalEnddate(Date dayCalEnddate) {
        this.dayCalEnddate = dayCalEnddate;
    }

    public Double getDayCalTotal() {
        return dayCalTotal;
    }

    public void setDayCalTotal(Double dayCalTotal) {
        this.dayCalTotal = dayCalTotal;
    }
}