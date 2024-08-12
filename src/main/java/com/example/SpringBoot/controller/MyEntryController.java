package com.example.SpringBoot.controller;

import com.example.SpringBoot.entity.MyEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RestController
@RequestMapping("/my")
public class MyEntryController {
    private Map<Long, MyEntry> myEntries = new HashMap<>();

    @GetMapping
    public List<MyEntry>getAll(){
        return new ArrayList<>(myEntries.values());
    }

    @PostMapping
    public boolean createEntry(@RequestBody MyEntry myEntry){
        myEntries.put(myEntry.getId(),myEntry);
        return true;
    }

    @GetMapping("/id/{myId}")
    public MyEntry getJournalEntryById(@PathVariable Long myId ){
        return myEntries.get(myId);
    }

    @DeleteMapping("/id/{myId}")
    public MyEntry deleteJournalEntryById(@PathVariable Long myId ){
        return myEntries.remove(myId);
    }

    @PutMapping("/id/{id}")
    public MyEntry updateJournalEntryById(@PathVariable Long id, @RequestBody MyEntry myEntry){
        return myEntries.put(id,myEntry);
    }

}
