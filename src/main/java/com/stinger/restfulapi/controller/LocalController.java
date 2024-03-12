package com.stinger.restfulapi.controller;

import com.stinger.restfulapi.entity.Local;
import com.stinger.restfulapi.error.LocalNotFoundException;
import com.stinger.restfulapi.service.LocalService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

public class LocalController {
    @Autowired
    LocalService localService;
    @GetMapping("/findAllLocals")
    public List<Local> findAllLocals(){
        return localService.findAllLocals();
    }

    @GetMapping("/findLocalByName")
    Optional<Local> findLocalByNameWithJPQL(@RequestParam String name){
        return localService.findLocalByNameIgnoreCase(name);
    }

    @GetMapping("/findLocalById/{id}")
    public Local findLocalById(@PathVariable Long id) throws LocalNotFoundException {
        return localService.findLocalById(id);
    }

    @PostMapping("/saveLocal")
    public Local saveLocal(@Valid @RequestBody Local local){
        return localService.saveLocal(local);
    }

    @PutMapping("/updateLocal/{id}")
    public Local updateLocal(@PathVariable Long id, @RequestBody Local local){
        return localService.updateLocal(id, local);
    }

    @DeleteMapping("deleteLocal/{id}")
    public String deleteLocal(@PathVariable Long id){
        localService.deleteLocal(id);
        return "Deleted Local";
    }

}
