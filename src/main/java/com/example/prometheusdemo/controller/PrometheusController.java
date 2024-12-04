package com.example.prometheusdemo.controller;

import com.example.prometheusdemo.model.SsoRequestDTO;
import com.example.prometheusdemo.model.SsoSecuAuthResponseDTO;
import org.jdom2.Document;
import org.jdom2.input.SAXBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 程式資訊摘要: AFAP<P>
 * 程式內容說明: <P>
 * 程式修改紀錄:<P>
 *
 * @author zero6
 * @version 1.0
 * @date 2024/11/27 上午 08:24
 */
@RestController
public class PrometheusController {
    @GetMapping("/prometheus")
    public String prometheus() {
        return "prometheus";
    }

    @PostMapping(value = "/diweb12/secuService/SecuAuth.asp", consumes = {"application/xml", "text/xml"}, produces = "application/xml")
    public SsoSecuAuthResponseDTO authenticate(@RequestBody SsoRequestDTO request) {
        System.out.println(request);
        // 直接使用 SsoRequestDTO 中的數據生成回應 DTO
        SsoSecuAuthResponseDTO response = new SsoSecuAuthResponseDTO();
        response.setReturnCode("0");
        response.setReturnMessage("驗證成功");
        response.setEmpId("SY00000");
        response.setEmpName("Eric");
        response.setBranchId("SYS");
        response.setBranchName("系統");
        response.setClassName("1");
        System.out.println("測試");
        System.out.println("測試-tag-3");
        return response; // 回應自動轉換為 XML 格式
    }

}
