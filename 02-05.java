class Main{
    public static void main(String[] args){
        System.out.println("Hello world");
        double d = 66.666;
        int score = (int)d;
        System.out.println(score); // 66 출력

        // 자동 형 변환은 보다 더 넓은 범위의 타입으로 변환이 된다.
        // int -> byte의 변환은 값 손실이 일어날 수 있다. int는 4byte (32bit) 이기 때문에 뒤에 앞의 3byte가 손실된다.
        // byte -> int는 값 손실이 일어나지 않는다.

    }
}