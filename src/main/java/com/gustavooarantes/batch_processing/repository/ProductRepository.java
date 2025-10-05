package com.gustavooarantes.batch_processing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavooarantes.batch_processing.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

}
