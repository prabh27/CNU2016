package com.devfactory.assignment4.repository;

import com.devfactory.assignment4.model.OrderProduct;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by vaibhavtulsyan on 09/07/16.
 */
public interface OrderProductRepository extends CrudRepository<OrderProduct, Integer> {

}
