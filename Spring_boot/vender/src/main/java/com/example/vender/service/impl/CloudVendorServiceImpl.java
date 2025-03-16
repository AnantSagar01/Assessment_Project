package com.example.vender.service.impl;

import com.example.vender.model.CloudVendor;
import com.example.vender.repository.CloudVenderRepository;

public interface CloudVendorServiceImpl implements CloudVendorService {

    CloudVenderRepository cloudVenderRepository;

    public CloudVendorSericeImpl(CloudVenderRepository cloudVenderRepository){
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
    public String deleteCloudVendor(CloudVendor cloudVendor){
        cloudVenderRepository.save(cloudVendor);
        return "Success";
    }
    @Override
    public Cloudvendor getCloudvendor(String cloudVendor){
        
        return cloudVenderRepository.findById(cloudVendorId).get();
    }
    @Override
    public List<CloudVendor> getAllCloudVendors(){
        return  cloudVenderRepository.findAll();
    }

}
