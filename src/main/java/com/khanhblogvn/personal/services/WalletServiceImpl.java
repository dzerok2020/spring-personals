package com.khanhblogvn.personal.services;

import com.khanhblogvn.personal.entities.Wallet;
import com.khanhblogvn.personal.repositories.WalletRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WalletServiceImpl implements WalletService {
    private final WalletRepository walletRepository;

    @Override
    public void addWallet(Wallet wallet) {
        walletRepository.save(wallet);
    }

    @Override
    public void addMoney(Long id, Double amount) {

    }

    @Override
    public void subtractMoney(Long id, Double amount) {

    }

    @Override
    public void transferMoney(Long id1, Long id2, Double amount) {

    }

    @Override
    public void setImage(Long id, String image) {

    }

    @Override
    public void deleteWallet(Long id) {

    }

    @Override
    public Wallet getWallet(Long id) {
        return walletRepository.findById(id).orElse(null);
    }
}
