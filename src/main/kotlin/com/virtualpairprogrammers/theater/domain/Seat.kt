package com.virtualpairprogrammers.theater.domain

import java.math.BigDecimal
import javax.persistence.*

@Entity
data class Seat(@Id @GeneratedValue(strategy = GenerationType.AUTO)
                val id: Long,
                @Column(name="SEAT_ROW")
                val row: Char,
                val num: Int,
                val price: BigDecimal,
                val description: String) {

    @OneToMany(mappedBy = "seat")
    lateinit var bookings: List<Booking>

    override fun toString(): String = "Seat $row-$num $$price ($description)"
}
