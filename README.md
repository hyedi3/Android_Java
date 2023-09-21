# 안드로이드 개요 

### **스마트폰의 개요**
통화 기능 + 컴퓨터 + 다양한 기능 내장(MP3, 카메라, BMB, GPS 등)   <br></br>

### **스마트폰의 역사**
- 1992년 IBM사의 사이먼(최초)
- 1996년 노키아 9000
- 2002년 마이크로소프트 포켓 PC 
- 2007년 아이폰 
- 2008년 안드로이드 폰 
- 2010년 윈도폰 7 
<br></br>

### **스마트폰의 개요**
안드로이드 운영체제를 탑재한 스마트폰이 약 72%, 아이폰이 약 26%, 윈도폰이 약 0.02%를 차지.
<br></br>

### **안드로이드 주요 기능**
- 애플리케이션 프레임워크를 통해 제공되는 API를 사용함으로써 코드를 재사용하여 효율적이고 빠른 애플리케이션 개발이 가능.
- 모바일 기기에 최적화된 달빅(Dalvik) 또는 아트(Android RunTime, ART) 런타임을 제공. 
- 모바일용 데이터베이스인 SQLite를 제공.
- 모바일 기기에 내장된 각종 하드웨어(블루투스，카메라, 나침반，와이파이 등)를 잘 지원.
- Eclipse IDE 또는 Android Studio를 통해 강력하고 빠른 개발 환경을 제공.
<br></br>

### **안드로이드의 특징**
① 안드로이드의 핵심 커널은 리눅스로 구성되어 있음 <br/>
② 안드로이드 애플리케이션 개발 언어로 Java를 사용함<br/>
③ 안드로이드 SDK에 많은 라이브러리를 포함하고 있어 쉽게 개발할 수 있음  <br/>
④ 오픈소스를 지향함<br/>
⑤ 지속적인 업그레이드를 제공함 
<br></br>

### **안드로이드 개발 환경 구성**
<p align="center">
<img src="img/Android_DEV_Environment.png" width="430px" height="200px"></img></p>
<br></br>

### **안드로이드 개발 환경 설치 순서**
<p align="center">
<img src="img/Android_DEV_Install.png" width="500px" height="230px"></img></p>
<br></br>

# 안드로이드 스튜디오 설치하기
<br></br>

### **Android Studio Dolphin(2021.03.01)을 다운로드**
#### https://developer.android.com/studio/archive 접속 후 해당 버전 다운로드 
<br></br>

### **Android Studio Setup**
파일을 실행하고 초기화면에서 \<Next>를 클릭한다. <br/>
[Choose Components]에서 "Android Virtual Device"의 체크를 끄고 \<Next>를 클릭한다.
<p align="center">
<img src="img/Android_Studio_Setup1.png" width="350px" height="280px"></img>
<img src="img/Android_Studio_Setup2.png" width="350px" height="280px"></img></p>
<br></br>

Android Studio 설치될 폴더를 선택한다. 기본값으로 두고 \<Next>를 클릭한다.  <br/>
시작 메뉴 폴더를 생성하는 화면에서도 기본값으로 두고 \<Install>을 클릭한다. 
<p align="center">
<img src="img/Android_Studio_Setup3.png" width="350px" height="280px"></img>
<img src="img/Android_Studio_Setup4.png" width="350px" height="280px"></img></p>
<br></br>

설치가 완료되면\<Next>를 클릭한다.
설치 완료 화면에서 “Start Android Studio”의 체크를 끄고 \<Finish>를 클릭한다.
<p align="center">
<img src="img/Android_Studio_Setup5.png" width="350px" height="280px"></img>
<img src="img/Android_Studio_Setup6.png" width="350px" height="280px"></img></p>
<br></br>


# 안드로이드 실습 환경 구축 

### **Android Studio Setup Wizard**
[Install Type]은 기본값인 'Standard'를 선택하고\<Next>를 클릭한다.
[Darcula] 테마로 선택하고 \<Next>를 클릭한다.
<p align="center">
<img src="img/Android_Studio_Setup_Wizard1.png" width="350px" height="280px"></img>
<img src="img/Android_Studio_Setup_Wizard2.png" width="350px" height="280px"></img></p>
<br></br>

[License Agreement] 창이 나오면 각 항목을 선택하고 \<Agree>를 클릭한 후 \<Finish>를 클릭하여 진행한다. <br/>
[Download Component] 창이 나오고 한동안 안드로이드 SDK의 다운로드 및 설치가 진행된다.
<p align="center">
<img src="img/Android_Studio_Setup_Wizard3.png" width="350px" height="280px"></img>
<img src="img/Android_Studio_Setup_Wizard4.png" width="350px" height="280px"></img></p>
<br></br>

다운로드 및 설치가 완료되면 \<Finish>를 클릭하여 종료한다.
<p align="center">
<img src="img/Android_Studio_Setup_Wizard5.png" width="350px" height="280px"></img></p>
<br></br>

### **Android Studio Customize**
Android Studio 초기화면이 나오면 [Customize]를 선택하고 'All Settings'를 클릭한다.<br/>
자동 업데이트 기능을 끄고, 왼쪽의 [Appearance & Behavior]-[System Settings]-[Updates]를 선택하고 업데이트와 관련된 오른쪽의 체크를 모두 끈다.
<p align="center">
<img src="img/Android_Studio_Customize1.png" width="350px" height="280px"></img>
<img src="img/Android_Studio_Customize2.png" width="350px" height="280px"></img></p>
<br></br>

소스코드의 행 번호가 보이도록 설정한다. <br/>
왼쪽의 [Editor]-[General]-[Appearance]를 선택하고 오른쪽의 'Show line numbers'에 체크 표시한다. 
<p align="center">
<img src="img/Android_Studio_Customize3.png" width="350px" height="280px"></img></p>
<br></br>

### **SDK Manager**
Android Studio 초기화면에서 왼쪽의 [Projects]를 선택하고 오른쪽 아래의 'More Actions'를 클릭하여 [SDK Manager]를 선택한다.오른쪽 아래의 'Show Package Details'에 체크한 후 기존에 체크되어 있는 항목을 모두 끈다. <br/> 
그리고 Android Tiramisu (Tiramisu) 아래의 'Android SDK Platform 33'과 'Google APIs Intel x86 Atom_64 System Image'에만 체크한다. 
<p align="center">
<img src="img/Android_Studio_SDK_Manager1.png" width="350px" height="280px"></img>
<img src="img/Android_Studio_SDK_Manager2.png" width="350px" height="280px"></img></p>
<br></br>

[SDK Tools] 탭을 클릭하여 추가로 'Google Play services'에 체크하고 \<OK>를 클릭한다. 만약 [Confirm Change] 창이 나오면\<OK>를 클릭한다. <br/>
[License Agreement] 창이 나오면 각 상위 항목을 클릭하여 'Accept'를 선택한 후 \<Next>를 클릭하여 설치를 진행한다. 
<p align="center">
<img src="img/Android_Studio_SDK_Manager3.png" width="350px" height="280px"></img>
<img src="img/Android_Studio_SDK_Manager4.png" width="350px" height="280px"></img></p>
<br></br>

설치가 완료되면 \<Finish>를 클릭하여 설치를 종료한다. <br/>
Android Studio 및 안드로이드 SDK의 설치가 완료된 상태이다.
<p align="center">
<img src="img/Android_Studio_SDK_Manager5.png" width="350px" height="280px"></img></p>
<br></br>

### **AVD creation**
Android Studio 초기화면에서 왼쪽의 [Projects]를 클릭한다. <br/>
오른쪽 아래의 'More Actions'를 클릭하여 [Virtual Device Manager]를 선택한다. \<Create virtual device>를 클릭한다.
<p align="center">
<img src="img/Android_Studio_AVD1.png" width="350px" height="280px"></img>
<img src="img/Android_Studio_AVD2.png" width="350px" height="280px"></img></p>
<br></br>

[Select Hardware] 창에서 'Phone'을 선택하고, 'Pixel 2'를 선택하고 \<Next>를 클릭한다. <br/>
[x86 Images] 탭을 클릭하여 'Tiramisu[33,x86_64, Android Tiramisu (Google APIs)]'를 선택하고 \<Next>를 클릭한다
<p align="center">
<img src="img/Android_Studio_AVD3.png" width="350px" height="280px"></img>
<img src="img/Android_Studio_AVD4.png" width="350px" height="280px"></img></p>
<br></br>

AVD Name은 적당히 'T(Pixel 2)' 정도로 하고\<Finish>를 클릭한다. \<Launch>를 클릭하여 AVD를 부팅한다. 
<p align="center">
<img src="img/Android_Studio_AVD5.png" width="350px" height="280px"></img>
<img src="img/Android_Studio_AVD6.png" width="350px" height="280px"></img></p>
<br></br>

한국어 세팅 & 맞춤법 검사기 & 화면 자동 잠금 시간 확인 
<p align="center">
<img src="img/Android_Studio_AVD7.png" width="160px" height="280px"></img>
<img src="img/Android_Studio_AVD8.png" width="160px" height="280px"></img>
<img src="img/Android_Studio_AVD9.png" width="160px" height="280px"></img>
<img src="img/Android_Studio_AVD10.png" width="160px" height="280px"></img></p>
<br></br>
