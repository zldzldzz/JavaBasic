import java.util.Scanner;

public class GoodS {
    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public class Main {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.print("입력할 주문의 개수를 입력하세요: ");
            int n = sc.nextInt();
            Goods[] listGoods= new Goods[n];
            int total=0;
            for (int i=0; i<n;i++) {
                System.out.println(n+"번째 주문 정보를 입력하세요.");

                System.out.print("상품명: ");
                String name= sc.next();

                System.out.print("가격: ");
                int price= sc.nextInt();

                System.out.print("수량: ");
                int quantity = sc.nextInt();

                listGoods[i]=creatGoods(name,price,quantity);
            }
            for (Goods listGood : listGoods) {
                System.out.println("상품명: "+listGood.name+" 가격: "+listGood.price+" 수량: "+listGood.quantity);
                total+=listGood.price*listGood.quantity;
            }
            System.out.println("총 결제 금액: "+total);

        }
        public static class Goods{
            String name;
            int price;
            int quantity;
        }

        public static Goods creatGoods(String name, int price, int quantity){
            Goods thisGoods = new Goods();
            thisGoods.name= name;
            thisGoods.price=price;
            thisGoods.quantity=quantity;
            return thisGoods;
        }


    }
}
