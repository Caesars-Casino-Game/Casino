package com.github.zipcodewilmington;

import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.casino.CasinoAccountManager;
import org.junit.Assert;
import org.junit.Test;

public class testCasinoAccountManager {
    CasinoAccountManager casinoAccountManager = new CasinoAccountManager();
    @Test
    public void testCreateAccount() {
        String accountName = "Eugene";

        CasinoAccount casinoAccount = new CasinoAccountManager().createAccount("Eugene","Shin", 2000);

        Assert.assertEquals(accountName,casinoAccount.getAccountName());
    }

    @Test
    public void testRegisterAccount() {
        CasinoAccount casinoAccount = new CasinoAccount("Eugene","Shin", 2000);

        casinoAccountManager.registerAccount(casinoAccount);

        Assert.assertEquals(casinoAccount,casinoAccountManager.getAccount("Eugene", "Shin"));
    }


}
