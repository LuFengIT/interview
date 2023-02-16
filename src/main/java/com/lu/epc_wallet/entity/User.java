package com.lu.epc_wallet.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 用户实体类
 * id 用户id
 * balance 用户余额
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class User {
    private Integer id;
    private Double balance;

}
