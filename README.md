## 📡APIs

```bash
curl --location --request GET 'http://localhost:8080/users'

curl --location --request POST 'http://localhost:8080/users' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "Nishant",
    "email": "nishant@demo.com",
    "age" : 30
}

'{
  "action": "opened",
  "number": 4,
  "pull_request": {
    "diff_url": "https://github.com/nishant121212/demo/pull/4.diff",
    "title": "Update README.md",
    "user": {
      "login": "nishant121212"
    }
  },
  "repository": {
    "name": "demo"
  }
}

