//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        PriductOrder[] priductOrder = new PriductOrder[3];
//test
        priductOrder[0]=new PriductOrder();
        priductOrder[0].prodcutName="두부";
        priductOrder[0].price=2000;
        priductOrder[0].quantity=2;

        priductOrder[1]=new PriductOrder();
        priductOrder[1].prodcutName="김치";
        priductOrder[1].price=5000;
        priductOrder[1].quantity=1;

        priductOrder[2]=new PriductOrder();
        priductOrder[2].prodcutName="콜라";
        priductOrder[2].price=1500;
        priductOrder[2].quantity=2;
        int sum=0;
        for(int i=0;i<priductOrder.length;i++){
            System.out.println("상품명: "+priductOrder[i]+ ", 가격: " + priductOrder[i].price+", 수량: "+priductOrder[i].quantity);
            sum+=priductOrder[i].price*priductOrder[i].quantity;
        }
        System.out.println("총 결제 금액: "+ sum);
    }
}