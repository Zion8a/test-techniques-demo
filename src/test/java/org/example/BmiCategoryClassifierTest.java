# Test Techniques Demo

A portfolio project that demonstrates practical software testing skills using Java, Maven, and JUnit 5.

        ## Purpose

This project shows how classic test design techniques can be translated into automated tests.

The current version focuses on small rule-based examples and demonstrates:
        - equivalence partitioning
- boundary value analysis
- invalid input testing
- parameterized tests in JUnit 5

        ## Project Structure

```text
test-techniques-demo/
        ├─ pom.xml
├─ README.md
├─ src/
        │  ├─ main/
        │  │  └─ java/
        │  │     └─ org/example/
        │  │        ├─ AgeCategoryClassifier.java
│  │        ├─ BmiCategoryClassifier.java
│  │        └─ Main.java
│  └─ test/
        │     └─ java/
        │        └─ org/example/
        │           ├─ AgeCategoryClassifierTest.java
│           └─ BmiCategoryClassifierTest.java