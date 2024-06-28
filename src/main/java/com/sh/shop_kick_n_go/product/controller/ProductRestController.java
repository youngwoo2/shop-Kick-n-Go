package com.sh.shop_kick_n_go.product.controller;

import com.sh.shop_kick_n_go.product.model.MediaTypeUtiles;
import com.sh.shop_kick_n_go.product.model.service.ProductQueryService;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import java.lang.Object;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileInputStream;
import java.util.*;
@RestController
@Slf4j
@RequestMapping(value = "/product-api")
@RequiredArgsConstructor
public class ProductRestController {
    @Autowired
    ServletContext servletContext;
    @Autowired
    ProductQueryService productQueryService;
    @GetMapping(value = "/downloadfile")
    public ResponseEntity<InputStreamResource> downloadfile(String filename,
                                                            HttpServletRequest req) throws Exception {
        // 로깅
        System.out.println("downloadfile " + new Date());        // 다운로드할 파일 경로 설


        // 파일 생성 및 복사
        File file =  productQueryService.loadImage(filename);
       //예외처리
        InputStreamResource isr = new InputStreamResource(new FileInputStream(file));

        // 파일 정보 넣어서 응답
        MediaType mediaType = MediaTypeUtiles.getMediaTypeForFileName(this.servletContext, filename);

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=" + file.getName())
                .contentType(mediaType)
                .contentLength(file.length())
                .body(isr);
    }
}
