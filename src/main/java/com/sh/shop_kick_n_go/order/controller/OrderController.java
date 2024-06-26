package com.sh.shop_kick_n_go.order.controller;

import com.sh.shop_kick_n_go.order.model.dto.OrderDto;
import com.sh.shop_kick_n_go.order.model.service.OrderCommandService;
import com.sh.shop_kick_n_go.order.model.service.OrderQueryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/order")
public class OrderController {
    private final OrderQueryService orderQueryService;
    private final OrderCommandService orderCommandService;

    @GetMapping("/order-tables-data")
    public void orderList(Model model) {
        log.info("Get /NiceAdmin/tables-data");
        List<OrderDto> orders = orderQueryService.findAllOrder();
        model.addAttribute("orders", orders);
    }

    @GetMapping("/delivery-tables-data")
    public void deliveryList(Model model) {
        List<OrderDto> deliveries = orderQueryService.findAllDelivery();
        model.addAttribute("deliveries", deliveries);
    }

    @GetMapping("/cancel-tables-data")
    public void cancelOrderList(Model model) {
        List<OrderDto> cancelOrders = orderQueryService.findAllCancelOrder();
        model.addAttribute("cancelOrders", cancelOrders);
    }

//    @PostMapping("/delivery-tables-data")
//    public String deliveryProcessing(@RequestParam(name = "selectedOrders", required = false) List<Integer> selectedOrders,
//                                     RedirectAttributes redirectAttributes) {
//        log.debug("Selected orders: {}", selectedOrders);
//        int result = orderCommandService.updateOrder(selectedOrders);
//
//        return "redirect:/order/delivery-tables-data";
//    }

    @PostMapping("/delivery-tables-data")
    public String deliveryProcessing(@RequestParam(name = "selectedOrders", required = false) List<Integer> selectedOrders,
                                     @RequestParam(name = "action") String action,
                                     RedirectAttributes redirectAttributes) {
        switch (action) {
            case "send":
                log.debug("Sending orders: {}", selectedOrders);
                int sendResult = orderCommandService.updateOrder(selectedOrders);
                break;
            case "cancel":
                log.debug("Canceling orders: {}", selectedOrders);
                int cancelResult = orderCommandService.processCanceling(selectedOrders);
                break;
            case "complete":
                log.debug("Completing orders: {}", selectedOrders);
                int completeResult = orderCommandService.processCompletion(selectedOrders);
                break;
            default:
                log.warn("Unknown action: {}", action);
                break;
        }

        return "redirect:/order/delivery-tables-data";
    }

    @PostMapping("/cancel-tables-data")
    public String cancelProcessing(@RequestParam(name = "canceledOrders", required = false) List<Integer> canceledOrders,
                                   @RequestParam(name = "action") String action) {
        switch (action) {
            case "approve" :
                log.debug("approving orders: {}", canceledOrders);
                int approveResult = orderCommandService.cancelOrderApprove(canceledOrders);
                break;
            case "withdraw" :
                log.debug("withdrawing orders: {}", canceledOrders);
                int withdrawResult = orderCommandService.cancelOrderWithdraw(canceledOrders);
                break;
            default:
                log.warn("Unknown action: {}", action);
                break;
        }
        return "redirect:/order/cancel-tables-data";
    }
}
