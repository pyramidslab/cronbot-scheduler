package io.pyramidslab.cronbot.scheduler.configuration;

import java.util.Date;

public interface TriggerContext {
    Date lastScheduledExecutionTime();

    Date lastActualExecutionTime();

    Date lastCompletionTime();
}
