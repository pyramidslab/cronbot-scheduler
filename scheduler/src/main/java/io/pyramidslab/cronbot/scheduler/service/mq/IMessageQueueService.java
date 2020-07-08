package io.pyramidslab.cronbot.scheduler.service.mq;

import io.pyramidslab.cronbot.scheduler.error.MQException;
import org.springframework.amqp.core.Message;

public interface IMessageQueueService {
    /**
     * Send an object after convert it to json
     * @param obj Object to be sent
     * @throws MQException Throws an exception if something went wrong
     */
    <T> void send(T obj) throws MQException;

    /**
     * Receive an event message
     * @param msg
     * @throws MQException
     */
    void receive(String msg) throws MQException;
}