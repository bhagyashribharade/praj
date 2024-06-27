package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ProcessManager {
	private ArrayList<Process>processList;
	private LinkedList<Process>pendingHistory;
	private LinkedList<Process>completedHistory;
	
	public ProcessManager() {
		processList= new ArrayList<>();
		pendingHistory = new LinkedList<>();
		completedHistory = new LinkedList<>();
		
	}
	
  
	//add process
	public void addProcess(Process process) {
		processList.add(process);
	}
	
	
	//remove process
	public boolean removeProcess(int processId) {
		for(Process process : processList) {
	            if (process.getProcessId() == processId) {
	               processList.remove(process);
	                return true;
	            }
	        }
	        return false;
	
		
	}
	
	
	//Search  for a process
	public Process searchProcess(int processId) {
		for(Process process : processList) {            //	Search for a process by its ID and return the process details.
			if(process.getProcessId()==processId) {
				return process;
			}
		}
		
		return null;
	}
	
	//list All Process
	public List<Process> listAllProcesses(){
		return new ArrayList<>(processList);
	}
	
	//update processStatus
	public boolean updateProcessStatus(int processId , String newStatus) {
		for(Process process : processList) {
			if(process.getProcessId()==processId) {
				process.setStatus(newStatus);
				if(newStatus.equals("completed")){
					addCompletedProcess(process);
					
				}
			return true;	
			}
		}
		return false;
	}
	
	//pending process
	public void addPendingProcess(Process process) {
		pendingHistory.add(process);
		
	}
	
	//completed process
	public void addCompletedProcess(Process process) {
		completedHistory.add(process);
	}
	
	public List<Process>getPendingProcessHistory(){
		return new ArrayList<>(pendingHistory);
		
	}
	
	
	public List<Process>getCompletedProcessHistory(){
		return  new ArrayList<>(completedHistory);
		
	}
	
	
	
	public static void main(String[] args) {
	
		//Example
		ProcessManager pm = new ProcessManager();
		
		Process p1 = new Process(1,"Testing","Pending");
		Process p2 = new Process(2,"Design","Running");
		Process p3 = new Process(3,"Planning","Completed");
		
		  
			
		pm.addProcess(p1);
		pm.addProcess(p2);
		pm.addProcess(p3);
		
		pm.addPendingProcess(p1);
		pm.addCompletedProcess(p3);
		
       System.out.println("All process : " +pm.listAllProcesses());
       System.out.println("\n Pending Process :"+ pm.getPendingProcessHistory());
       System.out.println("\nCompleted Process : "+ pm.getCompletedProcessHistory());
    
       pm.updateProcessStatus(1, "Completed");
       System.out.println("\n After updating Status of process 1 :");
       System.out.println("All Processes :"+ pm.listAllProcesses());
       
       System.out.println("\n Completed Processes :"+pm.getCompletedProcessHistory());
       
       System.out.println("Search process with id : "+pm.searchProcess(1));
       
     
	}

}
