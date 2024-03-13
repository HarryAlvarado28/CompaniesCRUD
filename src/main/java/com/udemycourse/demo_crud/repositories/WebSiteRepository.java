package com.udemycourse.demo_crud.repositories;

import com.udemycourse.demo_crud.entities.WebSite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WebSiteRepository extends JpaRepository<WebSite, Long> {
}
