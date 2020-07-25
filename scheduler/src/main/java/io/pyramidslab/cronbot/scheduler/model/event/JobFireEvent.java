package io.pyramidslab.cronbot.scheduler.model.event;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class JobFireEvent {
    @Id
    private String pluginId;
    private String name;
    private String status;
}
