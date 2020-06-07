package com.test_project.havriushenko.stockAgregator.repository;

import com.test_project.havriushenko.stockAgregator.model.QuoteModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuoteRepository extends JpaRepository<QuoteModel, Integer> {
}
