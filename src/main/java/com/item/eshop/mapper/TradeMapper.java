package com.item.eshop.mapper;

import com.item.eshop.model.Trade;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TradeMapper {
    int deleteByPrimaryKey(String id);

    int insert(Trade record);

    int insertSelective(Trade record);

    Trade selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Trade record);

    int updateByPrimaryKey(Trade record);

    // add  : chan   2018/4/4
    List<Trade> selectByUser(Integer user_id,Integer page,Integer num);

    List<Trade> selectByStatus(Integer status,Integer page,Integer num);

    List<Trade> selectMore(Integer page,Integer num);

    // add : chan 2018-4-21
    List<Trade> selectByUserAndStatus(Integer user_id,Integer status, Integer page, Integer num);

    Trade selectByIdAndUserId(String id,Integer user_id);

    // add: chan 2018-5-7
    List<Trade> selectBySet(Integer user_id,String status);

    List<Trade> selectBySets(String status,Integer page,Integer num);

    Integer updateTradeSuccess();

    int updateByIdAndStatusOne(String tradeId);

    //add zheng 2019/6/28

    /**
     * @return 当日所有订单 list<trade>
     */
    List<Trade> selectTodayTrade();
    /**
     * @return 当月所有订单 list<trade>
     */
    List<Trade> selectToMonthTrade();
    /**
     * @return 上月所有订单 list<trade>
     */
    List<Trade> selectLastMonthTrade();
    /**
     * @return 当年所有订单 list<trade>
     */
    List<Trade> selectToYearTrade();

}