package com.example.fw;/*
Controller의 종류가 여러개더라
초기화 - 같은 코드
실행 - 다른 코드
마무리 - 같은 코드
 */

public abstract class Controller {
    public void init(){
        System.out.println("초기화 하는 코드");
    }

    public void close(){
        System.out.println("마무리 하는 코드");
    }

    // 내가 가지고 있는 메소드를 호출한다
    // 어떤 순서를 가지고 있다. 이런 메소드를 템플릿 메소드라고 한다.
    public abstract void run(); // 매번 다른 코드
    public void execute(){
       this.init(); // this. 생략가능
       this.run();
       this.close();
    }
}
