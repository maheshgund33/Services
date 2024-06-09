package org.example.paymentservice.service;

import org.example.paymentservice.model.Payment;
import org.example.paymentservice.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;

    public Payment processPayment(Payment payment) {
        payment.setStatus("SUCCESS");
        return paymentRepository.save(payment);
    }
}
