# exam03

### **자바 기본 문법 3 (조건문)**
if문, switch()~case문 예제 <br></br>

### **if 문**
if 문은 조건이 true인지 false인지에 따라서 어떤 작업을 할 것인지를 결정한다. (true와 false 중 하나로 결정되기 때문에 **이중 분기문**이라고도 함)
```java
if(조건식){
    // 조건식이 true일 때 이 부분 실행
}
```
<br/>

### **if ~ else 문**
```java
if(조건식){
    // 조건식이 true일 때 이 부분 실행
} else {
    // 조건식이 false일 때 이 부분 실행 
}
```
<br/>

### **switch()~case 문**
switch~case 구문은 switch에 변수값을 넣어서 case에 해당하는 값이 있는 경우 그 해당 부분으로 가서 실행하는 구문이다. 여러 가지 경우에 따라서 어떤 작업을 할 것인지를 결정하므로 switch()~case문을 **다중 분기문**이라고도 한다. 

```java
switch(변수) {
    case 값1:
        실행문;    // 변수와 값 1이 일치하면 해당 case 실행문을 작동 
        break;     // break는 조건에 해당하는 실행문을 작동시키고 switch문을 종료하기 위해 사용됨 

    case 값 2 : 
        실행문;    // 변수와 값 2이 일치하면 해당 case 실행문을 작동 
        break; 

    default : 
        //어디에서 해당하지 않으면 default 문 실행 
        실행문;
        break;
}
```

> **break**; 부분을 통해 switch 문을 종료시키는데 break가 없으면 무한으로 값이 반복되므로 탈출하고 싶은 case 구문에 꼭 break 문을 작성해야 한다. 

> **default** : switch 문 조건식이 위의 case 조건식의 해당되는  경우가 없을 경우 무조건 실행한다. 

<br/>


