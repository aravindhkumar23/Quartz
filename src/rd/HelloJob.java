package rd;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
 
public class HelloJob implements Job
{
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	   //get current date time with Calendar()
	   Calendar cal = Calendar.getInstance();
	   
	public void execute(JobExecutionContext context)
	throws JobExecutionException {
 
		System.out.println("Hello Quartz! "+dateFormat.format(cal.getTime()));	
	}
 
}
