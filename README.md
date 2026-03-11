# Assignment 1: Empirical Observation of Algorithm Time Complexity
# 作業一：演算法時間複雜度實證觀察

📌 Project Overview | 專案概述
This project is part of the Algorithm course. It implements three fundamental algorithms from scratch in Java to observe their execution time across different data scales ($n$). The goal is to empirically verify the theoretical Big-O time complexity: $O(n)$, $O(n \log n)$, and $O(n^2)$.

本專案為「演算法」課程作業一。透過 Java 純手工實作三種基礎演算法，觀察在不同資料規模（$n$）下的執行時間。本實驗旨在透過實測數據，驗證理論上的 Big-O 時間複雜度：$O(n)$、$O(n \log n)$ 以及 $O(n^2)$。

🎯 Academic Objectives | 學習目標
- **Algorithm Implementation**: Implement Linear Scan, Merge Sort, and Insertion Sort without using built-in Java libraries.
- **Complexity Verification**: Observe how execution time grows as $n$ increases from 1,000 to 100,000.
- **Performance Analysis**: Identify the efficiency gap between different complexity classes in a real-world environment.

- **演算法實作**：在不使用 Java 內建函式庫的情況下，實作線性掃描、合併排序與插入排序。
- **複雜度驗證**：觀察當 $n$ 從 1,000 增加至 100,000 時，執行時間的增長趨勢。
- **效能分析**：辨識不同複雜度等級在實際環境中的效能差異。

🧮 Mathematical Model | 數學模型
The following algorithms are evaluated in this experiment:

本次實驗評估以下演算法：

1. **Linear Scan (Sum)**: $O(n)$ - Linear growth.
2. **Merge Sort**: $O(n \log n)$ - Log-linear growth (Divide and Conquer).
3. **Insertion Sort**: $O(n^2)$ - Quadratic growth (Nested loops).

💻 Implementation Details | 實作細節
- **Language**: Java 11+
- **Data Generation**: Dynamic generation of random integer arrays.
- **Timing**: Measured using `System.currentTimeMillis()` for high precision in milliseconds.
- **Constraint**: No built-in sorting packages (e.g., `Arrays.sort()`) are allowed.

- **開發語言**：Java 11+
- **資料生成**：動態產生隨機整數陣列。
- **計時方式**：使用 `System.currentTimeMillis()` 進行毫秒級精確計時。
- **限制條件**：禁止使用內建排序套件（如 `Arrays.sort()`）。

📊 Experimental Results | 實驗結果

| Data Size ($n$) | Linear Scan | Merge Sort | Insertion Sort |
| :--- | :--- | :--- | :--- |
| 1,000 | 0 ms | 1 ms | 1 ms |
| 10,000 | 0 ms | 1 ms | 21 ms |
| 50,000 | 1 ms | 5 ms | 428 ms |
| 100,000 | 0 ms | 9 ms | 1692 ms |

> **Observation**: As $n$ grows to 100,000, **Insertion Sort ($O(n^2)$)** slows down significantly, while **Merge Sort ($O(n \log n)$)** remains highly efficient, demonstrating the importance of algorithmic choice in large-scale data processing.
> **觀察**：當 $n$ 達到 100,000 時，**插入排序 ($O(n^2)$)** 顯著變慢，而 **合併排序 ($O(n \log n)$)** 依然保持極高效率，證明了在大規模資料處理中選擇正確演算法的重要性。


Author: 蔡晟旭 (Alexen)
Student ID: 1113405013
Institution: National Penghu University of Science and Technology (NPU)
