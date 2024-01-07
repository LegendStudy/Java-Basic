package class1.ex;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        MovieReview inception = new MovieReview("인셉션", "인생은 무한 루프");
        MovieReview aboutTime = new MovieReview("어바웃 타임", "인생 시간 영화");

        MovieReview[] reviews = {inception, aboutTime};

        for (MovieReview review : reviews) {
            System.out.println("영화 제목: " + review.title + ", 리뷰: " + review.review);
        }
    }
}
