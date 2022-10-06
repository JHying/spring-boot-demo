package tw.hyin.demo.service;

import tw.hyin.demo.entity.UserInfo;
import tw.hyin.demo.repo.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author JHying(Rita) on 2022.
 * @description
 */
@Service
@Transactional
public class TestService {

    private final UserInfoRepository userInfoRepository;

    @Autowired
    public TestService(UserInfoRepository userInfoRepository) {
        this.userInfoRepository = userInfoRepository;
    }

    UserInfo findUser(String userID) {
        return this.userInfoRepository.findById(userID).orElse(null);
    }

}
