package com.lili.library.utils;

import com.alibaba.fastjson.JSON;
import com.mysql.jdbc.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;

public class GetBodyParams {

    public String getParams(HttpServletRequest request) throws IOException {
        StringBuffer data = new StringBuffer();
        String line = null;
        BufferedReader reader = null;
        try {
            reader = request.getReader();
            while (null != (line = reader.readLine()))
                data.append(line);
        } catch (IOException e) {
        } finally {
        }
        return data.toString();
    }

}
