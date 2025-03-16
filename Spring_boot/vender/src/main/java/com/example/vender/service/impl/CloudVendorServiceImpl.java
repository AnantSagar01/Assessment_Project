package com.example.vender.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.vender.model.CloudVendor;
import com.example.vender.repository.CloudVenderRepository;
import com.example.vender.service.CloudVendorService;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {

    CloudVenderRepository cloudVenderRepository;

    public CloudVendorServiceImpl(CloudVenderRepository cloudVenderRepository){
        this.cloudVenderRepository = cloudVenderRepository;
    }

    @Override
    public String createCloudVendor(CloudVendor cloudVendor){
        cloudVenderRepository.save(cloudVendor);
        return "Success";
    }
    @Override
    public String updateCloudVendor(CloudVendor cloudVendor){
        cloudVenderRepository.save(cloudVendor);
        return "Success";
    }
    @Override
    public CloudVendor getcloudVendor(String cloudVendorId) {
        return cloudVenderRepository.findById(cloudVendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        return cloudVenderRepository.findAll(); 
    }

    @Override
    public String deleteCloudVendor(String cloudVendorId) {
        cloudVenderRepository.deleteById(cloudVendorId);
        return "success";
    }

}
