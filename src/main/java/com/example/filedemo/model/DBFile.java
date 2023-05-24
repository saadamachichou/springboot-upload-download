package com.example.filedemo.model;

import jakarta.persistence.*;
import lombok.*;


@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "files")
public class DBFile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String fileName;

    private String fileType;

    @Lob
    private byte[] data;


    public DBFile(String fileName, String contentType, byte[] bytes) {
    }
}
