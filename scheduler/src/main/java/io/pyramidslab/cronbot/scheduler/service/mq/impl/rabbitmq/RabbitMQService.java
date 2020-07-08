package io.pyramidslab.cronbot.scheduler.service.mq.impl.rabbitmq;

import io.pyramidslab.cronbot.scheduler.error.MQException;
import io.pyramidslab.cronbot.scheduler.service.mq.IMessageQueueService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service("rabbitMQ")
public class RabbitMQService implements IMessageQueueService {

    private AmqpTemplate rabbitTemplate;
    private Queue queue;

    @Autowired
    public RabbitMQService(AmqpTemplate rabbitTemplate, Queue queue){
        this.rabbitTemplate = rabbitTemplate;
        this.queue = queue;
    }

    public <T> void send(T obj) throws MQException {
        try {
            rabbitTemplate.convertAndSend(queue.getName(), obj);
            log.info("Message {} sent to queue {}", obj, queue.getName());
        }catch (AmqpException ex){
            log.error("Failed to send message to queue {}",queue.getName());
            throw new MQException(ex);
        }

    }

    @Override
    @RabbitListener(queues = "${mq.queuename}")
    public void receive(String msg) throws MQException {
        System.out.println(msg);
    }
}
