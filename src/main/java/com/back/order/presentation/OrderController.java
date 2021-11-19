package com.back.order.presentation;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(value = "*")
@RequestMapping("/api/orders")
@RestController
public class OrderController {
}
