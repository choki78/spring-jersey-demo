package net.ion.jerseydemo.api.service;

import org.springframework.stereotype.Service;

/**
 * Created by choki78@gmail.com on 2018-11-28
 * Github : https://github.com/choki78
 */

@Service
public class SampleService {
    private String msg = "welcome jersey";

    /**
     *
     * @return this message
     */
    public String getMessage(){
        return this.msg;
    }

    public void setMsg(String msg){
        this.msg = msg;
    }
}
