package com.microsoft.azure.springcloudplayground.metadata;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.springcloudplayground.service.ServiceCapability;
import com.microsoft.azure.springcloudplayground.service.ServiceCapabilityType;
import lombok.Setter;

public class TextCapability extends ServiceCapability<String> {

    @Setter
    private String content;

    @JsonCreator
    public TextCapability(@JsonProperty("id") String id) {
        this(id, null, null);
    }

    public TextCapability(String id, String title, String description) {
        super(id, ServiceCapabilityType.TEXT, title, description);
    }

    @Override
    public String getContent() {
        return this.content;
    }

    @Override
    public void merge(String otherContent) {
        if (otherContent != null) {
            this.content = otherContent;
        }
    }
}
