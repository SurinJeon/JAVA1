class Accounting {
    public double valueOfSupply;
    public Accounting(double valueOfSupply) {
    	this.valueOfSupply = valueOfSupply;
    } // 생성자 메소드 생성 완.
    public static double vatRate = 0.1; // 부가가치세율 // 이건 우리나라 안에서는 다 10%기 때문에, 굳이 static을 지울 필요가 없다! (그냥 class 소속으로 두자)
    public double getVAT() {
        return valueOfSupply * vatRate;
    }
    public double getTotal() {
        return valueOfSupply + getVAT();
    }
}
public class AccountingApp {
 
    public static void main(String[] args) {
    	Accounting a1 = new Accounting(10000.0);
    	
    	Accounting a2 = new Accounting(20000.0);
    	
    	
    	System.out.println("Value of supply : " + a1.valueOfSupply);
    	System.out.println("Value of supply : " + a2.valueOfSupply);
    	
    	System.out.println("VAT : " + a1.getVAT());
    	System.out.println("VAT : " + a2.getVAT());
    	
    	System.out.println("Total : " + a1.getTotal());
    	System.out.println("Total : " + a2.getTotal());
      
      
    }
 
}