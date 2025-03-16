package com.example.vender.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.vender.model.CloudVendor;
import com.example.vender.service.CloudVendorService;

@RestController
@RequestMapping("/cloudvendor")
public class CloudAPIService {
    CloudVendorService cloudVendorService;

    public CloudAPIService(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId){
        // return new CloudVendor("C1","Vendor 1","Bangalore","8877474528");
        
        return cloudVendorService.getcloudVendor(vendorId);
    }
    @GetMapping()
    public List<CloudVendor> getAllCloudVendorDetails(){
        // return new CloudVendor("C1","Vendor 1","Bangalore","8877474528");
    
        return cloudVendorService.getAllCloudVendors();
    }
    @PostMapping
    public String createCloudVanderDetails(@RequestBody CloudVendor cloudVendor){
        cloudVendorService.createCloudVendor(cloudVendor);
        return "Cloud Vandor Created";
    }
    @PutMapping
    public String updateCloudVanderDetails(@RequestBody CloudVendor cloudVendor){
        cloudVendorService.updateCloudVendor(cloudVendor);
        return "Cloud Vandor Updated";
    }
    @DeleteMapping("{vendorId}")
    public String deleteCloudVanderDetails(@PathVariable("vendorId") String vendorId){
        cloudVendorService.deleteCloudVendor(vendorId);
        return "Cloud Vandor deleted";
    }


}
