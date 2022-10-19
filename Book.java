package com.example.projectsc;

import javax.persistence.*;

@Entity
@Table(name="books")

public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 45)
    private String email;

    @Column(name = "vehicle_no", nullable = false, length = 20)
    private String vehicleno;

    @Column(name = "vehicle_type", nullable = false, length = 20)
    private String vehicletype;

    @Column(name = "service_type", nullable = false, length = 30)
    private String servicetype;

    @Column(name = "date", nullable = false, length = 10)
    private String date;

    @Column(name = "time", nullable = false, length = 10)
    private String time;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getVehicleno() {
        return vehicleno;
    }

    public void setVehicleno(String vehicleno) {
        this.vehicleno = vehicleno;
    }

    public String getVehicletype() {
        return vehicletype;
    }

    public void setVehicletype(String vehicletype) {
        this.vehicletype = vehicletype;
    }

    public String getServicetype() {
        return servicetype;
    }

    public void setServicetype(String servicetype) {
        this.servicetype = servicetype;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", vehicleno='" + vehicleno + '\'' +
                ", vehicletype='" + vehicletype + '\'' +
                ", servicetype='" + servicetype + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                '}';
    }

}
