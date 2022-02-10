package tw.hyin.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.DynamicInsert;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author H-yin on 2022.
 */
@Data
@Entity
@NoArgsConstructor
@DynamicInsert // 解決 not null 欄位沒給值時，不會自動塞 default 的問題
public class UserInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "UserID")
	private String userId;

	@Column(name = "UserName")
	private String userName;

	@Column(name = "Tel")
	private String tel;

}
