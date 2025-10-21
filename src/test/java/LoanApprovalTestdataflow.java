import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class LoanApprovalTestdataflow {

    //  NHÓM: Kiểm tra dữ liệu không hợp lệ 
    @Test
    void TC1_incomeOver100() {
        // Use được phủ: Income(1)
        assertEquals("Dữ liệu không hợp lệ", LoanApproval.checkLoan(25, 140.0));
    }

    @Test
    void TC2_incomeNegative() {
        // Use được phủ: Income(2)
        assertEquals("Dữ liệu không hợp lệ", LoanApproval.checkLoan(25, -1.0));
    }

    @Test
    void TC3_ageNegative() {
        // Use được phủ: Age(3)
        assertEquals("Dữ liệu không hợp lệ", LoanApproval.checkLoan(-36, 50.0));
    }

    @Test
    void TC4_ageOver120() {
        // Use được phủ: Age(4)
        assertEquals("Dữ liệu không hợp lệ", LoanApproval.checkLoan(136, 50.0));
    }

    //  NHÓM: Kiểm tra điều kiện không được vay 
    @Test
    void TC5_ageUnder18() {
        // Use được phủ: Age(5)
        assertEquals("Không được vay", LoanApproval.checkLoan(15, 50.0));
    }

    @Test
    void TC6_ageOver60() {
        // Use được phủ: Age(6)
        assertEquals("Không được vay", LoanApproval.checkLoan(66, 50.0));
    }

    @Test
    void TC7_incomeUnder5() {
        // Use được phủ: Income(7)
        assertEquals("Không được vay", LoanApproval.checkLoan(25, 4.0));
    }

    //  NHÓM: Dữ liệu hợp lệ, đủ điều kiện vay 
    @Test
    void TC8_validCase() {
        assertEquals("Được vay", LoanApproval.checkLoan(36, 10.0));
    }
}
