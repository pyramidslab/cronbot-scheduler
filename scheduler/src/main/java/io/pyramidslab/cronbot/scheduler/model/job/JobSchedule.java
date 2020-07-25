package io.pyramidslab.cronbot.scheduler.model.job;

import lombok.Data;

import java.util.Date;

@Data
public class JobSchedule {
    private String cron;
    private Date start;
    private Date end;
}
