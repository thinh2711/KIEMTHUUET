public class LoanApproval {
    public static String checkLoan(int age, double income) {
        // 1) VALIDATE input trước (ưu tiên invalid)
        if (income > 100.0 || income < 0.0 || age < 0 || age > 120) {
            return "Dữ liệu không hợp lệ";
        }

        // 2) Áp dụng quy tắc
        if (age < 18 || age > 60) {
            return "Không được vay";  // R1, R2
        }

        if (income < 5.0) {
            return "Không được vay";  // R3
        }

        return "Được vay";  // R5
    }
}
