# Java 기초 프로그래밍

## Index
    1. 자바 설치 및 IDE 설치와 사용
     - 프로그래밍이란?
     - 주석, 실행문
     - JDK, JRE ,JVM
    2. 변수
     - 변수 선언, 변수 초기화(Initialize)
     - 변수 사용, 변수 사용범위(Scope)
    3. 타입
     - 정수 타입 : int, long
     - 실수 타입 : double
     - 논리 타입 : boolean
    4. 타입 변환
     - 자동 타입 변환 (Promotion) : 작은범위 -> 큰 범위
     - 강제 타입 변환 (Casting) : 큰 범위 -> 작은 범위 (캐스팅연산자)
    5. 연산자
     - 단항 연산자, 이항 연산자, 삼항 연산자 
     - 산술 연산자, 대입 연산자, 증감 연산자 등
     - 연산자 우선순위가 존재 : (), ......  =
    6. 조건문
     - if
     - if-else, if-else-if
     - switch - case
    7. 반복문
     - while
     - for
     - do-while
     - break, continue
    8. 배열
     - 배열 선언, 배열 초기화, 배열 길이
     - 다차원 배열
     - 향상된 for문
    9. 메서드
     - 메서드 선언, 메서드 호출,
     - 리턴값, 리턴 타입
     - 매개변수(parameter), 인자(argument)
     - 메서드 오버로딩(overloading)
    10. 클래스
     - **객체지향 프로그래밍**
     - 필드, 생성자, 메서드
     - 패키지
     - 캡슐화, 상속, 다형성, 추상화
    11. 인스턴스 멤버와 정적 멤버 
     - static
     - this 키워드
     - final, 싱글톤
    12. 접근 제어자
     - (public > prorected > default > private)
     - Getter, Setter 메서드
    13. 패키지
     - package, import
    14. 상속
     - 부모 생성자 호출
     - 오버라이딩 (최우선순위, 메서드 재정의)
     - 타입변환 (업캐스팅, 다운캐스팅)
     - 다형성
    15. 추상 클래스
     - 인스턴스를 생성하지 못하는 추상적 클래스
     - 추상 메서드 : 본문이 없음, overriding 강제
    16. 인터페이스
     - 상수와 추상메서드만 존재
     - 다형성
     - 다중 구현(omplements)
    17. 중첩 클래스
     - 클래스 내부의 클래스
     - 정적 멤버, 인스턴스 멤버, 로컬 멤버
    18. 익명 객체
     - 이름이 없는 객체
     - 본문이 선언과 동시에 정의 -> 인터페이스 구현
     - 람다식으로 연결
    19. 예외처리
     - Error, Exception
     - checked 예외(compile), unchecked 예외(rentime)
     - try-catch-finally
     - throws 예외 떠넘기기, throw new 예외 발생시키기, 사용자 정의 예외
    20. Object 클래스
     - 모든 클래스의 조상
     - toString, equals, hashCode, getClass
    21. String 클래스
     - 문자열 : immutable
     - 문자열 메서드 : charAt, indexOf, length,
     - replace, substring, trim, split, toLowerCase, toUpperCase
     - stringBuilder, StringBuffer ( 변경 가능하게 문자열을 조작 mutable)
    22. Class 클래스
     - 클래스에 대한 메타 정보를 가져옴, 조작, 관리 => 리플렉션
    23. MAth, Random 클래스
    24. Wrapper 클래스
     - 기본 타입을 객체로 포장하는 클래스
    25. 날짜와 시간 관련 클래스
     - Date, Calendar
     - LocalDateTime, LocalDate, LocalTime
     - Period, Duration, DateTimeFormatter
    26. 제네릭
     - <T> 타입 파라미터를 정의하여 타입이 필요한 자리에 유연한 타입 제공
     - 제네릭 클래스, 제네릭 메서드(리턴 타입 앞에 선언)
     - 제한된 타입 파라미터 <T extends 타입>
     - 와일드 카드 <? extends 타입> <? super 타입>
    27. 컬렉션 프레임워크
     - java.util 패키지 Collection -> List, Set
     - List : 순서 있고(index), 중복 저장 가능
     - Set : 순서 없고, 중복 없음
     - Map : 키와 값으로 구성된 Entry, Key는 중복 안됨(Set)
     - Iterator, Comparable, Cmparator
     - Stack(LIFO), Queue(FIFO)
     - collections, Arrays
    28. 람다식
     - 함수형 프로그래밍(Functionak Programming, FP)
     - () -> {} : 매개변수 -> 본문
     - 함수형 인터페이스 : SAM(단 하나의 추상 메서드를 가짐)
     - 매개변수가 있는 람다식, 없는 람다식, 반환값이 있는 람다식, 없는 람다식
     - 메서드 참조(Method Reference), 생성자 참조 (클래스이름::메서드이름) (클래스::new)
    29. 스트림 API

## 메서드 정의
    - 제어자(Modifier) : public, static
    - 리턴타입(Return Type) : 메서드가 실행된 뒤 반환되는 타입
    - 메서드이름(Method Name) : 메서드를 호출하는데 사용됨. 기능이 드러나도록 이름을 짓는 것이 좋다.
    - 매개변수(Parameter) : 입력 값. 메서드 내부에서 사용 가능한 변수, 매개변수가 없을 수도 있음.
    - 메서드 본문(Method Body) : 실행되는 코드 블록. {} 사이 위치

## 메서드의 종류
    - 매개변수가 없고 리턴타입도 없는 메서드 정의
    - 리턴 타입이 없는 경우 void[를]() 사용

## 메서드의 장점
    1. 반복되는 코드의 중복을 줄일 수 있다.
    2. 작업이 분리되어 코드의 가독성이 향상된다.
    3. 코드를 다른 프로그램에서 재사용할 수 있다.
    4. 기존의 기능을 확장해서 사용하는데 유용하다. 
    5. 메서드를 사용할 때는 내부 작업, 구현부에 대해 알 필요가 없이 사용할 수 있다.
    6. 모듈화된 메서드는 개별적으로 테스트하고 디버깅할 수 있다.
    7. 유지보수가 용이해진다. 
    
## 메서드 명명 규칙
    - 기본적으로 변수의 이름을 붙이는 방식과 같다. (CamelCase 등)

    - 메서드의 이름에는 동사를 사용해서 시작하는 것이 좋다.
      - addNumbers : 두 숫자를 더하는 메서드 <- 명시적으로 추측 가능
      - getStudentInfo : 학생의 정보를 가져오는 메서드
      - setEmployeeName : 직원의 이름을 설정하는 메서드

    - 일반적으로 널리 사용되지 않는 약어는 사용하지 않는 것이 좋다.
      - addN, getSi, setEn <- 무슨 동작을 하는 메서드인지 추측하기 어렵다.

## 객체지향 프로그래밍
    - 절차적 프로그래밍 (Procedural Programming)
     - 프로그램을 일련의 순서, 절차나, 함수의 집합으로 보는 방식 
     - 상단에서부터 하단으로 프로그램 코드를 순서대로 실행
     - 함수(Function)/절차(Procedure)를 정의하고 호출

    - 객체지향 프로그래밍(OOP : Object-Oriented Programming)
     - 프로그램을 객체(Object)의 집합으로 보는 방식
     - 객체는 데이터(속성, 필드)과 데이터를 조작하는 기능(함수, 메서드)으로 캡슐화됨.

    - 주요 4대 특징
      - 캡슐화 : 데이터와 기능을 캡슐처럼 함께 포장
      - 상속 : 한 클래스가 다른 클래스의 특성을 상속받음
      - 다형성 : 객체 타입에 따라 다른 방식으로 작동
      - 추상화 : 복잡한 실제 세계를 단순한 모델로 표현
    - 모든 사물과 개념을 속성과 기능을 가지고 있는 객체로 단순화, 추상화 시키는 것.
    - 추상화 -> 모델링 : 데이터 + 행동
    - 객체 지향 프로그래밍 방법이 가장 널리 사용되고 있다.

## 클래스
     - 객체를 생성하기 위한 설계도 혹은 틀, 템플릿
     - 클래스의 구조
       1. Field : 객체의 데이터
       2. Constructor : 객체를 생성할 때 초기화를 담당
       3. Method : 객체가 수행하는 행동

## 객체(Object)
    - 클래스(설계도)에서 정의된대로 메모리에 할당되는 인스턴스(instance : 실례, 사례)
    - new 키워드를 통해서 객체를 생성

    - 객체(Object)와 인스턴스(instance)의 차이
      - 클래스에서 나온 실체. 인스턴스는 클래스의 관계에 맞춰져있음.
        - Student는 클래스다. `Student student1 = new Student()`
        - student1은 Student의 인스턴스다.
        - student1은 객체다.

## 생성자
    - 특징 
     1. 클래스 이름과 동일
     2. 리턴 타입이 없음 (void도 사용하지 않음)
     3. 오버로딩이 가능 (매개변수의 타입이나 개수에 따라 여러개 정의 가능)
     - 종류
     1. 기본 생성자 : 사용자가 정의하지 않으면 컴파일러에서 자동 생성 (매개변수 없음)
     2. 사용자 정의 생성자 : 매개변수를 가지고, 객체 생성시 초기값을 전달
     - this 키워드
      - 객체가 자기 자신을 가리키는데 사용되는 키워드
      - 생성자에서 매개변수와 클래스의 필드 이름이 중복되는 경우가 있을 때
      - this 키워드를 통해 둘을 구분
        - `this.name = name`
      - this() : 다른 생성자를 호출할 때
        - 생성자 오버로딩이 있을때 코드의 중복을 줄일 수 있음.

## 패키지
    - 패키지 생성 규칙 및 관례
    1. 패키지는 전세계에서 유일하게 만드는 것이 좋다.
    - 일반적으로 인터넷 도메인 이름을 역순으로 사용한다.
      - `com.google.project.pack.abc`, `com.naver.cafe.member`
    2. 패키지 이름에는 모두 소문자만 사용한다.
    3. `.`을 사용해서 계층 구조를 만든다.
    4. 예약어를 사용할 수가 없다. `class`, `enum` `package` 사용불가
    5. 숫자로 시작할수 없다.
  
        - `package0` 상위패키지
            - `package0.first` 하위패키지
            - `package0.second`
            - 세 패키지는 계층 구조를 이루지만, 각각의 패키지는 서로 다른 패키지이다.

## 접근제한자 Access Modifier
    1. public
    - 어떤 클래스에서도 접근 가능
    - 사용자에게 접근을 열어두고 싶은 경우
    2. protected
    - 상속 관계에서 부모 클래스가 자식 클래스에세 접근 가능할 때 사용
    - 다른 패키지에 있을 경우에도.
    3. default (package-private)
    - 접근 제한자를 명시하지 않는 경우
    - 같은 패키지 내부에서만 접근, 사용이 가능하다
    4. private
    - 해당 멤버를 선언한 클래스에서만 접근 가능
    - 사용자에게 접근을 차단하고 싶은 경우, 내부 구현을 숨기고 싶은 경우

## Getter, Setter 메소드
    - 객체지향 프로그래밍에서는 일반적으로 객체의 필드값에 외부 직접 접근을 막는다.(private)
    - 사용자가 개발자의 의도에 맞게 변경하거나 값을 가지고 올 수 있도록 별도의 메서드를 만든다.
    - 데이터의 무결성을 유지할 수 있음.
    - 캡슐화 원칙을 실현하고, 데이터를 보호할 수 있음
    1. Getter : 필드의 안전한(제약조건, 무결성 유지하며) 읽기  `getSpeed`
    2. Setter : 필드의 값을 안전하게(제약조건, 무결성 유지하며) 설정  `setSpeed`

## 자바의 메모리 영역 구조
    1. 스택(Stack) 영역
     - 자바를 실행하면, 각 스레드에 의해 실행 스택이 생성되고, 
     - 메서드가 호출될 때마다 메서드를 위한 스택 프레임이 생성된다.
     - 스택 프레임에서는 변수 등이 선언되고 메서드 종료시 제거된다.
    2. 힙(Heap) 영역
     - 모든 객체와, 배열이 생성되고 동적으로 할당되는 영역
     - 모든 스레드에서 공유가 된다.
     - 더 이상 참조가 되지 않는 객체는 GC(Garbage Collector)에 의해 제거된다.
    3. 메서드(Method) 영역
     - 프로그램을 실행하는데 필요한 공통 데이터를 공유하는 영역
     - 모든 스레드에 공유되고, 한번 불러온 클래스 정보는 이 영역에 저장됨.
     - 클래스의 정보, 메서드의 실행 코드, static 영역, 상수 등을 보관

### Stack 자료구조와 Queue 자료구조
    1. Stack 자료구조
        - 후입선출(LIFO : Last In First Out) 방식으로 작동
        - 마지막에 들어간 데이터가 먼저 나온다.
        - 프링글스 통, 입구가 좁은 냉장고 칸
        - 활용 
            - 웹브라우저의 뒤로가기 / 앞으로 가기
            - 실행 취소(Ctrl + Z) / 재실행
            - 자바의 스택 영역
            - 일반적으로 데이터 입력을 push, 출력을 pop이라고 한다.
        - 데이터 삽입 예시
            - 1 (push) -> 2 (push) -> 3 (push) -> 3(pop) -> 2(pop) -> 1(pop)
    2. Queue 자료구조
        - 선입선출(FIFO : Fist In First Out) 방식으로 작동
        - 먼저 들어온 데이터가 먼저 나온다.
        - 식당에서 대기줄을 설때
        - 활용
            - 프린터 출력 대기 큐
        - 데이터 삽입 예시
            - 1 (입력) -> 2(입력) -> 3(입력) -> 1(출력) -> 2(출력) -> 3(출력)

## 변수의 종류 
    1. 인스턴스 변수
        - 클래스 내부에서 선언
        - 객체마다 독립적으로 존재하는 변수 (힙 영역에 매번 새로 만들어짐)
        - `static`이 붙지 않은 변수
        - 더 이상 참조하는 변수가 없을 경우 GC이 제거 (객체 소멸 시 함께 제거됨)
        - 객체의 상태를 저장하는데 사용
    2. 클래스 변수 
        - 클래스 내부에서 선언
        - 모든 객체에서 공유되는 변수 (메서드 영역에 저장)
        - `static`이 붙는 변수
        - 프로그램이 종료될 시 제거
        - 클래스의 공통적인 정보를 저장하는데 사용
    3. 지역 변수
        - 메서드 내에서 지역적으로 사용되는 변수
        - 메서드가 종료(스택 프레임이 제거)되면서 제거 
        - 매개변수(Parameter)도 동일한 생명주기를 갖는다.
        - 메서드와 관련된 임시적인 값을 저장할 때 사용
    - 생명주기 길이 순서
    - 클래스 변수 > 인스턴스 변수 > 지역 변수

## static 키워드
    - static 변수
        - 해당 클래스의 모든 인스턴스에서 공유되는 변수
        - 같은 클래스의 모든 객체는 같은 값을 갖게 됨.
        - 메소드 영역에 할당
        - 메모리 사용량을 줄여서 효율성을 높일 수 있음
        - 객체 생성 없이 사용할 수 있음.
    - static 메소드
        - 객체 생성 없이 호출할 수 있음.
        - static 메소드에서는 static 변수와, static 메소드만 접근 가능.
        - 주로 유틸리티성 함수를 작성하는데 사용된다.
    - static 키워드의 장점과 주의점
    - 장점 : 메모리 사용 효율화, 코드 간결성
    - 주의점 : 캡슐화를 약화시킬 수 있음. 코드 이해가 어려울 수 있음.

## 상속 Inheritance
    - 객체지향의 핵심 개념 중 하나
    - 한 클래스가 다른 클래스의 필드와 메서드를 이어받아 사용할 수 있음 
    - 코드의 재사용성을 높이고, 중복을 줄이고, 구조를 체계적으로 관리할 수 있음.

    - 부모 클래스(Super Class) : 상속을 통해 다른 클래스에 필드와 메서드를 제공
    - 자식 클래스(Sub Class) : 부모 클래스로부터 필드와 메서드를 상속받는 클래스

    - "is-a" 관계를 모델링한다.
        - Dog is a Animal.  : Dog 클래스는 Animal 클래스에게 상속 받음.
        - HydroCar is a Car. : HydroCar 클래스는 Car 클래스에게 상속받음.
    - 자바에서는 상속 대상은 하나만 선택할 수 있다.
    - 다중 상속은 다이아몬드 문제가 발생할 수 있어 다중상속을 허용하지 않음.
    - 자식 클래스는 부모 클래스를 알지만, 부모 클래스는 자식 클래스를 모른다.

    - 상속 관계의 메모리 구조
        - 상속 관계의 객체를 생성하면 부모와 자식이 모두 생성된다.
        - 상속 관계 객체를 호출할 때, 호출자의 타입을 통해 대상 타입을 찾는다.
        - 대상 타입에서 메서드를 찾지 못할 때, 부모 타입의 메서드를 찾아 실행한다.

    - 메서드 오버라이딩
        - 상속을 통해 얻은 메서드를 자식 클래스에서 재정의 하는 것.
        - 상속받은 메서드의 구현부를 변경할 수 있다.
        - 오버라이딩 조건
            - 메서드 이름이 같아야 한다.
            - 매개변수가 같아야 한다.
            - 접근제어자가 부모보다 같거나 넓어야 한다.
        - @override 애노테이션을 사용한다.
    
    - 메서드 오버로딩(Overloading)과 오버라이딩(Overriding)의 차이
        - 오버로딩 : 같은 이름의 메서드를 여러개 정의하는 것.
        - 오버라이딩 : 하위 클래스에서 상위 클래스 메서드를 재정의 하는 것.

    - 상속을 사용할 때 주의할 점
         1. "is-a" 관걔가 성립할 때만 사용. 기타 다른 경우 예를 들어 "has-a" 관계
          일 때는 상속보다 포함(Composition)을 사용하는 것이 더 권장된다.
            - Car is a Tire. (X 상속X) Car has a Tire. (0 포함)
         2. 너무 깊은 상속 트리는 피한다.
            - 코드를 이해라기 어렵고, 유지보수가 복잡해질 수 있습니다.
         3. 부모 클래스의 변경에 주의한다.
            - Super Class 변경시 모든 자식 클래스의 영향을 미친다.
            - 코드 의존성이 증가한다.

## 다향성 (Polymorphism)
    - 객체가 여러 형태를 가질 수 있는 성질
    - 부모 클래스 타입의 참조 변수로 자식 클래스 타입의 객체를 참조 가능


## 인터페이스
    - 메모리 구조상 클래스, 추상 클래스, 인터페이스는 동일하다.
    - 컴파일 될 때 '.class'파일로 컴파일 되고, 소스 코드도 '.java'로 작성된다.
    
    - 상속과 구현
        - 부모 클래스 기능을 자식 클래스가 상속 받을 때 'extend(확장, 상속)'
        으로 표현 하지만.
            - 부모의 기능을 물려받는 것이 목적
        - 부모 인터페이스의 기능을 자식 클래스가 상속받을 때는 'implements(구현)'
        으로 표현한다
            - 물러받는 기능은 없고, 자식이 모든 메서드를 구현해야 할 의무가 있음

    - 인터페이스를 사용하는 이유
        1. 제약 : 추상 클래스는 본문을 가진 실행 가능한 일반 메서드 끼어들 
        수 있다. 상속받은 자식 클래스에서 기능을 구현하지 않을 수 있는 가능성이 있다.
         .해당 문제 원천 차단 가능
        2. 다중 구현 가능 : 자바 클래스는 다중 상속이 불가능, 부모 클래스로 하나만
        지정 가능한데, 인터페이스는 다중 구현(다중 상속)이 가능

## 객체지향 프로그래밍
    - OOP 4대 특성
        - 캡슐화, 추상화, 상속, 다양성
    - OOP 5대 원칙 (SOLID)
        1. SRP : Single Responsibility Principle - 단일책임원칙
            - 하나의 클래스는 하나의 책임만 가져야 한다.
        2. OCP : Open Closed Principle - 개방폐쇄원칙
            - 확장에는 열려 있어야 하지만, 수정에는 닫혀 있어야 한다.
        3. LSP : Liskow Substitution Principlr - 리스코프 치환원칙
            - 객체는 해당 객체의 하위타입으로 치환할 수 있어야 한다.
        4. ISP : Interface Segregation Principle - 인터페이스 분리원칙
            - 필요하지 않은 인터페이스는 분리시켜야 한다.
        5. DIP : Dependancy Inversion Principle - 의존성 역전원칙
            - 세부사항은 추상화에 의존해야 하고, 추상화는 세부사항에 의존해야 한다.
    
    - 실세계의 사물과 개념을 추상화하여 표현한 객체(Object)들의 모임,
    각 객체(데이터와 행위)는 메시지를 주고받으며, 상호작용한다. = > 객체의 협력
    - 유연하고 변경이 쉬운 소프트웨어 개발
        - 컴포넌트를 쉽고 유연하게 변경하고, 블럭을 조립하듯이 개발

    - 역할(Role)과 구현(Implementation)으로 구분

        - 역할 : 객체가 시스템에서 수행하는 책임과 기능,
                 하나 이상의 역할 가질 수 있음
        - 구현 : 객체의 역할을 실제 코드로 구현 => 구현 클래스
        - 역할과 구현을 분리하면 클라이언트에 영향을 주지 않는 변경이 가능하다.
        - 인터페이스를 설계할 때 잘 설계하는 것이 필요.
    - 객체의 협력 : 서버와 클라이언트
        - Server : 요청을 받는 쪽 (응답 : response)
        - Client : 요청을 하는 쪽 (요청 : request)
## 예외(Exception)
    - 프로그램 실행 중 발생할 수 있는 두 가지 문제
      1. Error (에러 오류)
        - 시스템 레벨에서 발생하는 심각한 문제
        - 프로그램 외부에서 발생.
        - 하드웨어 장애, 시스템 크래시. 자바가상머신 에러
        - 소스 코드로는 복구가 불가능
      2. Exception(예외)
        - 프로그램 실행 중 발생할 수 있는 일반적인 문제
        - 개발자가 코드를 통해 적절하기 처리하면 정상적인 실행을 할 수 있음
          1. Checked Exception : 컴파일 시점에 체크되는 예외.
          2. Unchecked Exception : 실행 시점(Runtime)에 발생하는 예외.
             - 주로 RuntimeException 클래스에서 상속받음.
## Generic의 장점
    1. 타입 안전성(Type Safely)를 가짐
      - 컴파일 시점에 타입 체크를 수행할 수 있어. ClassCastException을 방지
    2. 코드 재사용성의 향상
      - 다양한 타입의 데이터에 대해 재사용 가능하여, 코드의 양을 줄인다.
    3. 타입 캐스팅 감소
      - 캐스팅 연산자를 사용하지 않아서 깔끔하고 가독성 향상
## TreeSet, Comparable, Comparator
    - TreeSet : Red-Black tree 자료 구조를 사용하여 요소를 자동 정렬하여 저장
     - 고성능 검색 : Binary Search(이진 검색 적용), 시간 복잡도 0(log n)
     - TreeSet에 저장되는 요소는 항상 비교가 가능해야 한다. (Comparable)
     - Comparable 인터페이스가 구현되거나, 생성자에 비교자 Comparator 가 제공되어야 함
    - Comparable
     - 자연스러운 순서를 정의하기 위해, 클래스 내부에 구현 
     - 구현된 클래스들 : 기본 타입의 포장 클래스, 문자열 클래스, 날짜 및 시간 클래스,
        파일 클래스 등
     - 구현된 compareTo 메서드를 사용
    - Comparator
     - 객체 외부에 구현될 수 있고, 다양한 정렬 기준을 적용할 수 있음.
     - sort() 등의 메서드에 정렬 로직을 제공할 때 사용
     - 람다식 또는 메서드 참조 등으로 간결하게 사용할 수 있음.
## 람다식
    - 함수형 프로그래밍을 지원하기 위해 자바 8버전에 도입된 기능
    - 메서드(함수)를 식으로 표현한 것, 간결하고 읽기 쉽게 만듬
    - 람다식의 형태
        - '(매개변수들) -> 표현식'
        - '(매개변수들) -> { 명령문1; 명령문2; }'
    - 매개변수 : 입력값, 괄호 안에 매개변수를 정의하고, 타입을 생략.
    - -> : 람다식을 나타내고, 입력값과 본문을 구분함.
    - 표현식 또는 { 명령문; } : 메서드의 본문, 한 줄로 표현하거나, 여러 줄 표현
      (여러 줄일 경우 중괄호)

## 함수형 프로그래밍
    - 핵심 개념
     1. 순수 함수(Pure Function)
        - 함수의 return 값이, 오직 입력값(매개변수)에만 의존하고,
        - 프로그램의 상태를 변경하거나, 외부 환경에 영향을 미치지 않는 함수
        - (side Effect , 부작용)이 없는 함수
        - 항상 같은 입력 -> 같은 출력 (예측가능성)
     2. 불변성(Immutability)
        - 데이터가 생성된 후에는 내용을 변경할 수 없음
        - 변경하고 싶을때는 복사본을 만들어 변경사항을 적용
        - (프로그램의 복잡성을 줄이고, 안정성을 높임)
     3. 일급 객체 함수(First-class Function)
        - 일급 객체 : 변수에 할당하거나, 함수의 인자로 전달하거나, 
         리턴값으로 받을 수 있는 객체 
        - 함수를 일급 객체처럼, 변수, 인자, 리턴값으로 사용할 수 있음.
     4. 고차 함수(Higher-Order Function)
        - 함수를 메섣의 인자로 받거나, 결과로 반환하는 함수
        - 데이털 구조를 간결하고 효율적으로 처리할 수 있음.
        - map, filter, reduce 등
     - 함수형 프로그래밍의 장점
        - 예측 가능성과 안정성, 신뢰성을 향상
        - 함수를 조합하여 재사용할 수 있음
        - 외부 상태를 변경하지 않기 때문에, 멀티코어, 분산 시스템, 
         병렬처리에 효율적임

## 함수형 인터페이스
     - @FuntionalInterface
        - 단일 추상 메서드 (Single Abstract Method) : SAM
        - 추상 메서드가 단 하나만 있는 인터페이스
     - 람다식과 1:1로 대응이 될 수 있게
## 스트림 API
     - Stream : 데이터의 흐름, 데이터의 물줄기
     - 다양한 데이터 소스(컬렉션, 배열, I/O, 파일 리소드 등)에서 데이터를 추출하여 
     연속적으로 처리 -> 함수형 스타일로 추상화, 간결화하게 표현 가능
     - 2가지 유형의 연산이 존재
        1. 중간 연산(Intermediate Opertation)
            - 하나의 스트림에서 다른 스트림으로 데이터를 전달
            - 입력값이 스트림, 연산 결과(리턴값)도 스트림
            - 지연 평가(Lazy Evaluation) : 최종 연산이 될 때까지 실제 연산을 실행 
             하지 않음
                - 불필요한 계산을 최소화 (작업을 미룸)
        2. 최종 연산(Terminal Opertation)
            - 계산을 실행하고 결과를 반환
            - 데이터의 흐름을 소비해서 실제 모든 연산을 실행함.
            - 한 번 최종연산된 스트림은 더 이상 사용할 수 없다.
    - 내부 반복(Iternal iteration) : 내부에서 요소들을 직접 처리하여 개발자가 반복물을
    작성할 필요가 없이, 간결한 표현으로 데이터 처리를 도움
## 병렬 처리에 영향을 미치는 요인
        병렬이 순차보다 항상 빠른 것은 아니라, 요인을 고려해야 함
    1. 데이터 요소(element)의 숫자와 요소당 처리 시간
      - 포크와 조인 단계에 스레드 풀 생성에 추가 간접 비용 발생
    2. 스트림 소스 자료구조(collection)의 종류
      - ArrayList는 병렬에 쉬운 편, Hash tree Link 구조는 분리가 쉽지 않음
    3. 하드웨어와 core의 수
      - 코어 수가 많을 경우 병렬스트림 성능이 더 좋음
## 스레드
    - 프로세스 : 실행 중인 프로그램. 애플리케이션
      - 자신만의 독립적인 메모리 공간을 가짐.
      - 다른 프로세스는 서로 메모리 직접 접근 불가
      - 최소 하나 이상의 스레드를 포함
    - 스레드 : 프로세스 내에서 실제로 작업을 하는 '실행 흐름'
      - 경량 프로세스
      - 프로세스의 자원과 메모리를 공유함
      - 멀티 스레딩 : 하나의 프로세스의 여러개의 스레드가 동시에 실행되는 것
    - 멀티 스레딩 환경 메모리 구조
      - 힙 영역 : 모든 스레드가 공유하는 메모리 영역, 객체와 배열이 할당되는 곳
      - 스택 영억 : 각 스레드는 독립적인 스택을 가짐. 메서드 호출 시 지역변수,
        매개변수, 리턴값 등을 저장하는 곳
      - 메서드 영역 : 모든 스레드가 공유하는 메모리 영역, 클래스 정보, 상수, static
        변수 등 저장
## 스레드의 생명주기 (lifeCycle)
    1. New           : 스레드가 생성되고 start 가 아직 호출되기 전
    2. Runnable      : start가 호출되어 언제든지 실행될 수 있는 상태
    3. Waiting       : 다른 스레드의 작업이 완료되기를 기다리는 상태
    4. Timed Waiting : 지정된 시간만큼 대기하는 상태 sleep
    5. Blocked       : Lock을 보유한 스레드가 있어서 실행이 불가한 상태
    6. Terminated    : 스레드 작업 완료되었거나 예외 발생으로 종료된 상태
      
    - 스레드를 일시정지 (Waiting, Timed Waiting) 상태로 보냄
        - wait()
        - join()
        - sleep()
    - 일시정지 상태인 스레드를 실행 상태(Runnable) 이나 종료 상태(Terminated)로 만듬
        - notify()
        - interrupt()
## 동기화
    - 멀티 스레드 환경에서 일관성, 무결성을 유지하기 위해 동기화 기법을 사용
    - 경쟁 상태(Race Condition) : 두 개 이상의 스레드가 하나의 자운에 접근하여
     서로의 결과에 영향을 미치는 상황
    - 데드 락(Dead Lock) : 두 개 이상의 스레드가 서로 상대방의 작업 완료를 무한한게
    기
    - 동기화 기법
      1. synchriniaed 블록 : 특정 부분, 특정 객체에 대한 동기화
      2. synchronized 메서드 : 메서드 전체를 동기화
      3. volatile 키워드 : 선언된 변수의 최신 값을 모든 스레드가 볼 수 있게 (가시성 문제 해결)

## 교착상태 (Dead Lock)
    - 멀티 스레딩 환경에서 두개 이상의 스레드나 프로세스가 서로가 보유한 자원을 서로
     요구 하면서 무한히 대기하는 상태 => 어떤 스레드도 더 이상 진행 할 수 없기 때문에 멈춤

    - 교착상태가 발생하는 네 가지 조건 (동시에 만족)
        1. 상호 배제(Mutual Exclusion) : 한 번에 하나의 스레드만 자원을 사용할 수 있음.
        2. 소유 및 대기(Hold and Wait) : 최소한 하나의 자원을 보유한 상태에서, 다른 스레드
         가 보유한 추가 자원을 대기하는 스레드 있음.
        3. 비선점(No Preemption) : 자원을 보유한 스레드가 사용을 해제할 때까지 다른 스레드
         에 의해 선점이 될 수 없음.
        4. 순환 대기(Circular Wait) : 각 스레드가 순환적으로 다음 스레드가 요구하는 자원
         을 보유하는 상태
    - 철학자들의 식사 문제
    - 교착상태 문제 해결
      - 4가지 조건 중에 하나만이라도 제거하면 교착상태 풀림.
        - 상호배제 조건 제거 : 자워능ㄹ 다른 스레드들이 동시에 사용할 수 있게
        - 소유 및 대기 조건 제거 : 한 스레드가 자원을 내려놓으면 됨.
        - 비선점 조건 제거 : 선점할 수 있게 하면 됨. (OS)
        - 순환 대기 조건 제거 : 자원에 순서를 할당하고, 순차적으로 자원 요청

## 입출력 스트림
    - 데이터가 흐름을 통해서 출발지에서 도착지로 흘러서 이동하는 매개
      - 출발지 : 키보드, 파일, 프로그램, 네트워크 ... (출력 스트림)
      - 도착지 : 모니터, 파일, 프로그램, 네트워크 ... (입력 스트림)
    - 입력(Input) 스트림 : 데이터를 읽고, 파일에서 데이터를 읽거나, 네트워크에서 데이터를 받거나
    - 출력(Output) 스트림 : 데이터를 쓰고, 파일에 데이터를 쓰거나, 네트워크에 데이터를 보내거나

    - 스트림 타입
      - byte 스트림 : 그림, 동영상, 문자 등 모든 데이터를 입출력할 때 사용
      - 문자 스트림 : 문자 데이터를 처리하는 스트림.
    
    - java.io 패키지에서 제공
      - 바이트 스트림
        - 최상위 클래스
         - InputStream 
         - OutputStream
        - 하위 클래스
         - XXXInputStream
         - XXXOutputStream
      - 문자 스트림
        - 최상위 클래스
         - Reader
         - Writer
        - 하위 클래스
         - XXXReader
         - XXXWriter
    
    - 자바 8버전의 스트림API와는 다름.

## 보조 스트림
    - 1. 문자열 변환 스트림 : InputStreamReader, OutputStreamWriter
      - 바이트스트림 -> 문자열 스트림, 바이트의 데이터의 특정 문자 인코딩을 텍스트로 읽거나 쓸 수 있음.
    - 2. 성능향상 스트림 : BufferInputStream, BufferOutputStream, BufferReader, BufferWriter
      - 데이터를 처리할 때 내부적으로 버퍼를 사용해서 데이터를 임시 저장하여 입출력 효율을 높임
    - 3. 기본타입 스트림 : DataInputStream, dataOutputStream
      - 기본 타입(int, long, double ..)을 바이트 스트림으로 쓰거나 읽거나 할 수 있음
    - 4. 프린트 스트림 : PrintStream
      - print(), println(), printf() 메서드를 지원하는 보조 스트림
    - 5. 객체 직렬화 스트림 : ObjectInputStream, ObjectOutputStream
      - 객체를 직렬화(객체 -> 바이트 스트림). 역직렬화(바이트 스트림 -> 객체)

\\10.100.203.3\share