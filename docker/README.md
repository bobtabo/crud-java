# Docker環境あれこれ

### Dockerインストール

```
$ brew install --cask docker
$ open /Applications/Docker.app
```

タスクバーのDockerアイコンが「Docker Desktop is running」になるまで待つ。
Get started...画面が表示されるが閉じて良い。

### コンテナ起動準備

```
$ cp .env.example .env
```

### コンテナ起動

```
$ docker-compose up -d
```

### コンテナ停止

```
$ docker-compose down
```

### コンテナ破棄

```
$ docker-compose down --rmi all --volumes
$ rm -fdR db
```
