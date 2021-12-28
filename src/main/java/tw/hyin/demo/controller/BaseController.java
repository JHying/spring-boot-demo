package tw.hyin.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import tw.hyin.demo.pojo.ResponseObj;
import tw.hyin.demo.utils.Log;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class BaseController {

	protected <T> ResponseEntity<ResponseObj<T>> sendSuccessRsp(T result) {
        return new ResponseEntity(ResponseObj.builder().status(HttpStatus.OK)
                .result(result).build(), HttpStatus.OK);
    }

    protected <T> ResponseEntity<ResponseObj<T>> sendFailRsp(Exception e) {
        e.printStackTrace();
        List<String> errors = new ArrayList<>();
        errors.add("Internal Server Error");
        errors.add(e.getMessage());
        return new ResponseEntity(ResponseObj.builder().status(HttpStatus.INTERNAL_SERVER_ERROR)
                .errors(errors).build(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    protected <T> ResponseEntity<ResponseObj<T>> sendDenyRsp() {
        Log.info("Validate Failed, person not found.");
        List<String> errors = new ArrayList<>();
        errors.add("Validate Failed, person not found.");
        return new ResponseEntity(ResponseObj.builder().status(HttpStatus.UNAUTHORIZED)
                .errors(errors).build(), HttpStatus.UNAUTHORIZED);
    }

}
