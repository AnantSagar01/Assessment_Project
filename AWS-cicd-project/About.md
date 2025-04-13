# HTML AWS CI/CD Project 🚀

A simple HTML project to demonstrate CI/CD deployment using **GitHub**, **AWS CodePipeline**, **CodeBuild**, and **Amazon S3** (static website hosting) — all within the AWS Free Tier.

---

## 📁 Project Structure

```
html-cicd-project/
├── index.html
├── styles.css
├── scripts.js
├── buildspec.yml
├── assets/
│   └── pipeline-success.png
└── README.md
```

---

## 🧪 Pipeline Flow

1. Push to GitHub
2. Trigger CodePipeline
3. Build with CodeBuild
4. Deploy to S3 (static hosting)

---

## ✅ CI/CD Pipeline Screenshot

Here's what the pipeline looks like after successful execution:

## CodeBuild
![CodeBuild](https://github.com/user-attachments/assets/8123d63c-f7f5-45fd-98e4-9441bb398838)

## CI/CD Success
![CI/CD Success](https://github.com/user-attachments/assets/2944fd2b-4d8e-4adc-b2f4-51a27d458d4d)


---

## 🧰 Tech Stack

- GitHub (Source)
- AWS CodePipeline (CI/CD)
- AWS CodeBuild (Build)
- Amazon S3 (Deploy)

---

## 📦 Sample `buildspec.yml`

```yaml
version: 0.2

phases:
  install:
    runtime-versions:
      nodejs: 14
    commands:
      - echo Installing dependencies...
  build:
    commands:
      - echo Build started on `date`
      - echo Build completed

artifacts:
  files:
    - '**/*'
```

---

## 👨‍💻 Author

**Anant Sagar**  
📫 anantsagar0000@gmail.com  
🔗 [GitHub](https://github.com/AnantSagar01) | [LinkedIn](https://www.linkedin.com/in/anantsagar01)

---

## 📜 License

MIT License
