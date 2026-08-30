# Apex Strength — AI Engineering Guidelines

## Project

Apex Strength is a Java/Spring Boot microservices application.

Services:

- activityservice
- aiservice
- eureka
- userservice

Technology:

- Java 17+
- Spring Boot
- Spring Cloud
- Gradle
- MySQL
- REST APIs
- WebClient
- Kafka
- Docker

---

## Code Review Priorities

Prioritize issues in this order:

1. Security
2. Correctness
3. Data integrity
4. Reliability
5. Performance
6. Maintainability
7. Testing

Only report genuine problems that are worth fixing.

Do NOT report:

- Formatting
- Minor naming preferences
- Subjective coding style
- Personal implementation preferences
- Changes that are functionally correct
- Trivial improvements

---

## Java

Look for:

- NullPointerException risks
- Incorrect equals/hashCode
- Incorrect Optional usage
- Resource leaks
- Thread-safety problems
- Mutable shared state
- Incorrect exception handling
- Swallowed exceptions
- Incorrect stream usage
- Inefficient collections
- Unnecessary object creation

---

## Spring Boot

Look for:

- Incorrect dependency injection
- Incorrect bean configuration
- Incorrect transaction boundaries
- Incorrect @Transactional usage
- Transaction propagation problems
- Blocking calls in reactive code
- Incorrect WebClient usage
- Incorrect REST API behavior
- Missing validation
- Incorrect HTTP status codes
- Incorrect Spring Security configuration
- Missing authorization checks

---

## Database

Look for:

- SQL injection
- N+1 queries
- Unnecessary database calls
- Incorrect transaction handling
- Data consistency problems
- Missing pagination
- Loading unnecessarily large datasets

---

## Security

Pay particular attention to:

- Authentication bypass
- Authorization bypass
- SQL injection
- Hardcoded credentials
- Secrets in source code
- Sensitive information in logs
- Unsafe user input
- Missing validation
- Insecure endpoints
- Incorrect access-control checks

---

## Performance

Look for:

- N+1 queries
- Repeated database calls
- Unnecessary network calls
- Blocking operations
- Excessive memory allocation
- Inefficient loops
- Unnecessary synchronization

---

## Testing

Request meaningful tests when changes affect:

- Business logic
- Security
- Error handling
- Database behavior
- REST APIs
- Important edge cases

Do not request tests for trivial changes.

---

## Review Comments

Only report concrete issues.

For each issue provide:

- Severity
- File
- Line
- Problem
- Why it matters
- Recommended fix

Severity:

- 🔴 CRITICAL — security/data-loss/system-breaking issue
- 🟠 HIGH — significant bug or reliability/security issue
- 🟡 MEDIUM — meaningful correctness/performance/maintainability issue
- 🔵 LOW — minor but worthwhile issue

Prefer inline comments on the affected line.

Do not approve PRs automatically.

Do not request changes automatically.

Submit the review as COMMENT.