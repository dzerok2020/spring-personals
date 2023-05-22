package com.khanhblogvn.personal.services;

import com.khanhblogvn.personal.entities.Wallet;

public interface WalletService {
    public void addWallet(Wallet wallet);
    public void addMoney(Long id, Double amount);
    public void subtractMoney(Long id, Double amount);
    public void transferMoney(Long id1, Long id2, Double amount);
    public void setImage(Long id, String image);
    public void deleteWallet(Long id);
    public Wallet getWallet(Long id);
}
