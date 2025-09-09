package Com_Utility_Havmor;

 
import org.testng.IExecutionListener;
 
public class ReportExecutionListener_Havmor implements IExecutionListener {
 
    private static boolean reportFinalized = false; // prevent multiple executions
 
    @Override
    public void onExecutionFinish() {
    	
        if (!reportFinalized) {
            System.out.println("✅ Finalizing and emailing report only once...");
            ObjectRepo_Havmor.finalizeReport();  // Your report+email logic
            reportFinalized = true;
            
        }
    }
}

