# 📦 Portfolio Backend

This is the **backend service** for my personal portfolio and blog. Its build with **Spring Boot** and provides REST
APIs that will support both the portfolio content and blog functionality.

---

## ✅ Prerequisites

- **Java 21** (Make sure Java is installed: `java-version`)
- **Gradle** (included via the wrapper `./gradlew`)
- (Optional) **Postman** for testing APIs

---

## 🚀 Getting Started

1. **Clone the repo:**

 ```bash
 git clone https://github.com/austin-jarrett-dev/portfolio-backend.git
 cd portfolio-backend
 ```

2. **Build the Project:**

 ```bash
 ./gradlew build
 ```

3. **Run the Application:**

```bash
./gradlew bootRun
```

4 **Verify the API:**

Open your browser or Postman and navigate to:

```http
http://localhost:8080/api/v1/posts
```

You should see:

```
Hello, Portfolio!
```

---

## 🌐 API Endpoints

| Method | Endpoint     | Description               |
|--------|--------------|---------------------------|
| GET    | `/api/hello` | Returns a simple greeting |

---

## 🚧 Future Improvements

- [ ] Add blog-related REST APIs
- [ ] Connect to a database (MySQL)
- [ ] Add unit and integration tests

---

## 📄 License

This project is licensed under the [MIT License](https://en.wikipedia.org/wiki/MIT_License)