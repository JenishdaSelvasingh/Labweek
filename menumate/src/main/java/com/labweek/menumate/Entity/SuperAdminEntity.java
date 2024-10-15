package com.labweek.menumate.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="superadmin")

public class SuperAdminEntity {
    @Id
    @Column
            (name = "ntid",
            nullable = false)
    private String Nt_id;

    @Column
            (name = "name")
    private String SuperAdminName;

    @Column
            (name = "email")
    private String SuperAdminEmail;

    @Column
            (name = "password")
    private String SuperAdminPassword;

}
