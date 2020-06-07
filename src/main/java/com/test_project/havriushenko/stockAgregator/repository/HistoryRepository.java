package com.test_project.havriushenko.stockAgregator.repository;

import com.test_project.havriushenko.stockAgregator.model.HistoryModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoryRepository extends JpaRepository<HistoryModel, Integer> {
}
