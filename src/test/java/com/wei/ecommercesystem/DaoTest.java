package com.wei.ecommercesystem;

import com.wei.ecommercesystem.db.dao.SeckillActivityDao;
import com.wei.ecommercesystem.db.mappers.SeckillActivityMapper;
import com.wei.ecommercesystem.db.mappers.SeckillCommodityMapper;
import com.wei.ecommercesystem.db.po.SeckillActivity;
import com.wei.ecommercesystem.db.po.SeckillCommodity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @program: Ecommerce-System
 * @description:
 * @author: Yuheng Wei
 */
@SpringBootTest
public class DaoTest {
    @Resource
    private SeckillActivityMapper seckillActivityMapper;
    @Resource
    private SeckillCommodityMapper seckillCommodityMapper;
    @Autowired
    private SeckillActivityDao seckillActivityDao;
    @Test
    void SeckillActivityTest() {
        Date startTime = new Date();
        SeckillActivity seckillActivity = new SeckillActivity();
        seckillActivity.setName("testtest");
        seckillActivity.setCommodityId(999L);
        seckillActivity.setTotalStock(100L);
        seckillActivity.setSeckillPrice(new BigDecimal(99));
        seckillActivity.setActivitystatus(16);
        seckillActivity.setOldPrice(new BigDecimal(99));
        seckillActivity.setAvailablestock(100);
        seckillActivity.setLockstock(0L);
        Date endTime = new Date();
        seckillActivity.setStartTime(startTime);
        seckillActivity.setEndTime(endTime);
        seckillActivityMapper.insert(seckillActivity);
        System.out.println("====>>>>" +
                seckillActivityMapper.selectByPrimaryKey(1L));
    }

    @Test
    void SeckillCommodityTest(){
        SeckillCommodity seckillCommodity = new SeckillCommodity();
        seckillCommodity.setName("Banana");
        seckillCommodity.setDescription("haochi");
        seckillCommodity.setPrice(new BigDecimal(10));
        seckillCommodityMapper.insert(seckillCommodity);
    }

    @Test
    void setSeckillActivityQuery(){
        List<SeckillActivity> seckillActivitys =
                seckillActivityDao.querySeckillActivitysByStatus(0);
        System.out.println(seckillActivitys.size());
        seckillActivitys.stream().forEach(seckillActivity ->
                System.out.println(seckillActivity.toString()));
    }
}
