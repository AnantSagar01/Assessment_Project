
# 🐳 Docker & Kubernetes - Assessment Project

This repository contains a mini-project demonstrating containerization using **Docker** and orchestration using **Kubernetes**. It is designed for learning and showcasing DevOps practices in a practical and organized manner.

---

## 📸 Project Screenshots

### ✅ Docker Build and Run

## Docker Run
![Docker Run](https://github.com/user-attachments/assets/6ef30251-678d-4809-9fe9-8d7672e7af43)
## Docker Hub Repository
![Docker Hub Repository](https://github.com/user-attachments/assets/83afca58-88fa-4c0e-836b-60ce198e88ce)
## Docker Containers UI
![Docker Containers UI](https://github.com/user-attachments/assets/6c6a7fe1-1ded-4134-bc02-97d401ba4bc4)


### 🚢 Kubernetes Deployment

## K8s Deployment
![K8s Deployment](https://github.com/user-attachments/assets/52283926-4f85-4f64-a9f3-c938d3b313b7)

#K8s Services
![K8s Services](https://github.com/user-attachments/assets/edc2d2f6-6fa8-4d90-a5b9-fcce358a9dd1)

#K8s Pods
![K8s Pods](https://github.com/user-attachments/assets/c2882ee0-a576-48e2-a9b4-3fe8938decaf)

#K8s UI
![K8s UI](https://github.com/user-attachments/assets/713a0fb5-1bdd-49a0-be16-1f033a125bab)


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
docker build -t anantsagar0000/vandor-info .
```

### 3. Run Locally (Optional)

```bash
docker run -p 8080:8080 anantsagar0000/vandor-info
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
