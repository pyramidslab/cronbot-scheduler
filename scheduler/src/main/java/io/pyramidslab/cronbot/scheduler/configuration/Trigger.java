package io.pyramidslab.cronbot.scheduler.configuration;

import java.util.Date;

public interface Trigger {
    Date nextExecutionTime(TriggerContext triggerContext);
}
