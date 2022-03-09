# LifeCycleStudy_220309
안드로이드 LifeCycle에 대하여 알아보는 간단한 프로젝트 입니다.

Logcat을 활용하여 안드로이드의 생명주기가 어떻게 동작하는지를 알 수 있습니다.

![activity_lifecycle](https://user-images.githubusercontent.com/22425650/157458608-55a86a55-a3c7-474d-b9ab-a909e2b878b8.png)

사진 출처 : https://developer.android.com/guide/components/activities/activity-lifecycle?hl=ko

<hr>

### 1. 앱 실행 시

 > D/LifeCycle: [Main] onCreate()

 > D/LifeCycle: [Main] onStart()

 > D/LifeCycle: [Main] onResume()

### 2. DetailActivity로 이동하는 버튼을 클릭 시

 > D/LifeCycle: [Main] onPause()

 > D/LifeCycle: [Detail] onCreate()

 > D/LifeCycle: [Detail] onStart()

 > D/LifeCycle: [Detail] onResume()

 > D/LifeCycle: [Main] onStop()

### 3. 뒤로가기 버튼으로 DetailActivity 종료 시

 > D/LifeCycle: [Detail] onPause()

 > D/LifeCycle: [Main] onRestart()

 > D/LifeCycle: [Main] onStart()

 > D/LifeCycle: [Main] onResume()

 > D/LifeCycle: [Detail] onStop()

 > D/LifeCycle: [Detail] onDestroy()
