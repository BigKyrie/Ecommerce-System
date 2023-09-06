package com.wei.ecommercesystem.db.dao;

import com.wei.ecommercesystem.db.po.SeckillActivity;

import java.util.List;

/**
 * @description:
 * @author: Yuheng Wei
 */
public interface SeckillActivityDao {
    public List<SeckillActivity> querySeckillActivitysByStatus(int activityStatus);

    public void inertSeckillActivity(SeckillActivity seckillActivity);

    public SeckillActivity querySeckillActivityById(long activityId);

    public void updateSeckillActivity(SeckillActivity seckillActivity);

    public boolean lockStock(long activityId);

    public boolean deductStock(Long seckillActivityId);

}
