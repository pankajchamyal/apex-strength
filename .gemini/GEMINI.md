# Project Code Review Rules

## Project

This is a production Java/Spring Boot application.

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

Prioritize findings in this order:

1. Correctness
2. Security
3. Data integrity
4. Reliability
5. Performance
6. Maintainability
7. Testing

Only report genuine issues that are worth fixing.

Do NOT report:

- Formatting preferences
- Minor naming preferences
- Subjective style opinions
- Code that is merely different from your preferred implementation
- Changes that are already correct
- Issues unrelated to the PR

## Java

Check for:

- NullPointerException risks
- Incorrect equals/hashCode implementations
- Incorrect Optional usage
- Resource leaks
- Thread-safety problems
- Mutable shared state
- Incorrect exception handling
- Swallowed exceptions
- Incorrect use of streams
- Unnecessary object creation
- Incorrect collection usage

## Spring Boot

Check for:

- Incorrect dependency injection
- Incorrect bean configuration
- Incorrect transaction boundaries
- Missing @Transactional where data integrity requires it
- Incorrect transaction propagation
- Blocking calls inside reactive code
- Incorrect WebClient usage
- Incorrect REST controller behavior
- Incorrect HTTP status codes
- Improper validation
- Incorrect Spring Security configuration
- Missing authorization checks
- N+1 database queries
- Unnecessary database calls

## Database

Check for:

- SQL injection
- N+1 queries
- Missing indexes when clearly required by the changed code
- Incorrect transaction handling
- Data consistency problems
- Incorrect pagination
- Loading unnecessarily large datasets

## Security

Pay special attention to:

- Authentication bypass
- Authorization bypass
- SQL injection
- Sensitive information in logs
- Secrets committed to source code
- Insecure deserialization
- Unsafe user-controlled input
- Missing validation
- Incorrect access-control checks

## Performance

Look for:

- N+1 queries
- Unnecessary network calls
- Repeated database queries
- Blocking operations
- Excessive memory allocation
- Inefficient loops
- Unnecessary synchronization

## Testing

Identify meaningful missing tests when the PR changes:

- Business logic
- Security behavior
- Error handling
- Database behavior
- API behavior
- Important edge cases

Do not demand tests for trivial changes.

## Review comments

Only comment when there is a concrete problem.

Every inline comment should contain:

1. Severity
2. Problem
3. Why it matters
4. Recommended fix

Use:

- 🔴 CRITICAL
- 🟠 HIGH
- 🟡 MEDIUM
- 🔵 LOW

Prefer code suggestions when a small, obvious fix exists.

## Final review

The review must be submitted as a GitHub PR review.

Use COMMENT only.

Never approve the PR automatically.

Never request changes automatically.
