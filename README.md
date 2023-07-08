CRUD-create
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

## POST実行  
![post Location確認](https://github.com/kana2212/MyBatis-Demo/assets/121325913/580cf82e-f0ed-4f76-8712-b22f2138c673)  

## PATCH実行  
![スクリーンショット (100)](https://github.com/kana2212/MyBatis-Demo/assets/121325913/c25e7af3-f942-4826-9b8a-4fdb40725dbf)  

## PATCH実行確認の為GETリクエスト   
![スクリーンショット (101)](https://github.com/kana2212/MyBatis-Demo/assets/121325913/e4a2de5a-39bc-4860-9be3-70473359e369)  

## DELETE実行  
![delete成功](https://github.com/kana2212/MyBatis-Demo/assets/121325913/f80ffd91-b3e5-4fd8-a91f-6f8e58ff3675)  

## DELETE実行確認の為GETリクエスト  
![delete成功](https://github.com/kana2212/MyBatis-Demo/assets/121325913/f80ffd91-b3e5-4fd8-a91f-6f8e58ff3675)  
