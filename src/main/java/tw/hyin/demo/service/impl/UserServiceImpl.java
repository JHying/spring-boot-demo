package tw.hyin.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tw.hyin.demo.dao.repo.UserInfoRepo;
import tw.hyin.demo.entity.UserInfo;
import tw.hyin.demo.service.UserService;

/**
 * 
 * @author YingHan 2022
 *
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

	private final UserInfoRepo userInfoRepo;

	@Autowired
	public UserServiceImpl(UserInfoRepo userInfoRepo) {
		this.userInfoRepo = userInfoRepo;
	}

	@Override
	public UserInfo get(String userId) {
		return userInfoRepo.findById(userId).get();
	}

}
