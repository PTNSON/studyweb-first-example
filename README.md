# webProject

Online mobile phone store project

1. **Cấu hình database**

Linux

```
sudo docker compose -f postgreSQL.yaml up -d --build
```

Windows

```
docker compose -f postgreSQL.yaml up -d --build
```

**Reset database**

```
docker volume rm webproject_postgres_data
sudo docker compose -f postgreSQL.yaml up -d --build
```

**Thao tác với DB**

```
docker exec -it postgresfirstexample bash
psql -U cps -d cps_db
```

2. **Build toàn bộ project**

```bash
mvn clean install -DskipTests
```

## Chạy dự án

```bash
mvn spring-boot:run
```

Ứng dụng sẽ chạy mặc định tại : http://localhost:8080

## Swagger UI

Giao diện tài liệu API:

```
http://localhost:8080/swagger-ui/index.html
```

# github

**cách push code làm việc trong một nhóm**

Khởi tạo repository local

```
git init
```

Kết nối repo local với github

```
git remote add origin <URL>
```

Tạo quan hệ ban đầu với github, các lần sau chỉ cần git push hoặc git pull

```
git push -u origin main
```

**Sau khi xong các bước đó thì làm 3 bước sau để đưa code lên github**
Thêm từng file vào repo

```
git add <ten file>
```

Thêm tất cả file vào repo local

```
git add .
```

Commit

```
git commit -m "noi dung commit"
```

Đưa code lên github

```
git push
```

**Các lệnh khác**
Lấy code về từ url

```
git clone <URL>
```

Tạo nhánh kèm tên module, chức năng và chuyển nhánh. Tạo nhánh giúp tách biệt code khỏi nhánh chính của dự án
để tùy chỉnh code sau đó có thể merge lại vào nhánh chính

```
git checkout -b <tên_module>/feature/<tên_tính_năng>
```

Chuyển nhánh

```
git checkout <ten nhanh muon chuyen sang>
```

Tải code về nhưng không merge

```
git fetch
```

Tải code về và merge

```
git pull
```
