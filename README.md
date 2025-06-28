# 🧠 Design Patterns and Systems in Java

A curated, modular, and executable collection of Java-based Low-Level Design (LLD) systems, S.O.L.I.D. principles, and design pattern implementations... built as part of deep learning through hands-on coding.

---

## 📚 Topics Covered

- **S.O.L.I.D. Principles**
- **Design Patterns**
  - Creational
  - Structural
  - Behavioral
- **System Design Implementations**
  - Parking Lot, Tic-Tac-Toe, Elevator, ATM, Vending Machine, BookMyShow, Splitwise, etc.

---

## 🗂️ Project Structure

```
design-patterns-and-systems/
├── design-patterns/          # Patterns categorized into creational, structural, behavioral
├── system-designs/           # Real-world system implementations
├── utils/                    # Reusable helpers/utilities
├── docs/                     # Markdown notes and diagrams
├── pom.xml                   # Parent Maven POM
└── README.md                 # Root documentation (this file)
```

---

## 🧑‍💻 Requirements

- Java 17+
- Maven 3.8+
- VS Code (recommended with [Java Extension Pack](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack))

---

## 🚀 Getting Started

```bash
# Build the entire project
mvn clean install

# Run a specific class (example: Singleton demo)
cd design-patterns/creational
mvn compile exec:java -Dexec.mainClass="com.utkarsh.lld.creational.singleton.SingletonDemo"
```

---

## 🏗️ Creating a New Module (e.g., for a system like `elevator-system`)

```bash
cd system-designs

# Create a new Maven module
mvn archetype:generate -DgroupId=com.utkarsh.lld.system.elevator -DartifactId=elevator-system -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

# Add <module>elevator-system</module> in system-designs/pom.xml
# Also ensure it's included in the root pom.xml if necessary
```

---

## 📦 Creating a New Subpackage (e.g., a new pattern in `behavioral`)

1. Navigate to the module:
   ```bash
   cd design-patterns/behavioral/src/main/java/com/utkarsh/lld/behavioral
   mkdir observer
   ```
2. Create a new class like `ObserverPatternDemo.java` in it.

3. Add a corresponding `README.md` and optionally a `test` class.

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
```

**Types**: `feat`, `fix`, `docs`, `test`, `chore`, `refactor`, `style`, `perf`

---

## ✏️ Notes & UML Diagrams

All documentation is maintained in the [`/docs`](./docs/) folder or local `README.md` inside each module.

You can use:
- [draw.io](https://draw.io) for visual modeling
- Paste screenshots or exports in `/images/` subfolders

---

## 📌 Best Practices

- Keep all code modular, isolated, and runnable
- One design per submodule with its own readme
- Maintain notes and diagrams alongside code
- Test logic with JUnit 5 (where applicable)
- Don’t mix patterns with full systems (keep separation)

---

## 🏷️ License

MIT License... use, modify, and share with attribution.

---

## 🔗 Connect

> Built with ❤️ by Utkarsh Singh | [LinkedIn](https://www.linkedin.com/in/utk06/) | [GitHub](https://github.com/utkarshsingh369)