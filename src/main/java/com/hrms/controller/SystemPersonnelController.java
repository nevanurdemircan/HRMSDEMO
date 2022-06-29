package com.hrms.controller;

import com.hrms.entities.SystemPersonnel;
import com.hrms.entities.User;
import com.hrms.service.SystemPersonnelService;
import com.hrms.service.impl.SystemPersonnelServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api-system-personnel")
public class SystemPersonnelController {
    private final SystemPersonnelService systemPersonnelService;
    @GetMapping("fetch-all")
    public List<SystemPersonnel> allSystemPersonnel() {
        return this.systemPersonnelService.findAll();
    }
    @GetMapping("fetch-one")
    public  SystemPersonnel fetchOne(@RequestParam Long id){
        return this.systemPersonnelService.findOne(id);
    }
    @PostMapping("save")
    public SystemPersonnel save(@RequestBody SystemPersonnel systemPersonnel) {
        return this.systemPersonnelService.save(systemPersonnel);

    }
    @PutMapping("update")
    public  SystemPersonnel update(@RequestBody SystemPersonnel systemPersonnel){
    return this.systemPersonnelService.update(systemPersonnel);
    }
    @DeleteMapping ("delete")
    public ResponseEntity delete(@RequestBody SystemPersonnel systemPersonnel){
        this.systemPersonnelService.delete(systemPersonnel);
        return new ResponseEntity(HttpStatus.OK);
    }
}
