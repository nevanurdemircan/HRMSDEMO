package com.hrms.controller;

import com.hrms.entities.JobPosition;
import com.hrms.service.JobPositionService;
import lombok.RequiredArgsConstructor;
import net.bytebuddy.agent.builder.AgentBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api-job-position")
public class JobPositionController {
    private final JobPositionService jobPositionService;

    @GetMapping("fetch-all")
    public List<JobPosition>allJobPosition(){
        return this.jobPositionService.findAll();
    }


    @GetMapping("fetch-one")
    public JobPosition fetchOne(@RequestParam long id){
        return this.jobPositionService.findOne(id);

    }
    @PutMapping("update")
    public JobPosition update(@RequestBody JobPosition jobPosition){
        return this.jobPositionService.update(jobPosition);
    }
    @PostMapping ("save")
    public JobPosition save(@RequestBody JobPosition jobPosition){
        return this.jobPositionService.save(jobPosition);

    }
    @DeleteMapping("delete")
    public ResponseEntity delete(@RequestBody JobPosition jobPosition){
        return new ResponseEntity(HttpStatus.OK);
    }
    }

