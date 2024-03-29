package tw.hyin.demo.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import tw.hyin.java.utils.http.BaseController;
import tw.hyin.java.utils.http.ResponseObj;

/**
 *
 */
@RestController
@ResponseBody
public class CommonController extends BaseController {

    @Operation(description = "測試API")
    @GetMapping(value = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseObj<ResponseObj.RspMsg>> test() {
        return super.sendSuccessRsp(ResponseObj.RspMsg.SUCCESS);
    }

}
