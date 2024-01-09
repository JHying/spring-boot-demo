package tw.hyin.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "UserInfo")
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "UserID", nullable = false)
    private String userId;

    @Column(name = "Password")
    private String password;

    @Column(name = "UserName")
    private String userName;

    @Column(name = "Tel")
    private String tel;

}
