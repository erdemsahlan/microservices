package com.example.servicecommon.client;

import com.example.servicecommon.contract.AccountDto;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.transform.sax.SAXResult;

@FeignClient("account-service")
public interface AccountServiceClient {
    @RequestMapping("/{id}")
    ResponseEntity<AccountDto> get(@PathVariable("id") String id);
    }
}
