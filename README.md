# 第10回課題  
第9回課題を元に情報の取得、登録、更新、削除を行う  
## URL設計  

| HTTPメソッド |      URL     |  処理内容         |  
|--------------|--------------|------------------|  
| GET          |  /members    | 情報取得         |  
| POST         |  /members    | 情報登録         |  
| PATCH        | /members/{id}| 情報更新         |  
| DELETE       | /members/{id}| 情報削除         |  
## データベース定義  

| カラム名(論理名) | カラム名(物理名)| 型         |  
|-----------------|-----------------|------------|  
| ID              | id              | int        |  
| 名前            | name            | varchar(20)|  
| 年齢            | age             | int        |  
## SpringBoot設定  
Spring initializrを使用して設定しています 

| Project       | Gradle Project |  
|---------------|----------------|
| Language      | Java           |  
| SpringBoot    | 3.0.6          |  
| Packing       | Jar            |  
| Java          | 17             |  
## 実行環境  
JavaSE-19  
## 開発環境  
IntelliJ IDEA
