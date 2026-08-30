# Project AI Review Rules

## Technology

This is a Java Spring Boot application.

Primary technologies:

- Java 17+
- Spring Boot
- Spring Cloud
- Gradle
- REST APIs
- MySQL
- Kafka
- Docker

## Review priorities

Prioritize issues in this order:

1. Security
2. Correctness
3. Data integrity
4. Reliability
5. Performance
6. Maintainability
7. Testing

## Spring Boot

Check for:

- Incorrect dependency injection
- Incorrect transaction boundaries
- Missing transactional behavior
- Improper exception handling
- Blocking calls in reactive code
- Incorrect WebClient usage
- Incorrect Spring Security configuration
- N+1 database queries
- Unnecessary database calls

## Java

Check for:

- Null pointer risks
- Incorrect equals/hashCode
- Resource leaks
- Thread safety
- Incorrect Optional usage
- Mutable shared state
- Poor exception handling

## Review behavior

Do not report subjective style preferences.

Do not report an issue unless you can explain:

1. What is wrong
2. Why it matters
3. How to fix it