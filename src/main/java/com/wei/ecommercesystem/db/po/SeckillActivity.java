package com.wei.ecommercesystem.db.po;

import java.math.BigDecimal;
import java.util.Date;

public class SeckillActivity {
    private Long id;

    private String name;

    private Long commodityId;

    private BigDecimal oldPrice;

    private BigDecimal seckillPrice;

    private Date startTime;

    private Date endTime;

    private Long totalStock;

    private Integer activitystatus;

    private Integer availablestock;

    private Long lockstock;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Long commodityId) {
        this.commodityId = commodityId;
    }

    public BigDecimal getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(BigDecimal oldPrice) {
        this.oldPrice = oldPrice;
    }

    public BigDecimal getSeckillPrice() {
        return seckillPrice;
    }

    public void setSeckillPrice(BigDecimal seckillPrice) {
        this.seckillPrice = seckillPrice;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Long getTotalStock() {
        return totalStock;
    }

    public void setTotalStock(Long totalStock) {
        this.totalStock = totalStock;
    }

    public Integer getActivitystatus() {
        return activitystatus;
    }

    public void setActivitystatus(Integer activitystatus) {
        this.activitystatus = activitystatus;
    }

    public Integer getAvailablestock() {
        return availablestock;
    }

    public void setAvailablestock(Integer availablestock) {
        this.availablestock = availablestock;
    }

    public Long getLockstock() {
        return lockstock;
    }

    public void setLockstock(Long lockstock) {
        this.lockstock = lockstock;
    }
}