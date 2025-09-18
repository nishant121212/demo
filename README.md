## 📡APIs

```bash
curl --location --request GET 'http://localhost:8080/users'

curl --location --request POST 'http://localhost:8080/users' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "Nishant",
    "email": "nishant@demo.com",
    "age" : 30
}'

