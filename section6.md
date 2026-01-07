# 섹션 6 정리

## Stack  

```java
Deque<Integer> stack = new ArrayDeque<Integer>();

// FILO 이고
stack.push(100);
stack.pop();

// 가장 위에 확인
stack.peek();

stack.contains(100); // true or false

stack.isEmpty(); // 비어있냐

while(!stack.isEmpty()){} // 예시

```  

## Queue  

```java
Queue<Integer> queue = new ArrayDeque<Integer>();

// FIFO
queue.offer(100);
queue.poll();

// 가장 앞에 확인
queue.peek();

queue.contians(100); // true or false

queue.isEmpty(); // 비어있냐

while(!queue.isEmpty()){} //예시
```  
