package com.banking.controller;

import com.banking.model.Account;
import com.banking.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping
    public Account createAccount(@RequestBody Account account) {
        return accountService.createAccount(account);
    }

    @PostMapping("/{id}/deposit")
    public BigDecimal deposit(@PathVariable Long id, @RequestBody BigDecimal amount) {
        return accountService.deposit(id, amount);
    }

    @PostMapping("/{id}/withdraw")
    public BigDecimal withdraw(@PathVariable Long id, @RequestBody BigDecimal amount) {
        return accountService.withdraw(id, amount);
    }

    @PostMapping("/{sourceId}/transfer/{targetId}")
    public BigDecimal transfer(@PathVariable Long sourceId, @PathVariable Long targetId, @RequestBody BigDecimal amount) {
        return accountService.transfer(sourceId, targetId, amount);
    }
}
