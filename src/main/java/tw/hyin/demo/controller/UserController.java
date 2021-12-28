package tw.hyin.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import tw.hyin.demo.entity.UserInfo;
import tw.hyin.demo.pojo.ResponseObj;
import tw.hyin.demo.service.UserService;

/**
 * API 接口
 * @author YingHan 2021
 *
 */
@RestController
@ResponseBody
public class UserController extends BaseController {

	private final UserService userService;

	@Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
	
	@ApiOperation(value = "測試用API")
    @GetMapping(value = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseObj<String>> test() {
        try {
            return super.sendSuccessRsp("測試成功.");
        } catch (Exception e) {
            return super.sendFailRsp(e);
        }
    }

	@ApiOperation(value = "取得使用者資料")
    @GetMapping(value = "/get/{uid}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseObj<UserInfo>> getUserInfo(@PathVariable("uid") String userId) {
        try {
            return super.sendSuccessRsp(userService.get(userId));
        } catch (Exception e) {
            return super.sendFailRsp(e);
        }
    }

}
