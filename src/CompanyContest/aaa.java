interface MyInter {
    void methodA();
}

class Outer {   //匿名クラスを使用するクラス
    void method() {

            new MyInter() {
                public void methodA() {
                    System.out.println("Hello");
                }
            }.methodA();
        }
    }


class Ex3_4 {
    public static void main(String[] args) {
        new Outer().method();
    }
}