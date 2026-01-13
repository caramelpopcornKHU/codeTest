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

// 다른 방법도 있다.

Integer[] arr2 = {1, 2, 3, 4, 5};

// 내림차순 정렬
Arrays.sort(arr2, (a, b) -> b - a); // Comparator함수형 인터페이스 람다식

// 2차원 배열에서 첫열로 정렬후 그 다음 열로 정렬
int[][] data = { { -2, -2 }, { -1, -1 }, { 0, 0 }, { 1, 1 }, { 2, 0 }, { 2, 2 }, { 2, 1 }, { 3, 3 }, };

Arrays.sort(data, (o1,o2) -> {
    // 첫 행이 같다면
    if(o1[0] == o2[0])
        // 두번째 행으로 정렬
        return o1[1] - o2[1];
    else{
        return o1[0] - o2[0];
    }
});


```  
