# 요구사항
표를 검사하고 극장에 입장시키는 시스템
- 표가 있어야만 극장에 입장할 수 있다
- 표는 구매할 수 있다
- 초대장이 있다면 추가요금 없이 표로 바꿀 수 있다
- 고객은 초대장이 있거나 없을 수 있다

# 주요개념
- 소프트웨어 모듈의 3가지 목적(로버트 마틴)
    - 실행중에 제대로 동작해야한다
    - 변경하기 쉬워야한다(항상 변경되기 때문이다)
    - 읽고 이해하기 쉬워야한다
- 코드의 동작이 우리의 예상에서 크게 벗어나지 않아야한다
    - 소극장이 매표소의 티켓에 접근하고, 고객의 가방에 접근하는 것은 우리의 예상을 벗어난다
    - 대신 모든 객체를 의인화한 상태로 이해해야한다
    - 요구사항을 제대로 분석하고 클래스를 설계하는 것은 기본중의 기본이다
- 최소한의 의존성만 가져야한다
    - 클래스 다이어그램을 그려보고 과한 의존성은 제거해주는 것이 좋다
    - 의존이 강하면 변경에 취약하다(객체의 변경이 다른 객체에게 영향을 미침)
- 캡슐화를 통해 객체 내부의 세부적인 사항을 감추는 것이 좋다
    - 외부에서 객체의 세부적인 사항에 직접 접근할 수 없으므로, 결합도가 낮아지게 된다
    - 객체의 세부적인 사항에 직접 접근하면 할수록 중복이 많아지게 된다
- 자신의 일,데이터는 자신이 직접 책임지고 수행해야한다
    - 자신의 일이 아니라면 다른 객체에게 위임해야한다
    - 자신과 밀접하게 연관된 작업만을 수행해야한다(높은 응집도)
- 책임이 적절하게 분산 되어야한다
    - 자신을 스스로 책임지는 객체들과 메시지를 통해 소통하면서 기능을 완성해 나가야 한다
- 작은 메서드로 코드를 작게 분리하는 것은 매우 유용하다
    - 작은 메서드지만, 메서드 자체가 의사소통의 수단이 된다
- 트레이드 오프의 순간들도 자주 마주하게 될 것이다

> 룰을 만드려고 하지말고, 위의 개념들을 머리속으로 잘 이해하는 것이 중요하다

의문(deprecated)
- 표를 얻고, 표를 쓴다 의 2step 으로 가는건 맞는 행위인가? 이상하지 않은가? 이상하다면 어디가 이상한가?
- Optional 을 필드에 쓰는건 맞는행위인가? 언제 Optional을 필드에 써야할까?
- 파라미터로 전달한 오브젝트의 상태를 바꾸는건 좋은 행위인가 나쁜 행위인가?
  - 값을 직접 바꾸지 않고 메서드를 호출해서 바꾸는건 괜찮지 않을까?
- 애초에 이렇게 까지 하드하게 룰을 짤 필요가 있을까? 간단한 법칙들만 지키면 되지 않을까?
- 왜 어려울까?
  - 문서화된 룰을 만들고 싶지 않기 때문
  - 객체의 생성자, 메서드들만 보고도 객체가 무엇을 하는 애인지 알게 하기 위함
  - 객체에서 제공하는 인터페이스가 객체의 데이터를 제한적으로 컨트롤하게 하기 위함