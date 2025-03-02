// 햄버거 클래스 정의
class Burger {
    // 필수 속성
    private String bun;     // 빵
    private String patty;   // 패티

    // 선택 속성
    private boolean cheese;
    private boolean lettuce;
    private boolean tomato;
    private boolean bacon;
    private String sauce;

    // 빌더 클래스 정의
    public static class Builder {
        // 필수 속성
        private String bun;
        private String patty;

        // 선택 속성 (기본값 false)
        private boolean cheese = false;
        private boolean lettuce = false;
        private boolean tomato = false;
        private boolean bacon = false;
        private String sauce = "없음"; // 기본값

        // 필수 속성을 설정하는 생성자
        public Builder(String bun, String patty) {
            this.bun = bun;
            this.patty = patty;
        }

        // 선택 속성 추가 메서드들 (체이닝 지원)
        public Builder cheese(boolean cheese) {
            this.cheese = cheese;
            return this;
        }

        public Builder lettuce(boolean lettuce) {
            this.lettuce = lettuce;
            return this;
        }

        public Builder tomato(boolean tomato) {
            this.tomato = tomato;
            return this;
        }

        public Builder bacon(boolean bacon) {
            this.bacon = bacon;
            return this;
        }

        public Builder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        //최종적으로 Burger 객체 생성
        public Burger build() {
            Burger burger = new Burger();
            burger.bun = this.bun;
            burger.patty = this.patty;
            burger.cheese = this.cheese;
            burger.lettuce = this.lettuce;
            burger.tomato = this.tomato;
            burger.bacon = this.bacon;
            burger.sauce = this.sauce;
            return burger;
        }
    }

    //햄버거 정보 출력 메서드
    public void showInfo() {
        System.out.println("햄버거 구성");
        System.out.println("빵: " + bun);
        System.out.println("패티: " + patty);
        System.out.println("치즈: " + (cheese ? "추가됨" : "없음"));
        System.out.println("양상추: " + (lettuce ? "추가됨" : "없음"));
        System.out.println("토마토: " + (tomato ? "추가됨" : "없음"));
        System.out.println("베이컨: " + (bacon ? "추가됨" : "없음"));
        System.out.println("소스: " + sauce);
        System.out.println("-----------------------");
    }
}
