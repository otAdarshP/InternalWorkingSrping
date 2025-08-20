package com.InternalWorking.InternalWorkingSrping;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "payment.provider", havingValue = "razorpay")
public class RazorPayPaymentService implements PaymentService{
    public String pay(){
        String payment = "Through Razorpay.";
        System.out.println ("Payment processed: ");
        return payment;
    }

}
