# 섹션 2 정리

## HashMap  

```java
import java.util.*;
String str = "ABCDEAAA";

HashMap<Character,Integer> map = new HashMap<Character,Integer>();
// 값 넣기에 좋은 Tip
for(char x : str.toCharArray()){
    map.put(x, map.getOrDefault(x, 0) + 1);
}

map.containsKey('A'); // 'A' 라는 키가 있냐?

map.size(); // key-value가 몇개 매핑되어있냐?

map.remove('A'); // 'A'라는 키 삭제하고 value return해줌

// 각 key별 값 확인
for(char key : map.keySet()) {
    System.out.println(key + " " + map.get(key));
}

```  

## TreeSet  

```java

TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());

Tset.add(100);
Tset.add(100);
Tset.add(300);
for(int x : Tset)
    System.out.println(x);
// 결과: 300 100
// Collections.reverseOrder() 여서 내림차순

Tset.remove(300);
// 결과 100만 나옴 300을 지움

Tset.size(); // 개수 출력
Tset.first(); // TreeSet 처음 값 출력
Tset.last(); // TreeSet 마지막 값 출력

```  
