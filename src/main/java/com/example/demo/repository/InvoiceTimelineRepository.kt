package com.example.demo.repository

import com.example.demo.entity.InvoiceTimeline
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface InvoiceTimelineRepository : JpaRepository<InvoiceTimeline, Long> {

}