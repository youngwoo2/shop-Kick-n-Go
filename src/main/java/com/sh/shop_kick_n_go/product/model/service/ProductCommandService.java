package com.sh.shop_kick_n_go.product.model.service;

import com.sh.shop_kick_n_go.product.model.dao.ProductMapper;
import com.sh.shop_kick_n_go.product.model.dto.ProductDto;
import com.sh.shop_kick_n_go.product.model.dto.ProductRegistDto;
import com.sh.shop_kick_n_go.product.model.dto.ProductUpdateDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
@RequiredArgsConstructor
public class ProductCommandService {
    private final ProductMapper productMapper;
    @Value("${file.upload-dir}")
    private String uploadDir;

    @Transactional
    public int insertProduct(ProductRegistDto productRegistDto) {
        MultipartFile file = productRegistDto.getImage();
        String fileExtension = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        String fileName = System.currentTimeMillis() + fileExtension;
        Path filePath = Paths.get(uploadDir + File.separator + fileName);
        System.out.println("사진 저장");
        try {
            Files.createDirectories(filePath.getParent()); // 디렉토리가 없는 경우 생성
            Files.write(filePath, file.getBytes());

        } catch (IOException e) {
            e.printStackTrace();
            // Delete the partially uploaded file if there is a failure
            try {
                Files.deleteIfExists(filePath);// 사진 삭제
                System.out.println("사진 삭제");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            throw new RuntimeException("Failed to insert product and save image", e);
        }
        finally {
            String imagePath = filePath.toString(); // 저장된 파일 경로를 설정

            ProductDto productDto = productRegistDto.toProductDto(fileName);
            return productMapper.insertProduct(productDto);
        }
    }

    public int updateProduct(ProductUpdateDto productUpdateDto) {
        MultipartFile file = productUpdateDto.getImage();
        String fileExtension = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        String fileName = System.currentTimeMillis() + fileExtension;
        Path filePath = Paths.get(uploadDir + File.separator + fileName);
        System.out.println("사진 저장");
        try {
            Files.createDirectories(filePath.getParent()); // 디렉토리가 없는 경우 생성
            Files.write(filePath, file.getBytes());

        } catch (IOException e) {
            e.printStackTrace();
            // Delete the partially uploaded file if there is a failure
            try {
                Files.deleteIfExists(filePath);// 사진 삭제
                System.out.println("사진 삭제");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            throw new RuntimeException("Failed to insert product and save image", e);
        }
        finally {
            String imagePath = filePath.toString(); // 저장된 파일 경로를 설정

            ProductDto productDto = productUpdateDto.toProductDto(fileName);
            return productMapper.updateProduct(productDto);
        }


    }
}