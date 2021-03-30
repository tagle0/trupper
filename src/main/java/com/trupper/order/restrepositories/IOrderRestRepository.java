package com.trupper.order.restrepositories;

import com.trupper.order.model.Order;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "orders", path = "order")
public interface IOrderRestRepository extends PagingAndSortingRepository<Order, Integer>{
    
}
