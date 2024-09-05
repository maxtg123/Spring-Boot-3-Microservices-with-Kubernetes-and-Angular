package com.phong.microservice.notification_service.order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderPlacedEvent {
        private String orderNumber;
        private String email;
}
