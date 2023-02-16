package com.lu.epc_wallet.service.impl;

import com.lu.epc_wallet.entity.WalletDesc;
import com.lu.epc_wallet.mapper.UserMapper;
import com.lu.epc_wallet.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public Double walletBalance(Integer id) {
        return userMapper.walletBalance(id);
    }

    @Override
    public Integer walletExpenseOrRefund(Integer id, Double money) {
        return userMapper.walletExpenseOrRefund(id,money);
    }

    @Override
    public List<WalletDesc> walletInfo() {
        return userMapper.walletInfo();
    }

    @Override
    public Integer walletDesc(Integer uid,String str) {
        return userMapper.walletDesc(uid,str);
    }


}
