package com.callmepeace.lockorrock.health;

import com.callmepeace.lockorrock.common.ResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HealthCheckController {

    @GetMapping("/health/check")
    public ResponseDto healthCheck() {

        return ResponseDto.success("Healthy!");
    }
}
