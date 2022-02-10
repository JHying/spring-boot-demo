package tw.hyin.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import tw.hyin.demo.pojo.ResponseObj;
import tw.hyin.demo.utils.Log;

/**
 * 
 * @author YingHan 2022
 *
 */
@SuppressWarnings({ "unchecked", "rawtypes" })
public class BaseController {

	protected <T> ResponseEntity<ResponseObj<T>> sendSuccessRsp(T result) {
        return new ResponseEntity(ResponseObj.builder().status(HttpStatus.OK)
                .result(result).build(), HttpStatus.OK);
    }

    protected <T> ResponseEntity<ResponseObj<T>> sendDenyRsp() {
        Log.info("Validate Failed, person not found.");
        List<String> errors = new ArrayList<>();
        errors.add("Validate Failed, person not found.");
        return new ResponseEntity(ResponseObj.builder().status(HttpStatus.UNAUTHORIZED)
                .errors(errors).build(), HttpStatus.UNAUTHORIZED);
    }

}
