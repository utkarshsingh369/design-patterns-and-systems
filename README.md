# 🧠 Design Patterns and Systems in Java

A curated, modular, and executable collection of Java-based Low-Level Design (LLD) systems, S.O.L.I.D. principles, and design pattern implementations... built as part of deep learning through hands-on coding.

---


## 🗂️ Project Structure

```
design_patterns_and_systems/
├── design_patterns/          # Patterns categorized into creational, structural, behavioral
├── shared                    # Reusable helpers/utilities
├── .gitignore                # Files to be ignored by git
├── CMD_LOG.txt               # commands which are run in console to have an impact on repository
├── LICENSE                   # MIT license
├── pom.xml                   # Parent Maven POM
└── README.md                 # Root documentation (this file)
```

---

## 🧑‍💻 Requirements

- Java 21+
- Maven 3.8+
- IDE (preferably IntelliJ Idea)

---

## 🚀 Getting Started

```bash
# Build the entire project
mvn clean install

# Run a specific driver (example: App.java in design_patterns/structural/adapter)
- Alt 1: Use IDEs runner
- Alt 2: mvn exec:java -pl design_patterns/structural/adapter -Dexec.mainClass=com.utkarsh.design_patterns.App
```

---

## 🏗️ Creating a New Module (e.g., for factory design pattern inside 'design_patterns/creational')

```bash
cd design_patterns/

# Create a pom aggregator for creational (if not created)
mvn archetype:generate -DgroupId=com.utkarsh.design_patterns -DartifactId=creational -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

# Remove src/ folder from creational, and edit its pom accordingly
cd creational/

# Create the module for factory
mvn archetype:generate -DgroupId=com.utkarsh.design_patterns -DartifactId=factory -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```
* Check [`CMD_LOG`](./CMD_LOG.txt) for more details.
---

## ✍️ Commit Message Convention

Follow [Conventional Commits](https://www.conventionalcommits.org/):

```
<type>(scope): short description

# Examples
feat(parking-lot): add vehicle and slot logic
fix(tic-tac-toe): resolve draw condition bug
docs(splitwise): add simplified balance explanation
refactor(observer): improve event dispatching
test(elevator): add edge case unit tests
setup(base): create repository structure for ui
```

**Types**: `feat`, `setup`, `fix`, `docs`, `test`, `chore`, `refactor`, `style`, `perf`

---

## 📌 Best Practices

- Keep all code modular, isolated, and runnable
- One design per submodule with its own readme
- Maintain notes and diagrams alongside code
- Don’t mix patterns with full systems (keep separation)
---

## 🏷️ License

MIT License... use, modify, and share with attribution.

---

## 🔗 Connect

> Built with ❤️ by Utkarsh Singh | [LinkedIn](https://www.linkedin.com/in/utk06/) | [GitHub](https://github.com/utkarshsingh369)