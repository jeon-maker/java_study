class Main{
public static void main(String[] args){
final int max_speed = 10; //final을 붙혀 상수를 선언 및 초기화 ->상수 변경 불가
//리터럴 : 우리가 기존에 알고 있던 상수 개념. 프로그래밍에서 상수는 변하지 않는 값.
int octNum = 010; //8진수, 10진수로 8
int hexNum = 0x10; //16진수, 10진수로 16
int binNum = 0b10; //2진수. 10진수로 2

float pi = 3.14f ;// 접미사 f,F로 float 임을 표기 , 생략하면 에러 발생
double rate = 1.618d; // 점시다 d,D로 double 임을 표기 d는 생략 가능.기본실수형
double d = 1e1; // = 10.0
double d2 = 1e-3 ;// =0.001

String str = ""; // OK
 // char ch = ''; //에러 발생. 반드시 하나의 문자 필요
char ch = ' ' ; // ok. 공백 문자로 변수 초기화

int finger = 10;
System.out.printf("finger = [%5d]%n", finger);
System.out.printf("finger = [%-5d]%n",finger);
}}