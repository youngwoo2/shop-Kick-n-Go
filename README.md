# 👟 Kick-n-Go

## 📄 프로젝트 소개

1. **주제 - Spring Webmvc를 통한 Admin(관리자) 입장에서의 쇼핑몰 web
   프로젝트** : 쇼핑몰 관리자 입장에서 온라인 쇼핑몰의 운영과 관리를 담당하는 관리 시스템입니다.주요 기능은 다음과 같습니다. 1. 상품관리 (상품등록, 조회, 수정) 2. 판매관리 (주문 조회, 취소주문 조회 및 수정, 배송 조회 및 수정) 3. 회원관리 (조회, 등급변경, 삭제) 4. 문의관리 (판매자 1대1 문의, 상품 관련 문의) 5. 통계 (연령별, 성별, 주문수, 기간별 통계)


## 팀원 구성
김도현 박정은 박태준 심재람 이영우 정성연


## Stack


- Programming : ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white) 
  ![HTML](https://img.shields.io/badge/html-%23E34F26.svg?style=for-the-badge&logo=html5&logoColor=white)
  ![CSS](https://img.shields.io/badge/css-%231572B6.svg?style=for-the-badge&logo=css3&logoColor=white)
  ![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=for-the-badge&logo=javascript&logoColor=%23F7DF1E)
- Framework : ![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
<img src="https://img.shields.io/badge/MYBATIS-444444?style=for-the-badge&logo=&logoColor=white">
- DB : ![MySQL](https://img.shields.io/badge/mysql-%2300f.svg?style=for-the-badge&logo=mysql&logoColor=white) 
- 협업 툴 : <img src="https://img.shields.io/badge/Discord-644?style=for-the-badge&logo=&logoColor=white">  <img src="https://img.shields.io/badge/Notion-12FFFF?style=for-the-badge&logo=&logoColor=white">  <img src="https://img.shields.io/badge/slack-0099FF?style=for-the-badge&logo=&logoColor=white">
- ERD 다이어그램 : <img src="https://img.shields.io/badge/Erdcloud-99?style=for-the-badge&logo=&logoColor=white">

## 프로젝트 구조
### ERD
-완성본 넣기

### 유스케이스 다이어그램
- 완성본 넣기

## 역할분담
- 김도현 : 리더, 통계 Front/Back단 구현, 문의관리 Front단 구현, 코드 총괄 마무리, 프로젝트 발표
- 박정은 : 상품 관리 Front/Back단 구현
- 박태준 : 로그인 구현, 회원관리 Front/Back 단 구현, 시연영상 제작
- 심재람 : 요구사항 명세 최신화 및 확정, 테이블 정의서 작성
- 이영우 : 판매관리 Front/Back 구현, README 작성
- 정성연 : 통계 Front/Back단 구현, 문의관리 Back 단 구현, 서기, 기획안 작성
- 공통 : 다이어그램(유스케이스, 시퀀스, E-R) 제작, 깃허브 이슈관리, PPT 제작


## 개발기간 및 작업관리
- 개발기간 : 2024-06-14 ~ 2024-06-28
- 작업관리 : 노션 및 깃허브를 이용한 작업관리


## 📌 주요기능

[//]: # (3개 각각 큰 기능들 소개)

#### 👕 상품관리
##### 1️⃣ 상품 등록/수정
- 관리자는 상품을 등록할 수 있습니다.
- 관리자는 상품정보를 수정할 수 있습니다.

##### 2️⃣ 상품 조회
- 관리자는 상품을 전체 조회할 수 있습니다.
- 관리자는 상품을 조건별로 조회할 수 있습니다.
---

#### 📦 판매관리

##### 1️⃣ 주문 조회
- 관리자는 주문내역을 전체 조회할 수 있습니다.
- 관리자는 주문내역을 조건별로 조회할 수 있습니다.

##### 2️⃣ 배송 조회
- 관리자는 배송내역을 전체 조회할 수 있습니다.
- 관리자는 배송내역을 조건별로 조회할 수 있습니다.

##### 3️⃣ 발송 처리/배송 완료 처리
- 관리자는 배송준비가 완료된 주문을 발송 처리 할 수 있습니다.
- 관리자는 배송이 불가능한 주문을 발송 취소 처리 할 수 있습니다.
- 관리자는 배송이 완료된 상품에 대해 배송 완료 처리 할 수 있습니다.

##### 4️⃣ 주문 취소 조회
- 관리자는 주문 취소 내역을 전체 조회할 수 있습니다.
- 관리자는 주문 취소 내역을 조건별로 조회할 수 있습니다.

##### 5️⃣ 주문 취소 승인/거부
- 관리자는 주문 취소 요청건에 대해 취소 승인 처리를 할 수 있습니다.
- 관리자는 주문 취소 요청건에 대해 취소 거부 처리를 할 수 있습니다.
---

#### 🎅 회원관리

##### 1️⃣ 회원 조회
- 관리자는 전체 회원을 조회할 수 있습니다.
- 관리자는 조건별로 회원을 조회할 수 있습니다.

##### 2️⃣ 회원 등급 수정
- 관리자는 회원 소비엑에 따른 회원 등급을 수정할 수 있습니다.
- 회원 등급 수정은 매월 1일에 자동으로 변경된다.

##### 3️⃣ 회원 정보 삭제
- 관리자는 탈퇴 회원 일 경우 회원의 정보를 삭제할 수 있습니다
---

#### ❓ 문의관리

##### 1️⃣ 문의 관리
- 관리자는 등록된 최신순으로 문의 내역 전체 목록을 확인할 수 있습니다.
- 관리자는 조건별로 특정 문의 내역 목록을 조회할 수 있습니다.

##### 2️⃣ 문의 답글 관리
- 관리자는 문의에 대한 답글을 등록할 수 있습니다.
- 관리자는 문의에 대한 답글을 수정할 수 있습니다.
- 관리자는 문의에 대한 답글을 삭제할 수 있습니다.
- 관리자는 문의에 대한 답글을 조회할 수 있습니다.
---

#### 📊 통계

##### 1️⃣ 오늘의 매출 / 오늘의 주문 수
- 관리자는 오늘의 총 매출액을 조회할 수 있습니다.
- 관리자는 오늘 발생한 총 주문 수를 조회할 수 있습니다.

##### 2️⃣ 성별 / 연령별 고객현황
- 관리자는 전체 고객의 성별 분포를 조회할 수 있습니다.
- 관리자는 전체 고객의 연령대별 분포를 조회할 수 있습니다.

##### 3️⃣ 일, 주, 월, 특정기간별 매출(금액)
- 관리자는 특정 기간 내의 일별 매출을 그래프로 조회할 수 있습니다.
- 관리자는 특정 기간 내의 월별 매출을 그래프로 조회할 수 있습니다.
- 관리자는 특정 기간 내의 주별 매출을 그래프로 조회할 수 있습니다.
- 관리자는 특정 기간 내의 일별 매출을 그래프로 조회할 수 있습니다.
---


## 🖋 프로젝트 후기 🖋
### 김도현
- 각자후기
### 박정은
- 각자 후기
### 박태준
- 각자 후기
### 심재람
- 각자 후기
### 이영우
- 각자 후기
### 정성연
- 각자 후기


