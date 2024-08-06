package com.example.SpringBoot.controllers;

import com.example.SpringBoot.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {


    @GetMapping
    public List<JournalEntry>getAll(){
        return null;
    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry journalEntry){
        return true;
    }

    @GetMapping("/id/{myId}")
    public JournalEntry getJournalEntryById(@PathVariable Long myId ){
        return null;
    }

    @DeleteMapping("/id/{myId}")
    public JournalEntry deleteJournalEntryById(@PathVariable Long myId ){

        return null;
    }

    @PutMapping("/id/{id}")
    public JournalEntry updateJournalEntryById(@PathVariable Long id, @RequestBody JournalEntry myEntry){
        return null;
    }

}
