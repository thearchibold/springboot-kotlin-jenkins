package com.thearchibold.kotlinserver.resources

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1")
class IndexController {

    @GetMapping("/home")
    fun init(
            @RequestParam("name") name: String
    ): String{
        return "Welcome ${name}"
    }

}