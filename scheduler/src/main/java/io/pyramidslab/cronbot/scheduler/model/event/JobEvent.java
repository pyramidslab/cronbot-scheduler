package io.pyramidslab.cronbot.scheduler.model.event;

import io.pyramidslab.cronbot.scheduler.model.job.Job;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class JobEvent {
    private String event;
    @Getter(value = AccessLevel.NONE)
    @Setter(value = AccessLevel.NONE)
    private String _class;
    private Job object;

    

}
