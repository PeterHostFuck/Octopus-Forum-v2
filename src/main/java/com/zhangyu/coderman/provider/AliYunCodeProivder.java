package com.zhangyu.coderman.provider;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class AliYunCodeProivder {

    public String sendCodeToPhone(String phone){
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "LTAI6EW8bTwlXoZD", "p0zpokgzi3LrIuEu82lxYx0jNo5OLU");
        IAcsClient client = new DefaultAcsClient(profile);
        String code = String.format("%06d", new Random().nextInt(1000000));

        CommonRequest request = new CommonRequest();
        request.setMethod(MethodType.POST);
        request.setDomain("dysmsapi.aliyuncs.com");
        request.setVersion("2017-05-25");
        request.setAction("SendSms");
        request.putQueryParameter("RegionId", "cn-hangzhou");
        request.putQueryParameter("PhoneNumbers", phone);
        request.putQueryParameter("SignName", "章鱼社区");
        request.putQueryParameter("TemplateCode", "SMS_175050762");
        request.putQueryParameter("TemplateParam", "{\"code\":\""+code+"\"}");
        try {
            CommonResponse response = client.getCommonResponse(request);
            System.out.println(response.getData());
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }
        return code;
    }
}
