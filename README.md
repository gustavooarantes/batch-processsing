Project Proposal 1: Batch Data Ingestion and Processing Service

Status: Open | Priority: High | Estimate: 6-8 hours

0.  Problem Description, Requirements, and Technology Stack

    Problem Description:
    The business department requires an automated way to import product catalogs sent by suppliers in CSV format. We need to build a robust microservice that exposes an endpoint for CSV file uploads, processes the data in batches, validates each record, and persists them into a relational database.

    Functional Requirements (FR):

        FR-01: Expose a POST /v1/products/upload endpoint that accepts multipart/form-data.

        FR-02: Process the file in an asynchronous batch job.

        FR-03: Validate each record (mandatory fields, positive price).

        FR-04: Insert/update valid records in the database.

        FR-05: Log invalid records.

        FR-06: Expose a GET /v1/products/upload/status/{jobId} endpoint to query the job's status.

    Defined Technology Stack (2025 Outlook):

        Language/Framework: Java 21+ with Spring Boot 3.3+

        Batch Processing: Spring Batch

        Database: PostgreSQL 16

        Containerization: Docker and Docker Compose

        CI/CD: GitHub Actions

    Dependencies (Spring Initializr):

        Spring Web

        Spring Batch

        Spring Data JPA

        Validation

        PostgreSQL Driver

        Lombok

        Spring Boot DevTools

1.  Solution Architecture

    Deliverable: A simple diagram in Draw.io showing the flow: Controller -> Service -> JobLauncher -> Step (Reader, Processor, Writer) -> PostgreSQL.

2.  Infrastructure Implementation

    Deliverable: docker-compose.yml and .github/workflows/ci.yml.

    Tasks:

        Containerization: Create a docker-compose.yml with app (Spring Boot) and db (PostgreSQL) services.

        CI Pipeline: Set up a GitHub Actions workflow for build and tests on every push.

3.  Solution Development

    Deliverable: Application source code.

    Sub-tasks:

        Set up the project with the required dependencies.

        Implement the Product JPA entity and its Repository.

        Create the complete Spring Batch Job configuration.

        Develop the ProductController and ProductService.

4.  Testing Strategy

    Deliverable: Test code (src/test/java).

    Phases:

        Unit Tests: Test the ItemProcessor validation logic with JUnit 5 and Mockito.

        Integration Tests: Use @SpringBatchTest with H2 or Testcontainers to run the full job and verify persistence.

        API Tests: Use @WebMvcTest to validate the endpoints.
