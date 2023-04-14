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

<details>
<summary>상세보기</summary>
<br>
<p align="center"><img src="https://user-images.githubusercontent.com/116870617/231911826-6b80cac9-204b-4b83-bc09-93219e2d4330.png" style="width: 700px"></p> 
<br>
<p align="center">프로젝트 형상관리를 위한 기본 저장소를 생성합니다.</p>
<br><br>
<p align="center"><img src="https://user-images.githubusercontent.com/116870617/231911827-171bd537-dcbc-4725-8649-7f353c0f51a1.png" style="width: 700px"></p>
<br>
<p align="center">팀원들을 collaborators 및 contributers로 지정하여 저장소에 대한 pull Request뿐만 아니라 직접적인 push, pull의 권한을 부여하였습니다.</p>
<br><br>
<p align="center"><img src="https://user-images.githubusercontent.com/116870617/231911828-4e900412-9fbe-4cc9-ac49-a25946e82122.png" style="width: 700px"></p>
<br>
<p align="center">프로젝트 저장소를 fork하여 팀원 각자가 복사한 저장소를 통해 담당 파트별 소스코드를 업데이트할 수 있도록 합니다.</p>
<br><br>
<p align="center"><img src="https://user-images.githubusercontent.com/116870617/231911830-c32ffbdf-c60f-4204-af24-1d13cc0a5b91.png" style="width: 700px"></p>
<br>
<p align="center">특정 파트의 코드가 업데이트 되는대로 fork 저장소에서 프로젝트 저장소에 pull Request를 보냅니다.</p>
<br><br>
<p align="center"><img src="https://user-images.githubusercontent.com/116870617/231911831-d6f95fbe-349c-4390-a33f-45c187e06bb3.png" style="width: 700px"></p>
<br>
<p align="center">pull request의 커밋 내역을 확인하여 confirm을 통해 해당 수정사항을 프로젝트 저장소의 소스와 merge한 뒤,</p>
<p align="center">각자의 fork 저장소에서 최신화합니다.</p>
<br><br>
</details>

- 데이터 모델링 및 Entity, DTO 구현
- 메인 페이지(index) 구현
<details>
<summary>상세보기</summary>
<br>
<p align="center"><img src="https://user-images.githubusercontent.com/116870617/231911826-6b80cac9-204b-4b83-bc09-93219e2d4330.png" style="width: 700px"></p> 
<br>
<p align="center">프로젝트 형상관리를 위한 기본 저장소를 생성합니다.</p>
<br><br>
</details>
- 관리자 페이지(admin) 구현
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
