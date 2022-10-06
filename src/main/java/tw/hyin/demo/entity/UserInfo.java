package tw.hyin.demo.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "UserInfo")
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "UserID", nullable = false)
    private String userID;

    @Column(name = "Password")
    private String password;

    @Column(name = "UserName")
    private String userName;

    @Column(name = "Tel")
    private String tel;

}
