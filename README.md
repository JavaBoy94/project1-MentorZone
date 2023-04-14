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
- `Language` : Java 11, HTML5, CSS3, JavaScript
- `IDE` : IntelliJ IDEA, Visual Studio Code
- `Framework` : Springboot
- `Database` : MySQL
- `Template Engine` : Thymeleaf 
- `ORM` : JPA <br>

## 🧑‍🤝‍🧑 팀 구성 및 역할
#### 👨‍💻팀장 : 김필수 <br>
#### `Controller` : MainController / AdminController / ChatBotController <br>
#### `Templates` : index / admin / fragments <br>
- 프로젝트 일정 관리 및 발표준비
- 소스 통합 및 형상관리

<details>
<summary>상세보기</summary>
<br>
<p align="center"><img src="https://user-images.githubusercontent.com/116870617/231911826-6b80cac9-204b-4b83-bc09-93219e2d4330.png" style="width: 700px"></p> 
<br>
<p align="center">프로젝트 형상관리를 위한 기본 저장소를 생성합니다.</p>
<br>
<p align="center"><img src="https://user-images.githubusercontent.com/116870617/231911827-171bd537-dcbc-4725-8649-7f353c0f51a1.png" style="width: 700px"></p>
<br>
<p align="center">팀원들을 collaborators 및 contributers로 지정하여 저장소에 대한 pull Request뿐만 아니라 직접적인 push, pull의 권한을 부여하였습니다.</p>
<br>
<p align="center"><img src="https://user-images.githubusercontent.com/116870617/231911828-4e900412-9fbe-4cc9-ac49-a25946e82122.png" style="width: 700px"></p>
<br>
<p align="center">프로젝트 저장소를 fork하여 팀원 각자가 복사한 저장소를 통해 담당 파트별 소스코드를 업데이트할 수 있도록 합니다.</p>
<br>
<p align="center"><img src="https://user-images.githubusercontent.com/116870617/231911830-c32ffbdf-c60f-4204-af24-1d13cc0a5b91.png" style="width: 700px"></p>
<br>
<p align="center">특정 파트의 코드가 업데이트 되는대로 fork 저장소에서 프로젝트 저장소에 pull Request를 보냅니다.</p>
<br>
<p align="center"><img src="https://user-images.githubusercontent.com/116870617/231911831-d6f95fbe-349c-4390-a33f-45c187e06bb3.png" style="width: 700px"></p>
<br>
<p align="center">pull request의 커밋 내역을 확인하여 confirm을 통해 해당 수정사항을 프로젝트 저장소의 소스와 merge한 뒤,</p>
<p align="center">각자의 fork 저장소에서 최신화합니다.</p>
<br>
</details>

- 데이터 모델링 및 Entity, DTO 구현
- 메인 페이지(index) 구현

<details>
<summary>상세보기</summary>
<br>
  <p align="center"><img src="https://user-images.githubusercontent.com/116870617/231920398-99017e79-96b6-4673-85c5-0c9607140e1b.png" style="width: 700px"></p> 
<br>
  <p align="center">header와 footer를 공통요소(fragments)로 분리한 후, 카테고리별 최신 상품 정보와 자동재생 갤러리, 챗봇 등을 구현하였습니다.</p>
<br><br>
  <p align="center"><img src="https://user-images.githubusercontent.com/116870617/231920403-83bef557-74d4-4fd5-b879-261b350d3e53.png" style="width: 700px"></p> 
<br>
<p align="center">카테고리별 상품 리스트를 가져온 뒤, 등록일 순으로 내림차순하여 최신 상품의 DTO를 브라우저에 노출시킵니다.</p>
<br>
  
  ```java
// ---------- MainCotroller --------------
  
@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class MainController {

    private final MemberRepository memberRepository;
    private final ProductService productService;

    @GetMapping({"","index"})
    public String index(Model model){

//  최신강의 기본 상품 표시 (it)

        ProductDto productDto = new ProductDto();

        List<ProductDto> productDtoList = productService.ItProductListDo("it");
        if (productDtoList.isEmpty()){
            productDto = null;
        } else {
            productDto = productDtoList.get(0);
        }
            model.addAttribute("productDto",productDto);
            return "index";
        }
  
 // --------- productService -------------
  
  // 상품 목록 상세 페이지 가져오기(It)
    public List<ProductDto> ItProductListDo(String productType) {

        List<ProductEntity> ItProductEntityList = productRepository.findByProductTypeDesc(productType);
        List<ProductDto> ItProductDtoList = new ArrayList<>();

        for(ProductEntity productEntity : ItProductEntityList){
            ItProductDtoList.add(ProductDto.toProductDto(productEntity));
        }


        return ItProductDtoList;
  
 // --------- productRepository ----------
  
  // JPA의 기본 SQL메소드에 없는 쿼리요청은 네이티브 쿼리(@Query)를 사용
  @Query(value = "select * from product where product_type =:type order by product_create desc",nativeQuery = true)
    List<ProductEntity> findByProductTypeDesc(@Param("type") String productType);
  
  ```
  
<br><br>
  <p align="center"><img src="https://user-images.githubusercontent.com/116870617/231920404-c781c7f9-841e-4133-8b36-cf4771d25c51.png" style="width: 700px"></p> 
<br>
  <p align="center">자동재생 갤러리는 javascript를 이용하여 이미지 요소에 별도의 class를 설정한 뒤,</p>
  <p align="center">일정한 시간간격으로 해당 class요소만 노출되도록 설정하였습니다.</p>
  <br>
  
  ```html
  <!-- 자동갤러리 -->
        <div class="gallery">
            <div class="con">
                <div class="gallery-con">
                    <ul>
                        <li class="fadeLi"></li>
                        <li></li>
                        <li></li>
                        <li></li>
                    </ul>
                </div>
                <div class="arrow-con">
                    <span class="arrow left" id="arrow-left"></span>
                    <span class="arrow right" id="arrow-right"></span>
                </div>
                <div class="item-con">
                    <ul>
                        <li class="on"></li>
                        <li></li>
                        <li></li>
                        <li></li>
                    </ul>
                </div>
            </div>
        </div>
  ```
  
  ```javascript
  
// 자동갤러리

const galleryLi = document.querySelectorAll('.gallery-con>ul>li');
const itemLi = document.querySelectorAll('.item-con>ul>li');

let i = -1;

function autoGallery(){
  // i가 갤러리 이미지 총 갯수에 도달할 경우 시작번호(0)로 세팅
  if(i>=galleryLi.length-1){
    i=-1;
  }
  i++;

  console.log(`i=>${i}`);

  galleryLi.forEach((el,idx)=>{
    if(i==idx){
      el.classList.add('fadeLi');
    } else {
      el.classList.remove('fadeLi');
    }
  })

  itemLi.forEach((el,idx)=>{
    if(i==idx){
      el.classList.add('on');
    } else {
      el.classList.remove('on');
    }
  })

}
// 3초마다 autoGallery 함수 실행
let setIn = setInterval(autoGallery,3000);

// 즉시실행 함수 (페이지 로드시 바로 실행)
(function(){
  autoGallery();
})()
  ```
  
<br>
</details>

- 관리자 페이지(admin) 구현
- 공통요소(fragments) 디자인
- 웹소켓, Stomp 기반 챗봇(chatbot) 구현 <br>

#### 👨‍💻팀원 : 김현기 <br>
#### `Controller` : MemberController <br>
#### `Templates` : login / signUp <br>
- 로그인(login), 회원가입(signUp) 구현
- Naver Open API(workplace, work) 연동 <br>

#### 👨‍💻팀원 : 김홍록 <br>
#### `Controller` : ProductController / WishController <br>
#### `Templates` : product <br>
- 상품상세 페이지(productDetail) CRUD, 상품검색 구현
- 장바구니 추가 및 상품구매 구현 <br>

#### 👨‍💻팀원 : 이정모 <br>
#### `Controller` : MemberController / ProductController <br>
#### `Templates` : member / wish <br>
- 회원상세 페이지(memberDetail), 장바구니 목록, 구매내역 CRUD 구현 <br>

#### 👨‍💻팀원 : 장기운 <br>
#### `Controller` : ProductController <br>
#### `Templates` : product <br>
- 카테고리별 상품게시판 페이지(productList) 구현
- Github Actions, AWS EC2 기반 CI/CD 구현 <br>
