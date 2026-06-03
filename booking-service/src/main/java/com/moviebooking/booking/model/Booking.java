package com.moviebooking.booking.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "bookings")
@Data
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
    private Long movieId;
    private Integer seatCount;
    private Double totalAmount;
    private String seatNumbers;
    private LocalDateTime bookingTime;
    private String status;
}