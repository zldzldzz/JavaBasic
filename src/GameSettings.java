class GameSettings {
    private static GameSettings instance;

    private GameSettings() {} // private 생성자

    public static GameSettings getInstance() {
        if (instance == null) {
            instance = new GameSettings();
        }
        return instance;
    }

    public void showSettings() {
        System.out.println("게임 설정 화면");
    }
}

