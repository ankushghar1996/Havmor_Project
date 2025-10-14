package Com_Utility_Havmor;

import org.testng.IExecutionListener;

public class ReportExecutionListener_Havmor implements IExecutionListener {

    private static boolean reportFinalized = false;

    @Override
    public void onExecutionFinish() {
        if (!reportFinalized) {
            System.out.println("✅ TestNG execution finished — calling finalizeReport()");
            try {
                ObjectRepo_Havmor.finalizeReport();
            } catch (Exception e) {
                System.err.println("Error in finalizeReport(): " + e.getMessage());
                e.printStackTrace();
            }
            reportFinalized = true;
        } else {
            System.out.println("Report already finalized by another thread/process.");
        }
    }
}
