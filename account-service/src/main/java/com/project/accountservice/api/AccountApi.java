package com.project.accountservice.api;

import com.project.accountservice.entity.Account;
import com.project.accountservice.services.AccountService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RequestMapping("account")
@RestController
public class AccountApi {

    private final AccountService accountService;
    public AccountApi(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("{id}")
    public ResponseEntity<Account> get(@PathVariable String id){
        return ResponseEntity.ok(accountService.get(id));
    }
    @PostMapping
    public ResponseEntity<Account> save(@RequestBody Account account){
        return ResponseEntity.ok(accountService.save(account));
    }
    @PutMapping
    public ResponseEntity<Account> update(@PathVariable("id") String id,@RequestBody Account account){
        return ResponseEntity.ok(accountService.update(id,account));
    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable  String id){
        accountService.delete(id);
    }

    @GetMapping
    public ResponseEntity<List<Account>> getAll(){

        return ResponseEntity.ok(accountService.findALl());
    }

}