package com.haotam.giupviec.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
class WorkerController {

    @GetMapping("/workers")
    fun showWorkers(model: Model) : String {
        
    }

}
