# Introduction

Spring Boot Demo，只有測試 API、swagger。

(程式執行後可以在 localhost:8080/demo/swagger-ui.html 查看 API 規格)

1. 開發環境：IntelliJ IDEA 2022.1

2. 專案建置：Maven 3.8.2

3. 語言版本：JAVA 17

4. 執行：jar as service

5. 主框架：spring boot 3.2.3

最後更新時間：2024/02/29

### Detail

1. 設定檔位置：src.main.resources

2. 使用 maven build

3. 包含兩種環境配置：dev & prod

4. 依據 maven build 參數決定要 build 的檔案（dev 配置檔放在 dev 資料夾，prod 配置檔放在 prod 資料夾）

5. logback-test.xml：log 配置檔－－分別產生 INFO 及 ERROR 資訊的 Log 檔

6. 個人倉庫 https://github.com/JHying/mvn-repo
