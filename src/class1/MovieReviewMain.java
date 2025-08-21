package class1;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview mr1 = new MovieReview();
        mr1.title = "킹콩";
        mr1.review = "굿~~";
        MovieReview mr2 = new MovieReview();
        mr2.title = "링";
        mr2.review = "무섭!";

        MovieReview[] mrArr = new MovieReview[]{mr1, mr2};

        for (MovieReview movieReview : mrArr) {
            System.out.println("제목 : "+movieReview.title+", 리뷰 내용 : "+movieReview.review);
        }
    }
}
