package com.github.zipcodewilmington.casino.games.PracticeGamesAndPlayerClasses;

import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.casino.CasinoAccountPractice;
import com.github.zipcodewilmington.casino.PlayerInterface;

public class RoulettePlayerPractice implements PlayerInterface {
    Object casinoAccount;
    Integer balance;

    public RoulettePlayerPractice(CasinoAccountPractice casinoAccount){
        this.casinoAccount = casinoAccount;
        this.balance = casinoAccount.getBalance();
    }

    @Override
    public CasinoAccount getArcadeAccount() {

        return (CasinoAccount) this.casinoAccount;
    }

    @Override
    public <SomeReturnType> SomeReturnType play() {
        return null;
    }

    @Override
    public void Garbage() {

    }

    @Override
    public void CasinoAccount() {

    }

    @Override
    public void setBet() {

    }

    @Override
    public void cashIn() {

    }

    @Override
    public void cashOut() {

    }
}
