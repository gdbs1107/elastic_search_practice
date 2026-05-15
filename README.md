# Elastic Search Practice

Java Spring Boot, PostgreSQL, Elasticsearch, Kibana 실습 환경입니다.

## Local PostgreSQL 실행

현재 로컬 PostgreSQL 기준 기본 연결 정보:

- host: `localhost`
- port: `5432`
- database: `book_search`
- username: `jeonjaeyeon`
- password: empty

앱 로컬 실행:

```bash
./gradlew bootRun
```

## Docker Compose 실행

PostgreSQL, Elasticsearch, Kibana, Spring Boot 앱을 한 번에 실행합니다.

```bash
docker compose up --build
```

접속 URL:

- Spring Boot: http://localhost:8080
- Docker PostgreSQL: localhost:5433
- Elasticsearch: http://localhost:9200
- Kibana: http://localhost:5601

Docker Compose에서는 로컬 PostgreSQL과 포트 충돌을 피하기 위해 PostgreSQL을 `5433:5432`로 노출합니다.
