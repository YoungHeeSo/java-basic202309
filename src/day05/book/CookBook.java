package day05.book;

public class CookBook extends Book {

    private boolean coupon; // 요리학원 쿠폰유무

    public CookBook() {}

    public CookBook(String title, String author, String publisher, boolean coupon) {
        super(title, author, publisher);
        this.coupon = coupon;
    }

    //boolean 타입은 get생성자 대신 is생성자로 이름이 지어진다
    public boolean isCoupon() {
        return coupon;
    }

    public void setCoupon(boolean coupon) {
        this.coupon = coupon;
    }

    @Override
    public String info() {
        return String.format("# 분류: 요리책, %s, 쿠폰유무: %s", super.info(), this.coupon ? "있음" : "없음");
    }
}

