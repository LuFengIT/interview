package com.lu.epc_wallet.controller;

import com.lu.epc_wallet.entity.WalletDesc;
import com.lu.epc_wallet.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController

public class UserController {
    @Resource
    private UserService userService;

    /**
     * 查询用户余额接口
     *
     * @param id 用户id
     * @return
     */
    @RequestMapping("selectbalance/{id}")
    public String SelectBalance(@PathVariable("id") Integer id) {
        return "钱包余额为：" + userService.walletBalance(id);
    }

    /**
     * 用户消费接口
     *
     * @param id    用户id
     * @param money 消费金额
     * @return
     */
    @RequestMapping("expense/{id}")
    public String Expense100(@PathVariable("id") Integer id, Double money) {
        money = -100.0;
        if (userService.walletBalance(id) + money < 0) {
            return "余额不足，当前余额为：" + userService.walletBalance(id);
        }

        userService.walletExpenseOrRefund(id, money);
        userService.walletDesc(id, money.toString());
        return "消费成功，消费后余额为：" + userService.walletBalance(id);

    }

    /**
     * 用户退款接口
     *
     * @param id    用户id
     * @param money 退款金额
     * @return
     */
    @RequestMapping("refund/{id}")
    public String Refund20(@PathVariable("id") Integer id, Double money) {
        money = 20.0;
        userService.walletExpenseOrRefund(id, money);
        String str = "+" + money;
        userService.walletDesc(id, str);
        return "退款成功，退款后余额为：" + userService.walletBalance(id);
    }

    /**
     * 查询账户信息变动接口
     *
     * @return
     */
    @RequestMapping("walletInfo")
    public List<WalletDesc> walletInfo() {
        return userService.walletInfo();
    }


}
