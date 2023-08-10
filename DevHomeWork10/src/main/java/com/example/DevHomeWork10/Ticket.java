//package com.example.DevHomeWork10;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import java.time.LocalDateTime;
//
//@Entity
//public class Ticket {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private LocalDateTime created_at;
//
//    private Long client_id;
//
//    private String from_planet_id;
//
//    private String to_planet_id;
//
//    public Ticket(LocalDateTime created_at) {
//        this.created_at = created_at;
//    }
//
//    public Ticket() {
//    }
//
//    public Ticket(Long id, LocalDateTime created_at, Long client_id, String from_planet_id, String to_planet_id) {
//        this.id = id;
//        this.created_at = created_at;
//        this.client_id = client_id;
//        this.from_planet_id = from_planet_id;
//        this.to_planet_id = to_planet_id;
//    }
//
//    @Override
//    public String toString() {
//        return "Ticket{" +
//                "id=" + id +
//                ", created_at=" + created_at +
//                ", client_id=" + client_id +
//                ", from_planet_id='" + from_planet_id + '\'' +
//                ", to_planet_id='" + to_planet_id + '\'' +
//                '}';
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public LocalDateTime getCreated_at() {
//        return created_at;
//    }
//
//    public void setCreated_at(LocalDateTime created_at) {
//        this.created_at = created_at;
//    }
//
//    public Long getClient_id() {
//        return client_id;
//    }
//
//    public void setClient_id(Long client_id) {
//        this.client_id = client_id;
//    }
//
//    public String getFrom_planet_id() {
//        return from_planet_id;
//    }
//
//    public void setFrom_planet_id(String from_planet_id) {
//        this.from_planet_id = from_planet_id;
//    }
//
//    public String getTo_planet_id() {
//        return to_planet_id;
//    }
//
//    public void setTo_planet_id(String to_planet_id) {
//        this.to_planet_id = to_planet_id;
//    }
//}

