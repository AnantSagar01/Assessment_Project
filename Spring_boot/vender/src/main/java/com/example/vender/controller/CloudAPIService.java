package com.example.vender.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.vender.model.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")
public class CloudAPIService {
    CloudVendor cloudVendor;

    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId){
        // return new CloudVendor("C1","Vendor 1","Bangalore","8877474528");
        return cloudVendor;
    }
    @PostMapping
    public String createCloudVanderDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "Cloud Vandor Created";
    }
    @PutMapping
    public String updateCloudVanderDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "Cloud Vandor Updated";
    }
    @DeleteMapping("{vendorId}")
    public String deleteCloudVanderDetails(String vendorId){
        this.cloudVendor = null;
        return "Cloud Vandor deleted";
    }


}
