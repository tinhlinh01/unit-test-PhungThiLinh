# Bài tập Java: Phân tích điểm số học sinh

## 📋 Mô tả

Lớp `StudentAnalyzer` gồm các phương thức dùng để phân tích danh sách điểm của học sinh. Bài tập này yêu cầu bạn triển khai các hàm xử lý logic, đồng thời viết hoặc chạy các test để kiểm tra tính đúng đắn.

### 🧮 Các chức năng chính

1. `countExcellentStudents(List<Double> scores)`
    - Trả về số học sinh có điểm **Giỏi** (điểm >= 8.0)
    - Bỏ qua các điểm không hợp lệ (âm hoặc lớn hơn 10)
    - Nếu danh sách rỗng hoặc null → trả về 0

2. `calculateValidAverage(List<Double> scores)`
    - Tính **điểm trung bình** của các điểm hợp lệ (trong khoảng [0, 10])
    - Nếu không có điểm hợp lệ → trả về 0.0

---

## ▶️ Hướng dẫn chạy test

### ✅ Cách 1: Sử dụng IntelliJ IDEA / Eclipse

- Mở project trong IntelliJ
- Chuột phải vào file `StudentAnalyzerTest.java` → chọn **Run 'StudentAnalyzerTest'**
- Kết quả test sẽ hiển thị trong cửa sổ Run/Test

### ✅ Cách 2: Sử dụng Maven từ dòng lệnh

> Áp dụng nếu bạn đang dùng Maven để quản lý project.

1. Mở terminal
2. Di chuyển đến thư mục chứa `pom.xml`
3. Chạy lệnh:

```bash
mvn clean test
