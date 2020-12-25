package com.thearchibold.kotlinserver.resources

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1")
class IndexController {

    @GetMapping("/home")
    fun init():String{


    return "home is working"
    }

}