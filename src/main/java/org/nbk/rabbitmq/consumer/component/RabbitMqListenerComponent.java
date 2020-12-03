package org.nbk.rabbitmq.consumer.component;

import org.nbk.rabbitmq.consumer.domain.Employee;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMqListenerComponent {

    @RabbitListener(queues = "events.queue")
    public void recievedMessage(Employee employee) throws Exception {
	System.out.println("Recieved Message From RabbitMQ: " + employee);
	throw new Exception();
    }

}
