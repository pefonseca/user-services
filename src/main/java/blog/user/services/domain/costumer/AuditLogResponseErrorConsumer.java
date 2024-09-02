package blog.user.services.domain.costumer;

import blog.user.services.domain.service.UserService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class AuditLogResponseErrorConsumer {

    @Autowired private UserService userService;

    @RabbitListener(queues = {"audit-log-response-error-queue"})
    public void receive(@Payload Message message) {
        System.out.println("Message " + message + " " + LocalDateTime.now());
        String payload = String.valueOf(message.getPayload());

        userService.errorAuditLog(payload);
    }
}
