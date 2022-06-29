package com.hrms.controller;

import com.hrms.entities.JobSeeker;
import com.hrms.service.JobSeekerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api-job-seeker")
public class JobSeekerController {
    private final JobSeekerService jobSeekerService;
@GetMapping("fetch-all")
    public List<JobSeeker>allJobSeeker(){
    return this.jobSeekerService.findAll();

}
@GetMapping("fetch-one")
    public JobSeeker fetchOne(@RequestParam Long id){
    return this.jobSeekerService.findOne(id);
}
@PostMapping("save")
    public JobSeeker save(@RequestBody JobSeeker jobSeeker){
    return this.jobSeekerService.save(jobSeeker);
}
@PutMapping("update")
    public JobSeeker update(@RequestBody JobSeeker jobSeeker){
    return this.jobSeekerService.update(jobSeeker);
}
@DeleteMapping("delete")
    public ResponseEntity delete(@RequestBody JobSeeker jobSeeker){
    this.jobSeekerService.delete(jobSeeker);
    return new ResponseEntity(HttpStatus.OK);
}

}
