<p align="center">
  <img src="https://user-images.githubusercontent.com/116870617/231695054-5832b536-59d8-4d3c-9043-7b56da96b74f.png">
</p>

# MentorZone (멘토존)
## 쇼핑몰 &amp; 관리자 모드 기반 챗봇 구현 프로젝트 (2023.02.13 ~ 2023.03.13)

## 🖥️ 프로젝트 소개
- 재능마켓 플랫폼(크몽)을 참고하여 만든 전자책(PDF) 판매 쇼핑몰입니다.
- 약 4주간의 개발기간을 두었으며, 기본적인 쇼핑몰 기능 외에 관리자 페이지와 챗봇 기능도 추가하였습니다.

## 🧑‍🤝‍🧑 팀 구성 및 역할
#### 팀장 : 김필수 <br>
- 프로젝트 일정 관리 및 발표준비
- 소스 통합 및 형상관리
- 데이터 모델링 및 Entity, Dto 구현
- 메인 페이지, 관리자 페이지(회원관리, 상품관리, 주문관리) CRUD 구현
- 웹소켓, Stomp 기반 챗봇 구현 <br>

#### 팀원1 : 김현기 <br>
- 로그인 및 소셜로그인, 회원가입 구현
- Naver Open API(workplace, work) 조직배치, 결재, 드라이버 연동 <br>

#### 팀원2 : 김병현 <br>
- 장바구니, 상품구매 구현 <br>

팀원3 : 전성덕 - 1대1 문의 게시판(CRUD), 공지사항 게시판(CRUD)
팀원4 : 김창훈 - 1대1 문의 게시판(CRUD), 공지사항 게시판(CRUD)
팀원5 : 김성재 - 로그인, 회원가입, ID찾기, PW찾기
⚙️ 개발 환경
Java 8
JDK 1.8.0
IDE : STS 3.9
Framework : Springboot(2.x)
Database : Oracle DB(11xe)
ORM : Mybatis
📌 주요 기능
로그인 - 상세보기 - WIKI 이동
DB값 검증
ID찾기, PW찾기
로그인 시 쿠키(Cookie) 및 세션(Session) 생성
회원가입 - 상세보기 - WIKI 이동
주소 API 연동
ID 중복 체크
마이 페이지 - 상세보기 - WIKI 이동
주소 API 연동
회원정보 변경
영화 예매 - 상세보기 - WIKI 이동
영화 선택(날짜 지정)
영화관 선택(대분류/소분류 선택) 및 시간 선택
좌석 선택
결제 페이지
예매 완료
메인 페이지 - 상세보기 - WIKI 이동
YouTube API 연동
메인 포스터(영화) 이미지 슬라이드(CSS)
1대1문의 및 공지사항 - 상세보기 - WIKI 이동
글 작성, 읽기, 수정, 삭제(CRUD)
관리자 페이지
영화관 추가(대분류, 소분류)
영화 추가(상영시간 및 상영관 설정)
