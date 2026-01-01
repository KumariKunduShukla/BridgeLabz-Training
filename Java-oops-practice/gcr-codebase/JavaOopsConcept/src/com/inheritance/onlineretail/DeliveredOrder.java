package com.inheritance.onlineretail;

//Subclass representing a delivered order
public class DeliveredOrder extends ShippedOrder {
 
   // Additional attribute for delivered orders
   private String deliveryDate;

   // Constructor calling superclass constructor
   public DeliveredOrder(String orderId, String orderDate,
                       String trackingNumber, String deliveryDate) {
     super(orderId, orderDate, trackingNumber);
     this.deliveryDate = deliveryDate;
   }

    @Override
    public String getOrderStatus() {
    return "Order Delivered on " + deliveryDate;
 }
}
