package com.example.Lab2;

import org.springframework.beans.factory.annotation.Autowired;
@RestController
@RequestMapping("/banks")
public class BankController {
    @Autowired
    private BankRepository bankRepository;

    @PostMapping
    public Bank saveBank(@RequestBody Bank bank) {
        return bankRepository.save(bank);
    }

    @GetMapping("/{id}")
    public Bank getBank(@PathVariable String id) {
        return bankRepository.findById(id).orElse(null);
    }
}
