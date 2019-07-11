package netcracker.homework.front.dao;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "client") //класс соответствующий таблице в базе данных
public class ClientDao {

    @Id
    private String id;

    @Column
    private String name;

    @Column
    private String surename;

    // refactor: use Enum
    @Column
    private String gender;

    @Column
    private String age;
}


