package com.example.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpa.entity.Document;

public interface DocumentRepository extends JpaRepository<Document, Long>{

}
