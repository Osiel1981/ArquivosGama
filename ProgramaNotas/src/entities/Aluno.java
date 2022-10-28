package entities;

public class Aluno {
	public String name;
	public double notatrimestre1;
	public double notatrimestre2;
	public double notatrimestre3;
	
	public double Media() {
		return (notatrimestre1 + notatrimestre2 + notatrimestre3);
	}
	public double FaltaParaMeta() {
		if (Media() < 60) {
			return 60-Media();
		}else return 0.0;
		
	}
	public String toString() {
		if (Media()<60){
			return "FINAL GRADE = "+
					String.format("%.2f%n" ,Media()) 
					+"FAILED "
					+ "\nMISSING " 
					+ String.format("%.2f ", FaltaParaMeta()) + " POINTS";  
		} 
		else
			return "FINAL GRADE = "+
			String.format("%.2f%n", Media()) +
			"PASS";				
	}
	
}
