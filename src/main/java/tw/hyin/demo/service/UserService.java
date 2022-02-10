package tw.hyin.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tw.hyin.demo.entity.UserInfo;

/**
 * @author rita6 on 2022.
 */
@Service
@Transactional
public interface UserService {

	/**
	 * 
	 * @author YingHan
	 * @return 
	 * @throws Exception 
	 * @since 2021-12-16
	 * 
	 * @Description 建立使用者
	 */
    public UserInfo get(String userId);

}
