# 이번장에서 익혀야 할 주요개념
- 어떤 클래스가 필요할지를 고민하기 전에 어떤 객체들이 필요할지 고민해야한다
- 객체는 독립적인 존재가 아니라 기능 구현에 협력하는 공동체의 일원이다
- 객체는 상태와 행동을 가지며, 스스로 판단하고 행동하는 자율적인 존재이다
- 접근제어자는 캡슐화를 더욱 강력하게 할 수 있는 도구이다
- 인터페이스와 구현의 분리는 객체지향 프로그래밍의 훌륭한 핵심원리이다
  - `인터페이스`는 외부에서 접근가능한 부분을 말하고, `구현`은 내부에서만 접근 가능한 부분을 말한다
  - 접근제어자를 통해 인터페이스와 구현(외부와 내부)을 명확하게 구분짓도록, 깔끔하게 분리하도록 노력해야 한다
- 설계가 필요한 이유는 변경을 관리하기 위해서이다
- 하나의 기능은 여러 객체들이 협력해서 이루어지므로, 객체를 항상 공동체의 일원으로 바라봐야 한다
  - 객체지향 프로그래밍시에는 먼저 협력의 관점에서 어떤 객체가 필요한지를 결정해야 한다
- 다형성을 이용하면 코드의 의존성과 실행 시점의 의존성을 다르게 할 수 있다
  - 코드의 의존성과 실행 시점의 의존성이 다를수록 코드는 더 유연해지고 확장 가능해지지만, 이해하기 더 여려워진다
  - 훌륭한 객체지향 설계자가 되기 위해서는 항상 유연성과 가독성 사이에서 고민해야 한다
  - 무조건 유연한 설계도, 무조건 읽기 좋은 코드도 정답이 아니다
  - **설계는 트레이드오프의 산물이다**
- 다형성이란 동일한 메시지를 수신했을 때 객체의 타입에 따라 다르게 응답할 수 있는 능력을 의미한다
- 객체는 다른 객체에 `메시지`를 전송하고, 객체는 수신된 메시지를 처리할 `메서드`를 선택한다
  - 다형성을 이용할 경우 메시지와 메서드를 구분할 수 있다
  - 클라이언트는 인터페이스의 메시지를 호출할 것이고, 전달된 객체에 따라 실행하는 메서드들이 달라지기 때문이다
- 추상화를 중심으로 코드의 구조를 설계하면 유연하고 확장 가능한 설계를 만들수 있다
  - 유연성이 필요할 경우 추상화를 사용하자
- **우리가 작성하는 모든 코드에는 합당한 이유가 있어야 한다**
- 항상 고민하고 트레이드 오프 해야한다
- 코드 재사용을 위해서는 상속보다는 합성이 더 좋은 방법이다
  - extends 해서 부모의 기능을 가지는 방법 vs 부모를 멤버변수로 넣어 사용하는 방법
  - 상속은 사실상 코드의 재사용이라기 보다는 인터페이스의 재사용이다
  - 게다가 상속은 자식 클래스가 부모 클래스에 너무 강하게 결합하므로, 캡슐화를 위반한다
  - 반면에 합성의 경우 메시지를 통해 느슨하게 결합된다
  - 또한 합성의 경우 인스턴스 교체가 쉬워서 설계를 유연하게 만들 수 있다
- 하지만 최종적으로 합성과 상속은 같이 사용할 수 밖에 없다
  - 코드의 재사용을 위해서는 합성이 좋다
  - 다형성을 위한 인터페이스 재사용을 위해서는 상속을 사용해야만 한다

접근제어자  
외부에서 대상 객체의 상태를 알거나 직접 개입하려고 해서는 안되며, 객체에게 원하는 것을 요청하고 객체가 스스로 최선을 방법을 결정할 수 있을 것이라고 믿고 결과를 기다려야 한다  

요구사항에서 필요한 객체들 추출  
메시지 추출  
메시지에 맞는 객체선택  
메시지를 처리하기 위한 메서드 작성  
메시지를 처리하기 위해 필요한 상태를 가짐  
메시지(책임) 주도로 설계해야한다  
협력 문맥을 고려하고 위의 행위를 한다? 이건 이해가 안된다  
객체가 탄생하고, 거기서 메시지를 전달하면서 협력이 생기는것은 아니었을까?  
협력은 어떻게 설계하는가?      