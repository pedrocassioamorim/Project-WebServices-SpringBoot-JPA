package com.potiratech.course.config;

import com.potiratech.course.entites.Category;
import com.potiratech.course.entites.Order;
import com.potiratech.course.entites.User;
import com.potiratech.course.enums.OrderStatus;
import com.potiratech.course.repositories.CategoryRepository;
import com.potiratech.course.repositories.OrderRepository;
import com.potiratech.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;


    @Override
    public void run(String... args) throws Exception {

        Category c1 = new Category(null, "Electronics");
        Category c2 = new Category(null, "Books");
        Category c3 = new Category(null, "Computers");


        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2020-07-20T14:52:07Z"), OrderStatus.DELIVERED, u2);
        Order o3 = new Order(null, Instant.parse("2021-04-10T14:50:00Z"), OrderStatus.WAITING_PAYMENT, u1);



        userRepository.saveAll(Arrays.asList(u1,u2));
        orderRepository.saveAll(Arrays.asList(o1,o2,o3));
        categoryRepository.saveAll(Arrays.asList(c1, c2, c3));
    }
}
