
# 🐳 Docker & Kubernetes - Assessment Project

This repository contains a mini-project demonstrating containerization using **Docker** and orchestration using **Kubernetes**. It is designed for learning and showcasing DevOps practices in a practical and organized manner.

---

## 📸 Project Screenshots

### ✅ Docker Build and Run

![Docker Run](./assets/Screenshot%202025-04-13%20215155.png)

### 🚢 Kubernetes Deployment

![K8s Deployment](./assets/Screenshot%202025-04-13%20215853.png)
![K8s Services](./assets/Screenshot%202025-04-13%20215859.png)
![K8s Pods](./assets/Screenshot%202025-04-14%20004543.png)
![K8s UI](./assets/Screenshot%202025-04-14%20010201.png)

---

## 📦 Project Overview

The project includes:

- A **Dockerized** application
- A `Dockerfile` to build the image
- Kubernetes manifests to deploy the app on a cluster
- Basic configurations for services, deployments, and pods

## 📁 Folder Structure

```
Docker&Kubernetes/
├── Dockerfile                 # Docker build instructions
├── app/                       # Source code of the app
│   └── (your application files)
├── k8s/
│   ├── deployment.yaml        # Deployment manifest
│   ├── service.yaml           # Service manifest
│   └── other-k8s-files.yaml   # Any additional K8s resources
└── README.md                  # You're reading it!
```

## 🚀 Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/AnantSagar01/Assessment_Project.git
cd Assessment_Project/Docker&Kubernetes
```

### 2. Build Docker Image

```bash
docker build -t your-image-name .
```

### 3. Run Locally (Optional)

```bash
docker run -p 3000:3000 your-image-name
```

### 4. Deploy to Kubernetes

Make sure `kubectl` is configured and pointing to your cluster:

```bash
kubectl apply -f k8s/
```

Verify the deployment:

```bash
kubectl get all
```

## ⚙️ Prerequisites

- Docker
- Kubernetes (Minikube, Kind, or Cloud K8s cluster)
- kubectl CLI
- (Optional) DockerHub account for image pushing

## 📚 Learning Objectives

- Understand Dockerfile creation
- Build and run a containerized app
- Create and apply Kubernetes manifests
- Deploy applications on Kubernetes clusters

## 👨‍💻 Author

- **Anant Sagar**
- 📫 anantsagar0000@gmail.com
- 🌐 [GitHub - AnantSagar01](https://github.com/AnantSagar01)

## 🌟 Show Your Support

If you find this helpful, feel free to give the project a ⭐ on GitHub!

---
