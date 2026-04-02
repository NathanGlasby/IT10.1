# IT Term 1: Java and SQL Practice

> Looking for the guided docs version of this repo? Start at the Mintlify site: [student-30f5fd65.mintlify.app](https://student-30f5fd65.mintlify.app). It has topic-by-topic explanations, setup help, and an AI assistant you can use to ask questions about the exercises and project structure.

This repository is a collection of first-term Information Technology coursework focused on beginner Java programming and introductory database work. Most folders are small, self-contained Java exercises built in NetBeans, with one Maven-based project and one Microsoft Access database file.

Using the attached *Information Technology Java & SQL Book 1* as extra context, the repo follows the kind of progression you would expect in an introductory course: variables and data types, escape sequences, operators, type conversion, the `Math` class, random number generation, dialog boxes, simple Swing forms, and basic database concepts.

## What This Repo Contains

- Standalone Java mini-projects for class exercises and homework.
- Assessment folders under `Tests/` for term tasks and practical questions.
- A database file in [`!Databases/BaggageDB.mdb`](./!Databases/BaggageDB.mdb).
- Mostly NetBeans/Ant project structure, plus one Maven project.

There is no single application entry point for the whole repo. Each folder is intended to be opened and run on its own.

## Project Overview

| Folder | Focus |
| --- | --- |
| [`Aftermath`](./Aftermath) | Circle area calculation using `JOptionPane`, `Math.PI`, `Math.pow`, and a random radius. |
| [`Armathgeddon`](./Armathgeddon) | Square roots, cube roots, and generating a random 4-digit PIN. |
| [`ChangeIsGood`](./ChangeIsGood) | Type conversion between `String`, `int`, `double`, `char`, and `boolean`. |
| [`CharacterBuilding`](./CharacterBuilding) | Character literals and Unicode-style numeric character values. |
| [`DataTypes`](./DataTypes) | Primitive/reference data types, reassignment, formatted output, and a simple object example. |
| [`DiceRoller`](./DiceRoller) | Simulates rolling two dice and totals the result. |
| [`escapesequences`](./escapesequences) | A single-file example showing Java escape sequences and console formatting. |
| [`FullCircle`](./FullCircle) | Calculates the area of a circle from a user-entered radius. |
| [`HighsAndLows`](./HighsAndLows) | Compares two numbers with `Math.max` and `Math.min`. |
| [`IveGotThePower`](./IveGotThePower) | Raises a number to a power using `Math.pow`. |
| [`JavaMaths`](./JavaMaths) | Basic arithmetic, integer division, double division, and modulus. |
| [`LoginCheck`](./LoginCheck) | Simple login validation in both dialog-based and Swing GUI form versions. |
| [`MessageDialogs`](./MessageDialogs) | Basic `JOptionPane` message dialog examples. |
| [`NobodyPutsPythagorusInACorner`](./NobodyPutsPythagorusInACorner) | Pythagorean theorem calculation for a triangle hypotenuse. |
| [`RandomGenerator`](./RandomGenerator) | Prints raw `Math.random()` values. |
| [`RandomPractice`](./RandomPractice) | Practices converting `Math.random()` into different numeric ranges. |
| [`RealAltitude`](./RealAltitude) | Uses `Math.abs` to convert an altitude reading to distance from sea level. |
| [`SeeYouRound`](./SeeYouRound) | Demonstrates rounding and calculates a VAT-inclusive price. |
| [`SomethingRandom`](./SomethingRandom) | Experiments with loops, repeated random numbers, and phone-number-style output. |
| [`Tests/Glasby_Nathan_JavaTest1`](./Tests/Glasby_Nathan_JavaTest1) | Practical test work covering output, variables, user input, and integer arithmetic. |
| [`Tests/Glasby_Nathan_Term1`](./Tests/Glasby_Nathan_Term1) | Term assessment practice using variables, totals, and formatted output. |
| [`Tests/Glasby_Nathan_Term1_v2`](./Tests/Glasby_Nathan_Term1_v2) | Expanded term assessment with dialogs, age calculations, division/remainder, and `charAt`. |
| [`UserInput_`](./UserInput_) | User input with `JOptionPane` and a simple booking confirmation message. |
| [`!Databases`](./!Databases) | Introductory database work, currently represented by `BaggageDB.mdb`. |

## Topics Covered

- Java syntax and program structure
- Variables, literals, and data types
- Escape sequences and console output formatting
- Arithmetic operators and modulus
- Type casting and parsing
- `Math` methods such as `pow`, `sqrt`, `cbrt`, `round`, `abs`, `max`, and `min`
- Random number generation with `Math.random()`
- GUI input/output with `JOptionPane`
- Introductory Swing form design
- Simple conditional logic for validation
- Early database exposure through a Microsoft Access file

## Running the Projects

### NetBeans / Ant projects

Most folders in this repo are NetBeans projects with a `build.xml` file. The easiest way to run them is:

1. Open the specific project folder in NetBeans.
2. Run the main class for that project.

Examples include [`Aftermath`](./Aftermath), [`DiceRoller`](./DiceRoller), [`LoginCheck`](./LoginCheck), and the assessment folders in [`Tests`](./Tests).

If you prefer the command line, these NetBeans projects are Ant-based, so running from inside an individual project folder is the usual approach:

```bash
ant run
```

### Maven project

[`CharacterBuilding`](./CharacterBuilding) is set up as a Maven project rather than an Ant project.

```bash
cd CharacterBuilding
mvn package
```

Note: `CharacterBuilding/pom.xml` is currently configured with `maven.compiler.release` set to `25`, so you may need a matching JDK if you build it exactly as-is.

### Single-file example

[`escapesequences/EscapeSequences.java`](./escapesequences/EscapeSequences.java) is a simple standalone source file rather than a full NetBeans project.

```bash
javac -d . escapesequences/EscapeSequences.java
java escapesequences.EscapeSequences
```

### Database file

Open [`!Databases/BaggageDB.mdb`](./!Databases/BaggageDB.mdb) in Microsoft Access or another tool that supports `.mdb` files.

## Repo Notes

- This is a learning repository, so the projects are intentionally small and focused on one concept at a time.
- The code includes both console output and GUI-based input/output exercises.
- Some folders contain generated build output locally, but the real source work lives under each project's `src/` folder.
- `LoginCheck` is a classroom validation example with hardcoded credentials, not a production authentication system.

## Why This Repo Is Useful

This repo works well as:

- a revision set for early Java topics,
- a record of first-term programming progress,
- a reference for common beginner patterns in NetBeans,
- and a bridge between introductory Java exercises and early database work.
