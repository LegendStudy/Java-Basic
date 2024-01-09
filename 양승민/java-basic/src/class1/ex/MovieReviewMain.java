package class1.ex;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview inception = new MovieReview("인셉션", "인생은 무한 루프");
        MovieReview aboutTime = new MovieReview("어바웃 타임", "인생 시간 영화");

        System.out.println("영화 제목: " + inception.title + ", 리뷰: " + inception.review);
        System.out.println("영화 제목: " + aboutTime.title + ", 리뷰: " + aboutTime.review);
    }
}
