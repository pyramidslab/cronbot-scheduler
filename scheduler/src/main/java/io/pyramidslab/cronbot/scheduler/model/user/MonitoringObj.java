package io.pyramidslab.cronbot.scheduler.model.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;

@Data
public class MonitoringObj {
    @JsonProperty("created_at")
    private Date createdAt;
    @JsonProperty("created_by")
    private String createdBy;
    @JsonProperty("last_modified_at")
    private Date lastModifiedAt;
    @JsonProperty("last_modified_by")
    private String lastModifiedBy;
    private boolean enabled;


}
