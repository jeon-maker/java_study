import java.util.*;
class Main{
    public static void main(String[] args){
        System.out.print("입력 : ");
        Scanner scanner = new Scanner(System.in); //scanner 클래스 객체 생성
        String input = scanner.nextLine(); // 입력받은 내용을 input에 저장
        int num = Integer.parseInt(input); // 입력받은 값을 int 타입으로 바꿈
        System.out.print("입력받은 값 : " +  num);
    }
}