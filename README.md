## 미션 - 숫자 야구 게임

### 구현 기능 목록

#### 정답 생성
**🔆 목표 : 1-9까지의 서로 다른 임의의 수 3개를 정답으로 정한다.**

  [ ] 자료구조(Set)을 활용하여 크기가 3이 될 때까지, 1-9까지의 랜덤한 숫자를 입력받는다.
  [ ] 정답인 경우, 다시 정답을 생성한다.

#### 플레이어
**🔆 목표 : 플레이어로부터 올바른 서로 다른 임의의 수 3개를 문자열로 입력받은 후 심사를 요청한다.**
**🔆 목표 : 정답인 경우 게임 지속 여부에 대한 입력을 받는다. (진행 : 1, 종료 : 2)**

  [ ] 플레이어의 상태는 게임 진행중 True로 초기화한다.
  [ ] 플레이어의 상태가 진행중인 경우, 플레이어로부터 서로 다른 임의의 수 3개를 문자열로 입력받는다.
  [ ] 임의의 수 3개가 올바른 입력인지 유효성 검사를 시행한다.
      [ ] 예외 : 3개 이상의 입력인 경우
      [ ] 예외 : 숫자가 아닌 입력이 포함된 경우
      [ ] 예외 : 중복인 숫자를 입력한 경우
  [ ] 올바른 입력인 경우 숫자 리스트로 변환한다.
  [ ] [심판]에게 판정을 요청한다.
  [ ] 정답인 경우, 게임 지속 여부에 대한 입력을 받는다. (진행 : 1, 종료 : 2)
      [ ] 1을 입력한 경우, 플레이어의 상태는 게임 진행중 True로, 다시 서로 다른 임의의 수 3개를 문자열로 입력받는다.
      [ ] 2를 입력한 경우, 플레이어의 상태를 게임 진행중을 False로 변경하며 게임이 종료된다. 
      [ ] 예외 : 숫자가 아닌 입력을 한 경우
      [ ] 예외 : 1,2가 아닌 숫자를 입력한 경우
  [ ] 정답인 경우, 자동으로 정답은 다시 생성된다.

#### 볼
**🔆 목표 : 플레이어의 입력과 정답을 비교하여 스트라이크, 볼의 개수를 카운트한다.**

  [ ] 스트라이크인 숫자가 있을 때마다 리스트에 스트라이크를 저장한다.
  [ ] 볼인 숫자가 있을 때마다 리스트에 볼을 저장한다.

#### 결과  
**🔆 목표 : 볼, 스트라이크리스트를 종합하고, 정답여부를 확인한다.**

  [ ] 스트라이크, 볼리스트를 하나로 모은다.
  [ ] 3스트라이크인지 확인한다.

#### 심판
**🔆 목표 : 종합된 결과 및 정답여부를 출력한다.**

  [ ] 경기규칙대로 종합된 결과를 출력한다.
  [ ] 정답여부를 출력한다.
 
