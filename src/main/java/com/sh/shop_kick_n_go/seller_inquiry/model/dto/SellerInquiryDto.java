package com.sh.shop_kick_n_go.seller_inquiry.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SellerInquiryDto {
    private int sellerInquiryId;
    private int orderItemId;
    private int userId;
    private LocalDateTime receiptDate;
    private LocalDateTime processingDate;
    private String processingStatus;
    private String type;
    private String title;
    private String inquiryContents;
    private String inquiryReplyContents;
}
