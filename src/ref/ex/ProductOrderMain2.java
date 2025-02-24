package ref.ex;

import java.util.Scanner;

public class ProductOrderMain2 {
    static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder order = new ProductOrder();
        order.prodcutName=productName;
        order.price=price;
        order.quantity=quantity;
        return order;
    }
    static void printOrders(ProductOrder[] order){
        for(int i=0;i<order.length;i++){
            System.out.println("상품명: "+order[i].prodcutName+"가격: "+order[i].price+"수량: "+order[i].quantity);
        }
    }
    static int getTotalAmount(ProductOrder[] orders){
        int total=0;

        for(int i=0;i<orders.length;i++){
            total+=orders[i].price*orders[i].quantity;
        }
        return total;
    }
    static void inputOrder(){

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1번째 주문 정보를 입력하세요");
        int n = scanner.nextInt();


        ProductOrder[] order= new ProductOrder[n];
        for (ProductOrder productOrder : order) {
            
        }
        order[0]=createOrder("두부",2000,2);
        order[1]=createOrder("김치",5000,1);
        order[2]=createOrder("콜라",1500,2);

        printOrders(order);
        int total= getTotalAmount(order);
        System.out.println("총 결제 금액: "+total);

    }
}
