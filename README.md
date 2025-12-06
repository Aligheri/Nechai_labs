<p align="center">
  <img src="assets/header.svg" alt="University Course Management System" width="100%">
</p>

<p align="center">
  <a href="#overview"><img src="https://img.shields.io/badge/Labs-1--5-blue?style=for-the-badge" alt="Labs"></a>
  <a href="#tech-stack"><img src="https://img.shields.io/badge/UML-2.0-orange?style=for-the-badge" alt="UML"></a>
  <a href="#tech-stack"><img src="https://img.shields.io/badge/BPMN-2.0-green?style=for-the-badge" alt="BPMN"></a>
  <a href="#"><img src="https://img.shields.io/badge/PlantUML-Latest-red?style=for-the-badge" alt="PlantUML"></a>
</p>

<p align="center">
  <b>Software Engineering Laboratory Works</b><br>
  Data Modeling | Requirements | Behavior | Process | Architecture
</p>

---

## Overview

A comprehensive software engineering project demonstrating the complete modeling lifecycle of a **University Course Management System** — from data models to system architecture.

```
Student Registration → Course Enrollment → Grade Management → Transcript Generation
```

---

## System Architecture

```mermaid
graph TB
    subgraph Presentation["Presentation Layer"]
        UI1[Student Portal]
        UI2[Professor Portal]
        UI3[Admin Portal]
    end

    subgraph Application["Application Layer"]
        GW[API Gateway]
        subgraph Services["Business Services"]
            S1[User Service]
            S2[Enrollment Service]
            S3[Course Service]
            S4[Grade Service]
        end
    end

    subgraph Data["Data Layer"]
        R1[(PostgreSQL)]
    end

    subgraph External["External Systems"]
        E1[Payment Gateway]
        E2[Email Service]
        E3[Identity Verifier]
    end

    UI1 & UI2 & UI3 --> GW
    GW --> Services
    Services --> R1
    S2 --> E1
    S1 --> E2
    S1 --> E3

    style Presentation fill:#e1f5fe
    style Application fill:#fff3e0
    style Data fill:#e8f5e9
    style External fill:#fce4ec
```

---

## Project Structure

```
Nechai_labs/
│
├── lab1/                          # Data Modeling
│   ├── diagram.puml               # ER Diagram (PlantUML)
│   ├── diagram.mmd                # ER Diagram (Mermaid)
│   ├── schema.sql                 # Database Schema
│   └── Model.java                 # Domain Models
│
├── lab2/                          # Requirements Engineering
│   ├── requirements.md            # Functional & Non-functional
│   ├── PlantUML.puml              # Use Case Diagram
│   └── traceability_matrix.md     # Requirements Traceability
│
├── lab3/                          # Behavioral Modeling
│   ├── sequence_register_student.puml
│   └── sequence_enroll_course.puml
│
├── lab4/                          # Process Modeling
│   ├── activity_enroll_course.puml    # UML Activity
│   ├── bpmn_enroll_course.puml        # BPMN 2.0
│   └── screenshots/
│
├── lab5/                          # Component Architecture
│   ├── component_diagram.puml
│   └── screenshots/
│
└── assets/
    └── header.svg
```

---

## Labs Overview

<table>
<tr>
<td width="50%">

### Lab 1: Data Modeling
**ER Diagrams & Database Schema**

- 6 Entities: Student, Professor, Course, Enrollment, Department, Classroom
- Relationships with cardinality
- SQL schema generation
- Java domain models

</td>
<td width="50%">

### Lab 2: Requirements
**Use Cases & Traceability**

- 25 Functional Requirements
- 20 Non-functional Requirements
- 21 Use Cases
- Full traceability matrix

</td>
</tr>
<tr>
<td width="50%">

### Lab 3: Behavior
**Sequence Diagrams**

- Student Registration flow
- Course Enrollment process
- Error handling scenarios
- System interactions

</td>
<td width="50%">

### Lab 4: Processes
**Activity & BPMN Diagrams**

- UML Activity Diagram
- BPMN 2.0 Diagram
- Swimlanes (4 actors)
- Parallel flows & decisions

</td>
</tr>
<tr>
<td colspan="2">

### Lab 5: Architecture
**Component Diagram**

- 4-tier architecture (UI, API, Service, Data)
- Provided/Required interfaces
- External system integrations
- System boundary definition

</td>
</tr>
</table>

---

## Key Entities

```mermaid
erDiagram
    STUDENT ||--o{ ENROLLMENT : has
    COURSE ||--o{ ENROLLMENT : contains
    PROFESSOR ||--o{ COURSE : teaches
    DEPARTMENT ||--o{ PROFESSOR : employs
    DEPARTMENT ||--o{ COURSE : offers
    CLASSROOM ||--o{ COURSE : hosts

    STUDENT {
        int student_id PK
        string name
        string email
        date enrollment_date
    }
    COURSE {
        int course_id PK
        string code
        string name
        int credits
    }
    ENROLLMENT {
        int enrollment_id PK
        date enrollment_date
        string grade
        string status
    }
```

---


---

## Diagram Previews

<details>
<summary><b>Lab 1: ER Diagram (PlantUML)</b></summary>
<br>
<img src="lab1/screenshots/Screenshot 2025-11-22 at 20.31.28.png" alt="ER Diagram PlantUML" width="100%">
</details>

<details>
<summary><b>Lab 1: ER Diagram (Mermaid)</b></summary>
<br>
<img src="lab1/screenshots/Screenshot 2025-11-22 at 20.32.44.png" alt="ER Diagram Mermaid" width="100%">
</details>

<details>
<summary><b>Lab 2: Use Case Diagram</b></summary>
<br>
<img src="lab2/screenshots/Screenshot 2025-11-27 at 23.56.51.png" alt="Use Case Diagram" width="100%">
</details>

<details>
<summary><b>Lab 3: Sequence Diagram (Registration)</b></summary>
<br>
<img src="lab3/screenshots/Screenshot 2025-11-26 at 22.50.52.png" alt="Sequence Diagram Registration" width="100%">
</details>

<details>
<summary><b>Lab 3: Sequence Diagram (Enrollment)</b></summary>
<br>
<img src="lab3/screenshots/Screenshot 2025-11-26 at 22.51.19.png" alt="Sequence Diagram Enrollment" width="100%">
</details>

<details>
<summary><b>Lab 4: Activity Diagram</b></summary>
<br>
<img src="lab4/screenshots/Course_Enrollment_Activity_Diagram.png" alt="Activity Diagram" width="100%">
</details>

<details>
<summary><b>Lab 4: BPMN Diagram</b></summary>
<br>
<img src="lab4/screenshots/Course_Enrollment_BPMN.png" alt="BPMN Diagram" width="100%">
</details>

<details>
<summary><b>Lab 5: Component Diagram</b></summary>
<br>
<img src="lab5/screenshots/University_Course_Management_Component_Diagram.png" alt="Component Diagram" width="100%">
</details>

---

<p align="center">
  <sub>Built with PlantUML & Mermaid | KPI Software Engineering</sub>
</p>
