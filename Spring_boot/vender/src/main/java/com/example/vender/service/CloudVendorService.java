package com.example.vender.service;

import java.util.List;

import com.example.vender.model.CloudVendor;

public interface CloudVendorService {
    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public String deleteCloudVendor(String cloudVendorId);
    public CloudVendor getcloudVendor(String cloudVendorId);
    public List<CloudVendor> getAllCloudVendors();
}
