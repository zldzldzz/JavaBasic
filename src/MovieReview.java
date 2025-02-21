public class MovieReview {

    String title;
    String review;

    public static void main(String[] args){
        MovieReview newReview1 = new MovieReview();
        MovieReview newReview2 = new MovieReview();

        newReview1.title="인셉션";
        newReview1.review="안생은 무한 루프";
        newReview2.title="어바웃 타임";
        newReview2.review="인생 시간 영화!";

        MovieReview[] reviews = new MovieReview[]{newReview1,newReview2};

        for(int i=0; i<reviews.length;i++){
            System.out.println(reviews[i].title+reviews[i].review);
        }



    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

