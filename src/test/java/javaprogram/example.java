package javaprogram;

public class example {
	public static void main(String[]args) {
		String a="abc11b3jh";
		int sum=0;
		StringBuilder currentnumber=new StringBuilder();
		
		for(char s:a.toCharArray()) {
			if(Character.isDigit(s)) {
				currentnumber.append(s);
			}else {
				if(currentnumber.length()>0) {
					sum=sum+Integer.parseInt(currentnumber.toString());
					currentnumber.setLength(0);
					
				}
			}
			if(currentnumber.length()>0) {
				sum=sum+Integer.parseInt(currentnumber.toString());
			}
		}
			
		
		System.out.println(sum);


	}
	
	}


