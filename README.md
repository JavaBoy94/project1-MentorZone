<p align="center">
  <img src="https://user-images.githubusercontent.com/116870617/231695054-5832b536-59d8-4d3c-9043-7b56da96b74f.png">
</p>

# MentorZone (멘토존)
## 쇼핑몰 &amp; 관리자 모드 기반 챗봇 구현 프로젝트 (2023.02.13 ~ 2023.03.13)
## [프로젝트 소개 PDF](https://drive.google.com/file/d/1bpU7iVPnYZ2JlXM2T63D__F-oSB25bez/view?usp=share_link)

## 🖥️ 프로젝트 소개
- 재능마켓 플랫폼(크몽)을 참고하여 만든 전자책(PDF) 판매 쇼핑몰입니다.
- Spring MVC 패턴으로 개발하였습니다.
- 기본적인 쇼핑몰 기능 외에 관리자 페이지와 챗봇 기능도 추가하였습니다.
- Github Actions와 AWS EC2를 기반으로 CI/CD(지속통합/지속배포) 환경을 구축하였습니다.

## ⚙️ 개발 환경
- Language : Java 11, HTML5, CSS3, JavaScript
- IDE : IntelliJ IDEA, Visual Studio Code
- Framework : Springboot
- Database : MySQL
- Template Engine : Thymeleaf 
- ORM : JPA <br>

## 🧑‍🤝‍🧑 팀 구성 및 역할
#### 👨‍💻팀장 : 김필수 <br>
#### Controller : MainController / AdminController / ChatBotController <br>
#### Templates : index / admin / fragments <br>
- 프로젝트 일정 관리 및 발표준비
- 소스 통합 및 형상관리
- 데이터 모델링 및 Entity, DTO 구현
- 메인 페이지(index), 관리자 페이지(admin) CRUD 구현
- 공통요소(fragments) 디자인
- 웹소켓, Stomp 기반 챗봇(chatbot) 구현 <br>

#### 👨‍💻팀원 : 김현기 <br>
#### Controller : MemberController <br>
#### Templates : login / signUp <br>
- 로그인(login), 회원가입(signUp) 구현
- Naver Open API(workplace, work) 연동 <br>

#### 👨‍💻팀원 : 김홍록 <br>
#### Controller : ProductController / WishController <br>
#### Templates : product <br>
- 상품상세 페이지(productDetail) CRUD, 상품검색 구현
- 장바구니 추가 및 상품구매 구현 <br>

#### 👨‍💻팀원 : 이정모 <br>
#### Controller : MemberController / ProductController <br>
#### Templates : member / wish <br>
- 회원상세 페이지(memberDetail), 장바구니 목록, 구매내역 CRUD 구현 <br>

#### 👨‍💻팀원 : 장기운 <br>
#### Controller : ProductController <br>
#### Templates : product <br>
- 카테고리별 상품게시판 페이지(productList) 구현
- Github Actions, AWS EC2 기반 CI/CD 구현 <br>
