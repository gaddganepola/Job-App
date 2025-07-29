package com.experts.JobApp.controller;

import com.experts.JobApp.model.JobPost;
import com.experts.JobApp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JobController {

    @Autowired
    private JobService service;

    @RequestMapping({"/", "home"})
    public String home() {
        return "home";
    }

    @RequestMapping("addjob")
    public String addJob() {
        return "addjob";
    }

    @RequestMapping("handleForm")
    public String handleForm(JobPost jobPost) {
        service.addJob(jobPost);
        return "success";
    }

}
