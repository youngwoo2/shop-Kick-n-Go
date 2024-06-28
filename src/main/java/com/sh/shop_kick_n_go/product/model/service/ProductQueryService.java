package com.sh.shop_kick_n_go.product.model.service;

import com.sh.shop_kick_n_go.product.model.MediaTypeUtiles;
import com.sh.shop_kick_n_go.product.model.dao.ProductMapper;
import com.sh.shop_kick_n_go.product.model.dto.ProductDto;
import jakarta.servlet.ServletContext;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ProductQueryService {
    @Autowired
    ServletContext servletContext;

    @Value("${file.upload-dir}")
    private String uploadDir;
    private final ProductMapper productMapper;
    public List<ProductDto> findAll() {
        return productMapper.findAll();
    }

    public File loadImage(String filename) throws FileNotFoundException {
        // 파일 생성 및 복사


        // 파일 정보 넣어서 응답
        return new File(uploadDir + File.separator + filename);

    }
}
