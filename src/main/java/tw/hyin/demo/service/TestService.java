package tw.hyin.demo.service;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
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
@RequiredArgsConstructor
public class TestService {

    @Autowired
    private final UserInfoRepository userInfoRepository;

    UserInfo findUser(String userId) {
        return this.userInfoRepository.findById(userId).orElse(null);
    }

}
