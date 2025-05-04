package org.example.nplusone.repository;

import org.example.nplusone.model.User;
import org.example.nplusone.model.UserOrderDTO;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface NplusOneRepository {
    @Query("SELECT u FROM User u JOIN FETCH u.orders")
    List<User> findAllWithOrders();



    @Query("SELECT new com.example.UserOrderDTO(u.id, u.name, o.id, o.amount) FROM User u JOIN u.orders o")
    List<UserOrderDTO> fetchUserOrders();
}


