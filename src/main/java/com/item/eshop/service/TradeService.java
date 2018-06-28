package com.item.eshop.service;

import com.item.eshop.model.Trade;
import com.item.eshop.model.TradeReport;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TradeService {
    int deleteByPrimaryKey(String id);

    String insert(Trade record);

    int insertSelective(Trade record);

    Trade selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Trade record);

    int updateByPrimaryKey(Trade record);

    // add  : chan   2018/4/4
    List<Trade> selectByUser(Integer user_id, Integer page, Integer num);

    List<Trade> selectByStatus(Integer status,Integer page,Integer num);

    List<Trade> selectMore(Integer page,Integer num);

    // add : chan 2018-4-21
    List<Trade> selectByUserAndStatus(Integer user_id,Integer status,Integer page, Integer num);

    Trade selectByIdAndUserId(String id,Integer user_id);

    // add: chan 2018-5-7
    List<Trade> selectBySet(Integer user_id,String status);

    List<Trade> selectBySets(String status,Integer page,Integer num);

    int updateByIdAndStatusOne(String tradeId);


    //add zheng 2018-6-7

    /**
     *
     * @param sellerId 商家id
     * @return 返回tradeReport 日报表
     */
    List<TradeReport>  selectTodayTradeBySellerId(Integer sellerId);

    /**
     * 月报表，月报表相对于日报表来说，可以看到与上个月相比情况
     * @param sellerId 商家id
     * @return 返回tradeReport 月报表
     */
    List<TradeReport>  selectMonthTradeBySellerId(Integer sellerId);

    /**
     * 月报表，月报表相对于日报表来说，可以看到与上个月相比情况
     * @param sellerId 商家id
     * @return 返回tradeReport 年报表
     */
    List<TradeReport>  selectYearTradeBySellerId(Integer sellerId);

    /**
     * 曲线图，以1个月内的每天营业额统计,下标每隔5天显示一次
     * List<Integer> getdayChart(Day day)
     **/

}
