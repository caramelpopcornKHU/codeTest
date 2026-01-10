# 섹션 7 정리

## Sort  

```java
// 무작위 배열이 다음과 같이 있다면
int[] arr = {1,37,3,23,57,8,2};

// 오름차순 정렬은 쉽다.
Arrays.sort(arr); // O(nlog(n))인 퀵소트

// 내림차순 정렬은 조금 더 복잡하다.
Integer[] arr2 = new Integer[10];

//값 채워넣는 로직 - 블라블라
// 내림차순 정렬
Arrays.sort(arr2, Collections.reverseOrder());

// TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder()); <- 이런 느낌

```  
