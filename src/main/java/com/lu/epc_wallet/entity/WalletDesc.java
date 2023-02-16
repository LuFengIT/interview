package com.lu.epc_wallet.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
/**
 * 用户钱包金额变动实体类 WalletDesc
 * 用户id uid
 * 金额变动 money_change
 * 变动时间 change_time
 */
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class WalletDesc {
    private Integer id;
    private Integer uid;
    private String money_change;
    private Date change_time;
}
