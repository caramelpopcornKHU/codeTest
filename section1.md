# 섹션 1 정리

## StringBuilder

```java
StringBuilder sb = new StringBuilder();
new StringBuilder("hello").reverse().toString();

// 문자열 앞뒤 뒤집기
String tmp = new StringBuilder("stringtype").reverse().toString();


// sb값 비우기
sb.setLength(0);

// 문자열 늘리기
sb.append("string문자열");

// 뒤집기
sb.reverse();
```

## String

```java
String input = "example";

input.equals("example"); // 같은지 비교
input.equalsIgnoreCase("ExamPle"); // 대소문자 무시

// 분해
input.toCharArray(); // {'e','x','a','m','p','l','e'}

//분해
char[] s = input.toCharArray();
// 결합
String answer = String.valueOf(s);

String example = "afqw!@#!adq";
// 특수문자 제거
// 정규식으로 a-z가 아닌것은 ""으로
example = example.replaceAll("[^a-z]",""); // 정규식 a-z까지

example = example.replace('#','1'); // '#'문자를 '1'문자로 바꾸기

//응용

for(Char a : input.toCharArray()){
    System.out.println(a);
}

input.split(regex); // regex String 타입

input.split(" "); // 공백으로 자르기
input.split(":"); // 특정 기호로 자르기

indexOf 메소트는 처음에 발생한 문자열만 색인 알려줌   
input.indexOf(" "); // 공백 문자열이 처음 어디에서 발생했는지 리턴
input.indexOf("amp") // 특정 문자열이 어디있는지 확인
input.indexOf(120) // 특정 단어의 유니코드로 찾기

input.substring(startIndex); // 시작 index부터 끝까지
input.substring(startIndex,endIndex); // 시작 index부터 edn index까지

```

## Char

아스키 코드
A ~ Z
65 ~ 90

32 차이

a ~ z
97 ~ 122

0 ~ 9
48 ~ 57

```java

Character a = 'a';
a.toUpperCase(a); // 문자를 대문자로
a.toLowerCase(a); // 문자를 소문자로

a.toString(); // 문자를 문자열로

// 문자열 입력 중에 문자 추출

Scanner sc = new Scanner(System.in);
Character a = sc.next().charAt(0); // 문자열 입력 받은 것 중에 index로 찾기

String s = "eXaMpLe";
  
for(char a : s.toCharArray()) {

 if(a > 65 && a < 90) { // 대문자만
  System.out.println(a);
 }
   
 if(a > 97 && a < 122) { // 소문자만
  System.out.println(a);
 }
   
}

Character c = 'b';
Character.isAlphabetic(c); // 알파벳이냐?
Character.isDigit(c); // 숫자냐?
```

## Integer

설명설명

```java

Integer.parseInt("숫자인문자열");
Integer.parseInt("이진수문자열",2); // 2진수 문자열을 10진수로
parseInt("2147483647", 10) returns 2147483647
parseInt("-2147483648", 10) returns -2147483648
parseInt("2147483648", 10) throws a NumberFormatException

```
