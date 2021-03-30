package com.trupper.order.restrepositories;

import com.trupper.order.model.OrderDetail;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "orderDetails", path = "orderDetails")
public interface IOrderDetailRestRespository extends PagingAndSortingRepository<OrderDetail, Integer>{
    
}
