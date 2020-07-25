package io.pyramidslab.cronbot.scheduler.model.job;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.pyramidslab.cronbot.scheduler.model.user.MonitoringObj;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Map;

@Data
@Document("jobs")
public class Job {
    private String id;
    private String name;
    private String description;
    private String status;
    private MonitoringObj monitoring;
    @JsonProperty("integration_id")
    private String integrationId;
    @JsonProperty("integration_properties")
    private Map<String, Object> integrationProperties;
    private JobSchedule schedule;

}
