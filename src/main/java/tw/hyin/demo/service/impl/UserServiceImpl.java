package tw.hyin.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tw.hyin.demo.dao.UserInfoDao;
import tw.hyin.demo.entity.UserInfo;
import tw.hyin.demo.service.UserService;

/**
 * 
 * @author YingHan 2021-11-02
 *
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

	private final UserInfoDao userInfoDao;

	@Autowired
	public UserServiceImpl(UserInfoDao userInfoDao) {
		this.userInfoDao = userInfoDao;
	}

	@Override
	public UserInfo get(String userId) {
		return userInfoDao.selectBean(userId);
	}

}
