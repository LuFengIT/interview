package com.lu.epc_wallet.mapper;

import com.lu.epc_wallet.entity.WalletDesc;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    /**
     * 根据用户id查询钱包余额
     *
     * @param id
     * @return
     */
    Double walletBalance(Integer id);

    /**
     * 用户余额变动
     *
     * @param id    用户id
     * @param money 变动金额
     * @return
     */

    Integer walletExpenseOrRefund(Integer id, Double money);

    /**
     * 钱包金额变动详情
     *
     * @param uid 用户id
     * @param str 变动数额
     * @return
     */

    Integer walletDesc(Integer uid, String str);

    /**
     * 查询变动明细
     *
     * @return
     */
    List<WalletDesc> walletInfo();
}
