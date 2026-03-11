JAVA-0303-Assignments-1

📌 Project Overview | 專案概述

This project is developed for the Java Programming Fundamentals course at National Penghu University of Science and Technology. It implements a nonlinear dynamic system simulation using the Logistic Map model to demonstrate iterative computation, console interaction, and object-oriented programming in Java.

本專案為國立澎湖科技大學「Java程式設計(一)」課程作業。透過 Logistic Map (邏輯斯諦映射) 模型實作非線性動態系統模擬，展示 Java 中的迭代運算、控制台互動與物件導向程式設計。

🎯 Academic Objectives | 學習目標

Version Control: Establishing a professional academic identity on GitHub.

Environment Configuration: Setting up VS Code with AI-assisted engineering workflows.

Mathematical Modeling: Implementing discrete-time nonlinear systems using pure Java.

Documentation: Preparing data and logic for IEEE conference-style reporting.

版本控制：在 GitHub 上建立專業的學術開發者身份。

環境配置：設定 VS Code 並結合 AI 輔助開發流程。

數學建模：使用純 Java 語言實作離散時間非線性系統。

文獻準備：為 IEEE 研討會格式論文報告準備實驗數據與邏輯。

🧮 Mathematical Model | 數學模型

The simulation utilizes the Logistic Map, a classic example of how complex, chaotic behavior can arise from simple nonlinear dynamical equations:

$$x_{n+1} = r \cdot x_n \cdot (1 - x_n)$$

Parameters:

$x_n$: Population ratio at year $n$ ($0 \le x_n \le 1$).

$r$: Growth rate parameter ($0 \le r \le 4$).

本模擬採用著名的非線性動力學公式，探討簡單公式如何產生複雜甚至混沌的行為。

💻 Technical Implementation | 技術實作

Language: Java 11+

Class Structure: Encapsulated mathematical logic within the PopulationModel class.

Input Handling: Robust use of java.util.Scanner for user parameterization.

Constraints: No external high-level libraries used, adhering to the "No built-in package" requirement for core logic.

🚀 Usage | 執行說明

Clone the repository:

git clone [https://github.com/tch107146/JAVA-0303-Assignments-1]


Compile the source code:

javac JAVA_0303_Assignments_1.java


Run the simulation:

java JAVA_0303_Assignments_1


📄 Deliverables Checklist | 作業繳交清單

[x] Source Code: Fully commented Java file.

[x] README: Structured bilingual project documentation.

[x] Screenshot: Terminal output of a chaotic state ($r=3.9$).

[x] IEEE Paper: Formal report in IEEE conference format.