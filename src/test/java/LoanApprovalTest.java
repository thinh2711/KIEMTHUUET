import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class LoanApprovalTest {

    @Test
    void testInvalidData() {
        assertEquals("Dữ liệu không hợp lệ", LoanApproval.checkLoan(30, 150.0));
    }

    @Test
    void testUnderage() {
        assertEquals("Không được vay", LoanApproval.checkLoan(17, 10.0));
    }

    @Test
    void testOverage() {
        assertEquals("Không được vay", LoanApproval.checkLoan(61, 8.0));
    }

    @Test
    void testLowIncome() {
        assertEquals("Không được vay", LoanApproval.checkLoan(30, 4.0));
    }

    @Test
    void testValidLoan() {
        assertEquals("Được vay", LoanApproval.checkLoan(30, 10.0));
    }
}
