package com.khanhblogvn.personal.controller;

import com.khanhblogvn.personal.entities.Wallet;
import com.khanhblogvn.personal.services.WalletService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
@Slf4j
public class HomeController {
    private final WalletService walletService;

    @GetMapping("/")
    public String home(Model model){
        Wallet wallet = walletService.getWallet(1L);
        if (wallet == null) {
            walletService.addWallet(new Wallet(null, 10000D, "https://www.pngitem.com/pimgs/m/146-1468479_my-profile-icon-blank-profile-picture-circle-hd.png"));
            wallet = walletService.getWallet(1L);
        }
        model.addAttribute("wallet", wallet);
        return "index";
    }
}
