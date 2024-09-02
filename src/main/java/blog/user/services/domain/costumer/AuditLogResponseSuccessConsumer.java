package blog.user.services.domain.costumer;

import blog.user.services.domain.service.UserService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class AuditLogResponseSuccessConsumer {

    @Autowired private UserService service;

    @RabbitListener(queues = {"audit-log-response-success-queue"})
    public void receive(@Payload Message message) {
        String payload = String.valueOf(message.getPayload());
        service.successAuditLog(payload);
    }

}
