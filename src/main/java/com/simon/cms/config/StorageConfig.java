package com.simon.cms.config;


import org.springframework.context.annotation.Configuration;

@Configuration("storage")
public class StorageConfig {

  // Nom du dossier d'upload
  private String location = "upload-dir";

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }
}
