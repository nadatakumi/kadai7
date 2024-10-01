package kadai7;

public class raion {
    // フィールド
    private String name;
    private double length;
    private int speed;

    // nameのgetterとsetter
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // lengthのgetterとsetter
    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    // speedのgetterとsetter
    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // 情報を出力するメソッド
    public void printInfo() {
        System.out.println("動物名：" + this.getName());
        System.out.println("体長：" + this.getLength() + "m");
        System.out.println("速度：" + this.getSpeed() + "km/h");
    }

    public static void main(String[] args) {
        // raionインスタンスの生成
        raion lion = new raion();
        
        // setterを使って値を設定
        lion.setName("ライオン");
        lion.setLength(2.1);
        lion.setSpeed(80);

        // 情報の出力
        lion.printInfo();
    }
}