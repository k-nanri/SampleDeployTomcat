# SpringBootのwarファイルをtomcatにデプロイする

## 前提条件
dockerサービスが起動していること。

## 実行方法
```sh
$ ./build_and_run
```

## 確認方法
curlコマンドを実行し、"Hello World"が出力されること。

```bash
$ curl -X GET "localhost:8080/SampleDeployTomcat-0.0.1-SNAPSHOT/hello"
```
