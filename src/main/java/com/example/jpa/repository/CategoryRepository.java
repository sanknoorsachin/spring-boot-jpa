package com.example.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.jpa.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	@Query(value="select b.brand_name from brand b  where b.brand_id in (select cb.brand_id from category_brand cb where cb.category_id in(select c.category_id from category c where c.category_name=:name) )",nativeQuery = true)
	public List<String> getBrandNameOnCategoryName(@Param("name") String name);

}
