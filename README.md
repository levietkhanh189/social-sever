# Running Java Spring Project on IntelliJ IDEA

This guide will help you set up and run a Java Spring project using IntelliJ IDEA.

## Prerequisites

- IntelliJ IDEA installed (Community or Ultimate Edition)
- JDK 11 or higher installed
- Maven or Gradle installed (depending on your project build tool)
- Git installed (if cloning the project from a repository)

## Steps to Run the Project

### 1. Clone the Repository
First, clone the repository to your local machine using Git.

```bash
git clone https://github.com/your-username/your-repository.git
cd your-repository
```

### 2. Open the Project in IntelliJ IDEA
1. Launch IntelliJ IDEA.
2. Click on `File` > `Open` and select the project's root directory.

### 3. Import the Project
- **Maven Project**:
  - IntelliJ IDEA will automatically detect the `pom.xml` file and prompt to import the project. Click `Import` or `Enable Auto-Import`.
- **Gradle Project**:
  - Similarly, IntelliJ IDEA will detect the `build.gradle` file. Click `Import` or `Enable Auto-Import`.

### 4. Configure JDK
1. Open `File` > `Project Structure` > `Project`.
2. Set the Project SDK to the correct version (e.g., JDK 11 or higher).

### 5. Run the Application
1. Open the `src/main/java` directory and locate your main application class, typically annotated with `@SpringBootApplication`.
2. Right-click on the main class and select `Run 'YourApplication.main()'`.

### 6. Access the Application
Once the application starts, you can access it at `http://localhost:8080` (or another port if configured differently).

### Additional Tips
- **Running Tests**: To run tests, right-click on the `src/test/java` directory or a specific test class and select `Run`.
- **Debugging**: Set breakpoints by clicking in the gutter next to the code lines. Right-click the main class and select `Debug` to start debugging.
- **Plugins**: Consider installing the following plugins to enhance your development experience:
  - Spring Boot
  - Lombok
  - JPA Buddy (if using JPA)

---

By following these steps, you should be able to successfully run your Java Spring project on IntelliJ IDEA. If you encounter any issues, refer to the IntelliJ IDEA documentation or seek help from the community.
