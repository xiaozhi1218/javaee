package com.itheima.service;

import com.itheima.dao.AccountDao;

/**
 * 包名:com.itheima.service
 * @author Leevi
 * 日期2020-10-16  11:14
 * 方法的参数该怎么分析?
 * 就看方法中的代码需要哪些东西,就由调用者传入哪些东西
 */
public class AccountService {
    private AccountDao accountDao = new AccountDao();
    public void transfer(String fromName,String toName,Double money) throws Exception {
        //2. 处理转账
        //2.1 转出账户扣款
        accountDao.updateAccount(-money,fromName);

        //转账过程中出现异常
        //int num = 10/0;

        //2.2 转入账户收款
        accountDao.updateAccount(money,toName);
    }
}
